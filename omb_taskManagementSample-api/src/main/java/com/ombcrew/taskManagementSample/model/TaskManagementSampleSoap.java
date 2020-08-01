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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ombcrew.taskManagementSample.service.http.TaskManagementSampleServiceSoap}.
 *
 * @author OMB
 * @generated
 */
public class TaskManagementSampleSoap implements Serializable {

	public static TaskManagementSampleSoap toSoapModel(
		TaskManagementSample model) {

		TaskManagementSampleSoap soapModel = new TaskManagementSampleSoap();

		soapModel.setTaskId(model.getTaskId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreatedUserId(model.getCreatedUserId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setAssignedUserId(model.getAssignedUserId());

		return soapModel;
	}

	public static TaskManagementSampleSoap[] toSoapModels(
		TaskManagementSample[] models) {

		TaskManagementSampleSoap[] soapModels =
			new TaskManagementSampleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TaskManagementSampleSoap[][] toSoapModels(
		TaskManagementSample[][] models) {

		TaskManagementSampleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new TaskManagementSampleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TaskManagementSampleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TaskManagementSampleSoap[] toSoapModels(
		List<TaskManagementSample> models) {

		List<TaskManagementSampleSoap> soapModels =
			new ArrayList<TaskManagementSampleSoap>(models.size());

		for (TaskManagementSample model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new TaskManagementSampleSoap[soapModels.size()]);
	}

	public TaskManagementSampleSoap() {
	}

	public long getPrimaryKey() {
		return _taskId;
	}

	public void setPrimaryKey(long pk) {
		setTaskId(pk);
	}

	public long getTaskId() {
		return _taskId;
	}

	public void setTaskId(long taskId) {
		_taskId = taskId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCreatedUserId() {
		return _createdUserId;
	}

	public void setCreatedUserId(long createdUserId) {
		_createdUserId = createdUserId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getAssignedUserId() {
		return _assignedUserId;
	}

	public void setAssignedUserId(long assignedUserId) {
		_assignedUserId = assignedUserId;
	}

	private long _taskId;
	private long _groupId;
	private long _createdUserId;
	private Date _createdDate;
	private String _title;
	private String _description;
	private long _assignedUserId;

}