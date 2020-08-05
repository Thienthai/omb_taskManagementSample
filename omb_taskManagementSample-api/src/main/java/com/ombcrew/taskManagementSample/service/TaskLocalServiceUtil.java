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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Task. This utility wraps
 * <code>com.ombcrew.taskManagementSample.service.impl.TaskLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author OMB
 * @see TaskLocalService
 * @generated
 */
public class TaskLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.ombcrew.taskManagementSample.service.impl.TaskLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.ombcrew.taskManagementSample.model.Task addTask(
		String title, String description, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addTask(title, description, status, serviceContext);
	}

	/**
	 * Adds the Task to the database. Also notifies the appropriate model listeners.
	 *
	 * @param task the Task
	 * @return the Task that was added
	 */
	public static com.ombcrew.taskManagementSample.model.Task addTask(
		com.ombcrew.taskManagementSample.model.Task task) {

		return getService().addTask(task);
	}

	public static int countByG_T(long groupId, String title) {
		return getService().countByG_T(groupId, title);
	}

	/**
	 * counter
	 */
	public static int countByGroupId(long groupId) {
		return getService().countByGroupId(groupId);
	}

	/**
	 * Creates a new Task with the primary key. Does not add the Task to the database.
	 *
	 * @param taskId the primary key for the new Task
	 * @return the new Task
	 */
	public static com.ombcrew.taskManagementSample.model.Task createTask(
		long taskId) {

		return getService().createTask(taskId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the Task with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task that was removed
	 * @throws PortalException if a Task with the primary key could not be found
	 */
	public static com.ombcrew.taskManagementSample.model.Task deleteTask(
			long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteTask(taskId);
	}

	/**
	 * Deletes the Task from the database. Also notifies the appropriate model listeners.
	 *
	 * @param task the Task
	 * @return the Task that was removed
	 */
	public static com.ombcrew.taskManagementSample.model.Task deleteTask(
		com.ombcrew.taskManagementSample.model.Task task) {

		return getService().deleteTask(task);
	}

	public static boolean deleteTasks(long taskId) {
		return getService().deleteTasks(taskId);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.ombcrew.taskManagementSample.model.Task fetchTask(
		long taskId) {

		return getService().fetchTask(taskId);
	}

	public static java.util.List<com.ombcrew.taskManagementSample.model.Task>
		findByG_T(long groupId, String title, int start, int end) {

		return getService().findByG_T(groupId, title, start, end);
	}

	/**
	 * finder
	 */
	public static java.util.List<com.ombcrew.taskManagementSample.model.Task>
		findByGroupId(long groupId, int start, int end) {

		return getService().findByGroupId(groupId, start, end);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the Task with the primary key.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task
	 * @throws PortalException if a Task with the primary key could not be found
	 */
	public static com.ombcrew.taskManagementSample.model.Task getTask(
			long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTask(taskId);
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
	public static java.util.List<com.ombcrew.taskManagementSample.model.Task>
		getTasks(int start, int end) {

		return getService().getTasks(start, end);
	}

	/**
	 * crud
	 */
	public static java.util.List<com.ombcrew.taskManagementSample.model.Task>
		getTasks(long groupId, String title, int start, int end) {

		return getService().getTasks(groupId, title, start, end);
	}

	/**
	 * Returns the number of Tasks.
	 *
	 * @return the number of Tasks
	 */
	public static int getTasksCount() {
		return getService().getTasksCount();
	}

	public static com.ombcrew.taskManagementSample.model.Task updateTask(
		long taskId, String title, String description, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().updateTask(
			taskId, title, description, status, serviceContext);
	}

	/**
	 * Updates the Task in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param task the Task
	 * @return the Task that was updated
	 */
	public static com.ombcrew.taskManagementSample.model.Task updateTask(
		com.ombcrew.taskManagementSample.model.Task task) {

		return getService().updateTask(task);
	}

	public static TaskLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TaskLocalService, TaskLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TaskLocalService.class);

		ServiceTracker<TaskLocalService, TaskLocalService> serviceTracker =
			new ServiceTracker<TaskLocalService, TaskLocalService>(
				bundle.getBundleContext(), TaskLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}