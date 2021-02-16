
--CREATE DATABASE projectorganizer;

--BEGIN TRANSACTION;

DROP TABLE IF EXISTS employees;
CREATE TABLE employees
(
        employee_number SERIAL,
        job_title varchar(64) NOT NULL,
        last_name varchar(64) NOT NULL,
        first_name varchar(64) NOT NULL,
        gender varchar(10) NULL,
        birthday DATE NOT NULL,
        hire_date DATE NOT NULL,  --DATES instead of varchars so we can automate congratulatory emails for birthdays and work anniversaries 
        department_id INT NOT NULL,
     
        CONSTRAINT pk_employees PRIMARY KEY(employee_number)

);

DROP TABLE IF EXISTS departments;
CREATE TABLE departments 
(
        department_id SERIAL,
        department_name varchar(64) NOT NULL,
        
        CONSTRAINT pk_departments PRIMARY KEY (department_id)
);


DROP TABLE IF EXISTS projects;
CREATE TABLE projects
(
        project_number SERIAL,
        project_name varchar(64) NOT NULL,
        is_complete BOOLEAN NOT NULL,
        start_date DATE NOT NULL,
        end_date DATE NULL,
        
        CONSTRAINT pk_projects PRIMARY KEY (project_number)
        
);

DROP TABLE IF EXISTS employee_projects;
CREATE TABLE employee_projects
(
        employee_number INT NOT NULL,
        project_number INT NOT NULL
        
);


ALTER TABLE employees 
ADD CONSTRAINT fk_employee_department FOREIGN KEY (department_id) REFERENCES departments(department_id);

ALTER TABLE employee_projects
ADD CONSTRAINT fk_employee_on_project FOREIGN KEY (employee_number) REFERENCES employees(employee_number);

ALTER TABLE employee_projects
ADD CONSTRAINT fk_project_number FOREIGN KEY (project_number) REFERENCES projects(project_number);

--ROLLBACK;