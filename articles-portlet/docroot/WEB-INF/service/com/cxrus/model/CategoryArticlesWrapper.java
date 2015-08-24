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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CategoryArticles}.
 * </p>
 *
 * @author mohdtaufik
 * @see CategoryArticles
 * @generated
 */
public class CategoryArticlesWrapper implements CategoryArticles,
	ModelWrapper<CategoryArticles> {
	public CategoryArticlesWrapper(CategoryArticles categoryArticles) {
		_categoryArticles = categoryArticles;
	}

	@Override
	public Class<?> getModelClass() {
		return CategoryArticles.class;
	}

	@Override
	public String getModelClassName() {
		return CategoryArticles.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoryArticlesId", getCategoryArticlesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("categoryName", getCategoryName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long categoryArticlesId = (Long)attributes.get("categoryArticlesId");

		if (categoryArticlesId != null) {
			setCategoryArticlesId(categoryArticlesId);
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

		String categoryName = (String)attributes.get("categoryName");

		if (categoryName != null) {
			setCategoryName(categoryName);
		}
	}

	/**
	* Returns the primary key of this category articles.
	*
	* @return the primary key of this category articles
	*/
	@Override
	public long getPrimaryKey() {
		return _categoryArticles.getPrimaryKey();
	}

	/**
	* Sets the primary key of this category articles.
	*
	* @param primaryKey the primary key of this category articles
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_categoryArticles.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the category articles ID of this category articles.
	*
	* @return the category articles ID of this category articles
	*/
	@Override
	public long getCategoryArticlesId() {
		return _categoryArticles.getCategoryArticlesId();
	}

	/**
	* Sets the category articles ID of this category articles.
	*
	* @param categoryArticlesId the category articles ID of this category articles
	*/
	@Override
	public void setCategoryArticlesId(long categoryArticlesId) {
		_categoryArticles.setCategoryArticlesId(categoryArticlesId);
	}

	/**
	* Returns the group ID of this category articles.
	*
	* @return the group ID of this category articles
	*/
	@Override
	public long getGroupId() {
		return _categoryArticles.getGroupId();
	}

	/**
	* Sets the group ID of this category articles.
	*
	* @param groupId the group ID of this category articles
	*/
	@Override
	public void setGroupId(long groupId) {
		_categoryArticles.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this category articles.
	*
	* @return the company ID of this category articles
	*/
	@Override
	public long getCompanyId() {
		return _categoryArticles.getCompanyId();
	}

	/**
	* Sets the company ID of this category articles.
	*
	* @param companyId the company ID of this category articles
	*/
	@Override
	public void setCompanyId(long companyId) {
		_categoryArticles.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this category articles.
	*
	* @return the user ID of this category articles
	*/
	@Override
	public long getUserId() {
		return _categoryArticles.getUserId();
	}

	/**
	* Sets the user ID of this category articles.
	*
	* @param userId the user ID of this category articles
	*/
	@Override
	public void setUserId(long userId) {
		_categoryArticles.setUserId(userId);
	}

	/**
	* Returns the user uuid of this category articles.
	*
	* @return the user uuid of this category articles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoryArticles.getUserUuid();
	}

	/**
	* Sets the user uuid of this category articles.
	*
	* @param userUuid the user uuid of this category articles
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_categoryArticles.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this category articles.
	*
	* @return the user name of this category articles
	*/
	@Override
	public java.lang.String getUserName() {
		return _categoryArticles.getUserName();
	}

	/**
	* Sets the user name of this category articles.
	*
	* @param userName the user name of this category articles
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_categoryArticles.setUserName(userName);
	}

	/**
	* Returns the create date of this category articles.
	*
	* @return the create date of this category articles
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _categoryArticles.getCreateDate();
	}

	/**
	* Sets the create date of this category articles.
	*
	* @param createDate the create date of this category articles
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_categoryArticles.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this category articles.
	*
	* @return the modified date of this category articles
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _categoryArticles.getModifiedDate();
	}

	/**
	* Sets the modified date of this category articles.
	*
	* @param modifiedDate the modified date of this category articles
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_categoryArticles.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the category name of this category articles.
	*
	* @return the category name of this category articles
	*/
	@Override
	public java.lang.String getCategoryName() {
		return _categoryArticles.getCategoryName();
	}

	/**
	* Sets the category name of this category articles.
	*
	* @param categoryName the category name of this category articles
	*/
	@Override
	public void setCategoryName(java.lang.String categoryName) {
		_categoryArticles.setCategoryName(categoryName);
	}

	@Override
	public boolean isNew() {
		return _categoryArticles.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_categoryArticles.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _categoryArticles.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_categoryArticles.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _categoryArticles.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _categoryArticles.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_categoryArticles.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _categoryArticles.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_categoryArticles.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_categoryArticles.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_categoryArticles.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CategoryArticlesWrapper((CategoryArticles)_categoryArticles.clone());
	}

	@Override
	public int compareTo(com.cxrus.model.CategoryArticles categoryArticles) {
		return _categoryArticles.compareTo(categoryArticles);
	}

	@Override
	public int hashCode() {
		return _categoryArticles.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.cxrus.model.CategoryArticles> toCacheModel() {
		return _categoryArticles.toCacheModel();
	}

	@Override
	public com.cxrus.model.CategoryArticles toEscapedModel() {
		return new CategoryArticlesWrapper(_categoryArticles.toEscapedModel());
	}

	@Override
	public com.cxrus.model.CategoryArticles toUnescapedModel() {
		return new CategoryArticlesWrapper(_categoryArticles.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _categoryArticles.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _categoryArticles.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoryArticles.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CategoryArticlesWrapper)) {
			return false;
		}

		CategoryArticlesWrapper categoryArticlesWrapper = (CategoryArticlesWrapper)obj;

		if (Validator.equals(_categoryArticles,
					categoryArticlesWrapper._categoryArticles)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CategoryArticles getWrappedCategoryArticles() {
		return _categoryArticles;
	}

	@Override
	public CategoryArticles getWrappedModel() {
		return _categoryArticles;
	}

	@Override
	public void resetOriginalValues() {
		_categoryArticles.resetOriginalValues();
	}

	private CategoryArticles _categoryArticles;
}