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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Articles}.
 * </p>
 *
 * @author mohdtaufik
 * @see Articles
 * @generated
 */
public class ArticlesWrapper implements Articles, ModelWrapper<Articles> {
	public ArticlesWrapper(Articles articles) {
		_articles = articles;
	}

	@Override
	public Class<?> getModelClass() {
		return Articles.class;
	}

	@Override
	public String getModelClassName() {
		return Articles.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("articlesId", getArticlesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("articleName", getArticleName());
		attributes.put("articleTitle", getArticleTitle());
		attributes.put("publishedDate", getPublishedDate());
		attributes.put("categoryArticlesId", getCategoryArticlesId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long articlesId = (Long)attributes.get("articlesId");

		if (articlesId != null) {
			setArticlesId(articlesId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String articleName = (String)attributes.get("articleName");

		if (articleName != null) {
			setArticleName(articleName);
		}

		String articleTitle = (String)attributes.get("articleTitle");

		if (articleTitle != null) {
			setArticleTitle(articleTitle);
		}

		Date publishedDate = (Date)attributes.get("publishedDate");

		if (publishedDate != null) {
			setPublishedDate(publishedDate);
		}

		Long categoryArticlesId = (Long)attributes.get("categoryArticlesId");

		if (categoryArticlesId != null) {
			setCategoryArticlesId(categoryArticlesId);
		}
	}

	/**
	* Returns the primary key of this articles.
	*
	* @return the primary key of this articles
	*/
	@Override
	public long getPrimaryKey() {
		return _articles.getPrimaryKey();
	}

	/**
	* Sets the primary key of this articles.
	*
	* @param primaryKey the primary key of this articles
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_articles.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this articles.
	*
	* @return the uuid of this articles
	*/
	@Override
	public java.lang.String getUuid() {
		return _articles.getUuid();
	}

	/**
	* Sets the uuid of this articles.
	*
	* @param uuid the uuid of this articles
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_articles.setUuid(uuid);
	}

	/**
	* Returns the articles ID of this articles.
	*
	* @return the articles ID of this articles
	*/
	@Override
	public long getArticlesId() {
		return _articles.getArticlesId();
	}

	/**
	* Sets the articles ID of this articles.
	*
	* @param articlesId the articles ID of this articles
	*/
	@Override
	public void setArticlesId(long articlesId) {
		_articles.setArticlesId(articlesId);
	}

	/**
	* Returns the group ID of this articles.
	*
	* @return the group ID of this articles
	*/
	@Override
	public long getGroupId() {
		return _articles.getGroupId();
	}

	/**
	* Sets the group ID of this articles.
	*
	* @param groupId the group ID of this articles
	*/
	@Override
	public void setGroupId(long groupId) {
		_articles.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this articles.
	*
	* @return the company ID of this articles
	*/
	@Override
	public long getCompanyId() {
		return _articles.getCompanyId();
	}

	/**
	* Sets the company ID of this articles.
	*
	* @param companyId the company ID of this articles
	*/
	@Override
	public void setCompanyId(long companyId) {
		_articles.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this articles.
	*
	* @return the user ID of this articles
	*/
	@Override
	public long getUserId() {
		return _articles.getUserId();
	}

	/**
	* Sets the user ID of this articles.
	*
	* @param userId the user ID of this articles
	*/
	@Override
	public void setUserId(long userId) {
		_articles.setUserId(userId);
	}

	/**
	* Returns the user uuid of this articles.
	*
	* @return the user uuid of this articles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articles.getUserUuid();
	}

	/**
	* Sets the user uuid of this articles.
	*
	* @param userUuid the user uuid of this articles
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_articles.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this articles.
	*
	* @return the user name of this articles
	*/
	@Override
	public java.lang.String getUserName() {
		return _articles.getUserName();
	}

	/**
	* Sets the user name of this articles.
	*
	* @param userName the user name of this articles
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_articles.setUserName(userName);
	}

	/**
	* Returns the create date of this articles.
	*
	* @return the create date of this articles
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _articles.getCreateDate();
	}

	/**
	* Sets the create date of this articles.
	*
	* @param createDate the create date of this articles
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_articles.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this articles.
	*
	* @return the modified date of this articles
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _articles.getModifiedDate();
	}

	/**
	* Sets the modified date of this articles.
	*
	* @param modifiedDate the modified date of this articles
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_articles.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the article name of this articles.
	*
	* @return the article name of this articles
	*/
	@Override
	public java.lang.String getArticleName() {
		return _articles.getArticleName();
	}

	/**
	* Sets the article name of this articles.
	*
	* @param articleName the article name of this articles
	*/
	@Override
	public void setArticleName(java.lang.String articleName) {
		_articles.setArticleName(articleName);
	}

	/**
	* Returns the article title of this articles.
	*
	* @return the article title of this articles
	*/
	@Override
	public java.lang.String getArticleTitle() {
		return _articles.getArticleTitle();
	}

	/**
	* Sets the article title of this articles.
	*
	* @param articleTitle the article title of this articles
	*/
	@Override
	public void setArticleTitle(java.lang.String articleTitle) {
		_articles.setArticleTitle(articleTitle);
	}

	/**
	* Returns the published date of this articles.
	*
	* @return the published date of this articles
	*/
	@Override
	public java.util.Date getPublishedDate() {
		return _articles.getPublishedDate();
	}

	/**
	* Sets the published date of this articles.
	*
	* @param publishedDate the published date of this articles
	*/
	@Override
	public void setPublishedDate(java.util.Date publishedDate) {
		_articles.setPublishedDate(publishedDate);
	}

	/**
	* Returns the category articles ID of this articles.
	*
	* @return the category articles ID of this articles
	*/
	@Override
	public long getCategoryArticlesId() {
		return _articles.getCategoryArticlesId();
	}

	/**
	* Sets the category articles ID of this articles.
	*
	* @param categoryArticlesId the category articles ID of this articles
	*/
	@Override
	public void setCategoryArticlesId(long categoryArticlesId) {
		_articles.setCategoryArticlesId(categoryArticlesId);
	}

	@Override
	public boolean isNew() {
		return _articles.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_articles.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _articles.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_articles.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _articles.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _articles.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_articles.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _articles.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_articles.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_articles.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_articles.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ArticlesWrapper((Articles)_articles.clone());
	}

	@Override
	public int compareTo(com.cxrus.model.Articles articles) {
		return _articles.compareTo(articles);
	}

	@Override
	public int hashCode() {
		return _articles.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.cxrus.model.Articles> toCacheModel() {
		return _articles.toCacheModel();
	}

	@Override
	public com.cxrus.model.Articles toEscapedModel() {
		return new ArticlesWrapper(_articles.toEscapedModel());
	}

	@Override
	public com.cxrus.model.Articles toUnescapedModel() {
		return new ArticlesWrapper(_articles.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _articles.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _articles.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_articles.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ArticlesWrapper)) {
			return false;
		}

		ArticlesWrapper articlesWrapper = (ArticlesWrapper)obj;

		if (Validator.equals(_articles, articlesWrapper._articles)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _articles.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Articles getWrappedArticles() {
		return _articles;
	}

	@Override
	public Articles getWrappedModel() {
		return _articles;
	}

	@Override
	public void resetOriginalValues() {
		_articles.resetOriginalValues();
	}

	private Articles _articles;
}