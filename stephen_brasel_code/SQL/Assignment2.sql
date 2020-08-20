--Part I – Working with an existing database
--
--Setting up Chinook
--In this section you will begin the process of working with the Chinook database
--Task – Set up the Chinook DB by executing the script found here

--2.0 SQL Queries
--In this section you will be performing various queries against the Oracle Chinook database.
--2.1 SELECT
--Task – Select all records from the Employee table. 
select * from "Employee" e1;
--Task – Select all records from the Employee table where last name is King.
select * 
from "Employee" e 
where e."LastName" = 'King';
--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * 
from "Employee" e2 
where e2."FirstName" = 'Andrew'
AND e2."ReportsTo" is null;
--2.2 ORDER BY
--Task – Select all albums in album table and sort result set in descending order
select * 
from "Album" a2 
order by a2."AlbumId" desc;
--Task – Select first name from Customer and sort result set in ascending order
select * 
from "Album" a2 
order by a2."AlbumId" asc;
--2.3 INSERT INTO
--Task – Insert two new records into Genre table
select * 
from "Genre" g2
--where g2."Name" like '%etal%'
order by g2."GenreId" ;

insert into "Genre"
values(26, 'Death Metal'),
	(27, 'Thrash Metal');
--Task – Insert two new records into Employee table

select * 
from "Employee" e2 ;
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") 
VALUES 
(9, N'Winchester', N'Sam', N'Hunter', 1, '1979/1/24', current_date, N'666 713 ST NW', N'Lebanon', N'KA', N'United States', N'66952', N'+1 (800) 945-5237', N'+1 (800) 945-5237', N'lawboy@stanford.edu'),
(10, N'Winchester', N'Dean', N'Hunter', 1, '1983/5/2', current_date, N'666 713 ST NW', N'Lebanon', N'KA', N'United States', N'66952', N'+1 (866) 907-3235', N'+1 (866) 907-3235', N'jwinchester1246@gmail.com');

--Task – Insert two new records into Customer table
select * 
from "Customer" c 
where c."FirstName" like '%Min%'
or
c."FirstName" like '%lob%';

INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Address", "City", "Country", "PostalCode", "Phone", "Email", "SupportRepId") 
VALUES 
(60, N'Blob', N'Marley', N'143 Forrest Ln', N'Arabia', N'Alabama', N'31265', N'+1 315 9162240', N'bmarley@gmail.net', 3),
(61, N'Mini', N'Meme', N'1600 Pennsylvania Avenue', N'Washington D.C.', N'Washington D.C.', N'12345', N'+1 800 1234567', N'mmeme@yahoo.com', 3);

--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
select *
from "Customer" c2 
where c2."FirstName" = 'Robert';

update "Customer"
set "FirstName" = 'Robert',
	"LastName"  = 'Walter'
where "FirstName" = 'Aaron'
	and "LastName" = 'Mitchell';

--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
select *
from "Artist" a2 
order by "Name" ;

update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';

--2.5 LIKE
--Task – Select all invoices with a billing address like “T”
select * 
from "Invoice" i 
where i."BillingAddress" like '%T%';

--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50

select *
from "Invoice" i 
where "Total" between 15 and 50;

select * 
from "Invoice" i 
order by "Total" ;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004

select *
from "Employee" e 
where "HireDate" between date '2003-06-01' and date '2004-03-31';

select * 
from "Employee" e 
order by "HireDate" ;

--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).

select * 
from "Customer" c  
where "FirstName" = 'Robert' 
	and "LastName" = 'Walter';

select * 
from "Invoice" i 
where "CustomerId" = 32;

delete from "Customer" 
where "FirstName" = 'Robert'
	and "LastName" = 'Walter';

alter table "Customer" add constraint "FK_CustomerInvoiceId"
    foreign key ("CustomerId") references "Invoice" ("CustomerId") on delete cascade;


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
Task – Perform a self-join on the employee table, joining on the reports to column.
