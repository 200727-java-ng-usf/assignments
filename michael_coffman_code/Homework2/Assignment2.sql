---------------------- 2.1 SELECT ---------------------------

-- Task 1:
select * from "Employee";

-- Task 2:
select * from "Employee" 
where "LastName" = 'King';

-- Task 3:
select *
from "Employee"
where "FirstName" = 'Andrew' and "ReportsTo" is null;


---------------------- 2.2 ORDER BY ---------------------------

-- Task 1:
SELECT *
FROM "Album"
ORDER BY "AlbumId" DESC;

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

SELECT * FROM "Genre";

-- Task 2:
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email")
VALUES 
	(9, 'Coffman', 'Michael', 'Junior Dev', 6, '1991-04-01', '2020-07-27', '1540 Graduation Lane', 'Middleburg', 'FL', 'Merica', '32068', '904-451-0656', '904-444-9239', 'michael.coffman@revature.com'),
	(10, 'Yankevich', 'Al', 'Musician', 4, '1968-10-17', '1992-05-11', '123 Someplace Dr.', 'Silicon Valley', 'CA', 'Merica', '12345', '987-654-3210', '123-555-7780', 'itsWeirdAlYall@parody.net');
	
SELECT * FROM "Employee";

-- Task 3:
INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") 
VALUES (60, 'Steve', 'Cart', 'Mining INC', '1010 Ender Isle', 'Pearl Cove', 'Shulker City', 'The END', '12345', '123-456-7890', '098-765-4321', 'stevecarts@mojang.com', 1);

INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Address", "City", "Country", "PostalCode", "Phone", "Email", "SupportRepId") 
VALUES (61, 'Dory', 'The Fish', '42 Wallaby Way', 'Sydney', 'Australia', '42042', '111-222-333', 'gottaFindNemo@dis.com', 2);

SELECT * FROM "Customer";


-------------------- 2.4 UPDATE ---------------------------

-- Task 1:
UPDATE "Customer" 
SET 
	"FirstName" = 'Robert',
	"LastName" = 'Walter'
WHERE 
	"CustomerId" = 32;

SELECT * 
FROM "Customer"
ORDER BY "CustomerId";

-- Task 2:





