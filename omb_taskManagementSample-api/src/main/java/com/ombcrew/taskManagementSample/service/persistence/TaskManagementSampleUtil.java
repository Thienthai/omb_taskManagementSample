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

package com.ombcrew.taskManagementSample.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.ombcrew.taskManagementSample.model.TaskManagementSample;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the Task Management Sample service. This utility wraps <code>com.ombcrew.taskManagementSample.service.persistence.impl.TaskManagementSamplePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author OMB
 * @see TaskManagementSamplePersistence
 * @generated
 */
public class TaskManagementSampleUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(TaskManagementSample taskManagementSample) {
		getPersistence().clearCache(taskManagementSample);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, TaskManagementSample> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TaskManagementSample> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TaskManagementSample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TaskManagementSample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TaskManagementSample update(
		TaskManagementSample taskManagementSample) {

		return getPersistence().update(taskManagementSample);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TaskManagementSample update(
		TaskManagementSample taskManagementSample,
		ServiceContext serviceContext) {

		return getPersistence().update(taskManagementSample, serviceContext);
	}

	/**
	 * Caches the Task Management Sample in the entity cache if it is enabled.
	 *
	 * @param taskManagementSample the Task Management Sample
	 */
	public static void cacheResult(TaskManagementSample taskManagementSample) {
		getPersistence().cacheResult(taskManagementSample);
	}

	/**
	 * Caches the Task Management Samples in the entity cache if it is enabled.
	 *
	 * @param taskManagementSamples the Task Management Samples
	 */
	public static void cacheResult(
		List<TaskManagementSample> taskManagementSamples) {

		getPersistence().cacheResult(taskManagementSamples);
	}

	/**
	 * Creates a new Task Management Sample with the primary key. Does not add the Task Management Sample to the database.
	 *
	 * @param taskId the primary key for the new Task Management Sample
	 * @return the new Task Management Sample
	 */
	public static TaskManagementSample create(long taskId) {
		return getPersistence().create(taskId);
	}

	/**
	 * Removes the Task Management Sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample that was removed
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	public static TaskManagementSample remove(long taskId)
		throws com.ombcrew.taskManagementSample.exception.
			NoSuchTaskManagementSampleException {

		return getPersistence().remove(taskId);
	}

	public static TaskManagementSample updateImpl(
		TaskManagementSample taskManagementSample) {

		return getPersistence().updateImpl(taskManagementSample);
	}

	/**
	 * Returns the Task Management Sample with the primary key or throws a <code>NoSuchTaskManagementSampleException</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	public static TaskManagementSample findByPrimaryKey(long taskId)
		throws com.ombcrew.taskManagementSample.exception.
			NoSuchTaskManagementSampleException {

		return getPersistence().findByPrimaryKey(taskId);
	}

	/**
	 * Returns the Task Management Sample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample, or <code>null</code> if a Task Management Sample with the primary key could not be found
	 */
	public static TaskManagementSample fetchByPrimaryKey(long taskId) {
		return getPersistence().fetchByPrimaryKey(taskId);
	}

	/**
	 * Returns all the Task Management Samples.
	 *
	 * @return the Task Management Samples
	 */
	public static List<TaskManagementSample> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the Task Management Samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @return the range of Task Management Samples
	 */
	public static List<TaskManagementSample> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the Task Management Samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Task Management Samples
	 */
	public static List<TaskManagementSample> findAll(
		int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the Task Management Samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of Task Management Samples
	 */
	public static List<TaskManagementSample> findAll(
		int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the Task Management Samples from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of Task Management Samples.
	 *
	 * @return the number of Task Management Samples
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TaskManagementSamplePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<TaskManagementSamplePersistence, TaskManagementSamplePersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			TaskManagementSamplePersistence.class);

		ServiceTracker
			<TaskManagementSamplePersistence, TaskManagementSamplePersistence>
				serviceTracker =
					new ServiceTracker
						<TaskManagementSamplePersistence,
						 TaskManagementSamplePersistence>(
							 bundle.getBundleContext(),
							 TaskManagementSamplePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}