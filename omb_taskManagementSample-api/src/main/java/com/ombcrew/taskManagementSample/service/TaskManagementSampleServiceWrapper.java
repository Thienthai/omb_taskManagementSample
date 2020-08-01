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

package com.ombcrew.taskManagementSample.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TaskManagementSampleService}.
 *
 * @author OMB
 * @see TaskManagementSampleService
 * @generated
 */
public class TaskManagementSampleServiceWrapper
	implements ServiceWrapper<TaskManagementSampleService>,
			   TaskManagementSampleService {

	public TaskManagementSampleServiceWrapper(
		TaskManagementSampleService taskManagementSampleService) {

		_taskManagementSampleService = taskManagementSampleService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _taskManagementSampleService.getOSGiServiceIdentifier();
	}

	@Override
	public TaskManagementSampleService getWrappedService() {
		return _taskManagementSampleService;
	}

	@Override
	public void setWrappedService(
		TaskManagementSampleService taskManagementSampleService) {

		_taskManagementSampleService = taskManagementSampleService;
	}

	private TaskManagementSampleService _taskManagementSampleService;

}