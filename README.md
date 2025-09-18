#     Java-Database-CRUD-Assignment

A small **Java + Maven** project demonstrating **database-backed CRUD** operations.  
The app uses **JDBC** and simple **HTML/JSP** views to create, read, update, and delete records in a relational database.

---

## Features

- ✅ Relational database schema (tables + foreign keys)
- ✅ CRUD operations implemented in Java (via JDBC)
- ✅ Simple web views (HTML/JSP) to interact with data
- ✅ Maven build with wrapper (`mvnw` / `mvnw.cmd`)

---

## Tech Stack

- **Language:** Java  
- **Build:** Maven (includes `mvnw` wrapper)  
- **Persistence:** JDBC (MySQL / PostgreSQL — update below)  
- **Views:** HTML / JSP (basic pages)  
- **IDE:** IntelliJ IDEA / Eclipse / VS Code

---

## Project Structure

├─ DOC/ # Course-related docs (if provided)
├─ src/
│ ├─ main/
│ │ ├─ java/ # Java source (DAOs, models, servlets/controllers)
│ │ ├─ resources/ # SQL/init/config (if used)
│ │ └─ webapp/ # JSP/HTML/CSS (if using JSP)
│ └─ test/ # Unit tests (optional)
├─ pom.xml
├─ mvnw / mvnw.cmd # Maven wrapper

## Database (PostgreSQL)

### Configuration

Example `db.properties` (or similar configuration file):  

db.url=jdbc:postgresql://localhost:5432/sem6db
db.user=postgres
db.password=YOUR_PASSWORD
db.driver=org.postgresql.Driver

#Example SQL schema
CREATE DATABASE sem6db;
\c sem6db;

CREATE TABLE person (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(64) NOT NULL,
  last_name  VARCHAR(64) NOT NULL,
  email      VARCHAR(128) UNIQUE
);

CREATE TABLE address (
  id SERIAL PRIMARY KEY,
  person_id INT NOT NULL REFERENCES person(id) ON DELETE CASCADE,
  city VARCHAR(64) NOT NULL,
  street VARCHAR(128) NOT NULL
);

#Build & Run

1.Configure PostgreSQL

  Create database sem6db.
  Apply schema (see SQL above).
  Adjust user/password in your configuration file.

2. Build the project

./mvnw clean package

3. Run the project

    If web app (Servlets/JSP): deploy the generated .war file to Tomcat or GlassFish, or run via IDE.
    Access:

  http://localhost:8080/<context-path>

If console app: run the main class:

java -cp target/<artifact>-<version>.jar com.example.Main

## Assignment Tasks

### Task 1 – SQL JOINs
- Create two tables with meaningful data.  
- Demonstrate queries using:
  - **INNER JOIN**  
  - **NATURAL JOIN**  
  - **LEFT OUTER JOIN**  
  - **RIGHT OUTER JOIN**  
  - **FULL OUTER JOIN**  

---

### Task 2 – JDBC Application
- Write a Java program that connects to **PostgreSQL** and executes the same join queries as in Task 1.  
- Display the results (in console or via JSP/HTML).  

---

### Task 3 – Indexing and Query Analysis
- Add indexes to the database created in Task 1.  
- Use `EXPLAIN` / `EXPLAIN ANALYZE` to compare execution plans:  
  - **Without indexes** vs. **with indexes**.  
- Evaluate query performance improvements.  
- Dataset used for testing: [Snakes dataset (CSV)](https://people.sc.fsu.edu/~jburkardt/data/csv/csv.html) – `snakes_count_10000.csv`.  
