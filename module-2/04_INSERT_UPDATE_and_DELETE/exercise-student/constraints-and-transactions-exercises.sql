-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)
VALUES ('HAMPTON','AVENUE'),('LISA','BYWAY');

SELECT *
FROM actor
WHERE first_name IN ('HAMPTON','LISA');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film(title, description, release_year, language_id, length)
VALUES ('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

SELECT * 
FROM film
WHERE title = 'EUCLIDEAN PI';



-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor(actor_id, film_id)
VALUES((SELECT actor_id FROM actor WHERE actor.first_name = 'HAMPTON' AND actor.last_name ='AVENUE'),(SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI')),
((SELECT actor_id FROM actor WHERE actor.first_name ='LISA' AND actor.last_name = 'BYWAY'),(SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'));

SELECT * 
FROM actor
JOIN film_actor ON film_actor.actor_id = actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE film.title = 'EUCLIDEAN PI';

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES('Mathmagical');

SELECT * FROM category

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"



BEGIN TRANSACTION;

UPDATE film_category
SET category_id = (SELECT category_id FROM category WHERE category.name = 'Mathmagical')
FROM film, category
WHERE film.film_id = film_category.film_id AND film.title IN ('EUCLIDEAN PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

COMMIT;

SELECT * 
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE film.title IN ('EUCLIDEAN PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');



-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION;

UPDATE film
SET rating = 'G'
FROM film_category, category
WHERE film.film_id = film_category.film_id AND film_category.category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical');

COMMIT;


SELECT *
FROM film 
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Mathmagical';



-- 7. Add a copy of "Euclidean PI" to all the stores.

BEGIN TRANSACTION;

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1),(1001,2);


ROLLBACK;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- No, the film_id is referenced as a foreign key in other tables

BEGIN TRANSACTION;

DELETE FROM film WHERE title = 'EUCLIDEAN PI';

ROLLBACK;

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- No, the category_id is referenced as a foreign key in film_category
BEGIN TRANSACTION;
DELETE FROM category WHERE name = 'Mathmagical';
ROLLBACK;



-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- Yes, because none of the deleted keys are primary, so they exist elsewhere. The films effectively don't have a category anymore, but no discrepencies were created.

BEGIN TRANSACTION;
DELETE FROM film_category WHERE category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical');

ROLLBACK;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- Deleting the category worked, because with all entries in film_category deleted, it's like the category never existed. Deleting the film does not, as it still has keys referenced in film_actor


BEGIN TRANSACTION;
DELETE FROM category WHERE name = 'Mathmagical';
ROLLBACK;

BEGIN TRANSACTION;

DELETE FROM film WHERE title = 'EUCLIDEAN PI';

ROLLBACK;


-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--All rows containing its film_id would need to be deleted from inventory, film_category (already done), film_actor and language

SELECT pg_constraint.*
FROM pg_catalog.pg_constraint
INNER JOIN pg_catalog.pg_class ON pg_class.oid = pg_constraint.conrelid
INNER JOIN pg_catalog.pg_namespace ON pg_namespace.oid = connamespace;