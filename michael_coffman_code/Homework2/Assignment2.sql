---------------------- 2.1 SELECT ---------------------------

-- Task 1:
select * 
from "Employee";

-- Task 2:
select * 
from "Employee" 
where "LastName" = 'King';

-- Task 3:
select *
from "Employee"
where "FirstName" = 'Andrew' and "ReportsTo" is null;


---------------------- 2.2 ORDER BY ---------------------------

-- Task 1:
SELECT "Title"
FROM "Album"
ORDER BY "Title" DESC;

-- Task 2:
SELECT "FirstName"
FROM "Customer"
ORDER BY "FirstName";

-------------------- 2.3 INSERT INTO ---------------------------

-- Task 1:
INSERT INTO "Genre" ("GenreId", "Name")
VALUES
	(26, 'Parody'),
	(27, 'Remix');



-- Task 2:
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email")
VALUES 
	(9, 'Coffman', 'Michael', 'Junior Dev', 6, '1991-04-01', '2020-07-27', '1540 Graduation Lane', 'Middleburg', 'FL', 'Merica', '32068', '904-451-0656', '904-444-9239', 'michael.coffman@revature.com'),
	(10, 'Yankevich', 'Al', 'Musician', 4, '1968-10-17', '1992-05-11', '123 Someplace Dr.', 'Silicon Valley', 'CA', 'Merica', '12345', '987-654-3210', '123-555-7780', 'itsWeirdAlYall@parody.net');
	

-- Task 3:
INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") 
VALUES (60, 'Steve', 'Cart', 'Mining INC', '1010 Ender Isle', 'Pearl Cove', 'Shulker City', 'The END', '12345', '123-456-7890', '098-765-4321', 'stevecarts@mojang.com', 1);

INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Address", "City", "Country", "PostalCode", "Phone", "Email", "SupportRepId") 
VALUES (61, 'Dory', 'The Fish', '42 Wallaby Way', 'Sydney', 'Australia', '42042', '111-222-333', 'gottaFindNemo@dis.com', 2);




-------------------- 2.4 UPDATE ---------------------------

-- Task 1:
UPDATE "Customer" 
SET 
	"FirstName" = 'Robert',
	"LastName" = 'Walter'
WHERE 
	"CustomerId" = 32;


-- Task 2:
UPDATE "Artist" 
SET
	"Name" = 'CCR'
WHERE 
	"ArtistId" = 76;

-------------------- 2.5 LIKE ---------------------------

-- Task 1:
SELECT "BillingAddress" 
FROM "Invoice"
WHERE "BillingAddress" 
	LIKE 'T%';

-------------------- 2.6 BETWEEN ------------------------

-- Task 1:
SELECT "Total"
FROM "Invoice"
WHERE "Total" 
	BETWEEN 15 AND 20;

-- Task 2:
SELECT *
FROM "Employee"
WHERE "HireDate" 
	BETWEEN '2003-06-01' AND '2004-03-01';


-------------------- 2.7 DELETE ------------------------

-- Task 1:

/*
 * 	We must first address the first error. This is to add 'on delete cascade'
 * 	to the foreign key of table "Invoice"; this references the customer.
 * 	To change data such as this, it must first be dropped and then re-added
 * 	with the correct constraint arguments.
 */

ALTER TABLE "Invoice"
DROP CONSTRAINT "FK_InvoiceCustomerId";

ALTER TABLE "Invoice" 
ADD CONSTRAINT "FK_InvoiceCustomerId"
  FOREIGN KEY ("CustomerId") 
  REFERENCES "Customer" ("CustomerId") 
  ON DELETE CASCADE ON UPDATE NO ACTION;
  
/*
 * 	After the above command, the IDE tells us that there is still a reference.
 * 	This is a junction table referencing back to the invoice. Adding the delete cascade
 * 	keyword here essentially allows us to delete a customer, and all invoices we have 
 * 	of said customer
 */
 
ALTER TABLE "InvoiceLine"
DROP CONSTRAINT "FK_InvoiceLineInvoiceId";

ALTER TABLE "InvoiceLine" 
ADD CONSTRAINT "FK_InvoiceLineInvoiceId"
  FOREIGN KEY ("InvoiceId") 
  REFERENCES "Invoice" ("InvoiceId") 
  ON DELETE CASCADE ON UPDATE NO ACTION;
 
/*
 * 	Then we're allowed to finally delete any customer from "Customer" and all
 * 	referencing tables will delete their relative record.
 * 	..... this question took too long lol
 */

DELETE FROM "Customer"  
WHERE
	"FirstName" = 'Robert'
	AND 
	"LastName" = 'Walter';


--------------- 3.1 System Defined Functions---------------

-- Task 1:
SELECT to_char(clock_timestamp() , 'HH12 : MI : SS PM') AS current_time;

-- Task 2:
SELECT "Name", length("Name") AS MediaType_Length
FROM "MediaType"
WHERE "MediaTypeId" = 2;
-- displays length of 'Protected AAC audio file' = 24


---------- 3.2 System Defined Aggregate Functions-----------

-- Task 1:
SELECT count("Total") AS num_of_invoices, avg("Total")::numeric(5, 2) AS average_total
FROM "Invoice";

-- Task 2:
SELECT "Name", "UnitPrice"
FROM "Track"
WHERE "UnitPrice" 
	= (SELECT max("UnitPrice") FROM "Track");
		-- this was original statement, but I wanted to show
		-- the name next to it, and realized it only showed 
		-- 1 record of 1.99 instead of 213... all good now



------------- 3.3 User Defined Scalar Functions --------------

-- Task 1:
SELECT count("UnitPrice") AS Line_Items, avg("UnitPrice")::numeric(5,2) AS Average_Price_Each_Item
FROM "InvoiceLine";


---------- 3.4 User Defined Table Valued Functions -----------

-- Task 1:
SELECT *
FROM "Employee" 
WHERE
	"BirthDate" >= '1969-01-01';



--------------------- 5.1 INNER JOIN --------------------------

-- Task 1:
SELECT c."FirstName", c."LastName", i."InvoiceId"
FROM "Customer" c
INNER JOIN "Invoice" i ON i."InvoiceId" = c."CustomerId";



------------------- 5.2 FULL OUTER JOIN -----------------------

-- Task 1:
SELECT c."CustomerId", c."FirstName", c."LastName", i."InvoiceId", i."Total"
FROM "Customer" c
FULL OUTER JOIN "Invoice" i ON i."InvoiceId" = c."CustomerId";

	
---------------------- 5.3 RIGHT JOIN -------------------------

-- Task 1:
SELECT al."Title" AS Song_Title, ar."Name" AS Artist 
FROM "Album" al
RIGHT JOIN "Artist" ar ON al."ArtistId" = ar."ArtistId";


---------------------- 5.4 CROSS JOIN -------------------------

-- Task 1:
SELECT al."Title" AS Song_Title, ar."Name" AS Artist
FROM "Album" al
CROSS JOIN "Artist" ar
ORDER BY ar."Name";


------------------------ 5.5 SELF JOIN -----------------------

-- Task 1:
select e1."FirstName" || ' ' || e1."LastName" AS Employee , e2."FirstName" || ' ' || e2."LastName" as ReportsTo
from "Employee" e1 
join "Employee" e2 
on e1."ReportsTo" = e2."EmployeeId" 
order by e1."EmployeeId";

COMMIT;
	