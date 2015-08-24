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

package com.cxrus.service.base;

import com.cxrus.model.CategoryArticles;

import com.cxrus.service.CategoryArticlesService;
import com.cxrus.service.persistence.ArticlesPersistence;
import com.cxrus.service.persistence.CategoryArticlesPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the category articles remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.cxrus.service.impl.CategoryArticlesServiceImpl}.
 * </p>
 *
 * @author mohdtaufik
 * @see com.cxrus.service.impl.CategoryArticlesServiceImpl
 * @see com.cxrus.service.CategoryArticlesServiceUtil
 * @generated
 */
public abstract class CategoryArticlesServiceBaseImpl extends BaseServiceImpl
	implements CategoryArticlesService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.cxrus.service.CategoryArticlesServiceUtil} to access the category articles remote service.
	 */

	/**
	 * Returns the articles local service.
	 *
	 * @return the articles local service
	 */
	public com.cxrus.service.ArticlesLocalService getArticlesLocalService() {
		return articlesLocalService;
	}

	/**
	 * Sets the articles local service.
	 *
	 * @param articlesLocalService the articles local service
	 */
	public void setArticlesLocalService(
		com.cxrus.service.ArticlesLocalService articlesLocalService) {
		this.articlesLocalService = articlesLocalService;
	}

	/**
	 * Returns the articles remote service.
	 *
	 * @return the articles remote service
	 */
	public com.cxrus.service.ArticlesService getArticlesService() {
		return articlesService;
	}

	/**
	 * Sets the articles remote service.
	 *
	 * @param articlesService the articles remote service
	 */
	public void setArticlesService(
		com.cxrus.service.ArticlesService articlesService) {
		this.articlesService = articlesService;
	}

	/**
	 * Returns the articles persistence.
	 *
	 * @return the articles persistence
	 */
	public ArticlesPersistence getArticlesPersistence() {
		return articlesPersistence;
	}

	/**
	 * Sets the articles persistence.
	 *
	 * @param articlesPersistence the articles persistence
	 */
	public void setArticlesPersistence(ArticlesPersistence articlesPersistence) {
		this.articlesPersistence = articlesPersistence;
	}

	/**
	 * Returns the category articles local service.
	 *
	 * @return the category articles local service
	 */
	public com.cxrus.service.CategoryArticlesLocalService getCategoryArticlesLocalService() {
		return categoryArticlesLocalService;
	}

	/**
	 * Sets the category articles local service.
	 *
	 * @param categoryArticlesLocalService the category articles local service
	 */
	public void setCategoryArticlesLocalService(
		com.cxrus.service.CategoryArticlesLocalService categoryArticlesLocalService) {
		this.categoryArticlesLocalService = categoryArticlesLocalService;
	}

	/**
	 * Returns the category articles remote service.
	 *
	 * @return the category articles remote service
	 */
	public com.cxrus.service.CategoryArticlesService getCategoryArticlesService() {
		return categoryArticlesService;
	}

	/**
	 * Sets the category articles remote service.
	 *
	 * @param categoryArticlesService the category articles remote service
	 */
	public void setCategoryArticlesService(
		com.cxrus.service.CategoryArticlesService categoryArticlesService) {
		this.categoryArticlesService = categoryArticlesService;
	}

	/**
	 * Returns the category articles persistence.
	 *
	 * @return the category articles persistence
	 */
	public CategoryArticlesPersistence getCategoryArticlesPersistence() {
		return categoryArticlesPersistence;
	}

	/**
	 * Sets the category articles persistence.
	 *
	 * @param categoryArticlesPersistence the category articles persistence
	 */
	public void setCategoryArticlesPersistence(
		CategoryArticlesPersistence categoryArticlesPersistence) {
		this.categoryArticlesPersistence = categoryArticlesPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return CategoryArticles.class;
	}

	protected String getModelClassName() {
		return CategoryArticles.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = categoryArticlesPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.cxrus.service.ArticlesLocalService.class)
	protected com.cxrus.service.ArticlesLocalService articlesLocalService;
	@BeanReference(type = com.cxrus.service.ArticlesService.class)
	protected com.cxrus.service.ArticlesService articlesService;
	@BeanReference(type = ArticlesPersistence.class)
	protected ArticlesPersistence articlesPersistence;
	@BeanReference(type = com.cxrus.service.CategoryArticlesLocalService.class)
	protected com.cxrus.service.CategoryArticlesLocalService categoryArticlesLocalService;
	@BeanReference(type = com.cxrus.service.CategoryArticlesService.class)
	protected com.cxrus.service.CategoryArticlesService categoryArticlesService;
	@BeanReference(type = CategoryArticlesPersistence.class)
	protected CategoryArticlesPersistence categoryArticlesPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private CategoryArticlesServiceClpInvoker _clpInvoker = new CategoryArticlesServiceClpInvoker();
}