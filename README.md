
# Todo Application

- The aim of this project is to create a simple todo application where we perform the basic CRUD operations.
- We use spring initializer to create the spring boot application.


## Frameworks and Languages used:

- Java
- SpringBoot
- H2 Database
## Dependency used:

- Spring Web
- Spring Boot Dev Tool
- Lombook
- Springdoc-openapi-ui
- Spring-boot-starter-data-jpa
- H2 Database
- Hibernate-validator
## Data Flow:

### Model:
- It consists of class name called Todo it is typically used to "model" data in our application.
- We use @Data , @AllArgsConstructor , @NoArgsConstructor annotations in order to create getters,setters,toString method and constructors.
- @Entity annotation is used to create table in database.
- @Id annotation is used to create the primary key and @GeneratedValue(strategy=GenerationType.IDENTITY) for auto increment.

### Controller:
- It consists of a class named TodoController which basically controls the flow of data.
- @RestController annotation is used to make the TodoController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.


- ### API Reference

  #### Add Todo

  ```http
   https://localhost:8080/api/todo-app/add-todo
  ```

  #### Find All Todo

  ```http
   https://localhost:8080/api/todo-app/find-all
  ```

  #### Find Todo By Id

  ```http
   https://localhost:8080/api/todo-app/find-todo/id/{id}
  ```

  #### Update Todo

  ```http
   https://localhost:8080/api/todo-app/update-todo/id/{id}
  ```

  #### Delete Todo

  ```http
   https://localhost:8080/api/todo-app/delete-todo/id/{id}
  ```







### Service:
- It consists of a class caller TodoService and an interface called ItodoService where it helps us with business functionalities.
- @Service annotation is used to make the class as service layer.
- The TodoService class implements the ITodoService interface where we declare all the methods.

### Repository:
- It consists of an interface ITodoRepository which extends the JpaRepository which is mainly used for managing the data in Spring boot application.

## Resources:
### Application.properties File:
- spring.datasource.url=jdbc:h2:mem:tododb
- spring.datasource.driverClassName=org.h2.Driver
- spring.datasource.username=sa
- spring.datasource.password=
- spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
- The above properties is used for creating url's , username , password for H2 database.
- spring.jpa.defer-datasource-initialization=true
- The above property is used to tell the SpringBoot to create table before inserting the data.

### Data.sql file:
- This file is used to write the queries for inserting the data in the database.

## View
### Find All Todo:
![Screenshot (53)](https://user-images.githubusercontent.com/112794922/222974677-20d673c1-459f-4822-a081-a884e5fd5c0e.png)

### Add Todos:
![Screenshot (53)](https://user-images.githubusercontent.com/112794922/222974994-ddd96056-3769-40f8-adf3-c8916ea4a71a.png)

![Screenshot (55)](https://user-images.githubusercontent.com/112794922/222974988-f802bb28-3fe5-4a99-9251-05d75fb294d2.png)

### Find Todo By Id:
![Screenshot (53)](https://user-images.githubusercontent.com/112794922/222975242-451d26d9-b8ce-4403-a635-24c6fc8e7e65.png)

## Documentation
- For documentation of Rest Api's we use Swagger.

[Swagger](https://localhost:8080/swagger-ui.html)


## Project Description:
- In this project I have created the Rest Api's for performing various CRUD operations such as add , read , delete , update. In order to insert the data I have used H2 database which is a in-memory database.
