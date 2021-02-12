-- INSERT

-- 1. Add Klingon as a spoken language in the USA
INSERT INTO countrylanguage (countrycode, language, isOfficial, percentage)
VALUES ( 'USA', 'Klingon', false, 5);

SELECT * 
FROM countrylanguage
WHERE countrycode = 'USA';

-- 2. Add Klingon as a spoken language in Great Britain (GBR)

INSERT INTO countrylanguage(countrycode, language, isOfficial, percentage)
VALUES ('GBR', 'Klingon', false, 5);

SELECT * 
FROM countrylanguage
WHERE countrycode = 'GBR';

-- UPDATE

--UPDATE table_name
--SET column to value
-- WHERE column = value

-- 1. Update the capital of the USA to Houston
SELECT id
FROM city
WHERE name = 'Houston';

UPDATE country
SET capital=3796
WHERE code='USA';

SELECT country.code, city.name, headofstate
FROM country
INNER JOIN city on country.capital = city.id
WHERE code = 'USA';

-- 2. Update the capital of the USA to Washington DC and the head of state

UPDATE country
SET capital= (SELECT id FROM city WHERE name = 'Washington'),
headofstate = 'Elon Musk'
Where code = 'USA';


-- DELETE
--DELETE FROM table_name
--WHERE column = val

-- 1. Delete English as a spoken language in the USA
DELETE
--SELECT * 
FROM countrylanguage 
WHERE language = 'English' AND countrycode = 'USA';


-- 2. Delete all occurrences of the Klingon language 
DELETE 
--SELECT *
FROM countrylanguage
WHERE language = 'Klingon';


-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage(language)
VALUES ('Elvish');


-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO countrylanguage(countrycode, language, isOfficial, percentage)
VALUES ('ZZZ', 'English', false, 5);

-- 3. Try deleting the country USA. What happens?
DELETE FROM country
WHERE code = ('USA');


-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA
INSERT INTO countrylanguage (countrycode, language, isOfficial, percentage)
VALUES ('USA', 'English', false, 90)
-- 2. Try again. What happens?

--fails because it's a duplicate primary key


-- 3. Let's relocate the USA to the continent - 'Outer Space'
UPDATE country
SET continent = 'Outer Space'
WHERE code = 'USA';


-- How to view all of the constraints

SELECT pg_constraint.*
FROM pg_catalog.pg_constraint
INNER JOIN pg_catalog.pg_class ON pg_class.oid = pg_constraint.conrelid
INNER JOIN pg_catalog.pg_namespace ON pg_namespace.oid = connamespace;


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.




-- 2. Try updating all of the cities to be in the USA and roll it back

START TRANSACTION;

 UPDATE city
 SET countrycode = 'USA';
 
 SELECT * FROM city;
 
 ROLLBACK;
 
 SELECT * FROM city;
 

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.

START TRANSACTION;
UPDATE countrylanguage
SET percentage = 60
WHERE language = 'English' AND countrycode = 'USA';


-----------

-- Write queries to return the following:
-- Make the following changes in the "world" database.


-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The
-- countrycode is 'USA', and population of 45001.
INSERT INTO city (name, countrycode, district, population)
VALUES ('Smallville','USA', 'Kansas', 45001);

SELECT *
FROM city
WHERE name = 'Smallville';



-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('USA', 'Kryptonese', false, .0001);

SELECT * 
FROM countrylanguage
WHERE countrycode = 'USA';



-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble." Change
-- the appropriate record accordingly.
UPDATE countrylanguage
SET language = 'Krypto-babble'
WHERE language = 'Kryptonese';

SELECT * 
FROM countrylanguage
WHERE countrycode = 'USA';

-- 4. Set the US capital to Smallville, Kansas in the country table.

UPDATE country 
SET capital =  (SELECT id FROM city WHERE name = 'Smallville')
WHERE code = 'USA';  


SELECT country.name, city.name
FROM country
JOIN city ON country.capital = city.id
WHERE code = 'USA';

-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
DELETE FROM city
WHERE name = 'Smallville';

--because Smallville is referenced as USA's capital city

-- 6. Return the US capital to Washington.
UPDATE country
SET capital = (SELECT id FROM city WHERE name = 'Washington')
WHERE code = 'USA';

SELECT country.name, city.name
FROM country
JOIN city ON country.capital = city.id
WHERE code = 'USA';

-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
DELETE FROM city
WHERE name = 'Smallville';

--because smallville is no longer referenced in another table as a foreign key



-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972
-- (exclusive).
-- (590 rows affected)

UPDATE countrylanguage
--JOIN country ON countrylanguage.countrycode = country.code
SET isofficial = NOT isofficial
WHERE countrycode IN (SELECT code FROM country WHERE country.indepyear BETWEEN 1800 AND 1972);


-- 9. Convert population so it is expressed in 1,000s for all cities. (Round up to
-- the nearest integer value.)
-- (4079 rows affected)


UPDATE city
SET population = ROUND((population/1000));

SELECT * FROM city


-- 10. Assuming a country's surfacearea is expressed in square miles, convert it to
-- square meters for all countries where French is spoken by more than 20% of the
-- population.
-- (7 rows affected)

UPDATE country
SET surfacearea = surfacearea * 1609
WHERE code IN (SELECT countrycode FROM countrylanguage WHERE language = 'French' AND percentage > 20);







