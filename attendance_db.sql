CREATE DATABASE attendance_db;
USE attendance_db;
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    role ENUM('Staff', 'Student') NOT NULL,
    password VARCHAR(100) DEFAULT NULL
);

-- Attendance Tables
CREATE TABLE IF NOT EXISTS attendance_in (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    check_in_time DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS attendance_out (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    check_out_time DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

-- Insert Staff with Hashed Password
INSERT INTO users (name, role, password) VALUES 
('root', 'Staff', '$2a$10$uO7rV5xh.fP2rNJz9.wfmYkYhpD50P6jp2eKmR.I5h42riUks0h0C') 
ON DUPLICATE KEY UPDATE password = VALUES(password);

-- Insert Raja (Only if not exists)
INSERT INTO users (name, role, password) 
SELECT 'raja', 'Staff', '$2a$10$8x/8QDh6RNq4X7/HjjZwTu64aCAqg5.3DBhSAjSY5B5ASaGfB4lVy'
WHERE NOT EXISTS (SELECT 1 FROM users WHERE name = 'raja');

-- Check users
SELECT * FROM users;

-- Check Attendance
SELECT * FROM attendance_in;
SELECT * FROM attendance_out;

-- Set max connections (Run as admin if needed)
SET GLOBAL max_connections = 200;
