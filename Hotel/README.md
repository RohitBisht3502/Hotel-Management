# <h1 align = "center"> Hotel Application API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The Hotel Management Application is a Spring Boot-based web application designed to help manage hotel information. It allows users to perform various operations related to hotel management, including adding new hotel, updating hotel, and deleting hotel from the system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Controller** `CREATE /rooms` and GET/rooms`
   
   This endpoint creare employee and get employee by using user id.

   ```java
   
    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom)
    {
        return roomService.addRoom(newRoom);
    }
    @GetMapping("rooms")
    public List<Room> getRooms()
    {
        return roomService.getRooms();
    }
    @DeleteMapping("room/{id}/id")
    public String deleteRoomById(@PathVariable Integer id){
        return roomService.deleteRoomById(id);
    }
   ```
   ```
The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for hotel data. Additionally, it may include data mapping and conversion between Java objects and database entities.

## Database Design

The project's database design includes tables for hotel management, with fields such as:

## Database Used

The project utilizes the following data structures:

### Model
1.Employee
2.Address

### MySql

The project

 utilizes the `MySql` data structure to store and manage lists of `room ` objects in various parts of the application. `MySql` provides permanent storage and efficient element retrieval, making it suitable for storing rooms records and performing operations on them.

These database enable the application to organize and manipulate Ecommerce  data efficiently while maintaining data integrity.

## Project Summary

TA hotel API built using Spring Boot is a powerful and efficient solution for managing and providing access to hotel-related information and services. Spring Boot is a popular Java-based framework that simplifies the development of robust and scalable web applications, making it an excellent choice for creating APIs that cater to the needs of the hospitality industry.

Key Features:

- RESTful API endpoints for data management.
- Data validation to ensure data integrity.
- Clean code separation with a layered architecture (Controller, Services, Repository).
- Robust error handling for improved reliability.
- Java-based backend and Maven for build management.

The hotel Management Application serves as a practical example of Spring Boot application development, demonstrating best practices in API design and data management. It offers a solid foundation for building and extending data management systems in various applications.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

## Contact
For questions or feedback, please contact [ROHIT SINGH BISHT](mailto:business.rohitbisht3502@gmail.com)
