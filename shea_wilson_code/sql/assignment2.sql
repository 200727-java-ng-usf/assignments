--2.1 select
--task - select all records from the employee table.

select * from "Employee";

--task - select all records from the employee table where last name is king

select * from "Employee"
where "LastName" = 'King';


-- Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.

select * from "Employee" 
where "FirstName" = 'Andrew'
and "ReportsTo" is null;

--2.2 Order by
--Task – Select all albums in album table and sort result set in descending order

select *  from "Album"
order by "Title" desc;

--Task – Select first name from Customer and sort result set in ascending order

select * from "Customer"
order by "FirstName";

--2.3 insert into
--Task – Insert two new records into Genre table
--running select all to find out the naming conventions of the columns
select * from "Genre";

insert into "Genre" ("GenreId","Name" ) --Insert key word used to update table using the provided fields
values
	(26,'Reggaeton'), 
	(27,'Dubstep');
	
--Task – Insert two new records into Employee table

select * from "Employee";

insert into "Employee" ("EmployeeId" ,"LastName" ,"FirstName" ,"Title" ,"ReportsTo" ,"BirthDate" ,"HireDate" ,"Address" ,"City","State" ,"Country" ,"PostalCode" ,"Phone" ,"Fax" ,"Email" )
values
	(9,'Wilson','Shea','Developer', 6,timestamp'1984-09-06',timestamp '2020-07-27','11202 Willowood Crk Dr.','Corpus Christi','TX','USA','78410','+1 (619) 850-2811','+1 (361) 516-8889','sheawilsn@gmail.com'),
	(10,'Wilson','Martha','Developer', 6,timestamp'1984-09-06',current_timestamp,'11202 Willowood Crk Dr.','Corpus Christi','TX','USA','78410','+1 (619) 850-2811','+1 (361) 516-8889','ellexaye@gmail.com');

--Task – Insert two new records into Customer table
select * from "Customer";
insert into "Customer" ("CustomerId","FirstName" ,"LastName","Company" ,"Address" ,"City" )


--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" 
set "FirstName" = Robert
where "CustomerId" = 32;

update "Customer" 
set "LastName" = Walter
where "CustomerId" = 32;

--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
update "Artist" 
set "Name" = 'CCR'
where "ArtistId" =76;

--2.5 LIKE
-- Task – Select all invoices with a billing address like “T”

select * from "Invoice" 
where "BillingAddress" like '%T%';

--2.6 BETWEEN
-- Task – Select all invoices that have a total between 15 and 50
select * from "Invoice"
where "Total" between 15 and 50;

-- Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee"
where "HireDate" between timestamp'2003-06-01' and timestamp'2004-03-01';

--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them)
select * from "Customer";




commit;


