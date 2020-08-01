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
 * Provides a wrapper for {@link TaskManagementSampleLocalService}.
 *
 * @author OMB
 * @see TaskManagementSampleLocalService
 * @generated
 */
public class TaskManagementSampleLocalServiceWrapper
	implements ServiceWrapper<TaskManagementSampleLocalService>,
			   TaskManagementSampleLocalService {

	public TaskManagementSampleLocalServiceWrapper(
		TaskManagementSampleLocalService taskManagementSampleLocalService) {

		_taskManagementSampleLocalService = taskManagementSampleLocalService;
	}

	/**
	 * Adds the Task Management Sample to the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was added
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.TaskManagementSample
		addTaskManagementSample(
			com.ombcrew.taskManagementSample.model.TaskManagementSample
				taskManagementSample) {

		return _taskManagementSampleLocalService.addTaskManagementSample(
			taskManagementSample);
	}

	/**
	 * Creates a new Task Management Sample with the primary key. Does not add the Task Management Sample to the database.
	 *
	 * @param taskId the primary key for the new Task Management Sample
	 * @return the new Task Management Sample
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.TaskManagementSample
		createTaskManagementSample(long taskId) {

		return _taskManagementSampleLocalService.createTaskManagementSample(
			taskId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskManagementSampleLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the Task Management Sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample that was removed
	 * @throws PortalException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.TaskManagementSample
			deleteTaskManagementSample(long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskManagementSampleLocalService.deleteTaskManagementSample(
			taskId);
	}

	/**
	 * Deletes the Task Management Sample from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was removed
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.TaskManagementSample
		deleteTaskManagementSample(
			com.ombcrew.taskManagementSample.model.TaskManagementSample
				taskManagementSample) {

		return _taskManagementSampleLocalService.deleteTaskManagementSample(
			taskManagementSample);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _taskManagementSampleLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _taskManagementSampleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _taskManagementSampleLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _taskManagementSampleLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _taskManagementSampleLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _taskManagementSampleLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.ombcrew.taskManagementSample.model.TaskManagementSample
		fetchTaskManagementSample(long taskId) {

		return _taskManagementSampleLocalService.fetchTaskManagementSample(
			taskId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _taskManagementSampleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _taskManagementSampleLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _taskManagementSampleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskManagementSampleLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the Task Management Sample with the primary key.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample
	 * @throws PortalException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.TaskManagementSample
			getTaskManagementSample(long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskManagementSampleLocalService.getTaskManagementSample(
			taskId);
	}

	/**
	 * Returns a range of all the Task Management Samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @return the range of Task Management Samples
	 */
	@Override
	public java.util.List
		<com.ombcrew.taskManagementSample.model.TaskManagementSample>
			getTaskManagementSamples(int start, int end) {

		return _taskManagementSampleLocalService.getTaskManagementSamples(
			start, end);
	}

	/**
	 * Returns the number of Task Management Samples.
	 *
	 * @return the number of Task Management Samples
	 */
	@Override
	public int getTaskManagementSamplesCount() {
		return _taskManagementSampleLocalService.
			getTaskManagementSamplesCount();
	}

	/**
	 * Updates the Task Management Sample in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was updated
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.TaskManagementSample
		updateTaskManagementSample(
			com.ombcrew.taskManagementSample.model.TaskManagementSample
				taskManagementSample) {

		return _taskManagementSampleLocalService.updateTaskManagementSample(
			taskManagementSample);
	}

	@Override
	public TaskManagementSampleLocalService getWrappedService() {
		return _taskManagementSampleLocalService;
	}

	@Override
	public void setWrappedService(
		TaskManagementSampleLocalService taskManagementSampleLocalService) {

		_taskManagementSampleLocalService = taskManagementSampleLocalService;
	}

	private TaskManagementSampleLocalService _taskManagementSampleLocalService;

}