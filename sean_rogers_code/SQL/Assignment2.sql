--Task – Select all records from the Employee table.
select * from "Employee";

--Task – Select all records from the Employee table where last name is King.
select * from "Employee" where "LastName" = 'King';

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" = null;

--Task – Select all albums in album table and sort result set in descending order
select * from "Album" order by "Title" desc;

--Task – Select first name from Customer and sort result set in ascending order
select * from "Album" order by "Title" asc;

--Task – Insert two new records into Genre table
insert into "Genre" ("GenreId", "Name") values (26, N'Wood');
insert into "Genre" ("GenreId", "Name") values (27, N'Heavy Wood');

--Task – Insert two new records into Employee table
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (9, N'Rogers', N'Sean', N'IT Staff', 6, '1968/1/9', '2004/3/4', N'923 7 ST NW', N'Lethbridge', N'AB', N'Canada', N'T1H 1Y8', N'+1 (403) 467-3351', N'+1 (403) 467-8772', N'laura@chinookcorp.com');
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (10, N'Stark', N'Tony', N'IT Staff', 6, '1968/1/9', '2004/3/4', N'923 7 ST NW', N'Lethbridge', N'AB', N'Canada', N'T1H 1Y8', N'+1 (403) 467-3351', N'+1 (403) 467-8772', N'laura@chinookcorp.com');

--Task – Insert two new records into Customer table
INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (60, N'Hemsworth', N'Chris', N'Embraer - Empresa Brasileira de Aeron�utica S.A.', N'Av. Brigadeiro Faria Lima, 2170', N'S�o Jos� dos Campos', N'SP', N'Brazil', N'12227-000', N'+55 (12) 3923-5555', N'+55 (12) 3923-5566', N'luisg@embraer.com.br', 3);
INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (61, N'Ironside', N'Michael', N'Embraer - Empresa Brasileira de Aeron�utica S.A.', N'Av. Brigadeiro Faria Lima, 2170', N'S�o Jos� dos Campos', N'SP', N'Brazil', N'12227-000', N'+55 (12) 3923-5555', N'+55 (12) 3923-5566', N'luisg@embraer.com.br', 3);

--Task – Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" set "FirstName" = 'Robert', "LastName" = 'Walter' where "FirstName" = 'Aaron' and "LastName" = 'Mitchell';

--Task – Update name of artist “Creedence Clearwater Revival” to “CCR”
update "Artist" set "Name" = 'CCR' where "Name" = 'Creedence Clearwater Revival';

--Task – Select all invoices with a billing address like “T”
select * from "Invoice" where "BillingAddress" like '%T%' ;

--Task – Select all invoices that have a total between 15 and 50
select * from "Invoice" where "Total" > 15 and "Total" < 50;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee" e where "HireDate" > '2003-06-01' and "HireDate" < '2004-03-01';


select * from "InvoiceLine" il ;

-- Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
alter table "Invoice" 
drop constraint "FK_InvoiceCustomerId";
delete from "Customer" 
where "FirstName" = 'Robert' and "LastName" = 'Walter';




--Task – Create a function that returns the current time.
select current_timestamp;

--Task – create a function that returns the length of a mediatype from the mediatype table
select length(mt."Name") from "MediaType" mt;

--Task –Create a function that returns the average total of all invoices
select avg(i."Total" ) from "Invoice" i;

--Task – Create a function that returns the most expensive track
select max(t."UnitPrice") from "Track" t; 

--Task – Create a function that returns the average price of invoice-line items in the invoice-line table
select avg(il."UnitPrice") from "InvoiceLine" il;

--Task – Create a function that returns all employees who are born after 1968
select * from "Employee" e 
where e."BirthDate" > '1968-12-31';

--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId
select i2."InvoiceId", c2."FirstName", c2."LastName"
from "Customer" c2
inner join "Invoice" i2 
on c2."CustomerId" = i2."CustomerId";

--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId,
--firstname, last name, invoiceId, and total.
select c2."CustomerId", c2."FirstName", c2."LastName", i2."InvoiceId", i2."Total" 
from "Customer" c2
full outer join "Invoice" i2 
on c2."CustomerId" = i2."CustomerId";

--Task – Create a right join that joins album and artist specifying artist name and title
select ar."Name", al."Title" from "Artist" ar 
right join "Album" al 
on ar."ArtistId" = al."ArtistId";

--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
select * from "Artist" ar 
cross join "Album" al
order by ar."Name";

--Task – Perform a self-join on the employee table, joining on the reports to column.
select * from "Employee" e1
join "Employee" e2
on e2."EmployeeId" = e1."ReportsTo";






