-- SELECT ALL FROM employee TABLE
select * from "Employee";

-- Select all records from the Employee table where last name is King
select * 
from "Employee"
where "LastName" = 'King';

-- Select all records from the Employee table where first name is Andrew and Reportsto is null.
select * 
from "Employee"
where "FirstName" = 'Andrew' or "ReportsTo" = null;

-- Select all albums in album table and sort result set in descending order
select * 
from "Album"
order by "AlbumId" desc;

-- Select first name from Customer and sort result set in ascending order
select "FirstName"
from "Customer"
order by "FirstName" asc;

-- Insert two new records into Genre table
insert into "Genre" ("GenreId", "Name")
values 
	('26', 'Trance'),
	('27', 'HardStyle');

-- Insert two new records into Employee table
insert into "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate",
						"HireDate", "Address","City", "State", "Country", "PostalCode", "Phone",
						"Fax", "Email")
values 
	('9', 'Sheppard', 'Josh', 'IT Staff', '6', '1990-05-20', '1992-04-21', '121 Hill', 'Roswell',
	'NM', 'United States', '88203', '+1 (505) 332-5487', '+1 (505) 345-7654', 'sheppard@chinookcorp.com'),
	('10', 'Villalobos', 'Shane', 'IT Staff', '6', '1998-05-20', '1999-04-21', '200 DownHill', 'Roswell',
	'NM', 'United States', '88201', '+1 (505) 352-5997', '+1 (505) 575-7764', 'villalobos@chinookcorp.com');

-- Insert two new records into Customer table
insert into "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax",
						"Email", "SupportRepId")
values 
	('60', 'Tom', 'Shake', null, '202 Star', 'Charlotte', 'NC', 'United States', '28009', '+1 (704) 345-0976', null, 'shake@yahoo.com', '3'),
	('61', 'Estevan', 'Dom', null, '543 Gravel Road', 'Asheville', 'NC', 'United States', '23009', '+1 (764) 345-0076', null, 'dom@gmail.com', '4');

-- Update Aaron Mitchell in Customer table to Robert Walter
update "Customer"
set "FirstName" = 'Robert', "LastName" = 'Walter'
where "CustomerId" = '32';

-- Update name of artist "Creedence Clearwater Revival" to "CCR
update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';

-- Select all invoices with a billing address like "T"
select *
from "Invoice"
where "BillingAddress" like 'T%';

-- Select all invoices that have a total between 15 and 50
select *
from "Invoice" 
where "Total" between 15 and 50;

-- Select all employees hired between 1st of June 2003 and 1st of March 2004
select *
from "Employee"
where "HireDate" between '20030601' and '20040301';

-- Delete a record in Customer table where the name is Robert Walter

-- dropped constraint on Invoice table
alter table "Invoice"
drop  constraint "FK_InvoiceCustomerId";

-- added the constraint with on delete cascade on Invoice table
ALTER TABLE "Invoice" add constraint "FK_InvoiceCustomerId" 
FOREIGN KEY ("CustomerId") REFERENCES "Customer"("CustomerId") on delete cascade;

-- dropped the constraint on the InvoiceLine table
alter table "InvoiceLine"
drop constraint "FK_InvoiceLineInvoiceId";

-- added the constraint with on delete cascade on the InvoiceLine table
alter table "InvoiceLine" add constraint "FK_InvoiceLineInvoiceId"
foreign key ("InvoiceId") references "Invoice"("InvoiceId") on delete cascade;

-- deleted the Robert Walter from the Customer table
delete from "Customer"
where "FirstName" = 'Robert' and "LastName" = 'Walter';

-- Create a function that returns the current time
select (current_time);

-- Create a function that returns the length of a mediatype
select length("Name")
from "MediaType"
where "MediaTypeId" = '1';

-- Create a function that returns the average total of all invoices
select AVG("Total")
from "Invoice";

-- Create a function that returns the most expensive track
select max("UnitPrice") 
from "Track";

-- Create a function that returns the average price of invoice-line items in the invoice-line table
select avg("UnitPrice") 
from "InvoiceLine";

-- Create a function that returns all employees who are born after 1968.
select * 
from "Employee"
where "BirthDate" > '12/31/1968';

-- Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
select c."FirstName", i."InvoiceId"
from "Customer" c
join "Invoice" i
on c."CustomerId" = i."InvoiceId";

-- Create an outer join that joins the customer and invoice table, 
-- specifying the CustomerId, firstname, last name, invoiceId, and total.
select c."CustomerId", c."FirstName", c."LastName", i."InvoiceId", i."Total"
from "Customer" c
full outer join  "Invoice" i
on c."CustomerId" = i."CustomerId";

-- Create a right join that joins album and artist specifying artist name and title.
select a."Title", a2."Name"
from "Album" a
right join "Artist" a2
on a."AlbumId" = a2."ArtistId";

-- Create a cross join that joins album and artist and sorts by artist name in ascending order.
select *
from "Album" a
cross join "Artist" a2
order by a2."Name" asc;

-- Perform a self-join on the employee table, joining on the reports to column.
select "LastName",  "ReportsTo" 
from "Employee";



select *
from "Album";

select *
from "Artist";
commit;
















