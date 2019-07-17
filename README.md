## 学习SpringBoot

## 资料
[Spring文档](https://spring.io/guides)  
[GitHub文档](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[OKHTTP](https://square.github.io/okhttp/) 

## 工具
[Git](https://git-scm.com/)  
[BootStrap](https://v3.bootcss.com/)

## 脚本
```sql
create table USER
(
	ID int auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);
```