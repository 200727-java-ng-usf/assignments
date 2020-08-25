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


--2.2 ORDER BY

--Task – Select all albums in album table and sort result set in descending order
select * from "Album"
order by "Album" desc;

--Task – Select first name from Customer and sort result set in ascending order
select "FirstName" from "Customer"
order by "FirstName" asc;


--2.3 INSERT INTO

--Task – Insert two new records into Genre table
insert into "Genre" ("GenreId", "Name")
values ('26', 'newGenre'),
	   ('27','anotherNewGenre');

--Task – Insert two new records into Employee table
insert into "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City")
values ('9', 'JingleHeimerSchmidt', 'John', 'Sales Support Agent', '2', date '1984-04-03', date '2018-07-20', '893742 Circle Drive', 'Calgary'),
	   ('10', 'Smokes', 'Holy', 'Sales Support Agent', '2', date '1988-07-03', date '2019-02-20', '99484 Alfalfa St', 'Calgary');

--Task – Insert two new records into Customer table
insert into "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId")
values ('60', 'Jay', 'Johnson', 'Chum Bucket', '8394 Powdunk Avenue', 'Memphis', 'Tennessee', 'USA', '84938', '+1 (205) 882-5857', '+1 (495) 029-5928', 'efudd@hotmail.com', '4'), 
	   ('61', 'Billy', 'Jo', 'Trees Inc.', '90384 Penny Lane', 'Miami', 'Florida', 'USA', '93725', '+1 (978) 162-8462', '+1 (847) 723-9473', 'bebob@hotmail.com', '2');

	  
--2.4 UPDATE

--Task – Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" 
set "FirstName" = 'Robert' 
where "FirstName" like 'Aaron';

update "Customer"
set "LastName" = 'Walter'
where "LastName" like 'Mitchell';

--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
update "Artist" 
set "Name" = 'CCR'
where "Name" like 'Creedence Clearwater Revival';


--2.5 LIKE

--Task – Select all invoices with a billing address like “T”
select * from "Invoice" 
where "BillingAddress" like '%T%';


--2.6 BETWEEN

--Task – Select all invoices that have a total between 15 and 50
select * from "Invoice" 
where "Total" between 15 and 50;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee"
where "HireDate" between date '2003-06-01' and date '2004-03-01';


--2.7 DELETE

--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).

select * from "Invoice" i where "CustomerId" = 32; -- Find Walter

alter table "Invoice"
drop constraint "FK_InvoiceCustomerId"; -- drop the fk constraint

alter table "Invoice"
add constraint "FK_InvoiceCustomerId"
foreign key ("CustomerId") references "Customer" ("CustomerId") on delete cascade; -- after deleting, add the constraint again

alter table "InvoiceLine" 
drop constraint "FK_InvoiceLineInvoiceId"; -- drop the constraint on the invoiceLINE table

alter table "InvoiceLine" 
add constraint "FK_InvoiceLineInvoiceId"
foreign key ("InvoiceId") references "Invoice" ("InvoiceId") on delete cascade; -- after deleting, add the constraint again

delete from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter'; -- safe to delete now

-- alter table so that it will add constraint to cascade delete
