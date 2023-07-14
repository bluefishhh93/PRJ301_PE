CREATE DATABASE PRJ301_DE170791
USE PRJ301_DE170791

CREATE TABLE DE170791
(
	ProjectID nvarchar(6) PRIMARY KEY,
	Name nvarchar(30) NOT NULL,
	Quality int NOT NULL,
	Feature bit NOT NULL
)
INSERT INTO DE170791 values ('C001', 'HP Computer', 31, 1)
INSERT INTO DE170791 values ('C002', 'Dell Computer', 32, 0)

select * from DE170791