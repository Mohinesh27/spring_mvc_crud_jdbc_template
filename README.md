<h1>Spring MVC CRUD using JDBC Template</h1>

<h5>This is simple SPRING MVC project in which I have used Spring MVC, JDBC Templates for data manipulation and at database side I have used MYSQL database. </h5>

<h3>Steps-</h3>
1. Create MYSQL database with name- "usersdb"</br>
2. Create table with name- "users" using below command</br>
<command>
CREATE TABLE `usersdb`.`users` </br>
                 ( </br>
                              `username`  VARCHAR(45) NOT NULL, </br>
                              `password`  VARCHAR(45) NULL, </br>
                              `firstname` VARCHAR(45) NOT NULL, </br>
                              `lastname`  VARCHAR(45) NULL, </br>
                              `email`     VARCHAR(45) NULL, </br>
                              `address`   VARCHAR(45) NULL, </br>
                              `phone`     INT NULL, </br>
                              PRIMARY KEY (`username`) </br>
                 )</br>
</command>
