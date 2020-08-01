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

package com.ombcrew.taskManagementSample.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.ombcrew.taskManagementSample.exception.NoSuchTaskManagementSampleException;
import com.ombcrew.taskManagementSample.model.TaskManagementSample;
import com.ombcrew.taskManagementSample.model.impl.TaskManagementSampleImpl;
import com.ombcrew.taskManagementSample.model.impl.TaskManagementSampleModelImpl;
import com.ombcrew.taskManagementSample.service.persistence.TaskManagementSamplePersistence;
import com.ombcrew.taskManagementSample.service.persistence.impl.constants.OMBTFAPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the Task Management Sample service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author OMB
 * @generated
 */
@Component(service = TaskManagementSamplePersistence.class)
public class TaskManagementSamplePersistenceImpl
	extends BasePersistenceImpl<TaskManagementSample>
	implements TaskManagementSamplePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TaskManagementSampleUtil</code> to access the Task Management Sample persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TaskManagementSampleImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByGroupId;
	private FinderPath _finderPathWithoutPaginationFindByGroupId;
	private FinderPath _finderPathCountByGroupId;

	/**
	 * Returns all the Task Management Samples where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByGroupId(long groupId) {
		return findByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Task Management Samples where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @return the range of matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByGroupId(
		long groupId, int start, int end) {

		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Task Management Samples where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Task Management Samples where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByGroupId;
				finderArgs = new Object[] {groupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByGroupId;
			finderArgs = new Object[] {groupId, start, end, orderByComparator};
		}

		List<TaskManagementSample> list = null;

		if (useFinderCache) {
			list = (List<TaskManagementSample>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TaskManagementSample taskManagementSample : list) {
					if (groupId != taskManagementSample.getGroupId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_TASKMANAGEMENTSAMPLE_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TaskManagementSampleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				list = (List<TaskManagementSample>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first Task Management Sample in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample findByGroupId_First(
			long groupId,
			OrderByComparator<TaskManagementSample> orderByComparator)
		throws NoSuchTaskManagementSampleException {

		TaskManagementSample taskManagementSample = fetchByGroupId_First(
			groupId, orderByComparator);

		if (taskManagementSample != null) {
			return taskManagementSample;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchTaskManagementSampleException(sb.toString());
	}

	/**
	 * Returns the first Task Management Sample in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task Management Sample, or <code>null</code> if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample fetchByGroupId_First(
		long groupId,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		List<TaskManagementSample> list = findByGroupId(
			groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Task Management Sample in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample findByGroupId_Last(
			long groupId,
			OrderByComparator<TaskManagementSample> orderByComparator)
		throws NoSuchTaskManagementSampleException {

		TaskManagementSample taskManagementSample = fetchByGroupId_Last(
			groupId, orderByComparator);

		if (taskManagementSample != null) {
			return taskManagementSample;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchTaskManagementSampleException(sb.toString());
	}

	/**
	 * Returns the last Task Management Sample in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task Management Sample, or <code>null</code> if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample fetchByGroupId_Last(
		long groupId,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<TaskManagementSample> list = findByGroupId(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Task Management Samples before and after the current Task Management Sample in the ordered set where groupId = &#63;.
	 *
	 * @param taskId the primary key of the current Task Management Sample
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public TaskManagementSample[] findByGroupId_PrevAndNext(
			long taskId, long groupId,
			OrderByComparator<TaskManagementSample> orderByComparator)
		throws NoSuchTaskManagementSampleException {

		TaskManagementSample taskManagementSample = findByPrimaryKey(taskId);

		Session session = null;

		try {
			session = openSession();

			TaskManagementSample[] array = new TaskManagementSampleImpl[3];

			array[0] = getByGroupId_PrevAndNext(
				session, taskManagementSample, groupId, orderByComparator,
				true);

			array[1] = taskManagementSample;

			array[2] = getByGroupId_PrevAndNext(
				session, taskManagementSample, groupId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected TaskManagementSample getByGroupId_PrevAndNext(
		Session session, TaskManagementSample taskManagementSample,
		long groupId, OrderByComparator<TaskManagementSample> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TASKMANAGEMENTSAMPLE_WHERE);

		sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(TaskManagementSampleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						taskManagementSample)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TaskManagementSample> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Task Management Samples where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (TaskManagementSample taskManagementSample :
				findByGroupId(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(taskManagementSample);
		}
	}

	/**
	 * Returns the number of Task Management Samples where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching Task Management Samples
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = _finderPathCountByGroupId;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TASKMANAGEMENTSAMPLE_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
		"taskManagementSample.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByG_T;
	private FinderPath _finderPathWithPaginationCountByG_T;

	/**
	 * Returns all the Task Management Samples where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @return the matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByG_T(long groupId, String title) {
		return findByG_T(
			groupId, title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Task Management Samples where groupId = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @return the range of matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByG_T(
		long groupId, String title, int start, int end) {

		return findByG_T(groupId, title, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Task Management Samples where groupId = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByG_T(
		long groupId, String title, int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		return findByG_T(groupId, title, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Task Management Samples where groupId = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TaskManagementSampleModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param start the lower bound of the range of Task Management Samples
	 * @param end the upper bound of the range of Task Management Samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findByG_T(
		long groupId, String title, int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator,
		boolean useFinderCache) {

		title = Objects.toString(title, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = _finderPathWithPaginationFindByG_T;
		finderArgs = new Object[] {
			groupId, title, start, end, orderByComparator
		};

		List<TaskManagementSample> list = null;

		if (useFinderCache) {
			list = (List<TaskManagementSample>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TaskManagementSample taskManagementSample : list) {
					if ((groupId != taskManagementSample.getGroupId()) ||
						!StringUtil.wildcardMatches(
							taskManagementSample.getTitle(), title, '_', '%',
							'\\', true)) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_TASKMANAGEMENTSAMPLE_WHERE);

			sb.append(_FINDER_COLUMN_G_T_GROUPID_2);

			boolean bindTitle = false;

			if (title.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_T_TITLE_3);
			}
			else {
				bindTitle = true;

				sb.append(_FINDER_COLUMN_G_T_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TaskManagementSampleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				if (bindTitle) {
					queryPos.add(title);
				}

				list = (List<TaskManagementSample>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first Task Management Sample in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample findByG_T_First(
			long groupId, String title,
			OrderByComparator<TaskManagementSample> orderByComparator)
		throws NoSuchTaskManagementSampleException {

		TaskManagementSample taskManagementSample = fetchByG_T_First(
			groupId, title, orderByComparator);

		if (taskManagementSample != null) {
			return taskManagementSample;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", titleLIKE");
		sb.append(title);

		sb.append("}");

		throw new NoSuchTaskManagementSampleException(sb.toString());
	}

	/**
	 * Returns the first Task Management Sample in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Task Management Sample, or <code>null</code> if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample fetchByG_T_First(
		long groupId, String title,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		List<TaskManagementSample> list = findByG_T(
			groupId, title, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Task Management Sample in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample findByG_T_Last(
			long groupId, String title,
			OrderByComparator<TaskManagementSample> orderByComparator)
		throws NoSuchTaskManagementSampleException {

		TaskManagementSample taskManagementSample = fetchByG_T_Last(
			groupId, title, orderByComparator);

		if (taskManagementSample != null) {
			return taskManagementSample;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", titleLIKE");
		sb.append(title);

		sb.append("}");

		throw new NoSuchTaskManagementSampleException(sb.toString());
	}

	/**
	 * Returns the last Task Management Sample in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Task Management Sample, or <code>null</code> if a matching Task Management Sample could not be found
	 */
	@Override
	public TaskManagementSample fetchByG_T_Last(
		long groupId, String title,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		int count = countByG_T(groupId, title);

		if (count == 0) {
			return null;
		}

		List<TaskManagementSample> list = findByG_T(
			groupId, title, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Task Management Samples before and after the current Task Management Sample in the ordered set where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param taskId the primary key of the current Task Management Sample
	 * @param groupId the group ID
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public TaskManagementSample[] findByG_T_PrevAndNext(
			long taskId, long groupId, String title,
			OrderByComparator<TaskManagementSample> orderByComparator)
		throws NoSuchTaskManagementSampleException {

		title = Objects.toString(title, "");

		TaskManagementSample taskManagementSample = findByPrimaryKey(taskId);

		Session session = null;

		try {
			session = openSession();

			TaskManagementSample[] array = new TaskManagementSampleImpl[3];

			array[0] = getByG_T_PrevAndNext(
				session, taskManagementSample, groupId, title,
				orderByComparator, true);

			array[1] = taskManagementSample;

			array[2] = getByG_T_PrevAndNext(
				session, taskManagementSample, groupId, title,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected TaskManagementSample getByG_T_PrevAndNext(
		Session session, TaskManagementSample taskManagementSample,
		long groupId, String title,
		OrderByComparator<TaskManagementSample> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_TASKMANAGEMENTSAMPLE_WHERE);

		sb.append(_FINDER_COLUMN_G_T_GROUPID_2);

		boolean bindTitle = false;

		if (title.isEmpty()) {
			sb.append(_FINDER_COLUMN_G_T_TITLE_3);
		}
		else {
			bindTitle = true;

			sb.append(_FINDER_COLUMN_G_T_TITLE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(TaskManagementSampleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		if (bindTitle) {
			queryPos.add(title);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						taskManagementSample)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TaskManagementSample> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Task Management Samples where groupId = &#63; and title LIKE &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 */
	@Override
	public void removeByG_T(long groupId, String title) {
		for (TaskManagementSample taskManagementSample :
				findByG_T(
					groupId, title, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(taskManagementSample);
		}
	}

	/**
	 * Returns the number of Task Management Samples where groupId = &#63; and title LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param title the title
	 * @return the number of matching Task Management Samples
	 */
	@Override
	public int countByG_T(long groupId, String title) {
		title = Objects.toString(title, "");

		FinderPath finderPath = _finderPathWithPaginationCountByG_T;

		Object[] finderArgs = new Object[] {groupId, title};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TASKMANAGEMENTSAMPLE_WHERE);

			sb.append(_FINDER_COLUMN_G_T_GROUPID_2);

			boolean bindTitle = false;

			if (title.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_T_TITLE_3);
			}
			else {
				bindTitle = true;

				sb.append(_FINDER_COLUMN_G_T_TITLE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				if (bindTitle) {
					queryPos.add(title);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_T_GROUPID_2 =
		"taskManagementSample.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_T_TITLE_2 =
		"taskManagementSample.title LIKE ?";

	private static final String _FINDER_COLUMN_G_T_TITLE_3 =
		"(taskManagementSample.title IS NULL OR taskManagementSample.title LIKE '')";

	public TaskManagementSamplePersistenceImpl() {
		setModelClass(TaskManagementSample.class);

		setModelImplClass(TaskManagementSampleImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the Task Management Sample in the entity cache if it is enabled.
	 *
	 * @param taskManagementSample the Task Management Sample
	 */
	@Override
	public void cacheResult(TaskManagementSample taskManagementSample) {
		entityCache.putResult(
			entityCacheEnabled, TaskManagementSampleImpl.class,
			taskManagementSample.getPrimaryKey(), taskManagementSample);

		taskManagementSample.resetOriginalValues();
	}

	/**
	 * Caches the Task Management Samples in the entity cache if it is enabled.
	 *
	 * @param taskManagementSamples the Task Management Samples
	 */
	@Override
	public void cacheResult(List<TaskManagementSample> taskManagementSamples) {
		for (TaskManagementSample taskManagementSample :
				taskManagementSamples) {

			if (entityCache.getResult(
					entityCacheEnabled, TaskManagementSampleImpl.class,
					taskManagementSample.getPrimaryKey()) == null) {

				cacheResult(taskManagementSample);
			}
			else {
				taskManagementSample.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Task Management Samples.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TaskManagementSampleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Task Management Sample.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TaskManagementSample taskManagementSample) {
		entityCache.removeResult(
			entityCacheEnabled, TaskManagementSampleImpl.class,
			taskManagementSample.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TaskManagementSample> taskManagementSamples) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TaskManagementSample taskManagementSample :
				taskManagementSamples) {

			entityCache.removeResult(
				entityCacheEnabled, TaskManagementSampleImpl.class,
				taskManagementSample.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, TaskManagementSampleImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new Task Management Sample with the primary key. Does not add the Task Management Sample to the database.
	 *
	 * @param taskId the primary key for the new Task Management Sample
	 * @return the new Task Management Sample
	 */
	@Override
	public TaskManagementSample create(long taskId) {
		TaskManagementSample taskManagementSample =
			new TaskManagementSampleImpl();

		taskManagementSample.setNew(true);
		taskManagementSample.setPrimaryKey(taskId);

		return taskManagementSample;
	}

	/**
	 * Removes the Task Management Sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample that was removed
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public TaskManagementSample remove(long taskId)
		throws NoSuchTaskManagementSampleException {

		return remove((Serializable)taskId);
	}

	/**
	 * Removes the Task Management Sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Task Management Sample
	 * @return the Task Management Sample that was removed
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public TaskManagementSample remove(Serializable primaryKey)
		throws NoSuchTaskManagementSampleException {

		Session session = null;

		try {
			session = openSession();

			TaskManagementSample taskManagementSample =
				(TaskManagementSample)session.get(
					TaskManagementSampleImpl.class, primaryKey);

			if (taskManagementSample == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTaskManagementSampleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(taskManagementSample);
		}
		catch (NoSuchTaskManagementSampleException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TaskManagementSample removeImpl(
		TaskManagementSample taskManagementSample) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(taskManagementSample)) {
				taskManagementSample = (TaskManagementSample)session.get(
					TaskManagementSampleImpl.class,
					taskManagementSample.getPrimaryKeyObj());
			}

			if (taskManagementSample != null) {
				session.delete(taskManagementSample);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (taskManagementSample != null) {
			clearCache(taskManagementSample);
		}

		return taskManagementSample;
	}

	@Override
	public TaskManagementSample updateImpl(
		TaskManagementSample taskManagementSample) {

		boolean isNew = taskManagementSample.isNew();

		if (!(taskManagementSample instanceof TaskManagementSampleModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(taskManagementSample.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					taskManagementSample);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in taskManagementSample proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TaskManagementSample implementation " +
					taskManagementSample.getClass());
		}

		TaskManagementSampleModelImpl taskManagementSampleModelImpl =
			(TaskManagementSampleModelImpl)taskManagementSample;

		Session session = null;

		try {
			session = openSession();

			if (taskManagementSample.isNew()) {
				session.save(taskManagementSample);

				taskManagementSample.setNew(false);
			}
			else {
				taskManagementSample = (TaskManagementSample)session.merge(
					taskManagementSample);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				taskManagementSampleModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByGroupId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByGroupId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((taskManagementSampleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByGroupId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					taskManagementSampleModelImpl.getOriginalGroupId()
				};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);

				args = new Object[] {
					taskManagementSampleModelImpl.getGroupId()
				};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, TaskManagementSampleImpl.class,
			taskManagementSample.getPrimaryKey(), taskManagementSample, false);

		taskManagementSample.resetOriginalValues();

		return taskManagementSample;
	}

	/**
	 * Returns the Task Management Sample with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Task Management Sample
	 * @return the Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public TaskManagementSample findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTaskManagementSampleException {

		TaskManagementSample taskManagementSample = fetchByPrimaryKey(
			primaryKey);

		if (taskManagementSample == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTaskManagementSampleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return taskManagementSample;
	}

	/**
	 * Returns the Task Management Sample with the primary key or throws a <code>NoSuchTaskManagementSampleException</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample
	 * @throws NoSuchTaskManagementSampleException if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public TaskManagementSample findByPrimaryKey(long taskId)
		throws NoSuchTaskManagementSampleException {

		return findByPrimaryKey((Serializable)taskId);
	}

	/**
	 * Returns the Task Management Sample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taskId the primary key of the Task Management Sample
	 * @return the Task Management Sample, or <code>null</code> if a Task Management Sample with the primary key could not be found
	 */
	@Override
	public TaskManagementSample fetchByPrimaryKey(long taskId) {
		return fetchByPrimaryKey((Serializable)taskId);
	}

	/**
	 * Returns all the Task Management Samples.
	 *
	 * @return the Task Management Samples
	 */
	@Override
	public List<TaskManagementSample> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TaskManagementSample> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TaskManagementSample> findAll(
		int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TaskManagementSample> findAll(
		int start, int end,
		OrderByComparator<TaskManagementSample> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<TaskManagementSample> list = null;

		if (useFinderCache) {
			list = (List<TaskManagementSample>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TASKMANAGEMENTSAMPLE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TASKMANAGEMENTSAMPLE;

				sql = sql.concat(TaskManagementSampleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TaskManagementSample>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the Task Management Samples from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TaskManagementSample taskManagementSample : findAll()) {
			remove(taskManagementSample);
		}
	}

	/**
	 * Returns the number of Task Management Samples.
	 *
	 * @return the number of Task Management Samples
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_TASKMANAGEMENTSAMPLE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "taskId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TASKMANAGEMENTSAMPLE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TaskManagementSampleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Task Management Sample persistence.
	 */
	@Activate
	public void activate() {
		TaskManagementSampleModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		TaskManagementSampleModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			TaskManagementSampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			TaskManagementSampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			TaskManagementSampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			TaskManagementSampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] {Long.class.getName()},
			TaskManagementSampleModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByG_T = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			TaskManagementSampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithPaginationCountByG_T = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_T",
			new String[] {Long.class.getName(), String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(TaskManagementSampleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = OMBTFAPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.ombcrew.taskManagementSample.model.TaskManagementSample"),
			true);
	}

	@Override
	@Reference(
		target = OMBTFAPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OMBTFAPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TASKMANAGEMENTSAMPLE =
		"SELECT taskManagementSample FROM TaskManagementSample taskManagementSample";

	private static final String _SQL_SELECT_TASKMANAGEMENTSAMPLE_WHERE =
		"SELECT taskManagementSample FROM TaskManagementSample taskManagementSample WHERE ";

	private static final String _SQL_COUNT_TASKMANAGEMENTSAMPLE =
		"SELECT COUNT(taskManagementSample) FROM TaskManagementSample taskManagementSample";

	private static final String _SQL_COUNT_TASKMANAGEMENTSAMPLE_WHERE =
		"SELECT COUNT(taskManagementSample) FROM TaskManagementSample taskManagementSample WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"taskManagementSample.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TaskManagementSample exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TaskManagementSample exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TaskManagementSamplePersistenceImpl.class);

	static {
		try {
			Class.forName(OMBTFAPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}