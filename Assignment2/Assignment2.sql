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

      
	
	DELETE FROM "Assignment_2_chinook"."InvoiceLine" i WHERE "InvoiceId" = (SELECT i."InvoiceId" FROM "Assignment_2_chinook"."Invoice" WHERE "CustomerId" = 
    (select c."CustomerId"  FROM "Assignment_2_chinook"."Customer" c WHERE "LastName" = 'Walter' AND "FirstName" = 'Robert'));




-- 3.0 SQL Functions
-- In this section you will be using the PostGreSQL system functions, as well as your own functions, to perform various actions against the database
-- 3.1 System Defined Functions

--  Task – Create a function that returns the current time.

		SELECT CURRENT_TIMESTAMP;


--  Task – create a function that returns the length of a mediatype from the mediatype table

		SELECT LENGTH("Name") from "Assignment_2_chinook"."MediaType";


-- 3.2 System Defined Aggregate Functions
-- Task –Create a function that returns the average total of all invoices

	select avg("Total") from "Assignment_2_chinook"."Invoice" 

-- Task – Create a function that returns the most expensive track

	select * from "Assignment_2_chinook"."Track" t ;

	select max("UnitPrice" ) from "Assignment_2_chinook"."Track" ;
	
	
-- 3.3 User Defined Scalar Functions
-- Task – Create a function that returns the average price of invoice-line items in the invoice-line table
    select avg("UnitPrice" ) from "Assignment_2_chinook"."InvoiceLine" il ;
	
-- 3.4 User Defined Table Valued Functions
-- Task – Create a function that returns all employees who are born after 1968.

   select * from "Assignment_2_chinook"."Employee" e 
   where "BirthDate">'31-DEC-1968';
  
--  5.0 JOINS
--  In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.
--  5.1 INNER
--  Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
	
  select c."FirstName" ,c."LastName", i."InvoiceId" 
  from "Assignment_2_chinook"."Customer" c
  inner join "Assignment_2_chinook"."Invoice" i on (c."CustomerId" =i."CustomerId" );
  

  
  
-- 5.2 OUTER
--  Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, last name, invoiceId, and total.
	
	 select c2."CustomerId" ,c2."FirstName" ,c2."LastName" ,i2."InvoiceId" ,i2."Total" 
	 from "Assignment_2_chinook"."Customer" c2 
	 full outer join "Assignment_2_chinook"."Invoice" i2 on(c2."CustomerId" =i2."CustomerId" )
 

 
-- 5.3 RIGHT
-- Task – Create a right join that joins album and artist specifying artist name and title.
   select a3."Name" ,a2."Title" 
   from "Assignment_2_chinook"."Album" a2 
   right join "Assignment_2_chinook"."Artist" a3 on(a2."ArtistId" =a3."ArtistId" );
	 
	 
-- 5.4 CROSS
-- Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.

  	select * from "Assignment_2_chinook"."Album" a2 
  	cross join "Assignment_2_chinook"."Artist" a3 
  	order by a3."Name" asc ;


--  5.5 SELF
--  Task – Perform a self-join on the employee table, joining on the reports to column.

  select * from "Assignment_2_chinook"."Employee" e 
  left join "Assignment_2_chinook"."Employee" "manager" on(e."ReportsTo" ="manager"."EmployeeId" );
	