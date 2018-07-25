<h1>Spring MVC CRUD using JDBC Template</h1>

<h5>This is simple SPRING MVC project in which I have used Spring MVC, JDBC Templates for data manipulation and at database side I have used MYSQL database. </h5>

<h3>Steps-</h3>
1. Create MYSQL database with name- "usersdb"
2. Create table with name- "users" using below command
<command>
CREATE TABLE `usersdb`.`users` 
                 ( 
                              `username`  VARCHAR(45) NOT NULL, 
                              `password`  VARCHAR(45) NULL, 
                              `firstname` VARCHAR(45) NOT NULL, 
                              `lastname`  VARCHAR(45) NULL, 
                              `email`     VARCHAR(45) NULL, 
                              `address`   VARCHAR(45) NULL, 
                              `phone`     INT NULL, 
                              PRIMARY KEY (`username`) 
                 )
</command>
