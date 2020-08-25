/*Part I – Working with an existing database

Setting up Chinook
In this section you will begin the process of working with the Chinook database
Task – Set up the Chinook DB by executing the script found here

2.0 SQL Queries
In this section you will be performing various queries against the Oracle Chinook database.
*/

--2.1 SELECT

--Task – Select all records from the Employee table. 
select * from "Employee";   -- or public."Employee";

--Task – Select all records from the Employee table where last name is King.
select * from "Employee"
where "LastName" like 'King';

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee"
where "FirstName" like 'Andrew'
and "ReportsTo" is NULL;