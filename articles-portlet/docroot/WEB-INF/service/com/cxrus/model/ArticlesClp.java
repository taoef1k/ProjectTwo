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

import com.cxrus.service.ArticlesLocalServiceUtil;
import com.cxrus.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mohdtaufik
 */
public class ArticlesClp extends BaseModelImpl<Articles> implements Articles {
	public ArticlesClp() {
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
	public long getPrimaryKey() {
		return _articlesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setArticlesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _articlesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_articlesRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getArticlesId() {
		return _articlesId;
	}

	@Override
	public void setArticlesId(long articlesId) {
		_articlesId = articlesId;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setArticlesId", long.class);

				method.invoke(_articlesRemoteModel, articlesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_articlesRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_articlesRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_articlesRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_articlesRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_articlesRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_articlesRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArticleName() {
		return _articleName;
	}

	@Override
	public void setArticleName(String articleName) {
		_articleName = articleName;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setArticleName", String.class);

				method.invoke(_articlesRemoteModel, articleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArticleTitle() {
		return _articleTitle;
	}

	@Override
	public void setArticleTitle(String articleTitle) {
		_articleTitle = articleTitle;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setArticleTitle", String.class);

				method.invoke(_articlesRemoteModel, articleTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPublishedDate() {
		return _publishedDate;
	}

	@Override
	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setPublishedDate", Date.class);

				method.invoke(_articlesRemoteModel, publishedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCategoryArticlesId() {
		return _categoryArticlesId;
	}

	@Override
	public void setCategoryArticlesId(long categoryArticlesId) {
		_categoryArticlesId = categoryArticlesId;

		if (_articlesRemoteModel != null) {
			try {
				Class<?> clazz = _articlesRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryArticlesId",
						long.class);

				method.invoke(_articlesRemoteModel, categoryArticlesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Articles.class.getName()));
	}

	public BaseModel<?> getArticlesRemoteModel() {
		return _articlesRemoteModel;
	}

	public void setArticlesRemoteModel(BaseModel<?> articlesRemoteModel) {
		_articlesRemoteModel = articlesRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _articlesRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_articlesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ArticlesLocalServiceUtil.addArticles(this);
		}
		else {
			ArticlesLocalServiceUtil.updateArticles(this);
		}
	}

	@Override
	public Articles toEscapedModel() {
		return (Articles)ProxyUtil.newProxyInstance(Articles.class.getClassLoader(),
			new Class[] { Articles.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ArticlesClp clone = new ArticlesClp();

		clone.setUuid(getUuid());
		clone.setArticlesId(getArticlesId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setArticleName(getArticleName());
		clone.setArticleTitle(getArticleTitle());
		clone.setPublishedDate(getPublishedDate());
		clone.setCategoryArticlesId(getCategoryArticlesId());

		return clone;
	}

	@Override
	public int compareTo(Articles articles) {
		long primaryKey = articles.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ArticlesClp)) {
			return false;
		}

		ArticlesClp articles = (ArticlesClp)obj;

		long primaryKey = articles.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", articlesId=");
		sb.append(getArticlesId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", articleName=");
		sb.append(getArticleName());
		sb.append(", articleTitle=");
		sb.append(getArticleTitle());
		sb.append(", publishedDate=");
		sb.append(getPublishedDate());
		sb.append(", categoryArticlesId=");
		sb.append(getCategoryArticlesId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.cxrus.model.Articles");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articlesId</column-name><column-value><![CDATA[");
		sb.append(getArticlesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleName</column-name><column-value><![CDATA[");
		sb.append(getArticleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleTitle</column-name><column-value><![CDATA[");
		sb.append(getArticleTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishedDate</column-name><column-value><![CDATA[");
		sb.append(getPublishedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryArticlesId</column-name><column-value><![CDATA[");
		sb.append(getCategoryArticlesId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _articlesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _articleName;
	private String _articleTitle;
	private Date _publishedDate;
	private long _categoryArticlesId;
	private BaseModel<?> _articlesRemoteModel;
	private Class<?> _clpSerializerClass = com.cxrus.service.ClpSerializer.class;
}