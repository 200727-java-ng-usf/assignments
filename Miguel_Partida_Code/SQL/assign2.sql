--2.1 Select all records from the Employee table. 
select * 
from "Employee" ;

--Select all records from the Employee table where last name is King.
select *
from "Employee" 
where "LastName" ='King';

-- Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select *
from "Employee" 
where "FirstName" = 'Andrew'
and "ReportsTo" = null ;

--2.2 Select all albums in album table and sort result set in descending order
select *
from "Album" 
order by "AlbumId" desc;

--Select first name from Customer and sort result set in ascending order
select "FirstName"
from "Customer" 
order by "FirstName" asc ;

-- 2.3  Insert two new records into Genre table
insert into "Genre" ("GenreId" ,"Name" )
values
 	(666,'Folk Metal'),
 	(808,'Heavy Dubstep');
 
-- Insert two new records into Employee table
insert into chinook."Employee" ("EmployeeId" ,"LastName" ,"FirstName" ,"Title" ,"ReportsTo" ,"BirthDate" ,"HireDate" ,
 						"Address" ,"City" ,"State" ,"Country" ,"PostalCode" ,"Phone" ,"Fax" ,"Email" )
values 
	(9,'Roberts','"Robert','Disk Jockey',2,'1999-07-27','2008-08-21','123 Main St',
	'Fakesville','HI','USA','00000','1+ (456)789-1230','1+ (789)789-7894','rr@whatever.com'),
	(10,'Link','Zelda','Head Customer',2,'1989-04-17','2018-02-11','321 Niam St',
	'Notrealland','CA','USA','98653','1+ (978)321-4584','1+ (456)654-7530','geegee@gamer.org');

-- Insert two new records into Customer table
INSERT INTO chinook."Customer"
("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId")
	values
	(60, 'Mario', 'Mario', 'Mario Bros', '808 Peach Ln', 'MK', 'Toadstool', 'Mushroom Kingdom', '56987', '1+ (753)357-1595', '1+ (632)456-9875', 'mario@nintendo.org', 1),
	(61, 'Luigi', 'Mario', 'Mario Bros', '666 Haunted Rd', 'MK', 'Toadstool', 'Mushroom Kingdom', '56987', '1+ (456)753-9514', '1+ (542)215-6523', 'mario2@nintendo.org', 1);

-- 2.4 Update Aaron Mitchell in Customer table to Robert Walter
UPDATE chinook."Customer"
SET "FirstName"='Robert', "LastName"='Walter'
WHERE "FirstName" = 'Aaron';

-- Update name of artist “Creedence Clearwater Revival” to “CCR”
UPDATE chinook."Artist"
SET "Name"='CCR'
WHERE "ArtistId"=76;

-- 2.5 Select all invoices with a billing address like “T
select "BillingAddress" 
from  "Invoice" 
where "BillingAddress" like 'T%';

-- 2.6 Select all invoices that have a total between 15 and 50
select *
from "Invoice" 
where "InvoiceId" between 15 and 50;

-- Select all employees hired between 1st of June 2003 and 1st of March 2004
select *
from "Employee" 
where "HireDate" between '2003-06-01'and '2004-03-01';
 	
-- 2.7 Delete a record in Customer table where the name is Robert Walter 
-- (There may be constraints that rely on this, find out how to resolve them).

alter table "Invoice" 
drop constraint "FK_InvoiceCustomerId";

alter table "Customer" 
drop constraint "PK_Customer";

delete from "Customer" 
where "FirstName" ='Robert' and "LastName" = 'Walter';

alter table "Customer" 
add constraint PK_Customer UNIQUE ("CustomerId");

alter table "Customer" 
add constraint FK_InvoiceCustomerId foreign key (CustomerId) references "Invoice" (CustomerId);

--3.1 Create a function that returns the current time.
select current_timestamp ;

-- create a function that returns the length of a mediatype from the mediatype table
select "Name", length("Name")
from "MediaType" ;

-- 3.2 Create a function that returns the average total of all invoices
select avg("Total") 
from "Invoice" ;

-- Create a function that returns the most expensive track
select max("UnitPrice") 
from "Track";

--3.3  Create a function that returns the average price of invoice-line items in the invoice-line table
select avg("Total")
from "Invoice" ;

--3.4 Create a function that returns all employees who are born after 1968
select *
from "Employee" 
where "BirthDate" > '1967-12-31';

-- 5.1 Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
select i."InvoiceId", c."FirstName", c."LastName"
from "Invoice" i
inner join "Customer" c 
on i."CustomerId" = c."CustomerId" ;

--5.2 Create an outer join that joins the customer and 
--invoice table, specifying the CustomerId, firstname, 
--last name, invoiceId, and total.
select c."CustomerId",c."FirstName",c."LastName",i."InvoiceId",i."Total"
from "Customer" c
full join "Invoice" i 
on c."CustomerId" = i."CustomerId";

--5.3
select * 
from "Album";


