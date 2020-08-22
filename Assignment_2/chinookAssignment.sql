-- 1.0 Setting up Chinook

--In this section you will begin the process of working with the Chinook database

-- Task – Set up the Chinook DB by executing the script found here

-- The script has already been executed on a different file

-- 2.0 SQL Queries

-- In this section you will be performing various queries against the Oracle Chinook database.


-- 2.1 SELECT

-- Task – Select all records from the Employee table. 
select * from "Employee";

-- Task – Select all records from the Employee table where last name is King.
select * from "Employee"
where "LastName" = 'King';

-- Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee"
where "FirstName" = 'Andrew'
and "ReportsTo" IS NULL;


-- 2.2 ORDER BY

-- Task – Select all albums in album table and sort result set in descending order
select * from "Album"
order by "AlbumId" desc;

-- Task – Select first name from Customer and sort result set in ascending order
select "FirstName"
from chinook."Customer"
order by "FirstName";


-- 2.3 INSERT INTO

--Task – Insert two new records into Genre table
insert into "Genre" ("GenreId" , "Name") values (26, 'Indie');
insert into "Genre" ("GenreId" , "Name") values (27, 'K-pop');

-- Task – Insert two new records into Employee table
insert into "Employee" ("EmployeeId" , "LastName" , "FirstName" , "Title"    			, "ReportsTo" , "BirthDate" 		, "HireDate" 		, "Address" 			, "City" 		, "State" , "Country" , "PostalCode" , "Phone" 				, "Fax" 				, "Email" )
 				values (9			 , 'Igniss'	  , 'Aryana'    , 'IT Staff' 			, 1		   	  , '1993/10/03'		, '2015/08/19'		, '304 Cornucopia Road' , 'Lethbridge'	, 'AB'	  , 'Canada'  , 'H1S 1DY'	 , '+1 (889) 034-8890'	,  '+1 (889) 034-8896'	, 'aryana@chinookorp.com').
					   (10			 , 'Angel'	  , 'Peterson'  , 'Sales Support Agent' , 2		   	  , '1994/03/14'		, '2012/07/23'		, '1121 6 Ave SW' 		, 'Calagary'	, 'AB'	  , 'Canada'  , 'T2P 5M5'	 , '+1 (403) 636-8452'	,  '+1 (403) 636-8453'	, 'angel@chinookorp.com');

 -- Task – Insert two new records into Customer table
 insert into "Customer" ("CustomerId" , "FirstName" , "LastName" 	  , "Company" 			  , "Address" 		  , "City" 			, "State" , "Country" , "PostalCode" , "Phone" 			, "Fax" 			, "Email" 						, "SupportRepId" )
 				values 	(60			  , 'Rodrey'	, 'Atlant'	 	  , NULL 	 			  , 'Sodiqua Avenue'  , 'San Anthony'	, 'FL'	  , 'USA'	  , '61908'		 , '+1 (964)-3024'	, '+1 (964)-3024'	, 'rodreya@google.com'			, '3'),
 					 	(61			  , 'Maraya'	, 'Traitinoya'	  , 'Royal Blue co' 	  , 'Depp Sea Centre' , 'San Anthony'	, 'FL'	  , 'USA'	  , '61908'		 , '+1 (978)-3020'	, '+1 (961)-3784'	, 'marayatraitinoya@royale.net'	, '5');
 			
 			
-- 2.4 UPDATE

-- Task – Update Aaron Mitchell in Customer table to Robert Walter
update "Customer"
set "FirstName" = 'Robert', "LastName" = 'Walter'
where "FirstName" = 'Aaron' and "LastName" = 'Mitchell';

-- Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';
 

-- 2.5 LIKE

-- Task – Select all invoices with a billing address like “T”
select * from "Invoice"
where "BillingAddress" like 'T%';


-- 2.6 BETWEEN

-- Task – Select all invoices that have a total between 15 and 50
select * from "Invoice"
where "Total" > 15 and "Total" < 50;

-- Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee"
where "HireDate" > '2003/01/03' and "HireDate" < '2004/03/01';


-- 2.7 DELETE

select * from "Customer";
-- Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
alter table "Invoice" drop constraint "FK_InvoiceCustomerId";

alter table "Invoice" add constraint "FK_InvoiceCustomerId"
foreign key ("CustomerId") references "Customer" ("CustomerId") on delete cascade;

alter table "InvoiceLine" drop constraint "FK_InvoiceLineInvoiceId";

alter table "Invoice" add constraint "FK_InvoiceLineInvoiceId"
foreign key ("InvoiceId") references "Invoice" ("InvoiceId") on delete cascade;

delete from "Customer" 
where "FirstName" = 'Robert' and "LastName" = 'Walter';

-- 3.0 SQL Functions

-- In this section you will be using the PostGreSQL system functions, as well as your own functions, to perform various actions against the database


--3.1 System Defined Functions

--Task – Create a function that returns the current time.
select CURRENT_DATE;

--Task – create a function that returns the length of a mediatype from the mediatype table
select length("Name") from "MediaType";


--3.2 System Defined Aggregate Functions

--Task –Create a function that returns the average total of all invoices
select avg("Total") from "Invoice";

--Task – Create a function that returns the most expensive track
select * from "Track" where "UnitPrice" = (select max("UnitPrice") from "Track");


--3.3 User Defined Scalar Functions

--Task – Create a function that returns the average price of invoice-line items in the invoice-line table
select avg("Total") from "Invoice";


--3.4 User Defined Table Valued Functions

--Task – Create a function that returns all employees who are born after 1968.
select * from "Employee" where "BirthDate" > '1968/12/31';


--5.0 JOINS

--In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.

--5.1 INNER

--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
select c."FirstName" || ' ' || c."LastName" as Customer_Name, i."InvoiceId"
	from "Customer" c
	inner join "Invoice" i
	using("CustomerId");


--5.2 OUTER

--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, last name, invoiceId, and total.
select c."CustomerId", c."FirstName", c."LastName", i."InvoiceId", i."Total"
	from "Customer" c
	full outer join "Invoice" i
	using("CustomerId");


--5.3 RIGHT

--Task – Create a right join that joins album and artist specifying artist name and title.
select ar."Name", al."Title"
	from "Album" al
	right join "Artist" ar
	using("ArtistId");


--5.4 CROSS

--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
select a."Title", ar."Name"
	from "Album" a
	cross join "Artist" ar
	order by ar."Name" asc;


--5.5 SELF

--Task – Perform a self-join on the employee table, joining on the reports to column.
select * from "Employee" e 
	join "Employee" e2 
	on e."ReportsTo" = e2."EmployeeId";


