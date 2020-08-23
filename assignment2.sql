--2.1 SELECT
--Task – Select all records from the Employee table. 
SELECT * FROM "Employee";

--Task – Select all records from the Employee table where last name is King.
select * from "Employee" 
where ( "LastName" = 'King');

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee" 
where ("FirstName" = 'Andrew'
		and 
		"ReportsTo" is null);
	
--2.2 ORDER BY
--Task – Select all albums in album table and sort result set in descending order
select * from "Album"
order by "Title" desc;
	
--Task – Select first name from Customer and sort result set in ascending order
select "FirstName" from "Customer"
order by "FirstName" asc;
	
--2.3 INSERT INTO
--Task – Insert two new records into Genre table
insert into "Genre" ("GenreId", "Name" ) values
		(26, 'Hair Nation'),
		(27, 'Liquid Metal');
select * from "Genre";

--Task – Insert two new records into Employee table
insert into "Employee" ("EmployeeId", "FirstName" ,"LastName" ,"Title" ,"ReportsTo","BirthDate" ,"HireDate" ,
						"Address" ,"City" ,"State" ,"Country" ,"PostalCode" ,"Phone" ,"Fax", "Email" )
values 
(9,'John', 'Wick', 'Sales Support Agent', 1, date '1978-01-01', current_date, '1234 Kicking it lane', 'Edmondton', 'AB',
 'Canada', 'T2P 5M5', '+1(234)567-9900', '1(222)333-4444', 'jwick@chnookcorp.com'),
 (10, 'Dana', 'Smith', 'IT Support', 1, date '1982-01-01', current_date, '1234 Gover drive', 'Alberta', 'AB',
 'Canada', 'T2K 5M5', '+1(234)978-1155', '1(777)666-9876', 'dasmithk@chnookcorp.com');
	
--Task – Insert two new records into Customer table
insert into "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State",
			"Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId" )
values
(60, 'Clare', 'Danes', null, '6675 Blooming street', 'Denver', 'CO', 'USA', '65489', '1(235)456-1783',
'1(785)213-6784', 'claredanes@gmail.com', 9),
(61, 'Jana', 'Moore', null, '7824 Forlorn blvd', 'Denver', 'CO', 'USA', '65489', '1(785)473-9861',
'1(214)268-7964', 'jmoore@yahoo.com', 10);

--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" 
set "FirstName" = 'Robert',
	"LastName"  = 'Walter'
where "FirstName" = 'Aaron' and "LastName" = 'Mitchell';

select * from "Customer"
where "FirstName" = 'Robert'; 

--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
select * from "Artist"
order by "Name";

update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';
	
--2.5 LIKE
--Task – Select all invoices with a billing address like “T”
select * from "Invoice"
where "BillingAddress" like 'T%';
	
--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50
select * from "Invoice"
where "Total" between 15 and 50;
	
--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee"
where "HireDate" between date '2003-07-01' and date '2004-03-01';
	
--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter 
--(There may be constraints that rely on this, find out how to resolve them).
select * from "Customer"
where "FirstName" = 'Robert' and "LastName" = 'Walter';

alter table "Invoice" -- dropping primary key (wasn't neccessary)
drop constraint "FK_InvoiceCustomerId";

alter table "Customer" -- dropping primary key (wasn't neccessary)
drop constraint "PK_Customer";

alter table "Customer" -- dropping foreign key in customer
drop constraint "FK_CustomerSupportRepId";

alter table "Customer" -- adding primary key (done)
add constraint "PK_Customer"
primary key ("CustomerId");

alter table "Customer"
add constraint "FK_CustomerSupportRepId"
foreign key ("SupportRepId") references "Employee" ("EmployeeId") on delete cascade;

alter table "Invoice" 
add constraint "FK_InvoiceCustomerId"
foreign key ("CustomerID")
references "Customer" ("CustomerId") on delete cascade;


delete from "Customer"
where "CustomerId" = 32
returning *;

--3.0 SQL Functions
--In this section you will be using the PostGreSQL system functions, as well as your own functions,
--to perform various actions against the database

--3.1 System Defined Functions
--Task – Create a function that returns the current time.
select current_time;

--Task – create a function that returns the length of a mediatype from the mediatype table
select "Name" as name, length ("Name") len
from "MediaType"
order by len;

--3.2 System Defined Aggregate Functions
--Task –Create a function that returns the average total of all invoices
select avg("Total") from "Invoice";

--Task – Create a function that returns the most expensive track
select max("Total") from "Invoice";


--3.3 User Defined Scalar Functions
--Task – Create a function that returns the average price of invoice-line items in the invoice-line table
select avg("UnitPrice" ) as price
from "InvoiceLine";

--3.4 User Defined Table Valued Functions
--Task – Create a function that returns all employees who are born after 1968.
select * from "Employee";
select *
from "Employee"
where "BirthDate" > date '1968-01-01'
order by "BirthDate" ;

--5.0 JOINS
--In this section you will be working with combining various tables through the use of joins. 
--You will work with outer, inner, right, left, cross, and self joins.
--5.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and
-- the invoiceId.
select * from "Customer";
select c."FirstName", c."LastName", c."CustomerId", i."InvoiceId" 
from "Customer"c
join "Invoice" i
on c."CustomerId" = i."CustomerId" 
order by c."CustomerId";

--5.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the 
--CustomerId, firstname, last name, invoiceId, and total.
select c."CustomerId", c."FirstName", c."LastName", i."InvoiceId",i."Total"
from "Customer" c
full join "Invoice" i
on c."CustomerId" = i."CustomerId" 
where c."CustomerId" is not null or i."Total" is not null
order by c."CustomerId";


--5.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.
select "Artist"."Name", "Album"."Title" 
from "Album"  
right join "Artist"  
on "Album"."ArtistId" = "Artist"."ArtistId"; 

--5.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
select "Album"."Title", "Artist"."Name"
from "Artist"
cross join "Album"
order by "Artist"."Name";

--5.5 SELF
--Task – Perform a self-join on the employee table, joining on the reports to column.
select e."FirstName" || ' ' || e."LastName" as Employee, m."FirstName" || ' ' || m."LastName" as Manager
from "Employee" e  
right join "Employee" m on m."EmployeeId" = e."ReportsTo"; 

