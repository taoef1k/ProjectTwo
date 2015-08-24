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

import com.cxrus.model.CategoryArticles;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the category articles service. This utility wraps {@link CategoryArticlesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mohdtaufik
 * @see CategoryArticlesPersistence
 * @see CategoryArticlesPersistenceImpl
 * @generated
 */
public class CategoryArticlesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CategoryArticles categoryArticles) {
		getPersistence().clearCache(categoryArticles);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CategoryArticles> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CategoryArticles> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CategoryArticles> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CategoryArticles update(CategoryArticles categoryArticles)
		throws SystemException {
		return getPersistence().update(categoryArticles);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CategoryArticles update(CategoryArticles categoryArticles,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(categoryArticles, serviceContext);
	}

	/**
	* Caches the category articles in the entity cache if it is enabled.
	*
	* @param categoryArticles the category articles
	*/
	public static void cacheResult(
		com.cxrus.model.CategoryArticles categoryArticles) {
		getPersistence().cacheResult(categoryArticles);
	}

	/**
	* Caches the category articleses in the entity cache if it is enabled.
	*
	* @param categoryArticleses the category articleses
	*/
	public static void cacheResult(
		java.util.List<com.cxrus.model.CategoryArticles> categoryArticleses) {
		getPersistence().cacheResult(categoryArticleses);
	}

	/**
	* Creates a new category articles with the primary key. Does not add the category articles to the database.
	*
	* @param categoryArticlesId the primary key for the new category articles
	* @return the new category articles
	*/
	public static com.cxrus.model.CategoryArticles create(
		long categoryArticlesId) {
		return getPersistence().create(categoryArticlesId);
	}

	/**
	* Removes the category articles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryArticlesId the primary key of the category articles
	* @return the category articles that was removed
	* @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.CategoryArticles remove(
		long categoryArticlesId)
		throws com.cxrus.NoSuchCategoryArticlesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(categoryArticlesId);
	}

	public static com.cxrus.model.CategoryArticles updateImpl(
		com.cxrus.model.CategoryArticles categoryArticles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(categoryArticles);
	}

	/**
	* Returns the category articles with the primary key or throws a {@link com.cxrus.NoSuchCategoryArticlesException} if it could not be found.
	*
	* @param categoryArticlesId the primary key of the category articles
	* @return the category articles
	* @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.CategoryArticles findByPrimaryKey(
		long categoryArticlesId)
		throws com.cxrus.NoSuchCategoryArticlesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(categoryArticlesId);
	}

	/**
	* Returns the category articles with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryArticlesId the primary key of the category articles
	* @return the category articles, or <code>null</code> if a category articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.CategoryArticles fetchByPrimaryKey(
		long categoryArticlesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(categoryArticlesId);
	}

	/**
	* Returns all the category articleses.
	*
	* @return the category articleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.cxrus.model.CategoryArticles> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.cxrus.model.CategoryArticles> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.cxrus.model.CategoryArticles> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the category articleses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of category articleses.
	*
	* @return the number of category articleses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CategoryArticlesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CategoryArticlesPersistence)PortletBeanLocatorUtil.locate(com.cxrus.service.ClpSerializer.getServletContextName(),
					CategoryArticlesPersistence.class.getName());

			ReferenceRegistry.registerReference(CategoryArticlesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CategoryArticlesPersistence persistence) {
	}

	private static CategoryArticlesPersistence _persistence;
}