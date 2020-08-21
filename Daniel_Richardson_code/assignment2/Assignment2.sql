

--Q2.1=========================================================
--Task – Select all records from the Employee table. 
--Task – Select all records from the Employee table where last name is King.
--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.

select * from "Employee";

select * from "Employee"
where "LastName" = 'King';

select * from "Employee"
where ("FirstName" = 'Andrew') and ("ReportsTo" IS Null);

--Q2.2=========================================================
--Task – Select all albums in album table and sort result set in descending order
--Task – Select first name from Customer and sort result set in ascending order

select * from "Album" 
order by "Title" desc;

select * from "Customer"
order by "FirstName" asc;

--Q2.3=========================================================
--Task – Insert two new records into Genre table
--Task – Insert two new records into Employee table
--Task – Insert two new records into Customer table

insert into "Genre" ("GenreId", "Name")
values 
	(26, 'Spaghetti Western'),
	(27, 'Kabob Western');


insert into "Employee" ("EmployeeId", "LastName", "FirstName")
values 
	(9, 'Jimmy', 'John'),
	(10, 'Bill', 'Billy');

insert into "Customer" ("CustomerId","FirstName", "LastName", "Email")
values
	(60, 'Jimmy', 'John', 'jj@aol.com'),
	(61, 'Bill', 'Billy', 'bb@aol.com');

--Q2.4=========================================================
--Task – Update Aaron Mitchell in Customer table to Robert Walter
--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”

update "Customer"
set "FirstName" = 'Robert', "LastName" = 'Walter'
where ("FirstName" = 'Aaron' and "LastName" = 'Mitchell');
--select * from "Customer"
--where "FirstName" = 'Aaron' or "FirstName" = 'Robert';

update "Artist"
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';
--select * from "Artist"
--where "Name" = 'CCR' or "Name" = 'Creedence Clearwater Revival';

--Q2.5=========================================================
--Task – Select all invoices with a billing address like “T”

select * from "Invoice"
where "BillingAddress" like '%T%';

--Q2.6=========================================================
--Task – Select all invoices that have a total between 15 and 50
--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004

select * from "Invoice"
where ("Total" > 15.00) and ("Total" < 50.00);

select * from "Employee"
where "HireDate" > TO_DATE('2003-06-01', 'YYYY-MM-DD')
and
"HireDate" < TO_DATE('2004-03-01', 'YYYY-MM-DD');

--Q2.7=========================================================
--Task – Delete a record in Customer table where the name is Robert Walter 
--(There may be constraints that rely on this, find out how to resolve them).

alter table "Invoice"
drop constraint "FK_InvoiceCustomerId";

--ALTER TABLE assignment2."Invoice" 
--ADD CONSTRAINT "FK_InvoiceCustomerId" 
--FOREIGN KEY ("CustomerId") 
--REFERENCES assignment2."Customer"("CustomerId")

ALTER TABLE assignment2."Invoice" 
ADD CONSTRAINT "FK_InvoiceCustomerId" 
FOREIGN KEY ("CustomerId") 
REFERENCES assignment2."Customer"("CustomerId")
on delete cascade;

select * from "Customer" where "FirstName" = 'Robert';

delete from "Customer"
where ("FirstName" = 'Robert')
and 
("LastName" = 'Walter');



--Q3.1=========================================================
--Task – Create a function that returns the current time.
--Task – create a function that returns the length of a mediatype from the mediatype table

select current_timestamp;

select * from "MediaType";

select length("Name")
from "MediaType"
where "MediaTypeId" = 2;

--Q3.2=========================================================
--Task –Create a function that returns the average total of all invoices
--Task – Create a function that returns the most expensive track

select avg("Total")
from "Invoice";

select max("UnitPrice")
from "Track";

--Q3.3=========================================================
--Task – Create a function that returns the average price of invoice-line items in the invoice-line table

select * from "InvoiceLine";
select avg("UnitPrice") as "Average" from "InvoiceLine";

--Q3.4=========================================================
--Task – Create a function that returns all employees who are born after 1968.

select * from "Employee"
where "BirthDate" > TO_DATE('1969-01-01', 'YYYY-MM-DD');

--Q5.1=========================================================
--Task – Create an inner join that joins customers and orders and 
--specifies the name of the customer and the invoiceId.

select "Customer"."LastName",
		"Customer". "FirstName",
		"Invoice"."InvoiceId"
from "Customer"
inner join "Invoice"
on "Invoice"."CustomerId" = "Customer"."CustomerId";

--Q5.2=========================================================
--Task – Create an outer join that joins the customer and invoice table, 
--specifying the CustomerId, firstname, last name, invoiceId, and total.

select  "Customer"."CustomerId", 
		"Customer"."FirstName",
		"Customer"."LastName",
		"Invoice"."InvoiceId",
		"Invoice"."Total"
from "Customer"
full join "Invoice"
on "Invoice"."CustomerId" = "Customer"."CustomerId";

--Q5.3=========================================================
--Task – Create a right join that joins album and artist specifying artist name and title.

select "Artist"."Name",
		"Album"."Title"
from "Album"
RIGHT join "Artist"
on "Album"."ArtistId" = "Artist"."ArtistId";

--Q5.4=========================================================
--Task – Create a cross join that joins album and artist 
--and sorts by artist name in ascending order.

select *
from "Album"
cross join "Artist"
order by "Name" asc;

--Q5.5=========================================================
--Task – Perform a self-join on the employee table, joining on the reports to column.

select e."LastName",
		e."ReportsTo",
		e."EmployeeId" 
from "Employee" e
right join "Employee" ee
on ee."ReportsTo" = e."EmployeeId";

