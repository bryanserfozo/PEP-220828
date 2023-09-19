-- Creating a new table, recall that this is DDL (data definition language)

CREATE TABLE people(
	id serial PRIMARY KEY ,
	first_name varchar(25) NOT NULL,
	middle_name varchar(25) DEFAULT 'None',
	last_name varchar(25) NOT NULL,
	"age" int CHECK ("age" > 0),
	height decimal(4,2)  
);

-- Recall that we can DROP the table to delete the table itself and all its contents
DROP TABLE people;


-- How do we go about actually adding in information to the table?
-- CRUD operations (Create, Read, Update, and Delete) DML (Data manipulation language)

-- How do we create data?
-- Note that strings in SQL are created with '' whereas column names go inside ""
INSERT INTO PEOPLE (FIRST_NAME, Middle_name, LAST_NAME, AGE, HEIGHT) VALUES ( 'Bryan', 'J', 'Serfozo', 25, 6.0);
INSERT INTO people ( first_name, last_name, age,  height) VALUES ( 'Kaitlyn', 'Graves', 22, 5.75);

-- We can add values to specific columns in particular as follows
INSERT INTO people ( first_name, last_name,age, height) VALUES ( 'Jane', 'Doe', 23,  5.5);

-- Let's shift back and try to talk about the concept of constraints
INSERT INTO people (FIRST_NAME, LAST_NAME, AGE, HEIGHT) VALUES ('Daniel', 'Knight', 23, 6.4);

-- We'll get started with this but we will continue it tomorrow
-- How do we Read data?
SELECT * FROM people;

SELECT id, first_name, age FROM people;

SELECT * FROM people WHERE HEIGHT < 5;


-- Below here is an example of some mocked data from mockaroo
insert into people (first_name, last_name, age, height) values ('Skyler', 'Twohig', 35, 1.35);
insert into people (first_name, last_name, age, height) values ('Ingmar', 'Gaither', 12, 1.2);
insert into people (first_name, last_name, age, height) values ('Gilbertine', 'Robertshaw', 96, 3.37);
insert into people (first_name, last_name, age, height) values ('Donetta', 'Shortland', 66, 5.65);
insert into people (first_name, last_name, age, height) values ('Marina', 'Perillo', 92, 3.55);
insert into people (first_name, last_name, age, height) values ('Connie', 'Assad', 64, 2.28);
insert into people (first_name, last_name, age, height) values ('Thibaut', 'Moy', 31, 3.59);
insert into people (first_name, last_name, age, height) values ('Benny', 'Fulop', 99, 1.5);
insert into people (first_name, last_name, age, height) values ('Benedicto', 'Viollet', 14, 3.63);
insert into people (first_name, last_name, age, height) values ('Blaire', 'Clemitt', 72, 1.76);
insert into people (first_name, last_name, age, height) values ('Claudie', 'Weeke', 23, 5.18);
insert into people (first_name, last_name, age, height) values ('Adriana', 'Favelle', 26, 3.21);
insert into people (first_name, last_name, age, height) values ('Shepherd', 'Havock', 6, 3.94);
insert into people (first_name, last_name, age, height) values ('Dottie', 'Kenworth', 66, 4.82);
insert into people (first_name, last_name, age, height) values ('Camellia', 'Beldum', 94, 4.85);
insert into people (first_name, last_name, age, height) values ('Millisent', 'Beden', 2, 3.47);
insert into people (first_name, last_name, age, height) values ('Odessa', 'Easum', 58, 1.3);
insert into people (first_name, last_name, age, height) values ('Gladi', 'Ateridge', 59, 5.2);
insert into people (first_name, last_name, age, height) values ('Rinaldo', 'Cothey', 9, 1.36);
insert into people (first_name, last_name, age, height) values ('Birgitta', 'Frizell', 47, 1.92);