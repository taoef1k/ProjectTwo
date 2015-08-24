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

import com.cxrus.model.CategoryArticles;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CategoryArticles in entity cache.
 *
 * @author mohdtaufik
 * @see CategoryArticles
 * @generated
 */
public class CategoryArticlesCacheModel implements CacheModel<CategoryArticles>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{categoryArticlesId=");
		sb.append(categoryArticlesId);
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
		sb.append(", categoryName=");
		sb.append(categoryName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CategoryArticles toEntityModel() {
		CategoryArticlesImpl categoryArticlesImpl = new CategoryArticlesImpl();

		categoryArticlesImpl.setCategoryArticlesId(categoryArticlesId);
		categoryArticlesImpl.setGroupId(groupId);
		categoryArticlesImpl.setCompanyId(companyId);
		categoryArticlesImpl.setUserId(userId);

		if (userName == null) {
			categoryArticlesImpl.setUserName(StringPool.BLANK);
		}
		else {
			categoryArticlesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			categoryArticlesImpl.setCreateDate(null);
		}
		else {
			categoryArticlesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			categoryArticlesImpl.setModifiedDate(null);
		}
		else {
			categoryArticlesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (categoryName == null) {
			categoryArticlesImpl.setCategoryName(StringPool.BLANK);
		}
		else {
			categoryArticlesImpl.setCategoryName(categoryName);
		}

		categoryArticlesImpl.resetOriginalValues();

		return categoryArticlesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		categoryArticlesId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		categoryName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(categoryArticlesId);
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

		if (categoryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryName);
		}
	}

	public long categoryArticlesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String categoryName;
}