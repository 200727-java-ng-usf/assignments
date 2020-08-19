
--2.1 SELECT

--Task – Select all records from the Employee table. 
select * from "Employee";

--Task – Select all records from the Employee table where last name is King.
select * from "Employee"
where "LastName" = 'King';

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee"
where "FirstName" = 'Andrew' and "ReportsTo" is null;

--2.2 ORDER BY

--Task – Select all albums in album table and sort result set in descending order
select * from "Album" a 
order by a."Title" desc;

--Task – Select first name from Customer and sort result set in ascending order
select * from "Customer" c 
order by c."FirstName";


--2.3 INSERT INTO

--Task – Insert two new records into Genre table

insert into "Genre" ("GenreId", "Name")
values
	(26, 'Soul'),
	(27, 'Blues');
	


--Task – Insert two new records into Employee table
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") 
values
	(9, N'Capoli', N'Mia', N'Associate', '1997-11-24', '2020-07-27', N'42 Walaby Way', N'Sydney', N'NSW', N'Australia', N'08088', N'+1 (234) 567-9482', N'+1 (780) 254-3457', N'capolimia@gmail.com'),
	(10, 'Capoli', 'Julia', 'Associate', '1999-11-12', '2020-07-27', '42 Walaby Way', 'Sydney', 'NSW', 'Australia', '08088', '+1 (234) 567-9482', '+1 (780) 254-3457', 'capolijulia@gmail.com');

--Task – Insert two new records into Customer table
insert into "Customer" ("CustomerId", "FirstName", "LastName", "Address", "City", "State", "Country", "PostalCode", "Phone", "Email", "SupportRepId") 
values 
(60, N'Capoli', N'Mia', N'42 Walaby Way', N'Sydney', N'NSW', N'Australia', N'08088', N'+1 (312) 245-7465', N'capolimia@gmail.com', 5),
(61, N'Capoli', N'Julia', N'42 Walaby Way', N'Sydney', N'NSW', N'Australia', N'08088', N'+1 (312) 231-4276', N'capolijulia@gmail.com', 5);
;

--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" c
set "FirstName" = 'Robert', "LastName" = 'Walter'
where (
"FirstName" = 'Aaron'
and 
"LastName" = 'Mitchell'
);


--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
update "Artist" a
set "Name" = 'CCR'
where (
"Name" = 'Creedence Clearwater Revival'
);


--2.5 LIKE


--Task – Select all invoices with a billing address like “T”
select * from "Invoice" i 
where (
	"BillingAddress" like 'T%'
);


--2.6 BETWEEN


--Task – Select all invoices that have a total between 15 and 50
select * from "Invoice" i 
where (
	"Total" > 15
	and 
	"Total" < 50
);

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee" e 
where ( "HireDate" > timestamp '2003-06-01'
and 
"HireDate" < timestamp '2004-03-01'
);


--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
--
--
--3.0 SQL Functions
--In this section you will be using the PostGreSQL system functions, as well as your own functions, to perform various actions against the database
--3.1 System Defined Functions
--
--Task – Create a function that returns the current time.
--Task – create a function that returns the length of a mediatype from the mediatype table
--3.2 System Defined Aggregate Functions
--Task –Create a function that returns the average total of all invoices
--Task – Create a function that returns the most expensive track
--3.3 User Defined Scalar Functions
--Task – Create a function that returns the average price of invoice-line items in the invoice-line table
--3.4 User Defined Table Valued Functions
--Task – Create a function that returns all employees who are born after 1968.
--5.0 JOINS
--In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.
--5.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
--5.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, last name, invoiceId, and total.
--5.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.
--5.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
--5.5 SELF
--Task – Perform a self-join on the employee table, joining on the reports to column.

