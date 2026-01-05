# 📚 Library Management System

## 📌 Project Description
The Library Management System is a console-based Java application designed to manage library operations such as adding books, registering members, and issuing books. The project uses Core Java, JDBC, and MySQL, following a layered architecture with the DAO design pattern.

---

## 🛠️ Technologies Used
- Java (Core Java)
- JDBC
- MySQL
- Eclipse IDE (Enterprise Edition)

---

## ✨ Features
- Add and view books
- Register library members
- Issue books to members
- Automatic book quantity update
- MySQL database integration
- DAO design pattern for clean code structure

---

## 📂 Project Structure
LibraryManagementSystem/
│
├── src/
│ ├── com.library.main
│ │ └── Main.java
│ ├── com.library.model
│ │ ├── Book.java
│ │ ├── Member.java
│ │ └── IssueRecord.java
│ ├── com.library.dao
│ │ ├── BookDAO.java
│ │ ├── MemberDAO.java
│ │ └── IssueDAO.java
│ ├── com.library.util
│ │ └── DBConnection.java
│ └── com.library.exception
│ └── BookNotAvailableException.java
│
├── lib/
│ └── mysql-connector-j.jar
│
└── README.md



---

## 🗄️ Database Setup

### Create Database and Tables

CREATE DATABASE library_db;
USE library_db;

CREATE TABLE books (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    quantity INT
);

CREATE TABLE members (
    member_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE issued_books (
    issue_id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT,
    member_id INT,
    issue_date DATE,
    return_date DATE
);
## ▶️ How to Run the Project
Open Eclipse IDE (Enterprise Edition)

Create a Java Project named LibraryManagementSystem

Create packages and classes as per the structure

Add MySQL Connector/J to the project build path

Update database credentials in DBConnection.java

Run Main.java as a Java Application

## 🧪 Sample Operations
Add a new book with title, author, and quantity

View available books

Register a member

Issue a book using valid book and member IDs

## 🧠 Concepts Applied
OOP Principles

JDBC CRUD Operations

DAO Design Pattern

Exception Handling

MySQL Integration

## 🚀 Future Enhancements
Return book functionality

Fine calculation for late returns

Search books by title or author

Convert to Spring Boot REST API

## 👩‍💻 Author
Bhuma Likitha Sai Laxmi
Java Developer | Student


---

### ✅ What this README does for you
✔ Looks **professional on GitHub**  
✔ Clearly explains your project  
✔ Impresses **interviewers & recruiters**  
✔ Matches **Java developer expectations**

If you want, I can:
- shorten it  
- make it more advanced  
- add screenshots section  
- tailor it for **college project submission**

Just tell me 👍






