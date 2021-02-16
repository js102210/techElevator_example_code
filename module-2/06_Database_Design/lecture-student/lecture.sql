-- CREATE DATABASE database_name
DROP DATABASE IF EXISTS artgallery;
CREATE DATABASE artgallery;


-- create the tables 
/*
CREATE TABLE table_name
(
 column_name1 data_type(size),
 column_name2 data_type(size) NOT NULL,
 CONSTRAINT pk_column1 PRIMARY KEY (column_name1) -- means the first column is the pk
 CONSTRAINT fk_column2 FOREIGN KEY(column_name2) REFERENCES table_name2(columnD) -- specifies column as fk, must reference an existing table and the column in that table
);

-- customers table that has a cust_id, name, address, phone. cust_id is pk

*/

BEGIN TRANSACTION;

CREATE TABLE customers
(
        customer_id SERIAL,
        name varchar(64) NOT NULL,
        adress varchar(100) NOT NULL,--spelled wrong
        phone varchar (11) NULL,
        
        
        CONSTRAINT pk_customers PRIMARY KEY(customer_id)

);

--create table to hold the artists - this has artis_id, firstname, lastname id is pk

CREATE TABLE artists
(
        artist_id SERIAL,
        first_name varchar(64) NULL,
        last_name varchar(64) NOT NULL,
     
        
        CONSTRAINT pk_artists PRIMARY KEY(artist_id)

);

--INSERT INTO customers(name, adress, phone)
--VALUES ('Jake', 'aplace', 1234567);


CREATE TABLE art
(
        art_code_id SERIAL,
        title varchar(64) NOT NULL,
        who_made_it int NOT NULL, -- if artist ID serial, fk needs to be int, if varchar, it would be varchar-- should be the same name as column in other table in best practice
                                       
   
        CONSTRAINT pk_art PRIMARY KEY (art_code_id),
        CONSTRAINT fk_art_who_made_it FOREIGN KEY (who_made_it) REFERENCES artists(artist_id)

);
/*
ALTER TABLE table_name
ADD CONSTRAINT pk_constraint_name PRIMARY KEY (column);

ALTER TABLE table_name
ADD CONSTRAINT fk_constraint_name FOREIGN KEY (columnb) REFERENCES other_table_name(column_in_other_table);

ALTER TABLE table_name
ADD CONSTRAINT check_constraint_name CHECK (column = 'value' OR column_name IN (values));

ex
ALTER TABLE table_name
ADD CONSTRAINT check_constraint_name CHECK (continent  IN ('North America', 'South America'));
*/
ALTER TABLE customers
RENAME adress TO address;-- fixing my typo