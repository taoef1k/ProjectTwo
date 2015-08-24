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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Articles. This utility wraps
 * {@link com.cxrus.service.impl.ArticlesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author mohdtaufik
 * @see ArticlesLocalService
 * @see com.cxrus.service.base.ArticlesLocalServiceBaseImpl
 * @see com.cxrus.service.impl.ArticlesLocalServiceImpl
 * @generated
 */
public class ArticlesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.cxrus.service.impl.ArticlesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the articles to the database. Also notifies the appropriate model listeners.
	*
	* @param articles the articles
	* @return the articles that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.Articles addArticles(
		com.cxrus.model.Articles articles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addArticles(articles);
	}

	/**
	* Creates a new articles with the primary key. Does not add the articles to the database.
	*
	* @param articlesId the primary key for the new articles
	* @return the new articles
	*/
	public static com.cxrus.model.Articles createArticles(long articlesId) {
		return getService().createArticles(articlesId);
	}

	/**
	* Deletes the articles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articlesId the primary key of the articles
	* @return the articles that was removed
	* @throws PortalException if a articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.Articles deleteArticles(long articlesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteArticles(articlesId);
	}

	/**
	* Deletes the articles from the database. Also notifies the appropriate model listeners.
	*
	* @param articles the articles
	* @return the articles that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.Articles deleteArticles(
		com.cxrus.model.Articles articles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteArticles(articles);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.cxrus.model.Articles fetchArticles(long articlesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchArticles(articlesId);
	}

	/**
	* Returns the articles with the matching UUID and company.
	*
	* @param uuid the articles's UUID
	* @param companyId the primary key of the company
	* @return the matching articles, or <code>null</code> if a matching articles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.Articles fetchArticlesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchArticlesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the articles matching the UUID and group.
	*
	* @param uuid the articles's UUID
	* @param groupId the primary key of the group
	* @return the matching articles, or <code>null</code> if a matching articles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.Articles fetchArticlesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchArticlesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the articles with the primary key.
	*
	* @param articlesId the primary key of the articles
	* @return the articles
	* @throws PortalException if a articles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.Articles getArticles(long articlesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getArticles(articlesId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static com.cxrus.model.Articles getArticlesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getArticlesByUuidAndCompanyId(uuid, companyId);
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
	public static com.cxrus.model.Articles getArticlesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getArticlesByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.cxrus.model.Articles> getArticleses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getArticleses(start, end);
	}

	/**
	* Returns the number of articleses.
	*
	* @return the number of articleses
	* @throws SystemException if a system exception occurred
	*/
	public static int getArticlesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getArticlesesCount();
	}

	/**
	* Updates the articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param articles the articles
	* @return the articles that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.cxrus.model.Articles updateArticles(
		com.cxrus.model.Articles articles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateArticles(articles);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static ArticlesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ArticlesLocalService.class.getName());

			if (invokableLocalService instanceof ArticlesLocalService) {
				_service = (ArticlesLocalService)invokableLocalService;
			}
			else {
				_service = new ArticlesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ArticlesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ArticlesLocalService service) {
	}

	private static ArticlesLocalService _service;
}