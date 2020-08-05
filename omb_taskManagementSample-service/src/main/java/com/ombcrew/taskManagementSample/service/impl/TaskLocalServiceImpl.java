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
import com.ombcrew.taskManagementSample.exception.NoSuchTaskException;
import com.ombcrew.taskManagementSample.model.Task;
import com.ombcrew.taskManagementSample.service.base.TaskLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the Task local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.ombcrew.taskManagementSample.service.TaskLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author OMB
 * @see TaskLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.ombcrew.taskManagementSample.model.Task",
	service = AopService.class
)
public class TaskLocalServiceImpl extends TaskLocalServiceBaseImpl {

	private static final String EXCEPTION_PREFIX = StringPool.POUND + StringPool.POUND + StringPool.POUND + StringPool.POUND + StringPool.POUND + StringPool.NEW_LINE;
	
	/*** entity ***/
	public Task getTask(long sampleId) {
		return taskPersistence.fetchByPrimaryKey(sampleId);
	}
	
	/*** counter ***/
	public int countByGroupId(long groupId) {
		return taskPersistence.countByGroupId(groupId);
	}
	
	public int countByG_T(long groupId, String title) {
		if (Validator.isNotNull(title)) title = StringPool.PERCENT + title + StringPool.PERCENT;
		
		return taskPersistence.countByG_T(groupId, title);
	}
	
	/*** finder ***/
	public List<Task> findByGroupId(long groupId, int start, int end) {
		return taskPersistence.findByGroupId(groupId, start, end);
	}
	 
	public List<Task> findByG_T(long groupId, String title, int start, int end) {
		if (Validator.isNotNull(title)) title = StringPool.PERCENT + title + StringPool.PERCENT;
		
		return taskPersistence.findByG_T(groupId, title, start, end);
	}
	
	/*** crud ***/
	public List<Task> getTasks(long groupId, String title, int start, int end) {
		if (Validator.isNotNull(title)) {
			return findByG_T(groupId, title, start, end);
		} else {
			return findByGroupId(groupId, start, end);
		}
	}
	
	public Task addTask(String title, String description,int status, ServiceContext serviceContext) {
		
		/*** entity fields ***/
		long taskId = counterLocalService.increment(Task.class.getName());
		
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		
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
		Date createdDate = serviceContext.getCreateDate(now);
		Date modifiedDate = serviceContext.getModifiedDate(now);
		
		/*** entity ***/
		Task tsk = taskPersistence.create(taskId);
		
		tsk.setTitle(title);
		tsk.setDescription(description);
		tsk.setTaskId(taskId);
		tsk.setGroupId(groupId);
		tsk.setCreatedUserId(userId);
		tsk.setCreatedDate(createdDate);
		tsk.setCreatedUserId(userId);
		tsk.setAssignedUserId(userId);
		tsk.setStatus(status);
		
		tsk = taskPersistence.update(tsk);
		
		return tsk;
	}
	
	public Task updateTask(long taskId,String title, String description,int status, ServiceContext serviceContext) {
	
		/*** entity fields ***/	
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
		Task tsk = getTask(taskId);
		tsk.setTitle(title);
		tsk.setDescription(description);
		tsk.setAssignedUserId(userId);
		tsk.setStatus(status);
		
		tsk = taskPersistence.update(tsk);
		
		return tsk;
	}

	public boolean deleteTasks(long taskId) {
		
		/*** entity ***/
		Task tsk = getTask(taskId);
		
		try {
			tsk = taskPersistence.remove(taskId);
			return true;
		} catch (NoSuchTaskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}