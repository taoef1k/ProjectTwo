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

package com.cxrus.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.cxrus.service.http.CategoryArticlesServiceSoap}.
 *
 * @author mohdtaufik
 * @see com.cxrus.service.http.CategoryArticlesServiceSoap
 * @generated
 */
public class CategoryArticlesSoap implements Serializable {
	public static CategoryArticlesSoap toSoapModel(CategoryArticles model) {
		CategoryArticlesSoap soapModel = new CategoryArticlesSoap();

		soapModel.setCategoryArticlesId(model.getCategoryArticlesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCategoryName(model.getCategoryName());

		return soapModel;
	}

	public static CategoryArticlesSoap[] toSoapModels(CategoryArticles[] models) {
		CategoryArticlesSoap[] soapModels = new CategoryArticlesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CategoryArticlesSoap[][] toSoapModels(
		CategoryArticles[][] models) {
		CategoryArticlesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CategoryArticlesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CategoryArticlesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CategoryArticlesSoap[] toSoapModels(
		List<CategoryArticles> models) {
		List<CategoryArticlesSoap> soapModels = new ArrayList<CategoryArticlesSoap>(models.size());

		for (CategoryArticles model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CategoryArticlesSoap[soapModels.size()]);
	}

	public CategoryArticlesSoap() {
	}

	public long getPrimaryKey() {
		return _categoryArticlesId;
	}

	public void setPrimaryKey(long pk) {
		setCategoryArticlesId(pk);
	}

	public long getCategoryArticlesId() {
		return _categoryArticlesId;
	}

	public void setCategoryArticlesId(long categoryArticlesId) {
		_categoryArticlesId = categoryArticlesId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getCategoryName() {
		return _categoryName;
	}

	public void setCategoryName(String categoryName) {
		_categoryName = categoryName;
	}

	private long _categoryArticlesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _categoryName;
}