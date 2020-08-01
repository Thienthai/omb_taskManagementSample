/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ombcrew.taskManagementSample.service.impl;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import com.ombcrew.taskManagementSample.exception.NoSuchTaskManagementSampleException;
import com.ombcrew.taskManagementSample.model.TaskManagementSample;
import com.ombcrew.taskManagementSample.service.base.TaskManagementSampleLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the Task Management Sample local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.ombcrew.taskManagementSample.service.TaskManagementSampleLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author OMB
 * @see TaskManagementSampleLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.ombcrew.taskManagementSample.model.TaskManagementSample",
	service = AopService.class
)
public class TaskManagementSampleLocalServiceImpl
	extends TaskManagementSampleLocalServiceBaseImpl {

	private static final String EXCEPTION_PREFIX = StringPool.POUND + StringPool.POUND + StringPool.POUND + StringPool.POUND + StringPool.POUND + StringPool.NEW_LINE;

	/*** entity ***/
	public TaskManagementSample getSample(long taskId) {
		return taskManagementSamplePersistence.fetchByPrimaryKey(taskId);
	}
	
	/*** counter ***/
	public int countByGroupId(long groupId) {
		return taskManagementSamplePersistence.countByGroupId(groupId);
	}
	
	public int countByG_T(long groupId, String title) {
		if (Validator.isNotNull(title)) title = StringPool.PERCENT + title + StringPool.PERCENT;
		
		return taskManagementSamplePersistence.countByG_T(groupId, title);
	}
	
	/*** finder ***/
	public List<TaskManagementSample> findByGroupId(long groupId, int start, int end) {
		return taskManagementSamplePersistence.findByGroupId(groupId, start, end);
	}
	
	public List<TaskManagementSample> findByG_T(long groupId, String title, int start, int end) {
		if (Validator.isNotNull(title)) title = StringPool.PERCENT + title + StringPool.PERCENT;
		
		return taskManagementSamplePersistence.findByG_T(groupId, title, start, end);
	}
	
	/*** crud ***/
	public int getTaskManagementSampleCount(long groupId, String title) {
		if (Validator.isNotNull(title)) {
			return countByG_T(groupId, title);
		} else {
			return countByGroupId(groupId);
		}
	}
	
	public List<TaskManagementSample> getTaskManagementSample(long groupId, String title, int start, int end) {
		if (Validator.isNotNull(title)) {
			return findByG_T(groupId, title, start, end);
		} else {
			return findByGroupId(groupId, start, end);
		}
	}
	
	public TaskManagementSample addtaskManagementSample(String title,long createdUserId,String description,long assignedUserId, ServiceContext serviceContext) {
		
		/*** entity fields ***/
		long taskId = counterLocalService.increment(TaskManagementSample.class.getName());
		
		long groupId = serviceContext.getScopeGroupId();
		
		long userId = serviceContext.getUserId();
		User user = null;
		String userName = null;
		
		try {
			user = userLocalService.getUserById(userId);
			userName = user.getFullName();
		} catch (PortalException e) {
			System.out.println(EXCEPTION_PREFIX + e.toString());
		}
		
		Date now = new Date();
		Date createDate = serviceContext.getCreateDate(now);
		
		/*** entity ***/
		TaskManagementSample tms = taskManagementSamplePersistence.create(taskId);
		
		tms.setTaskId(taskId);
		tms.setCreatedUserId(createdUserId);
		tms.setCreatedDate(createDate);
		tms.setTitle(title);
		tms.setDescription(description);
		tms.setAssignedUserId(assignedUserId);
		
		tms = taskManagementSamplePersistence.update(tms);
		
		return tms;
	}
	
	public boolean updataskManagementSample(long taskId,String title,long createdUserId,String description,long assignedUserId, ServiceContext serviceContext) {
		
		long userId = serviceContext.getUserId();
		User user = null;
		String userName = null;
		
		try {
			user = userLocalService.getUserById(userId);
			userName = user.getFullName();
		} catch (PortalException e) {
			System.out.println(EXCEPTION_PREFIX + e.toString());
		}
		
		/*** entity ***/
		TaskManagementSample tms;
		try {
			tms = getTaskManagementSample(taskId);
			
			tms.setTaskId(taskId);
			tms.setCreatedUserId(createdUserId);
			tms.setTitle(title);
			tms.setDescription(description);
			tms.setAssignedUserId(assignedUserId);
			
			tms = taskManagementSamplePersistence.update(tms);
			
			return true;
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean deleteSample(long taskId) {
		
		/*** entity ***/
		TaskManagementSample tms = getSample(taskId);
		
		try {
			tms = taskManagementSamplePersistence.remove(taskId);
			return true;
		} catch (NoSuchTaskManagementSampleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}