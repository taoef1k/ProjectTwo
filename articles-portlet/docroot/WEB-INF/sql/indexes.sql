create index IX_A1B0C4E3 on AR_Articles (uuid_);
create index IX_22EC6365 on AR_Articles (uuid_, companyId);
create unique index IX_BE907F27 on AR_Articles (uuid_, groupId);