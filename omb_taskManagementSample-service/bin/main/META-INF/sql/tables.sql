create table OMBTFA_TaskManagementSample (
	taskId LONG not null primary key,
	groupId LONG,
	createdUserId LONG,
	createdDate DATE null,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	assignedUserId LONG
);