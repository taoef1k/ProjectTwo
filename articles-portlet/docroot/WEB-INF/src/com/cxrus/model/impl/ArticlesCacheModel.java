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

package com.cxrus.model.impl;

import com.cxrus.model.Articles;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Articles in entity cache.
 *
 * @author mohdtaufik
 * @see Articles
 * @generated
 */
public class ArticlesCacheModel implements CacheModel<Articles>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", articlesId=");
		sb.append(articlesId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", articleName=");
		sb.append(articleName);
		sb.append(", articleTitle=");
		sb.append(articleTitle);
		sb.append(", publishedDate=");
		sb.append(publishedDate);
		sb.append(", categoryArticlesId=");
		sb.append(categoryArticlesId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Articles toEntityModel() {
		ArticlesImpl articlesImpl = new ArticlesImpl();

		if (uuid == null) {
			articlesImpl.setUuid(StringPool.BLANK);
		}
		else {
			articlesImpl.setUuid(uuid);
		}

		articlesImpl.setArticlesId(articlesId);
		articlesImpl.setGroupId(groupId);
		articlesImpl.setCompanyId(companyId);
		articlesImpl.setUserId(userId);

		if (userName == null) {
			articlesImpl.setUserName(StringPool.BLANK);
		}
		else {
			articlesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			articlesImpl.setCreateDate(null);
		}
		else {
			articlesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			articlesImpl.setModifiedDate(null);
		}
		else {
			articlesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (articleName == null) {
			articlesImpl.setArticleName(StringPool.BLANK);
		}
		else {
			articlesImpl.setArticleName(articleName);
		}

		if (articleTitle == null) {
			articlesImpl.setArticleTitle(StringPool.BLANK);
		}
		else {
			articlesImpl.setArticleTitle(articleTitle);
		}

		if (publishedDate == Long.MIN_VALUE) {
			articlesImpl.setPublishedDate(null);
		}
		else {
			articlesImpl.setPublishedDate(new Date(publishedDate));
		}

		articlesImpl.setCategoryArticlesId(categoryArticlesId);

		articlesImpl.resetOriginalValues();

		return articlesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		articlesId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		articleName = objectInput.readUTF();
		articleTitle = objectInput.readUTF();
		publishedDate = objectInput.readLong();
		categoryArticlesId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(articlesId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (articleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleName);
		}

		if (articleTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleTitle);
		}

		objectOutput.writeLong(publishedDate);
		objectOutput.writeLong(categoryArticlesId);
	}

	public String uuid;
	public long articlesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String articleName;
	public String articleTitle;
	public long publishedDate;
	public long categoryArticlesId;
}