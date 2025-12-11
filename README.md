# Advance-Java_Task

# Task-1
# Overview
This project explains how a Java application connects to an Oracle Database using JDBC.
The program loads the Oracle driver, connects to the database using login credentials, performs a simple database query, checks if data exists, and prints a message based on the result.
#  Project Description
The program:
Loads the Oracle JDBC driver
Connects to the database using a URL, username, and password
Runs a query on a specific table (example: “users”)
Checks if the table contains any rows
Displays a success or failure message
Handles all possible errors using exceptions
Closes the database connection after use
# Requirements
# Software Needed
Java JDK installed
Oracle Database installed and running (XE or any edition)
Oracle JDBC driver JAR file placed in the project (for example: ojdbc8.jar)
# Database Requirements
The database service must be up
Correct username and password for login
A table available in the database to query
# Configuration Steps
Install Oracle Database and ensure it is running.
Add the Oracle JDBC driver JAR file to your project’s classpath or library settings.
Confirm that the database username, password, and connection URL are correct.
Ensure the table you want to read from exists in the database.
# How the Program Works (Step-by-Step)
The program starts and attempts to load the Oracle JDBC driver.
It prepares the database connection details such as URL, username, and password.
A connection is established with the Oracle Database.
The program prepares a SQL query that reads data from a table.
The query is executed, and results are checked.
If the table contains at least one row, the program prints a successful message.
If the table is empty, it prints a failure message.
The connection is closed after completing all operations.
Any errors during loading the driver or connecting to the database are displayed clearly.
# Expected Output Behavior
If the database is reachable and the table has data → displays a connection success message.
If the table has no data → displays a failure message.

If the driver is missing → shows a driver error message.

If login details or database are incorrect → shows a database error message
