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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the category articles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mohdtaufik
 * @see CategoryArticlesPersistenceImpl
 * @see CategoryArticlesUtil
 * @generated
 */
public interface CategoryArticlesPersistence extends BasePersistence<CategoryArticles> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CategoryArticlesUtil} to access the category articles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the category articles in the entity cache if it is enabled.
	*
	* @param categoryArticles the category articles
	*/
	public void cacheResult(com.cxrus.model.CategoryArticles categoryArticles);

	/**
	* Caches the category articleses in the entity cache if it is enabled.
	*
	* @param categoryArticleses the category articleses
	*/
	public void cacheResult(
		java.util.List<com.cxrus.model.CategoryArticles> categoryArticleses);

	/**
	* Creates a new category articles with the primary key. Does not add the category articles to the database.
	*
	* @param categoryArticlesId the primary key for the new category articles
	* @return the new category articles
	*/
	public com.cxrus.model.CategoryArticles create(long categoryArticlesId);

	/**
	* Removes the category articles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryArticlesId the primary key of the category articles
	* @return the category articles that was removed
	* @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.cxrus.model.CategoryArticles remove(long categoryArticlesId)
		throws com.cxrus.NoSuchCategoryArticlesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.cxrus.model.CategoryArticles updateImpl(
		com.cxrus.model.CategoryArticles categoryArticles)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the category articles with the primary key or throws a {@link com.cxrus.NoSuchCategoryArticlesException} if it could not be found.
	*
	* @param categoryArticlesId the primary key of the category articles
	* @return the category articles
	* @throws com.cxrus.NoSuchCategoryArticlesException if a category articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.cxrus.model.CategoryArticles findByPrimaryKey(
		long categoryArticlesId)
		throws com.cxrus.NoSuchCategoryArticlesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the category articles with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryArticlesId the primary key of the category articles
	* @return the category articles, or <code>null</code> if a category articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.cxrus.model.CategoryArticles fetchByPrimaryKey(
		long categoryArticlesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the category articleses.
	*
	* @return the category articleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.cxrus.model.CategoryArticles> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.cxrus.model.CategoryArticles> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.cxrus.model.CategoryArticles> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the category articleses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of category articleses.
	*
	* @return the number of category articleses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}