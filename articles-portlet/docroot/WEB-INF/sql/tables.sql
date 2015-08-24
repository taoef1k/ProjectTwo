create table AR_Articles (
	uuid_ VARCHAR(75) null,
	articlesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	articleName VARCHAR(75) null,
	articleTitle VARCHAR(75) null,
	publishedDate DATE null,
	categoryArticlesId LONG
);

create table AR_CategoryArticles (
	categoryArticlesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryName VARCHAR(75) null
);