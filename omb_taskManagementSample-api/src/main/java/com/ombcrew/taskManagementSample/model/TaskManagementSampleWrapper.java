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

package com.ombcrew.taskManagementSample.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TaskManagementSample}.
 * </p>
 *
 * @author OMB
 * @see TaskManagementSample
 * @generated
 */
public class TaskManagementSampleWrapper
	extends BaseModelWrapper<TaskManagementSample>
	implements ModelWrapper<TaskManagementSample>, TaskManagementSample {

	public TaskManagementSampleWrapper(
		TaskManagementSample taskManagementSample) {

		super(taskManagementSample);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taskId", getTaskId());
		attributes.put("groupId", getGroupId());
		attributes.put("createdUserId", getCreatedUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("title ", getTitle());
		attributes.put("description", getDescription());
		attributes.put("assignedUserId", getAssignedUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long createdUserId = (Long)attributes.get("createdUserId");

		if (createdUserId != null) {
			setCreatedUserId(createdUserId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String title = (String)attributes.get("title ");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long assignedUserId = (Long)attributes.get("assignedUserId");

		if (assignedUserId != null) {
			setAssignedUserId(assignedUserId);
		}
	}

	/**
	 * Returns the assigned user ID of this Task Management Sample.
	 *
	 * @return the assigned user ID of this Task Management Sample
	 */
	@Override
	public long getAssignedUserId() {
		return model.getAssignedUserId();
	}

	/**
	 * Returns the assigned user uuid of this Task Management Sample.
	 *
	 * @return the assigned user uuid of this Task Management Sample
	 */
	@Override
	public String getAssignedUserUuid() {
		return model.getAssignedUserUuid();
	}

	/**
	 * Returns the created date of this Task Management Sample.
	 *
	 * @return the created date of this Task Management Sample
	 */
	@Override
	public Date getCreatedDate() {
		return model.getCreatedDate();
	}

	/**
	 * Returns the created user ID of this Task Management Sample.
	 *
	 * @return the created user ID of this Task Management Sample
	 */
	@Override
	public long getCreatedUserId() {
		return model.getCreatedUserId();
	}

	/**
	 * Returns the created user uuid of this Task Management Sample.
	 *
	 * @return the created user uuid of this Task Management Sample
	 */
	@Override
	public String getCreatedUserUuid() {
		return model.getCreatedUserUuid();
	}

	/**
	 * Returns the description of this Task Management Sample.
	 *
	 * @return the description of this Task Management Sample
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this Task Management Sample.
	 *
	 * @return the group ID of this Task Management Sample
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the primary key of this Task Management Sample.
	 *
	 * @return the primary key of this Task Management Sample
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the task ID of this Task Management Sample.
	 *
	 * @return the task ID of this Task Management Sample
	 */
	@Override
	public long getTaskId() {
		return model.getTaskId();
	}

	/**
	 * Returns the title of this Task Management Sample.
	 *
	 * @return the title of this Task Management Sample
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the assigned user ID of this Task Management Sample.
	 *
	 * @param assignedUserId the assigned user ID of this Task Management Sample
	 */
	@Override
	public void setAssignedUserId(long assignedUserId) {
		model.setAssignedUserId(assignedUserId);
	}

	/**
	 * Sets the assigned user uuid of this Task Management Sample.
	 *
	 * @param assignedUserUuid the assigned user uuid of this Task Management Sample
	 */
	@Override
	public void setAssignedUserUuid(String assignedUserUuid) {
		model.setAssignedUserUuid(assignedUserUuid);
	}

	/**
	 * Sets the created date of this Task Management Sample.
	 *
	 * @param createdDate the created date of this Task Management Sample
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		model.setCreatedDate(createdDate);
	}

	/**
	 * Sets the created user ID of this Task Management Sample.
	 *
	 * @param createdUserId the created user ID of this Task Management Sample
	 */
	@Override
	public void setCreatedUserId(long createdUserId) {
		model.setCreatedUserId(createdUserId);
	}

	/**
	 * Sets the created user uuid of this Task Management Sample.
	 *
	 * @param createdUserUuid the created user uuid of this Task Management Sample
	 */
	@Override
	public void setCreatedUserUuid(String createdUserUuid) {
		model.setCreatedUserUuid(createdUserUuid);
	}

	/**
	 * Sets the description of this Task Management Sample.
	 *
	 * @param description the description of this Task Management Sample
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this Task Management Sample.
	 *
	 * @param groupId the group ID of this Task Management Sample
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the primary key of this Task Management Sample.
	 *
	 * @param primaryKey the primary key of this Task Management Sample
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the task ID of this Task Management Sample.
	 *
	 * @param taskId the task ID of this Task Management Sample
	 */
	@Override
	public void setTaskId(long taskId) {
		model.setTaskId(taskId);
	}

	/**
	 * Sets the title of this Task Management Sample.
	 *
	 * @param title  the title of this Task Management Sample
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected TaskManagementSampleWrapper wrap(
		TaskManagementSample taskManagementSample) {

		return new TaskManagementSampleWrapper(taskManagementSample);
	}

}