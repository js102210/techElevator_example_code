-- ORDERING RESULTS

-- Populations of all countries in descending order
SELECT name, population
FROM country
ORDER BY population DESC;

--Names of countries and continents in ascending order

SELECT name, continent
FROM country
ORDER BY name ASC, continent DESC;

-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.
SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;
-- The name and average life expectancy of the countries with the 10-20 highest life expectancies.
SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10
OFFSET 10;
-- biggest city by pop
SELECT name, population
FROM city
WHERE population IS NOT NULL
ORDER BY population DESC
LIMIT 1;

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city

SELECT upper(name) ||', ' ||substring (district for 3)  AS city_state --uppercase city name first 3 chars of state
FROM city
WHERE district IN('California','Oregon','Washington')
ORDER BY district ASC, city ASC;

-- AGGREGATE FUNCTIONS (COUNT, SUM, AVG, MIN, MAX)
-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy) AS avglifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL;


-- Total population in all cities in Ohio
SELECT SUM(population) AS statepop
FROM city
WHERE district = 'Ohio';

-- The surface area of the smallest country in the world --limit to one answer for name display

SELECT MIN(surfacearea) AS smallestsurface
FROM country;




-- The 10 largest countries in the world
SELECT name, surfacearea
FROM country
WHERE surfacearea IS NOT NULL
ORDER BY surfacearea DESC
LIMIT 10;

-- The number of countries who declared independence in 1991

SELECT COUNT(*)
FROM country
WHERE indepyear = '1991';

-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least
SELECT language, COUNT(*) AS count_countries
FROM countrylanguage
GROUP BY language
ORDER BY count_countries;

-- Average life expectancy of each continent ordered from highest to lowest

-- Exclude Antarctica from consideration for average life expectancy
SELECT continent, AVG(lifeexpectancy)
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY continent 

SELECT * FROM country ORDER BY continent;


-- Sum of the population of cities in each state in the USA ordered by state name

SELECT  district
FROM city
WHERE countrycode = 'USA'
GROUP BY district;






SELECT sum(population), district
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district ASC;

-- The average population of cities in each state in the USA ordered by state name

SELECT AVG(population), district
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district ASC;

-- The average population rounded to 2 decimal places of cities in each state that has an avg pop > 100000 in the USA ordered by state name

SELECT ROUND(AVG(population),2) AS avgpop, district
FROM city
WHERE countrycode = 'USA'
GROUP BY district
HAVING AVG(population) > 100000
ORDER BY district ASC;

--how many unique districts
SELECT COUNT (DISTINCT district)
FROM city
WHERE countrycode = 'USA';


-- SUBQUERIES-- provides result of one query as input for another NOTE CAN ONLY HAVE ONE OUTPUT IN SELECT CLAUSE OF SUBQUERIES
-- Find the names of cities under a given government leader
SELECT name, countrycode
FROM city
WHERE countrycode IN(
        SELECT code
        FROM country 
        WHERE headofstate LIKE '%Bush%'
        );




-- Find the names of cities whose country they belong to has not declared independence yet
SELECT name, countrycode
FROM city
WHERE countrycode IN(

SELECT code FROM country WHERE indepyear IS NULL

);

-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.
SELECT name, countrycode AS cc
FROM city c
WHERE countrycode IN(

SELECT code FROM country WHERE indepyear IS NULL

);

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

SELECT SUM(population) as sum_pop, ROUND(AVG(population),2) as avg_pop, COUNT(*)
FROM city;

SELECT SUM(population) as sum_pop, AVG(population) as avg_pop, district
FROM city
GROUP BY district;

-- Gets the MIN population and the MAX population from the city table.


-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
SELECT countrycode, MIN(population), MAX(population)
FROM city
GROUP BY countrycode
