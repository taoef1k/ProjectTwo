/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.cxrus.service.persistence;

import com.cxrus.NoSuchCategoryArticlesException;

import com.cxrus.model.CategoryArticles;
import com.cxrus.model.impl.CategoryArticlesImpl;
import com.cxrus.model.impl.CategoryArticlesModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the category articles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mohdtaufik
 * @see CategoryArticlesPersistence
 * @see CategoryArticlesUtil
 * @generated
 */
public class CategoryArticlesPersistenceImpl extends BasePersistenceImpl<CategoryArticles>
	implements CategoryArticlesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CategoryArticlesUtil} to access the category articles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CategoryArticlesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
			CategoryArticlesModelImpl.FINDER_CACHE_ENABLED,
			CategoryArticlesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
			CategoryArticlesModelImpl.FINDER_CACHE_ENABLED,
			CategoryArticlesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
			CategoryArticlesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CategoryArticlesPersistenceImpl() {
		setModelClass(CategoryArticles.class);
	}

	/**
	 * Caches the category articles in the entity cache if it is enabled.
	 *
	 * @param categoryArticles the category articles
	 */
	@Override
	public void cacheResult(CategoryArticles categoryArticles) {
		EntityCacheUtil.putResult(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
			CategoryArticlesImpl.class, categoryArticles.getPrimaryKey(),
			categoryArticles);

		categoryArticles.resetOriginalValues();
	}

	/**
	 * Caches the category articleses in the entity cache if it is enabled.
	 *
	 * @param categoryArticleses the category articleses
	 */
	@Override
	public void cacheResult(List<CategoryArticles> categoryArticleses) {
		for (CategoryArticles categoryArticles : categoryArticleses) {
			if (EntityCacheUtil.getResult(
						CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
						CategoryArticlesImpl.class,
						categoryArticles.getPrimaryKey()) == null) {
				cacheResult(categoryArticles);
			}
			else {
				categoryArticles.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all category articleses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CategoryArticlesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CategoryArticlesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the category articles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CategoryArticles categoryArticles) {
		EntityCacheUtil.removeResult(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
			CategoryArticlesImpl.class, categoryArticles.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CategoryArticles> categoryArticleses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CategoryArticles categoryArticles : categoryArticleses) {
			EntityCacheUtil.removeResult(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
				CategoryArticlesImpl.class, categoryArticles.getPrimaryKey());
		}
	}

	/**
	 * Creates a new category articles with the primary key. Does not add the category articles to the database.
	 *
	 * @param categoryArticlesId the primary key for the new category articles
	 * @return the new category articles
	 */
	@Override
	public CategoryArticles create(long categoryArticlesId) {
		CategoryArticles categoryArticles = new CategoryArticlesImpl();

		categoryArticles.setNew(true);
		categoryArticles.setPrimaryKey(categoryArticlesId);

		return categoryArticles;
	}

	/**
	 * Removes the category articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryArticlesId the primary key of the category articles
	 * @return the category articles that was removed
	 * @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryArticles remove(long categoryArticlesId)
		throws NoSuchCategoryArticlesException, SystemException {
		return remove((Serializable)categoryArticlesId);
	}

	/**
	 * Removes the category articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the category articles
	 * @return the category articles that was removed
	 * @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryArticles remove(Serializable primaryKey)
		throws NoSuchCategoryArticlesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CategoryArticles categoryArticles = (CategoryArticles)session.get(CategoryArticlesImpl.class,
					primaryKey);

			if (categoryArticles == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCategoryArticlesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(categoryArticles);
		}
		catch (NoSuchCategoryArticlesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CategoryArticles removeImpl(CategoryArticles categoryArticles)
		throws SystemException {
		categoryArticles = toUnwrappedModel(categoryArticles);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(categoryArticles)) {
				categoryArticles = (CategoryArticles)session.get(CategoryArticlesImpl.class,
						categoryArticles.getPrimaryKeyObj());
			}

			if (categoryArticles != null) {
				session.delete(categoryArticles);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (categoryArticles != null) {
			clearCache(categoryArticles);
		}

		return categoryArticles;
	}

	@Override
	public CategoryArticles updateImpl(
		com.cxrus.model.CategoryArticles categoryArticles)
		throws SystemException {
		categoryArticles = toUnwrappedModel(categoryArticles);

		boolean isNew = categoryArticles.isNew();

		Session session = null;

		try {
			session = openSession();

			if (categoryArticles.isNew()) {
				session.save(categoryArticles);

				categoryArticles.setNew(false);
			}
			else {
				session.merge(categoryArticles);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
			CategoryArticlesImpl.class, categoryArticles.getPrimaryKey(),
			categoryArticles);

		return categoryArticles;
	}

	protected CategoryArticles toUnwrappedModel(
		CategoryArticles categoryArticles) {
		if (categoryArticles instanceof CategoryArticlesImpl) {
			return categoryArticles;
		}

		CategoryArticlesImpl categoryArticlesImpl = new CategoryArticlesImpl();

		categoryArticlesImpl.setNew(categoryArticles.isNew());
		categoryArticlesImpl.setPrimaryKey(categoryArticles.getPrimaryKey());

		categoryArticlesImpl.setCategoryArticlesId(categoryArticles.getCategoryArticlesId());
		categoryArticlesImpl.setGroupId(categoryArticles.getGroupId());
		categoryArticlesImpl.setCompanyId(categoryArticles.getCompanyId());
		categoryArticlesImpl.setUserId(categoryArticles.getUserId());
		categoryArticlesImpl.setUserName(categoryArticles.getUserName());
		categoryArticlesImpl.setCreateDate(categoryArticles.getCreateDate());
		categoryArticlesImpl.setModifiedDate(categoryArticles.getModifiedDate());
		categoryArticlesImpl.setCategoryName(categoryArticles.getCategoryName());

		return categoryArticlesImpl;
	}

	/**
	 * Returns the category articles with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the category articles
	 * @return the category articles
	 * @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryArticles findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCategoryArticlesException, SystemException {
		CategoryArticles categoryArticles = fetchByPrimaryKey(primaryKey);

		if (categoryArticles == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCategoryArticlesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return categoryArticles;
	}

	/**
	 * Returns the category articles with the primary key or throws a {@link com.cxrus.NoSuchCategoryArticlesException} if it could not be found.
	 *
	 * @param categoryArticlesId the primary key of the category articles
	 * @return the category articles
	 * @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryArticles findByPrimaryKey(long categoryArticlesId)
		throws NoSuchCategoryArticlesException, SystemException {
		return findByPrimaryKey((Serializable)categoryArticlesId);
	}

	/**
	 * Returns the category articles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the category articles
	 * @return the category articles, or <code>null</code> if a category articles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryArticles fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CategoryArticles categoryArticles = (CategoryArticles)EntityCacheUtil.getResult(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
				CategoryArticlesImpl.class, primaryKey);

		if (categoryArticles == _nullCategoryArticles) {
			return null;
		}

		if (categoryArticles == null) {
			Session session = null;

			try {
				session = openSession();

				categoryArticles = (CategoryArticles)session.get(CategoryArticlesImpl.class,
						primaryKey);

				if (categoryArticles != null) {
					cacheResult(categoryArticles);
				}
				else {
					EntityCacheUtil.putResult(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
						CategoryArticlesImpl.class, primaryKey,
						_nullCategoryArticles);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CategoryArticlesModelImpl.ENTITY_CACHE_ENABLED,
					CategoryArticlesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return categoryArticles;
	}

	/**
	 * Returns the category articles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoryArticlesId the primary key of the category articles
	 * @return the category articles, or <code>null</code> if a category articles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryArticles fetchByPrimaryKey(long categoryArticlesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)categoryArticlesId);
	}

	/**
	 * Returns all the category articleses.
	 *
	 * @return the category articleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CategoryArticles> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the category articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cxrus.model.impl.CategoryArticlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of category articleses
	 * @param end the upper bound of the range of category articleses (not inclusive)
	 * @return the range of category articleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CategoryArticles> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the category articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cxrus.model.impl.CategoryArticlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of category articleses
	 * @param end the upper bound of the range of category articleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of category articleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CategoryArticles> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CategoryArticles> list = (List<CategoryArticles>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CATEGORYARTICLES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CATEGORYARTICLES;

				if (pagination) {
					sql = sql.concat(CategoryArticlesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CategoryArticles>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CategoryArticles>(list);
				}
				else {
					list = (List<CategoryArticles>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the category articleses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CategoryArticles categoryArticles : findAll()) {
			remove(categoryArticles);
		}
	}

	/**
	 * Returns the number of category articleses.
	 *
	 * @return the number of category articleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CATEGORYARTICLES);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the category articles persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.cxrus.model.CategoryArticles")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CategoryArticles>> listenersList = new ArrayList<ModelListener<CategoryArticles>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CategoryArticles>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CategoryArticlesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CATEGORYARTICLES = "SELECT categoryArticles FROM CategoryArticles categoryArticles";
	private static final String _SQL_COUNT_CATEGORYARTICLES = "SELECT COUNT(categoryArticles) FROM CategoryArticles categoryArticles";
	private static final String _ORDER_BY_ENTITY_ALIAS = "categoryArticles.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CategoryArticles exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CategoryArticlesPersistenceImpl.class);
	private static CategoryArticles _nullCategoryArticles = new CategoryArticlesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CategoryArticles> toCacheModel() {
				return _nullCategoryArticlesCacheModel;
			}
		};

	private static CacheModel<CategoryArticles> _nullCategoryArticlesCacheModel = new CacheModel<CategoryArticles>() {
			@Override
			public CategoryArticles toEntityModel() {
				return _nullCategoryArticles;
			}
		};
}