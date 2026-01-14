# Homework assignment for the class “Non-relational (NoSQL) databases” 

### With this assignment, you will:
- Learn how to work with non-relational databases, use Spring Data to interact with NoSQL stores, and master the specifics of working with data in such systems.
- Be able to develop applications that use various types of databases, including NoSQL solutions, and integrate them into Spring Framework-based projects.
- Practice your skills in designing data models for NoSQL systems, configuring database access through Spring Data, and optimizing data queries.
- Gain experience working with MongoDB, one of the most popular NoSQL databases, which is widely used in modern web applications.

Non-relational databases are becoming increasingly popular due to their flexibility, high performance when working with large data sets, and horizontal scalability. With the growth of information volumes and the need for fast data processing, the ability to work with such systems is becoming critically important for developers.

### Before starting the task, make sure you have:
- Java development environment - IntelliJ IDEA installed.
- JDK version 11+ installed.
- Maven or Gradle is installed and configured for project build.
- MongoDB is installed locally, or you have access to a remote MongoDB server.

### To successfully complete this task, you will need:
- Java development environment - IntelliJ IDEA.
- Project builder (Maven or Gradle).
- Local instance of MongoDB or access to a cloud instance.
- Internet connection to download dependencies and documentation.

### Task:
You will create a simple Spring Boot-based application that will interact with a MongoDB database. The application should perform CRUD operations on a collection of documents representing user entities. To do this, you will need to configure the connection to MongoDB, create data models, implement a repository for working with the database, and write a controller for processing HTTP requests.

### Instructions for completing the task:
1. Creating a new Spring Boot project
- Create a new Spring Boot project using Maven or Gradle.
- Add the spring-boot-starter-web, spring-boot-starter-data-mongodb dependencies and other necessary libraries.
2. Configure the connection to MongoDB
- Run MongoDB in Docker using the command: ```docker run --name my-mongodb -d -p 27017:27017 mongo```
- Configure the connection to your MongoDB database in the application.properties file.
- Check that the settings are correct by running the application and making sure that it successfully connects to the database.
3. Creating a data model
- Define the User entity that will be stored in the MongoDB collection. This entity should contain the fields id, name, email, and age.
- Use MongoDB annotations (@Document, @Id) to mark up the model correctly.
4. Implementing the repository
- Create an interface that extends MongoRepository<User, String> to implement standard CRUD operations.
- Implement additional methods to search for users by name or age.
5. Writing the controller
- Write a REST controller that handles GET, POST, PUT, and DELETE requests for working with users.
- Ensure input validation and error handling.
6. Testing
- Test your application by executing requests through Postman or another API testing tool.
- Ensure that all operations are performed correctly and that data is saved/modified/deleted in the database.

### Tips and tricks:
- When setting up your connection to MongoDB, pay attention to the connection URL format, which may look like this: mongodb://localhost:27017/your_database_name.
- Use @Document(collection = “users”) annotations to specify a specific collection in the database.
- To validate data in the controller, use annotations from the javax.validation.constraints package.
- If you are using Gradle, add a dependency on org.springframework.boot:spring-boot-starter-data-mongodb.
