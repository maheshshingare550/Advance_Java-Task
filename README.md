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



# Task 2 

# 1  Purpose of the Program
This program is used to fetch student records from the database and display them on the console. It reads data from the Students_Info table and shows each student's details in a readable format.

# 2. Database Connection
The program first establishes a connection to the database using a separate database connection class.
Once the connection is successful, the program is able to communicate with the database and execute SQL queries.

# 3. SQL Query Execution
A SQL query is sent to the database to retrieve all rows and columns from the Students_Info table.
The database processes this query and sends the matching data back to the program.

# 4. Receiving Data from the Database
The returned data is stored in a result set.
The result set behaves like a table where each row represents a single student record.

# 5. Reading Data Row by Row
The program reads the result set one record at a time.
For each student, the following details are retrieved:
Student ID
Name
Age
Gender
Email
Mobile Number
Class / Standard

# 6. Displaying the Student Details
After reading all details of a student, the program prints them on the console in a single line.
This process continues until all student records are displayed.

# 7. Error Handling
If any error occurs (such as database connection failure, missing table, or incorrect column name), the program displays the error details.
These error messages help in identifying and fixing issues quickly.

# 8. Program Completion
After all records are printed, the program completes its execution.
The program only reads data from the database and does not modify or update any records, making it a read-only operation.
