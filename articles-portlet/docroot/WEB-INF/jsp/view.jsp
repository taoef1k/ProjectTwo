
<%
	/**
	 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>

<%@ include file="init.jsp"%>

<portlet:defineObjects />

<c:set var="listCategory" value=""/>
<c:forEach items="${listCategoryArticles}" var="category_articles">
	<c:set var="listCategory" value="${listCategory}${category_articles.categoryName},"/>
</c:forEach>

<liferay-ui:tabs names="${listCategory}" refresh="false" tabsValues="${listCategory}">
    <c:forEach items="${listCategoryArticles}" var="category_articles">
    	<liferay-ui:section>
    		<ul>
			<c:forEach items="${listArticles}" var="articles">
				<c:if test="${category_articles.categoryArticlesId eq articles.categoryArticlesId}">
					<li>${articles.articleName}</li>
				</c:if>
			</c:forEach>
			</ul>
		</liferay-ui:section>
	</c:forEach>
</liferay-ui:tabs>