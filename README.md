# Attendance Management System (JDBC)

## Overview
This is a simple Attendance Management System using Java and MySQL. The project allows users to check in and check out, storing their attendance records in a MySQL database. It uses JDBC for database connectivity.

## Features
- User authentication (Staff and Student roles)
- Check-in and Check-out system
- Stores attendance records in MySQL database
- Secure password storage using hashing
- Automatic attendance tracking

## Technologies Used
- **Java (JDBC)**
- **MySQL**
- **Spring Boot** (Optional for enhancements)
- **Git & GitHub** for version control

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/Jim-Jeffry/Attendance_Management_JDBC.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Attendance_Management_JDBC
   ```
3. Set up the MySQL database:
   - Open MySQL and execute the `attendance_db.sql` script:
     ```sh
     mysql -u root -p < attendance_db.sql
     ```
4. Compile and run the Java program:
   ```sh
   javac src/project/Attendance_JDBC.java
   java src/project/Attendance_JDBC
   ```

## Database Schema
- **users** (Stores user details)
- **attendance_in** (Records check-in times)
- **attendance_out** (Records check-out times)

## Usage
1. **Login as Staff or Student**
2. **Check-in** using your credentials
3. **Check-out** when leaving
4. **View attendance records** in the database

## Contributing
Feel free to fork the repository, create a new branch, and submit a pull request.

## Author
[Jim Jeffry](https://github.com/Jim-Jeffry)

## License
This project is open-source and available under the MIT License.
