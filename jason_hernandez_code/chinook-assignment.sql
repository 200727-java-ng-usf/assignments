-- 2.1 SELECT
-- Select all records from the Employee table
SELECT * FROM "Employee";

-- Select all records from the Employee table where last name is King.
select * from "Employee"
where "LastName" = 'King'; -- Only one record: Robert King, IT Staff

-- Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee"
where "FirstName" = 'Andrew'
and "ReportsTo" is null; -- Andrew Adams, general Manager

-- 2.2 ORDER BY
-- Select all albums in album table and sort result set in descending order
select * from "Album"
order by "AlbumId" desc; -- 347 Koyaanisqatsi; 346 Mozart: Chamber Music; 345 Monteverdi: L'Orfeo...

--Select first name from Customer and sort result set in ascending order
select "FirstName" from "Customer"
order by "FirstName"; -- Aaron, Astrid, Bjorn, Camille, Daan, Dan...

-- 2.3 INSERT INTO
--Insert two new records into Genre table
insert into "Genre" ("GenreId", "Name")
values 	(26, 'J-Pop'),
		(27, 'Folk'); -- The GenreId is not auto-incrementing
		
-- Insert two new records into Employee table
insert into "Employee"
	("EmployeeId", "LastName", "FirstName", "Title", 
	"ReportsTo", "BirthDate", "HireDate", "Address", 
	"City", "State", "Country", "PostalCode", "Phone", "Fax", "Email")
values
	(9, 'Wonderland', 'Allison', 'Customer Service Rep', 
	2, date '1973-04-01 00:00:00', date '2005-01-31 00:00:00', '321 White Rabbit Dr',
	'Edmonton', 'AB', 'Canada', 'T5K 2N1', '+1 (780)678-5678', '+1 (780) 987-6543', 'alice@chinookcorp.com'),
	(10, 'Hill', 'Sam', 'Admin', 
	1, date '1983-09-10 00:00:00', date '2005-01-31 00:00:00', '114 10 Street SE, #6',
	'Lethbridge', 'AB', 'Canada', 'T1H 1Y8', '+1 (403)555-5555', '+1 (403) 467-1111', 'Sam@chinookcorp.com');

-- Insert two new records into Customer table
insert into "Customer" ("CustomerId", "FirstName", "LastName", "Address",
			"City", "State", "Country", "PostalCode", "Phone", "Email", "SupportRepId")
values
	(60, 'Louis', 'Armstrong', '17 Satchmo Ave', 
	'New Orleans', 'LA', 'USA', '70115', '+1 (504) 504-5004', 'satch@gmail.com', 5),
	(61, 'Amanda', 'Reckonwith', '876 6th Street',
	'London', null, 'UK', 'EC1A 1AA', '+44 202 8765-4321', 'areckonwith@goodl.uk', 5);

-- 2.4 update
-- Update Aaron Mitchell in Customer table to Robert Walter
select * from "Customer"
where "FirstName" = 'Aaron' and "LastName" = 'Mitchell'; -- need to find the CustomerId

update "Customer" 
set "FirstName" = 'Robert', "LastName" = 'Walter'
where "CustomerId" = 32; -- use CustomerId as the index

-- Update name of artist “Creedence Clearwater Revival” to “CCR”
update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival'; -- this time did it with the same index

-- 2.5 like
-- Select all invoices with a billing address like “T”
select * from "Invoice"
where "BillingAddress" like 'T%'; -- two addresses: Theodor-Heuss-Strasse and Tauentzienstrasse

-- 2.6 between
-- Select all invoices that have a total between 15 and 50
select * from "Invoice"
where "Total" between 15 and 20; -- seven invoices met this criterion

-- Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee"
where "HireDate" between date '2003-06-01' and date '2004-03-01'; -- Johnson, Mitchell, King

-- 2.7 Delete a record in Customer table where the name is Robert Walter
select * from "Customer"
where "FirstName" = 'Robert' and "LastName" = 'Walter';

select * from "Invoice"
where "CustomerId" = 32; -- verify that there is such a column in this table

alter table "Invoice" 
drop constraint "FK_InvoiceCustomerId"; -- must first drop existing constraint

alter table "InvoiceLine" 
drop constraint "FK_InvoiceLineInvoiceId"; -- and the other one

-- set foreign keys to cascade delete
ALTER TABLE "Invoice" ADD CONSTRAINT "FK_InvoiceCustomerId"
    FOREIGN KEY ("CustomerId") REFERENCES "Customer" ("CustomerId") ON delete cascade; 
   
ALTER TABLE "InvoiceLine" ADD CONSTRAINT "FK_InvoiceLineInvoiceId"
    FOREIGN KEY ("InvoiceId") REFERENCES "Invoice" ("InvoiceId") ON delete cascade;

delete from "Customer" 
where "FirstName" = 'Robert' and "LastName" = 'Walter'; -- now it works

commit; -- not about to lose that much work!!

-- 3.1 System Defined functions
-- Create a function that returns the current time.
create or replace function get_time(t date)
returns date 
as $$
	begin 
		return convert(time, GETDATE());
	end
$$ language plpgsql;

--create a function that returns the length of a mediatype from the mediatype table
select * from "MediaType"; -- first see what is there

create or replace function find_length(j numeric)
returns numeric 
as $$
	declare 
		name_length integer;
		retrieved_result text;
	
	begin 
		SELECT "Name", length("Name") 
		into name_length 
		FROM "MediaType";
	
		retrieved_result := name_length;
		return retrieved_result;
	end
$$ language plpgsql;

-- 3.2 System Defined Aggregate functions
-- Create a function that returns the average total of all invoices
create or replace function get_average()
returns numeric 
as $$
	declare 
		average_price float;
		retrieved_result float; 
		
	begin 
		select avg("Total")
		into average_price
		from "Invoice";
		
		retrieved_result := average_price;
		return retrieved_result;
	end 
	
$$ language plpgsql;

SELECT get_average();

-- Create a function that returns the most expensive track
create or replace function get_priciest_track()
returns text 
as $$
	declare 
		highest_price integer;
		track_name text; 
		retrieved_result text; 
		
	begin 
		select max("UnitPrice")
		into highest_price
		from "Track";
		
		select "Name"
		into track_name
		from "Track"
		where "TrackId" = highest_price;
	
		
		retrieved_result := highest_price || ' - ' || track_name;
		return retrieved_result;
	end 
	
$$ language plpgsql;

select get_priciest_track();

-- 3.3 User Defined Scalar Functions
-- Create a function that returns the average price of invoice-line items in the invoice-line table

create or replace function get_line_average()
returns numeric 
as $$
	declare 
		average_price float;
		retrieved_result float; 
		
	begin 
		select avg("UnitPrice")
		into average_price
		from "InvoiceLine";
		
		retrieved_result := average_price;
		return retrieved_result;
	end 
	
$$ language plpgsql; -- not very different from 3.2

SELECT get_line_average();

commit; -- another wise place to save