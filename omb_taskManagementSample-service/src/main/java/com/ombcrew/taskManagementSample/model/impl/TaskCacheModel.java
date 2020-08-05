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

package com.ombcrew.taskManagementSample.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.ombcrew.taskManagementSample.model.Task;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Task in entity cache.
 *
 * @author OMB
 * @generated
 */
public class TaskCacheModel implements CacheModel<Task>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaskCacheModel)) {
			return false;
		}

		TaskCacheModel taskCacheModel = (TaskCacheModel)obj;

		if (taskId == taskCacheModel.taskId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, taskId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{taskId=");
		sb.append(taskId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createdUserId=");
		sb.append(createdUserId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", assignedUserId=");
		sb.append(assignedUserId);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Task toEntityModel() {
		TaskImpl taskImpl = new TaskImpl();

		taskImpl.setTaskId(taskId);
		taskImpl.setGroupId(groupId);
		taskImpl.setCreatedUserId(createdUserId);

		if (createdDate == Long.MIN_VALUE) {
			taskImpl.setCreatedDate(null);
		}
		else {
			taskImpl.setCreatedDate(new Date(createdDate));
		}

		if (title == null) {
			taskImpl.setTitle("");
		}
		else {
			taskImpl.setTitle(title);
		}

		if (description == null) {
			taskImpl.setDescription("");
		}
		else {
			taskImpl.setDescription(description);
		}

		taskImpl.setAssignedUserId(assignedUserId);
		taskImpl.setStatus(status);

		taskImpl.resetOriginalValues();

		return taskImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		taskId = objectInput.readLong();

		groupId = objectInput.readLong();

		createdUserId = objectInput.readLong();
		createdDate = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();

		assignedUserId = objectInput.readLong();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(taskId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(createdUserId);
		objectOutput.writeLong(createdDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(assignedUserId);

		objectOutput.writeInt(status);
	}

	public long taskId;
	public long groupId;
	public long createdUserId;
	public long createdDate;
	public String title;
	public String description;
	public long assignedUserId;
	public int status;

}