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
 * This class is used by SOAP remote services, specifically {@link com.cxrus.service.http.ArticlesServiceSoap}.
 *
 * @author mohdtaufik
 * @see com.cxrus.service.http.ArticlesServiceSoap
 * @generated
 */
public class ArticlesSoap implements Serializable {
	public static ArticlesSoap toSoapModel(Articles model) {
		ArticlesSoap soapModel = new ArticlesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setArticlesId(model.getArticlesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setArticleName(model.getArticleName());
		soapModel.setArticleTitle(model.getArticleTitle());
		soapModel.setPublishedDate(model.getPublishedDate());
		soapModel.setCategoryArticlesId(model.getCategoryArticlesId());

		return soapModel;
	}

	public static ArticlesSoap[] toSoapModels(Articles[] models) {
		ArticlesSoap[] soapModels = new ArticlesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ArticlesSoap[][] toSoapModels(Articles[][] models) {
		ArticlesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ArticlesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ArticlesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ArticlesSoap[] toSoapModels(List<Articles> models) {
		List<ArticlesSoap> soapModels = new ArrayList<ArticlesSoap>(models.size());

		for (Articles model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ArticlesSoap[soapModels.size()]);
	}

	public ArticlesSoap() {
	}

	public long getPrimaryKey() {
		return _articlesId;
	}

	public void setPrimaryKey(long pk) {
		setArticlesId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getArticlesId() {
		return _articlesId;
	}

	public void setArticlesId(long articlesId) {
		_articlesId = articlesId;
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

	public String getArticleName() {
		return _articleName;
	}

	public void setArticleName(String articleName) {
		_articleName = articleName;
	}

	public String getArticleTitle() {
		return _articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		_articleTitle = articleTitle;
	}

	public Date getPublishedDate() {
		return _publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;
	}

	public long getCategoryArticlesId() {
		return _categoryArticlesId;
	}

	public void setCategoryArticlesId(long categoryArticlesId) {
		_categoryArticlesId = categoryArticlesId;
	}

	private String _uuid;
	private long _articlesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _articleName;
	private String _articleTitle;
	private Date _publishedDate;
	private long _categoryArticlesId;
}