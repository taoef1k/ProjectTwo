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

package com.cxrus.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ArticlesLocalService}.
 *
 * @author mohdtaufik
 * @see ArticlesLocalService
 * @generated
 */
public class ArticlesLocalServiceWrapper implements ArticlesLocalService,
	ServiceWrapper<ArticlesLocalService> {
	public ArticlesLocalServiceWrapper(
		ArticlesLocalService articlesLocalService) {
		_articlesLocalService = articlesLocalService;
	}

	/**
	* Adds the articles to the database. Also notifies the appropriate model listeners.
	*
	* @param articles the articles
	* @return the articles that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles addArticles(
		com.cxrus.model.Articles articles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.addArticles(articles);
	}

	/**
	* Creates a new articles with the primary key. Does not add the articles to the database.
	*
	* @param articlesId the primary key for the new articles
	* @return the new articles
	*/
	@Override
	public com.cxrus.model.Articles createArticles(long articlesId) {
		return _articlesLocalService.createArticles(articlesId);
	}

	/**
	* Deletes the articles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articlesId the primary key of the articles
	* @return the articles that was removed
	* @throws PortalException if a articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles deleteArticles(long articlesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.deleteArticles(articlesId);
	}

	/**
	* Deletes the articles from the database. Also notifies the appropriate model listeners.
	*
	* @param articles the articles
	* @return the articles that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles deleteArticles(
		com.cxrus.model.Articles articles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.deleteArticles(articles);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _articlesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cxrus.model.impl.ArticlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cxrus.model.impl.ArticlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.cxrus.model.Articles fetchArticles(long articlesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.fetchArticles(articlesId);
	}

	/**
	* Returns the articles with the matching UUID and company.
	*
	* @param uuid the articles's UUID
	* @param companyId the primary key of the company
	* @return the matching articles, or <code>null</code> if a matching articles could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles fetchArticlesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.fetchArticlesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the articles matching the UUID and group.
	*
	* @param uuid the articles's UUID
	* @param groupId the primary key of the group
	* @return the matching articles, or <code>null</code> if a matching articles could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles fetchArticlesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.fetchArticlesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the articles with the primary key.
	*
	* @param articlesId the primary key of the articles
	* @return the articles
	* @throws PortalException if a articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles getArticles(long articlesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.getArticles(articlesId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the articles with the matching UUID and company.
	*
	* @param uuid the articles's UUID
	* @param companyId the primary key of the company
	* @return the matching articles
	* @throws PortalException if a matching articles could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles getArticlesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.getArticlesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the articles matching the UUID and group.
	*
	* @param uuid the articles's UUID
	* @param groupId the primary key of the group
	* @return the matching articles
	* @throws PortalException if a matching articles could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles getArticlesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.getArticlesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the articleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.cxrus.model.impl.ArticlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of articleses
	* @param end the upper bound of the range of articleses (not inclusive)
	* @return the range of articleses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.cxrus.model.Articles> getArticleses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.getArticleses(start, end);
	}

	/**
	* Returns the number of articleses.
	*
	* @return the number of articleses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getArticlesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.getArticlesesCount();
	}

	/**
	* Updates the articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param articles the articles
	* @return the articles that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.cxrus.model.Articles updateArticles(
		com.cxrus.model.Articles articles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articlesLocalService.updateArticles(articles);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _articlesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_articlesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _articlesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ArticlesLocalService getWrappedArticlesLocalService() {
		return _articlesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedArticlesLocalService(
		ArticlesLocalService articlesLocalService) {
		_articlesLocalService = articlesLocalService;
	}

	@Override
	public ArticlesLocalService getWrappedService() {
		return _articlesLocalService;
	}

	@Override
	public void setWrappedService(ArticlesLocalService articlesLocalService) {
		_articlesLocalService = articlesLocalService;
	}

	private ArticlesLocalService _articlesLocalService;
}