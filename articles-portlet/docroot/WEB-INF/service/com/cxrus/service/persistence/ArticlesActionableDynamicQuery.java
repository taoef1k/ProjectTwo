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

import com.cxrus.model.Articles;

import com.cxrus.service.ArticlesLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author mohdtaufik
 * @generated
 */
public abstract class ArticlesActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ArticlesActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ArticlesLocalServiceUtil.getService());
		setClass(Articles.class);

		setClassLoader(com.cxrus.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("articlesId");
	}
}