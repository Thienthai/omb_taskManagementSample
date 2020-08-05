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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.ombcrew.taskManagementSample.exception.NoSuchTaskException;
import com.ombcrew.taskManagementSample.model.Task;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the Task service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author OMB
 * @see TaskUtil
 * @generated
 */
@ProviderType
public interface TaskPersistence extends BasePersistence<Task> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskUtil} to access the Task persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the Tasks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching Tasks
	 */
	public java.util.List<Task> findByGroupId(long groupId);

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
	public java.util.List<Task> findByGroupId(long groupId, int start, int end);

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
	public java.util.List<Task> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator);

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
	public java.util.List<Task> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public Task findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Task>
				orderByComparator)
		throws NoSuchTaskException;

	/**
	 * Returns the first Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public Task fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator);

	/**
	 * Returns the last Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public Task findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Task>
				orderByComparator)
		throws NoSuchTaskException;

	/**
	 * Returns the last Task in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public Task fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator);

	/**
	 * Returns the Tasks before and after the current Task in the ordered set where groupId = &#63;.
	 *
	 * @param taskId the primary key of the current Task
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Task
	 * @throws NoSuchTaskException if a Task with the primary key could not be found
	 */
	public Task[] findByGroupId_PrevAndNext(
			long taskId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Task>
				orderByComparator)
		throws NoSuchTaskException;

	/**
	 * Removes all the Tasks where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of Tasks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching Tasks
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the Tasks where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @return the matching Tasks
	 */
	public java.util.List<Task> findByG_T(long groupId, String title);

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
	public java.util.List<Task> findByG_T(
		long groupId, String title, int start, int end);

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
	public java.util.List<Task> findByG_T(
		long groupId, String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator);

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
	public java.util.List<Task> findByG_T(
		long groupId, String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public Task findByG_T_First(
			long groupId, String title,
			com.liferay.portal.kernel.util.OrderByComparator<Task>
				orderByComparator)
		throws NoSuchTaskException;

	/**
	 * Returns the first Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public Task fetchByG_T_First(
		long groupId, String title,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator);

	/**
	 * Returns the last Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task
	 * @throws NoSuchTaskException if a matching Task could not be found
	 */
	public Task findByG_T_Last(
			long groupId, String title,
			com.liferay.portal.kernel.util.OrderByComparator<Task>
				orderByComparator)
		throws NoSuchTaskException;

	/**
	 * Returns the last Task in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task, or <code>null</code> if a matching Task could not be found
	 */
	public Task fetchByG_T_Last(
		long groupId, String title,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator);

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
	public Task[] findByG_T_PrevAndNext(
			long taskId, long groupId, String title,
			com.liferay.portal.kernel.util.OrderByComparator<Task>
				orderByComparator)
		throws NoSuchTaskException;

	/**
	 * Removes all the Tasks where groupId = &#63; and title LIKE &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 */
	public void removeByG_T(long groupId, String title);

	/**
	 * Returns the number of Tasks where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @return the number of matching Tasks
	 */
	public int countByG_T(long groupId, String title);

	/**
	 * Caches the Task in the entity cache if it is enabled.
	 *
	 * @param task the Task
	 */
	public void cacheResult(Task task);

	/**
	 * Caches the Tasks in the entity cache if it is enabled.
	 *
	 * @param tasks the Tasks
	 */
	public void cacheResult(java.util.List<Task> tasks);

	/**
	 * Creates a new Task with the primary key. Does not add the Task to the database.
	 *
	 * @param taskId the primary key for the new Task
	 * @return the new Task
	 */
	public Task create(long taskId);

	/**
	 * Removes the Task with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task that was removed
	 * @throws NoSuchTaskException if a Task with the primary key could not be found
	 */
	public Task remove(long taskId) throws NoSuchTaskException;

	public Task updateImpl(Task task);

	/**
	 * Returns the Task with the primary key or throws a <code>NoSuchTaskException</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task
	 * @throws NoSuchTaskException if a Task with the primary key could not be found
	 */
	public Task findByPrimaryKey(long taskId) throws NoSuchTaskException;

	/**
	 * Returns the Task with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task
	 * @return the Task, or <code>null</code> if a Task with the primary key could not be found
	 */
	public Task fetchByPrimaryKey(long taskId);

	/**
	 * Returns all the Tasks.
	 *
	 * @return the Tasks
	 */
	public java.util.List<Task> findAll();

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
	public java.util.List<Task> findAll(int start, int end);

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
	public java.util.List<Task> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator);

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
	public java.util.List<Task> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the Tasks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of Tasks.
	 *
	 * @return the number of Tasks
	 */
	public int countAll();

}