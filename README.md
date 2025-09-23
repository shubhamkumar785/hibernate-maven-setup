# Hibernate MySQL Demo

This repository demonstrates the setup of the **Hibernate framework** in Java and showcases how Hibernate communicates with a **MySQL database** in a **Maven-based project**.

## 🚀 Features
- Hibernate ORM configuration with MySQL
- Maven-based dependency management
- Entity mapping using `.hbm.xml`
- Basic Hibernate operations setup (ready for CRUD)

## 🛠️ Prerequisites
Make sure you have the following installed:
- Java 8 or above
- MySQL Server
- Maven
- IDE (Eclipse/IntelliJ/VS Code)

## ⚙️ Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/hibernate-mysql-demo.git
2. Import the project as a Maven project in your IDE.
3. Configure your hibernate.cfg.xml with your database details:
   <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/yourdb</property>
   <property name="hibernate.connection.username">root</property>
   <property name="hibernate.connection.password">yourpassword</property>
4. Create the employee table in MySQL:
    CREATE TABLE employee (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100)
   );
5. Run the Tester class to test the configuration.
 📂 Project Structure
 src/main/java
 └── com/hibernate/test
      ├── Employee.java
      └── Tester.java

src/main/resources
 ├── employee.hbm.xml
 └── hibernate.cfg.xml

 📖 Learning Objectives
- Understand how to configure Hibernate in a Maven project.
- Learn entity-to-table mapping using XML.
- Explore how Hibernate interacts with MySQL.

  🔗 Useful Links
  https://mvnrepository.com/
  [Hibernate Documentation](https://hibernate.org/orm/documentation/7.1/)
  [MySQL Documentation](https://dev.mysql.com/doc/)

  




