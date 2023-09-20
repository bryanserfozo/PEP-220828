-- We'll define a table with DDL and then use mockaroo to add in additional people with DML
create table people (
	id serial PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	salary INT,
	company VARCHAR(50),
	position VARCHAR(50),
	shirt_size VARCHAR(50)
);
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Hyacinth', 'McBratney', 55307, 'Grady-Mohr', 'Senior Sales Associate', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Vivianne', 'Molohan', 85627, 'Hoeger, Jerde and Ebert', 'Safety Technician I', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Urban', 'Fockes', 84556, 'Koch-Hoppe', 'Senior Sales Associate', 'L');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Berti', 'Glentz', 88800, 'Schroeder-Dach', 'Recruiting Manager', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Ardyth', 'Brockman', 47849, 'Lindgren LLC', 'Nurse Practicioner', 'L');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Naomi', 'Drepp', 39804, 'Lindgren, Tromp and McDermott', 'Design Engineer', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Peria', 'Pacht', 32086, 'Beahan Inc', 'Business Systems Development Analyst', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Dilly', 'Hardwicke', 98786, 'Runte Group', 'Actuary', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Cathryn', 'Drissell', 31079, 'Roberts-McDermott', 'Actuary', 'M');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Tobiah', 'Grelak', 98009, 'Thiel-Mraz', 'Payment Adjustment Coordinator', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Haleigh', 'Dayes', 88770, 'Heller Group', 'Health Coach I', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Daffy', 'Miskimmon', 74230, 'Smitham, Koch and Adams', 'Administrative Officer', '3XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Delcina', 'Tinmouth', 54607, 'Ziemann-Von', 'GIS Technical Architect', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Darelle', 'de Aguirre', 50646, 'Breitenberg Group', 'Analyst Programmer', 'S');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Sherwin', 'Diament', 35946, 'Herzog Inc', 'Registered Nurse', 'L');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Bartel', 'Komorowski', 53973, 'Lockman-Schamberger', 'Quality Engineer', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Carline', 'Lewisham', 82421, 'Treutel-Collier', 'Social Worker', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Clarissa', 'Gregr', 39238, 'Kuhic LLC', 'Recruiting Manager', '2XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Dara', 'Beaney', 39191, 'Berge and Sons', 'Information Systems Manager', 'S');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Lucy', 'Rawsthorne', 99712, 'Schoen-Bahringer', 'Cost Accountant', 'L');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Corena', 'Luffman', 39016, 'Bailey LLC', 'Information Systems Manager', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Peggy', 'Myderscough', 56655, 'Rath-Goldner', 'Senior Cost Accountant', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Kale', 'Domini', 99373, 'Schamberger and Sons', 'Professor', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Griselda', 'Critch', 55750, 'Koss, Hartmann and Spencer', 'Budget/Accounting Analyst I', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Sarette', 'McHugh', 49977, 'Williamson, Bogan and Morar', 'Statistician I', 'S');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Miguel', 'Giorgielli', 31903, 'Nitzsche, Bartoletti and Lemke', 'Recruiting Manager', 'M');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Marna', 'Ollett', 36170, 'Stehr Inc', 'Research Associate', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Eadie', 'Chevolleau', 85562, 'Schiller Group', 'Analog Circuit Design manager', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Viviyan', 'Fagan', 68809, 'Schmidt-Morissette', 'Automation Specialist I', '2XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Karlan', 'Penni', 31743, 'Schuster Group', 'Occupational Therapist', 'M');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Paul', 'Hoble', 92701, 'Schaefer Inc', 'Engineer I', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Anderea', 'de Castelain', 49304, 'Boyle LLC', 'Physical Therapy Assistant', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Davy', 'Shervil', 61609, 'Schowalter-Tromp', 'Internal Auditor', '3XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Harris', 'Ackermann', 63669, 'Pfannerstill-Block', 'Statistician III', 'L');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Nessa', 'Dashper', 69531, 'Legros-D''Amore', 'Dental Hygienist', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Grayce', 'McAuslan', 55035, 'Wilkinson-Grant', 'Senior Sales Associate', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Wayland', 'Henrys', 33356, 'Murazik LLC', 'Analog Circuit Design manager', 'L');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Timi', 'Quincey', 83793, 'Vandervort LLC', 'Statistician II', '2XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Sara', 'Hobben', 72224, 'Keeling Group', 'Chief Design Engineer', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Rubi', 'Hing', 98394, 'Upton, Mosciski and Abshire', 'Account Executive', 'L');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Alikee', 'Rulten', 87336, 'Batz, Considine and Glover', 'Editor', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Gregoire', 'Huffa', 74312, 'Parker-Crooks', 'Senior Developer', 'M');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Cilka', 'Jowers', 36294, 'Wisozk, Murray and Orn', 'Director of Sales', '3XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Margarette', 'Timblett', 44263, 'Lowe, Greenholt and Kulas', 'Sales Associate', 'M');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Nadean', 'Baudic', 74380, 'Prohaska-Leuschke', 'Developer III', '3XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Orton', 'Delph', 67188, 'Goodwin-Lueilwitz', 'Research Assistant II', 'XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Sydney', 'Parlet', 54999, 'Schuster-Schowalter', 'Statistician I', 'M');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Jodie', 'Beharrell', 82264, 'Mohr, Daugherty and Rath', 'Database Administrator III', '3XL');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Eveleen', 'Cortese', 64338, 'Williamson, Purdy and Gottlieb', 'Cost Accountant', 'XS');
insert into people (first_name, last_name, salary, company, position, shirt_size) values ('Oran', 'Sturdgess', 86208, 'Quitzon LLC', 'Software Test Engineer II', '2XL');




-- PLAN: Explore DML/DQL commands on this dataset to see what we can do
-- DML comprises our CRUD operations

-- Reading essentially happens with the SELECT statement
SELECT * FROM people;

SELECT first_name, last_name, shirt_size FROM people;

-- WHERE clause
SELECT * FROM people WHERE salary < 50000;

SELECT first_name, last_name, shirt_size FROM people WHERE shirt_size = 'XL';

SELECT * FROM people WHERE salary < 50000 AND shirt_size = 'XL';

SELECT * FROM people WHERE salary > 80000 OR "position" = 'Recruiting Manager';

 
SELECT people.first_name FROM people;
-- Aliasing
SELECT p.first_name, p.last_name FROM people AS p;

SELECT * FROM people AS p WHERE p.first_name ILIKE 'S%';

SELECT * FROM people WHERE last_name LIKE '_e%';

SELECT * FROM people WHERE salary BETWEEN 50000 AND 60000;

-- DML 
-- Update

UPDATE people SET salary = 80000, "position" = 'Analyst Programmer II' WHERE id = 14;
SELECT * FROM people WHERE id = 14;

SELECT * FROM people WHERE "position" = 'Recruiting Manager';
UPDATE people SET Salary = 70000 WHERE "position" = 'Recruiting Manager';

-- Delete
DELETE FROM people WHERE id = 14;
-- Delete deletes a row(s) based off criteria

-- Truncate removes the data from the table but not the table itself (DDL)
TRUNCATE people;

-- DROP deletes the table and its data (DDL)
DROP TABLE people;



-- Some other DQL statements that we'll cover today

-- ORDER BY specificies the column we want to order by (default order is ascending)
SELECT * FROM people ORDER BY salary;

SELECT * FROM people ORDER BY first_name DESC;

-- Scalar functions transform individual rows based off some function
SELECT first_name FROM people ORDER BY first_name;

SELECT UPPER(first_name) FROM people ORDER BY first_name;
SELECT LOWER(first_name) FROM people ORDER BY first_name;

-- Aggregate functions as well
SELECT avg(salary) FROM people;

-- Other ones include MAX, MIN, COUNT, SUM
-- Let's say we wanted to place an order for shirt sizes for the people in the people table
SELECT count(*) FROM people WHERE shirt_size = 'XL';

-- We need to introduce 2 new clauses
-- Group by clause
SELECT shirt_size, count(*) FROM people GROUP BY shirt_size;
-- Having clause

--SELECT * FROM people GROUP BY id HAVING salary = max(salary);
SELECT * FROM people order BY salary desc LIMIT 1;

