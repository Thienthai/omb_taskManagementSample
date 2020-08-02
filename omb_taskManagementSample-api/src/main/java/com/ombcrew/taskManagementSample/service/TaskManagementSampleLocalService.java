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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.ombcrew.taskManagementSample.model.TaskManagementSample;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for TaskManagementSample. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author OMB
 * @see TaskManagementSampleLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface TaskManagementSampleLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskManagementSampleLocalServiceUtil} to access the Task Management Sample local service. Add custom service methods to <code>com.ombcrew.taskManagementSample.service.impl.TaskManagementSampleLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public TaskManagementSample addtaskManagementSample(
		String title, String description, long assignedUserId,
		ServiceContext serviceContext);

	/**
	 * Adds the Task Management Sample to the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public TaskManagementSample addTaskManagementSample(
		TaskManagementSample taskManagementSample);

	public int countByG_T(long groupId, String title);

	/**
	 * counter
	 */
	public int countByGroupId(long groupId);

	/**
	 * Creates a new Task Management Sample with the primary key. Does not add the Task Management Sample to the database.
	 *
	 * @param taskId the primary key for the new Task Management Sample
	 * @return the new Task Management Sample
	 */
	@Transactional(enabled = false)
	public TaskManagementSample createTaskManagementSample(long taskId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public boolean deleteSample(long taskId);

	/**
	 * Deletes the Task Management Sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample that was removed
	 * @throws PortalException if a Task Management Sample with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public TaskManagementSample deleteTaskManagementSample(long taskId)
		throws PortalException;

	/**
	 * Deletes the Task Management Sample from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public TaskManagementSample deleteTaskManagementSample(
		TaskManagementSample taskManagementSample);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TaskManagementSample fetchTaskManagementSample(long taskId);

	public List<TaskManagementSample> findByG_T(
		long groupId, String title, int start, int end);

	/**
	 * finder
	 */
	public List<TaskManagementSample> findByGroupId(
		long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * entity
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TaskManagementSample getSample(long taskId);

	/**
	 * Returns the Task Management Sample with the primary key.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample
	 * @throws PortalException if a Task Management Sample with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TaskManagementSample getTaskManagementSample(long taskId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TaskManagementSample> getTaskManagementSample(
		long groupId, String title, int start, int end);

	/**
	 * crud
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTaskManagementSampleCount(long groupId, String title);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TaskManagementSample> getTaskManagementSamples(
		int start, int end);

	/**
	 * Returns the number of Task Management Samples.
	 *
	 * @return the number of Task Management Samples
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTaskManagementSamplesCount();

	public boolean updataskManagementSample(
		long taskId, String title, long createdUserId, String description,
		long assignedUserId, ServiceContext serviceContext);

	/**
	 * Updates the Task Management Sample in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param taskManagementSample the Task Management Sample
	 * @return the Task Management Sample that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public TaskManagementSample updateTaskManagementSample(
		TaskManagementSample taskManagementSample);

}