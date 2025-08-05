# 🧑‍💼 Employee Management System (Hibernate + MySQL + Java)

[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)  
[![Profile Views](https://komarev.com/ghpvc/?username=chetan-ullagaddi&color=blue)](https://github.com/chetan-ullagaddi)

> **Employee Management System** is a Java console application that manages employee data through a user-friendly menu. It performs CRUD operations using Hibernate ORM with a MySQL backend, ensuring efficient and secure database interactions.

---

## 🌟 Project Overview

Managing employee information accurately and efficiently is critical for organizations.  
This system offers a simple yet powerful solution to:

- Add, update, view, and delete employee records  
- Handle employee details including name, salary, and department  
- Provide a console-based menu interface for easy interaction  
- Use Hibernate ORM for seamless database mapping and transactions  

Ideal for Java developers exploring ORM and database CRUD operations.

---

## 🔍 How It Works

1. **Launch Application:** Run the console-based Java program.  
2. **Select Operation:** Choose from options to Add, View, Update, or Delete employees.  
3. **Input Details:** Enter employee information as prompted.  
4. **Database Actions:** Hibernate handles all database sessions and transactions.  
5. **View Results:** Confirmations and employee data show in the console.

---

## 🚩 Challenges Faced

- Managing Hibernate sessions and ensuring transaction safety  
- Designing an intuitive console interface for CRUD operations  
- Syncing entity classes with the database schema using JPA annotations  
- Handling user inputs and preventing invalid data entries  

---

## 📁 Project Structure
src/
└── org.jsp.chetan.Employee/
├── Employee.java # Entity class mapping employee table
├── App.java # Main class with menu and CRUD operations



## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/chetan-ullagaddi/employee-management-hibernate.git
cd employee-management-hibernate

2️⃣ Setup MySQL Database
Create a database:

sql
Copy
Edit
CREATE DATABASE employee_db;
Update your hibernate.cfg.xml file with your database username and password.

3️⃣ Run the Application
Open the project in your preferred Java IDE (Eclipse, IntelliJ IDEA, VS Code).

Run the App.java main class.

Use the console menu to manage employees.

🖥️ Sample Hibernate Configuration (hibernate.cfg.xml)
xml
Copy
Edit
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/employee_db</property>
    <property name="hibernate.connection.username">your_username</property>
    <property name="hibernate.connection.password">your_password</property>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
    <property name="hibernate.hbm2ddl.auto">update</property>
    <property name="show_sql">true</property>

    <mapping class="org.jsp.chetan.Employee.Employee"/>
  </session-factory>
</hibernate-configuration>
✅ Sample Console Output
css
Copy
Edit
WELCOME TO EMPLOYEE MANAGEMENT SYSTEM
OUR MENU
PRESS-1 TO VIEW EMPLOYEE
PRESS-2 TO ADD A EMPLOYEE
PRESS-3 TO DELETE EMPLOYEE
PRESS-4 TO UPDATE EMPLOYEE
OTHER NUMBER TO STOP
Enter your choice:
🤝 Contributing
Contributions are welcome! Feel free to fork the repository, raise issues, or submit pull requests.

📄 License
This project is licensed under the MIT License.

📬 Contact
Author: Chetan Ullagaddi
📧 Email: ullagaddichetan2@gmail.com
🔗 LinkedIn: linkedin.com/in/chetan-ullagaddi-31b999254
🔗 GitHub: github.com/chetan-ullagaddi
