-- This is a comment in SQL

-- SQL stands for Structured Query Language
-- It is a structure way to talk to and read/update relational databases (tables that are related)
-- NOT a programming language
-- Easy-to-read with english-like syntax

-- 5 Sublanguages in SQL
-- DDL (Data Definition language) describes how to define our data (like creating/updating tables/schema)
-- DML (Data Manipulation Langugage) used for manipulating Data
	-- CRUD operations (Create, Read, Update, Delete)
-- DQL (Data Query Language) describes all the ways to read or query the database
-- DCL (Data Control Language) describes who can access what pieces of data
-- TCL (Transaction Control Language) describes how we can utilize transactions (basically a bunch of DML statements
-- operating at the same time)


-- First thing we need to do if we want to create/read/update/delete data is define a table to store all
-- of the data

--DDL
CREATE TABLE employees(
	-- SQL Doesn't really care if the statements are even on the same line
	-- Column_name datatype constraints
	emp_id int UNIQUE , -- Basically guarantees that the value in this column will be unique 
	first_name varchar(50) NOT NULL,-- NULL means the absence OF a value, so IF we require this TO be 
									-- NOT NULL, It MUST have a value
	last_name varchar(50) NOT NULL,
	salary numeric(8, 2)
); -- Doesn't care ab ; but we can ADD it TO FORCE it TO END the CURRENT STATEMENT

-- Other things DDL can do,
-- ALTER a table (change columns/constraints)
-- TRUNCATE a table (delete all the data inside a table but leave the table)
-- DROP a table (delete a table and its included data)

DROP TABLE employees;

-- Let's create another table for example
CREATE TABLE department(
	dept_id int PRIMARY KEY, -- combination OF not null AND unique
	dept_name varchar(20) NOT NULL UNIQUE
);
