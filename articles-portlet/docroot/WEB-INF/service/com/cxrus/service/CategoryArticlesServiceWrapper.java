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
 * Provides a wrapper for {@link CategoryArticlesService}.
 *
 * @author mohdtaufik
 * @see CategoryArticlesService
 * @generated
 */
public class CategoryArticlesServiceWrapper implements CategoryArticlesService,
	ServiceWrapper<CategoryArticlesService> {
	public CategoryArticlesServiceWrapper(
		CategoryArticlesService categoryArticlesService) {
		_categoryArticlesService = categoryArticlesService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _categoryArticlesService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_categoryArticlesService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _categoryArticlesService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CategoryArticlesService getWrappedCategoryArticlesService() {
		return _categoryArticlesService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCategoryArticlesService(
		CategoryArticlesService categoryArticlesService) {
		_categoryArticlesService = categoryArticlesService;
	}

	@Override
	public CategoryArticlesService getWrappedService() {
		return _categoryArticlesService;
	}

	@Override
	public void setWrappedService(
		CategoryArticlesService categoryArticlesService) {
		_categoryArticlesService = categoryArticlesService;
	}

	private CategoryArticlesService _categoryArticlesService;
}