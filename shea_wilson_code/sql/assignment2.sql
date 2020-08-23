--2.1 select
--task - select all records from the employee table.

select * from "Employee";

--task - select all records from the employee table where last name is king

select * from "Employee"
where "LastName" = 'King';


-- Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.

select * from "Employee" 
where "FirstName" = 'Andrew'
and "ReportsTo" is null;

--2.2 Order by
--Task – Select all albums in album table and sort result set in descending order

select *  from "Album"
order by "Title" desc;

--Task – Select first name from Customer and sort result set in ascending order

select * from "Customer"
order by "FirstName";

--2.3 insert into
--Task – Insert two new records into Genre table
--running select all to find out the naming conventions of the columns
select * from "Genre";

insert into "Genre" ("GenreId","Name" ) --Insert key word used to update table using the provided fields
values
	(26,'Reggaeton'), 
	(27,'Dubstep');
	
--Task – Insert two new records into Employee table

select * from "Employee";

insert into "Employee" ("EmployeeId" ,"LastName" ,"FirstName" ,"Title" ,"ReportsTo" ,"BirthDate" ,"HireDate" ,"Address" ,"City","State" ,"Country" ,"PostalCode" ,"Phone" ,"Fax" ,"Email" )
values
	(9,'Wilson','Shea','Developer', 6,timestamp'1984-09-06',timestamp '2020-07-27','11202 Willowood Crk Dr.','Corpus Christi','TX','USA','78410','+1 (619) 850-2811','+1 (361) 516-8889','sheawilsn@gmail.com'),
	(10,'Wilson','Martha','Developer', 6,timestamp'1984-09-06',current_timestamp,'11202 Willowood Crk Dr.','Corpus Christi','TX','USA','78410','+1 (619) 850-2811','+1 (361) 516-8889','ellexaye@gmail.com');

--Task – Insert two new records into Customer table
select * from "Customer";
insert into "Customer" ("CustomerId","FirstName" ,"LastName","Company" ,"Address" ,"City" ,"State" , "Country" ,"PostalCode","Phone" ,"Fax" ,"Email" ,"SupportRepId" )
values 
	(62,'Shea', 'Wilson',null,'11202 Willowood Dr','Corpus Christi', 'TX','USA','78410','6198502811',null,'sheawilsn@revature.com',3),
	(63,'Martha', 'Wilson',null,'11202 Willowood Dr','Corpus Christi', 'TX','USA','78410','6198502811',null,'mwilson@gmail.com',3);


--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" 
set "FirstName" = Robert
where "CustomerId" = 32;

update "Customer" 
set "LastName" = Walter
where "CustomerId" = 32;

--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
update "Artist" 
set "Name" = 'CCR'
where "ArtistId" =76;

--2.5 LIKE
-- Task – Select all invoices with a billing address like “T”

select * from "Invoice" 
where "BillingAddress" like '%T%';

--2.6 BETWEEN
-- Task – Select all invoices that have a total between 15 and 50
select * from "Invoice"
where "Total" between 15 and 50;

-- Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee"
where "HireDate" between timestamp'2003-06-01' and timestamp'2004-03-01';

--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them)
select * from "Customer";

--3.1 System Defined Functions

--Task – Create a function that returns the current time.

create or replace function return_current_time()
returns time
as'
begin
      
return current_time ;

end
'
language plpgsql;

select return_current_time();

--Task – create a function that returns the length of a mediatype from the mediatype table

select * from "MediaType" mt;

create or replace function length_of_mediatype (e numeric )
returns numeric 
as $$
	
	declare 
	mediatype_length integer ;
	mediatype_name text;
	id integer;

	begin 

		select ("MediaTypeId")
		into id
		from "MediaType";
		
		select ("Name")
		into mediatype_name
		from "MediaType";
			
		 mediatype_length := length(mediatype_name) ;
		return mediatype_length;
	end
$$
language plpgsql;

select length_of_mediatype(3);


--3.2 System Defined Aggregate Functions
--Task –Create a function that returns the average total of all invoices

select * from "Invoice" i ;
select avg("Total")
from "Invoice" i ;

create or update function avg_total()
returns int
as $$
	declare invoice_avg integer;
begin
	select("Total")
	from "Invoice";

	invoice_avg := avg("Total") ;
	return invoice_avg;
end
$$ language plpgsql;

select avg_total();



--Task – Create a function that returns the most expensive track
select * from "Track";
select max("UnitPrice")
from "Track" t ;

--3.3 User Defined Scalar Functions
--Task – Create a function that returns the average price of invoice-line items in the invoice-line table

select * from "InvoiceLine" il ;
select avg("UnitPrice" )
from "InvoiceLine" il;

--3.4 User Defined Table Valued Functions
--Task – Create a function that returns all employees who are born after 1968.

select * from "Employee" e2 
where ("BirthDate" ) > timestamp '1968-12-31';


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




commit;


