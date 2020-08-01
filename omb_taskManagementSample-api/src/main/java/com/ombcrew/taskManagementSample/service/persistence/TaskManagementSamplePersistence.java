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

import com.ombcrew.taskManagementSample.exception.NoSuchTaskManagementSampleException;
import com.ombcrew.taskManagementSample.model.TaskManagementSample;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the Task Management Sample service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author OMB
 * @see TaskManagementSampleUtil
 * @generated
 */
@ProviderType
public interface TaskManagementSamplePersistence
	extends BasePersistence<TaskManagementSample> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskManagementSampleUtil} to access the Task Management Sample persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the Task Management Sample in the entity cache if it is enabled.
	 *
	 * @param taskManagementSample the Task Management Sample
	 */
	public void cacheResult(TaskManagementSample taskManagementSample);

	/**
	 * Caches the Task Management Samples in the entity cache if it is enabled.
	 *
	 * @param taskManagementSamples the Task Management Samples
	 */
	public void cacheResult(
		java.util.List<TaskManagementSample> taskManagementSamples);

	/**
	 * Creates a new Task Management Sample with the primary key. Does not add the Task Management Sample to the database.
	 *
	 * @param taskId the primary key for the new Task Management Sample
	 * @return the new Task Management Sample
	 */
	public TaskManagementSample create(long taskId);

	/**
	 * Removes the Task Management Sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample that was removed
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	public TaskManagementSample remove(long taskId)
		throws NoSuchTaskManagementSampleException;

	public TaskManagementSample updateImpl(
		TaskManagementSample taskManagementSample);

	/**
	 * Returns the Task Management Sample with the primary key or throws a <code>NoSuchTaskManagementSampleException</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	public TaskManagementSample findByPrimaryKey(long taskId)
		throws NoSuchTaskManagementSampleException;

	/**
	 * Returns the Task Management Sample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample, or <code>null</code> if a Task Management Sample with the primary key could not be found
	 */
	public TaskManagementSample fetchByPrimaryKey(long taskId);

	/**
	 * Returns all the Task Management Samples.
	 *
	 * @return the Task Management Samples
	 */
	public java.util.List<TaskManagementSample> findAll();

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
	public java.util.List<TaskManagementSample> findAll(int start, int end);

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
	public java.util.List<TaskManagementSample> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskManagementSample>
			orderByComparator);

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
	public java.util.List<TaskManagementSample> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskManagementSample>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the Task Management Samples from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of Task Management Samples.
	 *
	 * @return the number of Task Management Samples
	 */
	public int countAll();

}