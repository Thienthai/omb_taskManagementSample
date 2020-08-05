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
 * Provides a wrapper for {@link TaskLocalService}.
 *
 * @author OMB
 * @see TaskLocalService
 * @generated
 */
public class TaskLocalServiceWrapper
	implements ServiceWrapper<TaskLocalService>, TaskLocalService {

	public TaskLocalServiceWrapper(TaskLocalService taskLocalService) {
		_taskLocalService = taskLocalService;
	}

	@Override
	public com.ombcrew.taskManagementSample.model.Task addTask(
		String title, String description, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _taskLocalService.addTask(
			title, description, status, serviceContext);
	}

	/**
	 * Adds the Task to the database. Also notifies the appropriate model listeners.
	 *
	 * @param task the Task
	 * @return the Task that was added
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.Task addTask(
		com.ombcrew.taskManagementSample.model.Task task) {

		return _taskLocalService.addTask(task);
	}

	@Override
	public int countByG_T(long groupId, String title) {
		return _taskLocalService.countByG_T(groupId, title);
	}

	/**
	 * counter
	 */
	@Override
	public int countByGroupId(long groupId) {
		return _taskLocalService.countByGroupId(groupId);
	}

	/**
	 * Creates a new Task with the primary key. Does not add the Task to the database.
	 *
	 * @param taskId the primary key for the new Task
	 * @return the new Task
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.Task createTask(long taskId) {
		return _taskLocalService.createTask(taskId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the Task with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task that was removed
	 * @throws PortalException if a Task with the primary key could not be found
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.Task deleteTask(long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskLocalService.deleteTask(taskId);
	}

	/**
	 * Deletes the Task from the database. Also notifies the appropriate model listeners.
	 *
	 * @param task the Task
	 * @return the Task that was removed
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.Task deleteTask(
		com.ombcrew.taskManagementSample.model.Task task) {

		return _taskLocalService.deleteTask(task);
	}

	@Override
	public boolean deleteTasks(long taskId) {
		return _taskLocalService.deleteTasks(taskId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _taskLocalService.dynamicQuery();
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

		return _taskLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskModelImpl</code>.
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

		return _taskLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskModelImpl</code>.
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

		return _taskLocalService.dynamicQuery(
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

		return _taskLocalService.dynamicQueryCount(dynamicQuery);
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

		return _taskLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ombcrew.taskManagementSample.model.Task fetchTask(long taskId) {
		return _taskLocalService.fetchTask(taskId);
	}

	@Override
	public java.util.List<com.ombcrew.taskManagementSample.model.Task>
		findByG_T(long groupId, String title, int start, int end) {

		return _taskLocalService.findByG_T(groupId, title, start, end);
	}

	/**
	 * finder
	 */
	@Override
	public java.util.List<com.ombcrew.taskManagementSample.model.Task>
		findByGroupId(long groupId, int start, int end) {

		return _taskLocalService.findByGroupId(groupId, start, end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _taskLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _taskLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _taskLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the Task with the primary key.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task
	 * @throws PortalException if a Task with the primary key could not be found
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.Task getTask(long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _taskLocalService.getTask(taskId);
	}

	/**
	 * Returns a range of all the Tasks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @return the range of Tasks
	 */
	@Override
	public java.util.List<com.ombcrew.taskManagementSample.model.Task> getTasks(
		int start, int end) {

		return _taskLocalService.getTasks(start, end);
	}

	/**
	 * crud
	 */
	@Override
	public java.util.List<com.ombcrew.taskManagementSample.model.Task> getTasks(
		long groupId, String title, int start, int end) {

		return _taskLocalService.getTasks(groupId, title, start, end);
	}

	/**
	 * Returns the number of Tasks.
	 *
	 * @return the number of Tasks
	 */
	@Override
	public int getTasksCount() {
		return _taskLocalService.getTasksCount();
	}

	@Override
	public com.ombcrew.taskManagementSample.model.Task updateTask(
		long taskId, String title, String description, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _taskLocalService.updateTask(
			taskId, title, description, status, serviceContext);
	}

	/**
	 * Updates the Task in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param task the Task
	 * @return the Task that was updated
	 */
	@Override
	public com.ombcrew.taskManagementSample.model.Task updateTask(
		com.ombcrew.taskManagementSample.model.Task task) {

		return _taskLocalService.updateTask(task);
	}

	@Override
	public TaskLocalService getWrappedService() {
		return _taskLocalService;
	}

	@Override
	public void setWrappedService(TaskLocalService taskLocalService) {
		_taskLocalService = taskLocalService;
	}

	private TaskLocalService _taskLocalService;

}