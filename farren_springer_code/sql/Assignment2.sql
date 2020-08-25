--2.1 SELECT

--Task – Select all records from the Employee table. 
SELECT * FROM chinook."Employee";

--Task – Select all records from the Employee table where last name is King.
select * from chinook."Employee"
where "LastName" like 'King';

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from chinook."Employee"
where "FirstName" like 'Andrew'
and "ReportsTo" is NULL;


--2.2 ORDER BY

--Task – Select all albums in album table and sort result set in descending order
select * from chinook."Album"
order by "Album" desc;

--Task – Select first name from Customer and sort result set in ascending order
select "FirstName" from chinook."Customer"
order by "FirstName" asc;


--2.3 INSERT INTO

--Task – Insert two new records into Genre table
insert into chinook."Genre" ("GenreId", "Name")
values ('26', 'newGenre'),
	   ('27','anotherNewGenre');

--Task – Insert two new records into Employee table
insert into chinook."Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City")
values ('9', 'JingleHeimerSchmidt', 'John', 'Sales Support Agent', '2', date '1984-04-03', date '2018-07-20', '893742 Circle Drive', 'Calgary'),
	   ('10', 'Smokes', 'Holy', 'Sales Support Agent', '2', date '1988-07-03', date '2019-02-20', '99484 Alfalfa St', 'Calgary');

--Task – Insert two new records into Customer table
insert into chinook."Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId")
values ('60', 'Elmer', 'Fudd', 'Chum Bucket', '8394 Powdunk Avenue', 'Memphis', 'Tennessee', 'USA', '84938', '+1 (205) 882-5857', '+1 (495) 029-5928', 'efudd@hotmail.com', '4'), 
	   ('61', 'Bill', 'Ebob', 'Trees Inc.', '90384 Penny Lane', 'Miami', 'Florida', 'USA', '93725', '+1 (978) 162-8462', '+1 (847) 723-9473', 'bebob@hotmail.com', '2');

	  
--2.4 UPDATE

--Task – Update Aaron Mitchell in Customer table to Robert Walter
update chinook."Customer" 
set "FirstName" = 'Robert' 
where "FirstName" like 'Aaron';

update chinook."Customer"
set "LastName" = 'Walter'
where "LastName" like 'Mitchell';

--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
update chinook."Artist" 
set "Name" = 'CCR'
where "Name" like 'Creedence Clearwater Revival';


--2.5 LIKE

--Task – Select all invoices with a billing address like “T”
select * from chinook."Invoice" 
where "BillingAddress" like '%T%';


--2.6 BETWEEN

--Task – Select all invoices that have a total between 15 and 50
select * from chinook."Invoice" 
where "Total" between 15 and 50;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from chinook."Employee"
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


--3.0 SQL Functions

--In this section you will be using the PostGreSQL system functions, as well as your own functions, to perform various actions against the database

--3.1 System Defined Functions

--Task – Create a function that returns the current time.
select current_timestamp;

--create function getTime()
--returns varTypeHere
--begin
--	declare the_time varTypeHere;
--	set the_time = current_timestamp 
--	return the_time;
--end

--Task – create a function that returns the length of a mediatype from the mediatype table
select length ("MediaType"."Name")
from chinook."MediaType";


--3.2 System Defined Aggregate Functions

--Task –Create a function that returns the average total of all invoices
select avg ("Invoice"."Total")
from chinook."Invoice";

--Task – Create a function that returns the most expensive track
select max ("Track"."UnitPrice")
from chinook."Track";

--3.3 User Defined Scalar Functions

--Task – Create a function that returns the average price of invoice-line items in the invoice-line table
select avg ("InvoiceLine"."UnitPrice")
from chinook."InvoiceLine";


--3.4 User Defined Table Valued Functions

--Task – Create a function that returns all employees who are born after 1968.
select *
from chinook."Employee"
where ("BirthDate" > date '1968-01-01');


--5.0 JOINS

--In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.

--5.1 INNER

--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
select "Invoice"."InvoiceId", "Customer"."FirstName"
from chinook."Invoice"
inner join chinook."Customer" 
on "Invoice"."CustomerId"="Customer"."CustomerId"; 

--5.2 OUTER

--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, last name, invoiceId, and total.
select "Customer"."CustomerId", "Customer"."FirstName", "Customer"."LastName", "Invoice"."InvoiceId", "Invoice"."Total"
from chinook."Invoice"
full outer join chinook."Customer"
on "Invoice"."CustomerId" = "Customer"."CustomerId"; 

--5.3 RIGHT

--Task – Create a right join that joins album and artist specifying artist name and title.
select "Album"."Title", "Artist"."Name"
from chinook."Album"
right join chinook."Artist"
on "Album"."ArtistId" = "Artist"."ArtistId";

--5.4 CROSS

--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
select "Album"."Title", "Artist"."Name"
from chinook."Album"
cross join chinook."Artist"
order by "Artist"."Name" asc;

--5.5 SELF

--Task – Perform a self-join on the employee table, joining on the reports to column.
select * from "Employee" e 
join "Employee" e2 
on e."ReportsTo" = e2."ReportsTo";





