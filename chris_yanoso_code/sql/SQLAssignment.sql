--2.1
select * from "Employee";
select * from "Employee" where "LastName"='King';
select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" is NULL;

--2.2
select * from "Album" order by "AlbumId" desc; 
select * from "Customer" order by "FirstName";

--2.3
insert into "Genre" ("GenreId", "Name" ) 
values (26, N'Musical'),
(27, N'indy');

INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") 
VALUES  (9, 'Chris', 'Yanoso', 'IT Staff', '1996-01-16', '2020-07-27', '1 Main Street', 'New York', 'New York', 'USA', 1, '(555) 555-5555', '(555) 555-5555', 'example@email.com'),
(10, 'Marilynn', 'Mercado', 'Sales Manager', '1997-04-03', '2020-08-19', '1 Main Street', 'New York', 'New York', 'USA', 1, '(555) 555-5555', '(555) 555-5555', 'example2@email.com');

INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") 
VALUES (60, 'Chris', 'Yanoso', 'Revature','1 Main Street', 'New York', 'New York', 'USA', 1, '(555) 555-5555', '(555) 555-5555', 'example@email.com', 3),
(61, 'Marilynn', 'Mercado', 'NA', '1 Main Street', 'New York', 'New York', 'USA', 1, '(555) 555-5555', '(555) 555-5555', 'example@email.com', 3);

--2.4
update "Customer" set "FirstName" = 'Robert', "LastName" = 'Walter' where "CustomerId" = 32;
update "Artist" set "Name" = 'CCR' where "Name" = 'Creedence Clearwater Revival';

--2.5
select * from "Invoice" where "BillingAddress" Like 'T%';

--2.6
select * from "Invoice" where "Total" > 15 and "Total" <50;
select * from "Employee" where "HireDate" > '2003-06-01' and "HireDate" < '2004-03-01';

--2.7
/* find customerid
 * find invoice from id
 * find invoiceline from id
 * delete from line to invoice to customer
 */
delete from "InvoiceLine" where
"InvoiceId" = 50 or
"InvoiceId" = 61 or
"InvoiceId" = 116 or 
"InvoiceId" = 245 or 
"InvoiceId" = 268 or 
"InvoiceId" = 290 or 
"InvoiceId" = 342;
delete from "Invoice" where "CustomerId" = 32; 
delete from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter';

--3.1
select current_timestamp;
select "Name", Length("Name") from "MediaType";

--3.2
select avg("Total") from "Invoice";
select max("UnitPrice") from "Track";
select * from "Track" where "UnitPrice" = 1.99;

--3.3
select avg("UnitPrice") from "InvoiceLine";

--3.4
select * from "Employee" where "BirthDate" > '1967-12-31';

--5.1
select "Invoice"."InvoiceId", "Customer"."FirstName", "Customer"."LastName"
from "Invoice" 
inner join "Customer" Using("CustomerId"); 

--5.2
select "Customer"."CustomerId", "Customer"."FirstName", "Customer"."LastName", "Invoice"."InvoiceId", "Invoice"."Total"
from "Customer"
full outer join "Invoice" on "Customer"."CustomerId" = "Invoice"."CustomerId";

--5.3
select "Artist"."Name", "Album"."Title"
from "Album"  
right join "Artist" on "Artist". "ArtistId" = "Album"."ArtistId" ;

--5.4
select *
from "Artist" 
cross join "Album" 
order by "Artist"."Name";

--5.5
select * from "Employee";
select "1"."EmployeeId", "1"."LastName", "1"."FirstName", "1"."Title", "1"."ReportsTo", "2"."LastName", "2"."FirstName"
from "Employee" "1", "Employee" "2"
where "1"."ReportsTo" = "2"."EmployeeId";


















