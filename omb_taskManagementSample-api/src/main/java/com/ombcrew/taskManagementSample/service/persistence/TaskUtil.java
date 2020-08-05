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

import com.ombcrew.taskManagementSample.model.Task;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the Task service. This utility wraps <code>com.ombcrew.taskManagementSample.service.persistence.impl.TaskPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author OMB
 * @see TaskPersistence
 * @generated
 */
public class TaskUtil {

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
	public static void clearCache(Task task) {
		getPersistence().clearCache(task);
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
	public static Map<Serializable, Task> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Task> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Task> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Task> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Task> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Task update(Task task) {
		return getPersistence().update(task);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Task update(Task task, ServiceContext serviceContext) {
		return getPersistence().update(task, serviceContext);
	}

	/**
	 * Returns all the Tasks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching Tasks
	 */
	public static List<Task> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the Tasks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @return the range of matching Tasks
	 */
	public static List<Task> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the Tasks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Tasks
	 */
	public static List<Task> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Task> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the Tasks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching Tasks
	 */
	public static List<Task> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Task> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public static Task findByGroupId_First(
			long groupId, OrderByComparator<Task> orderByComparator)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public static Task fetchByGroupId_First(
		long groupId, OrderByComparator<Task> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public static Task findByGroupId_Last(
			long groupId, OrderByComparator<Task> orderByComparator)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public static Task fetchByGroupId_Last(
		long groupId, OrderByComparator<Task> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the Tasks before and after the current Task in the ordered set where groupId = &#63;.
	 *
	 * @param taskId the primary key of the current Task
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Task
	 * @throws NoSuchTaskException if a Task with the primary key could not be found
	 */
	public static Task[] findByGroupId_PrevAndNext(
			long taskId, long groupId,
			OrderByComparator<Task> orderByComparator)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().findByGroupId_PrevAndNext(
			taskId, groupId, orderByComparator);
	}

	/**
	 * Removes all the Tasks where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of Tasks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching Tasks
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the Tasks where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @return the matching Tasks
	 */
	public static List<Task> findByG_T(long groupId, String title) {
		return getPersistence().findByG_T(groupId, title);
	}

	/**
	 * Returns a range of all the Tasks where groupId = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @return the range of matching Tasks
	 */
	public static List<Task> findByG_T(
		long groupId, String title, int start, int end) {

		return getPersistence().findByG_T(groupId, title, start, end);
	}

	/**
	 * Returns an ordered range of all the Tasks where groupId = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Tasks
	 */
	public static List<Task> findByG_T(
		long groupId, String title, int start, int end,
		OrderByComparator<Task> orderByComparator) {

		return getPersistence().findByG_T(
			groupId, title, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the Tasks where groupId = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching Tasks
	 */
	public static List<Task> findByG_T(
		long groupId, String title, int start, int end,
		OrderByComparator<Task> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_T(
			groupId, title, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public static Task findByG_T_First(
			long groupId, String title,
			OrderByComparator<Task> orderByComparator)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().findByG_T_First(
			groupId, title, orderByComparator);
	}

	/**
	 * Returns the first Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public static Task fetchByG_T_First(
		long groupId, String title, OrderByComparator<Task> orderByComparator) {

		return getPersistence().fetchByG_T_First(
			groupId, title, orderByComparator);
	}

	/**
	 * Returns the last Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public static Task findByG_T_Last(
			long groupId, String title,
			OrderByComparator<Task> orderByComparator)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().findByG_T_Last(
			groupId, title, orderByComparator);
	}

	/**
	 * Returns the last Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public static Task fetchByG_T_Last(
		long groupId, String title, OrderByComparator<Task> orderByComparator) {

		return getPersistence().fetchByG_T_Last(
			groupId, title, orderByComparator);
	}

	/**
	 * Returns the Tasks before and after the current Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param taskId the primary key of the current Task
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Task
	 * @throws NoSuchTaskException if a Task with the primary key could not be found
	 */
	public static Task[] findByG_T_PrevAndNext(
			long taskId, long groupId, String title,
			OrderByComparator<Task> orderByComparator)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().findByG_T_PrevAndNext(
			taskId, groupId, title, orderByComparator);
	}

	/**
	 * Removes all the Tasks where groupId = &#63; and title LIKE &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 */
	public static void removeByG_T(long groupId, String title) {
		getPersistence().removeByG_T(groupId, title);
	}

	/**
	 * Returns the number of Tasks where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @return the number of matching Tasks
	 */
	public static int countByG_T(long groupId, String title) {
		return getPersistence().countByG_T(groupId, title);
	}

	/**
	 * Caches the Task in the entity cache if it is enabled.
	 *
	 * @param task the Task
	 */
	public static void cacheResult(Task task) {
		getPersistence().cacheResult(task);
	}

	/**
	 * Caches the Tasks in the entity cache if it is enabled.
	 *
	 * @param tasks the Tasks
	 */
	public static void cacheResult(List<Task> tasks) {
		getPersistence().cacheResult(tasks);
	}

	/**
	 * Creates a new Task with the primary key. Does not add the Task to the database.
	 *
	 * @param taskId the primary key for the new Task
	 * @return the new Task
	 */
	public static Task create(long taskId) {
		return getPersistence().create(taskId);
	}

	/**
	 * Removes the Task with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task that was removed
	 * @throws NoSuchTaskException if a Task with the primary key could not be found
	 */
	public static Task remove(long taskId)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().remove(taskId);
	}

	public static Task updateImpl(Task task) {
		return getPersistence().updateImpl(task);
	}

	/**
	 * Returns the Task with the primary key or throws a <code>NoSuchTaskException</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task
	 * @throws NoSuchTaskException if a Task with the primary key could not be found
	 */
	public static Task findByPrimaryKey(long taskId)
		throws com.ombcrew.taskManagementSample.exception.NoSuchTaskException {

		return getPersistence().findByPrimaryKey(taskId);
	}

	/**
	 * Returns the Task with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task, or <code>null</code> if a Task with the primary key could not be found
	 */
	public static Task fetchByPrimaryKey(long taskId) {
		return getPersistence().fetchByPrimaryKey(taskId);
	}

	/**
	 * Returns all the Tasks.
	 *
	 * @return the Tasks
	 */
	public static List<Task> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the Tasks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @return the range of Tasks
	 */
	public static List<Task> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the Tasks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Tasks
	 */
	public static List<Task> findAll(
		int start, int end, OrderByComparator<Task> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the Tasks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Tasks
	 * @param end the upper bound of the range of Tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of Tasks
	 */
	public static List<Task> findAll(
		int start, int end, OrderByComparator<Task> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the Tasks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of Tasks.
	 *
	 * @return the number of Tasks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TaskPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TaskPersistence, TaskPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TaskPersistence.class);

		ServiceTracker<TaskPersistence, TaskPersistence> serviceTracker =
			new ServiceTracker<TaskPersistence, TaskPersistence>(
				bundle.getBundleContext(), TaskPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}