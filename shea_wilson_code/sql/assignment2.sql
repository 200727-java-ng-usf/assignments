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
insert into "Customer" ("CustomerId","FirstName" ,"LastName","Company" ,"Address" ,"City" )

commit;


