/*
2.1 SELECT
*/

-- Task – Select all records from the Employee table. 

	select * from "Assignment_2_chinook"."Employee";

-- Task – Select all records from the Employee table where last name is King.

	select * from "Assignment_2_chinook"."Employee"
	where "LastName"='King';

-- Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.

	select * from "Assignment_2_chinook"."Employee"
	where "FirstName"='Andrew' and "ReportsTo" isnull; 

-- 2.2 ORDER BY

-- Task – Select all albums in album table and sort result set in descending order

	select * from "Assignment_2_chinook"."Album" order by "AlbumId" desc ;


-- Task – Select first name from Customer and sort result set in ascending order

	select "FirstName" from "Assignment_2_chinook"."Customer"
	order by "FirstName" desc ;


--  2.3 INSERT INTO

--  Task – Insert two new records into Genre table

		select * from "Assignment_2_chinook"."Genre";	
		
		insert into "Assignment_2_chinook"."Genre"("GenreId","Name")
		values (26,'Sports'),(27,'Anime');

--  Task – Insert two new records into Employee table

		select * from "Assignment_2_chinook"."Employee";
		
		
		insert into "Assignment_2_chinook"."Employee"("EmployeeId","LastName","FirstName","Title","Email")
		values (10,'effie','shen','IT Staff','hj1234@hids.com');
		values (9,'yuan','gu','IT Staff','hdhja@hchc.com');

			
--  Task – Insert two new records into Customer table

		select * from "Assignment_2_chinook"."Customer";
		insert into "Assignment_2_chinook"."Customer"("CustomerId","FirstName","LastName","Email")
		values (60,'mike','Lee','dasdas@hdiajd.com');
				(61,'John','Smith','dsahda@hdha.com');
	
--  2.4 UPDATE
--  Task – Update Aaron Mitchell in Customer table to Robert Walter

		UPDATE "Assignment_2_chinook"."Customer" SET "FirstName" = 'Robert', "LastName" = 'Walter' 
    		WHERE "CustomerId" IN (SELECT "CustomerId" FROM "Assignment_2_chinook"."Customer" WHERE "FirstName" = 'Aaron' AND "LastName" = 'Mitchell');

	
-- Task – Update name of artist “Creedence Clearwater Revival” to “CCR”


		UPDATE "Assignment_2_chinook"."Artist" SET "Name" = 'CCR' WHERE "Name" = 'Creedence Clearwater Revival';


--  2.5 LIKE
--  Task – Select all invoices with a billing address like “T”

		SELECT * from "Assignment_2_chinook"."Invoice" WHERE "BillingAddress" LIKE 'T';

--  2.6 BETWEEN
--  Task – Select all invoices that have a total between 15 and 50
        select  * from "Assignment_2_chinook"."Invoice" 
        where "Total" between 15 and 50;
	
	
--  Task – Select all employees hired between 1st of June 2003 and 1st of March 2004

       select * from "Assignment_2_chinook"."Employee";

       select * from "Assignment_2_chinook"."Employee" 
       where "HireDate" between '01-JUN-2003' and '01-MAR-2004';

       
       
-- 2.7 DELETE
--  Task – Delete a record in Customer table where the name is Robert Walter 
--  (There may be constraints that rely on this, find out how to resolve them).

      
DELETE FROM "Assignment_2_chinook"."InvoiceLine" WHERE "InvoiceId" IN 
     (SELECT "InvoiceId" FROM "Assignment_2_chinook"."Invoice" WHERE "CustomerId" = 
        (SELECT "CustomerId" FROM "Assignment_2_chinook"."Customer" WHERE  "FirstName" = 'Robert' AND "LastName" = 'Walter'));
DELETE FROM "Assignment_2_chinook"."Invoice" WHERE "CustomerId" = (SELECT "CustomerId" FROM "Assignment_2_chinook"."Customer"  WHERE "FirstName" = 'Robert' AND "LastName" = 'Walter');
DELETE FROM "Assignment_2_chinook"."Customer"  WHERE "FirstName" = 'Robert' AND "LastName" = 'Walter';     

	