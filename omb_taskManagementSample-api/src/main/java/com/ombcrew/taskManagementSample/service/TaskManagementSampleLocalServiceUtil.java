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
 * Provides the local service utility for TaskManagementSample. This utility wraps
 * <code>com.ombcrew.taskManagementSample.service.impl.TaskManagementSampleLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author OMB
 * @see TaskManagementSampleLocalService
 * @generated
 */
public class TaskManagementSampleLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.ombcrew.taskManagementSample.service.impl.TaskManagementSampleLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
		addtaskManagementSample(
			String title, String description, long assignedUserId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addtaskManagementSample(
			title, description, assignedUserId, serviceContext);
	}

	/**
	 * Adds the Task Management Sample to the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was added
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
		addTaskManagementSample(
			com.ombcrew.taskManagementSample.model.TaskManagementSample
				taskManagementSample) {

		return getService().addTaskManagementSample(taskManagementSample);
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
	 * Creates a new Task Management Sample with the primary key. Does not add the Task Management Sample to the database.
	 *
	 * @param taskId the primary key for the new Task Management Sample
	 * @return the new Task Management Sample
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
		createTaskManagementSample(long taskId) {

		return getService().createTaskManagementSample(taskId);
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

	public static boolean deleteSample(long taskId) {
		return getService().deleteSample(taskId);
	}

	/**
	 * Deletes the Task Management Sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample that was removed
	 * @throws PortalException if a Task Management Sample with the primary key could not be found
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
			deleteTaskManagementSample(long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteTaskManagementSample(taskId);
	}

	/**
	 * Deletes the Task Management Sample from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was removed
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
		deleteTaskManagementSample(
			com.ombcrew.taskManagementSample.model.TaskManagementSample
				taskManagementSample) {

		return getService().deleteTaskManagementSample(taskManagementSample);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskManagementSampleModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ombcrew.taskManagementSample.model.impl.TaskManagementSampleModelImpl</code>.
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

	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
		fetchTaskManagementSample(long taskId) {

		return getService().fetchTaskManagementSample(taskId);
	}

	public static java.util.List
		<com.ombcrew.taskManagementSample.model.TaskManagementSample> findByG_T(
			long groupId, String title, int start, int end) {

		return getService().findByG_T(groupId, title, start, end);
	}

	/**
	 * finder
	 */
	public static java.util.List
		<com.ombcrew.taskManagementSample.model.TaskManagementSample>
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
	 * entity
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
		getSample(long taskId) {

		return getService().getSample(taskId);
	}

	/**
	 * Returns the Task Management Sample with the primary key.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample
	 * @throws PortalException if a Task Management Sample with the primary key could not be found
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
			getTaskManagementSample(long taskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTaskManagementSample(taskId);
	}

	public static java.util.List
		<com.ombcrew.taskManagementSample.model.TaskManagementSample>
			getTaskManagementSample(
				long groupId, String title, int start, int end) {

		return getService().getTaskManagementSample(groupId, title, start, end);
	}

	/**
	 * crud
	 */
	public static int getTaskManagementSampleCount(long groupId, String title) {
		return getService().getTaskManagementSampleCount(groupId, title);
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
	public static java.util.List
		<com.ombcrew.taskManagementSample.model.TaskManagementSample>
			getTaskManagementSamples(int start, int end) {

		return getService().getTaskManagementSamples(start, end);
	}

	/**
	 * Returns the number of Task Management Samples.
	 *
	 * @return the number of Task Management Samples
	 */
	public static int getTaskManagementSamplesCount() {
		return getService().getTaskManagementSamplesCount();
	}

	public static boolean updataskManagementSample(
		long taskId, String title, String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().updataskManagementSample(
			taskId, title, description, serviceContext);
	}

	/**
	 * Updates the Task Management Sample in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was updated
	 */
	public static com.ombcrew.taskManagementSample.model.TaskManagementSample
		updateTaskManagementSample(
			com.ombcrew.taskManagementSample.model.TaskManagementSample
				taskManagementSample) {

		return getService().updateTaskManagementSample(taskManagementSample);
	}

	public static TaskManagementSampleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<TaskManagementSampleLocalService, TaskManagementSampleLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			TaskManagementSampleLocalService.class);

		ServiceTracker
			<TaskManagementSampleLocalService, TaskManagementSampleLocalService>
				serviceTracker =
					new ServiceTracker
						<TaskManagementSampleLocalService,
						 TaskManagementSampleLocalService>(
							 bundle.getBundleContext(),
							 TaskManagementSampleLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}