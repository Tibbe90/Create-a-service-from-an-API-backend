[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/x5rQfWD4)

Cross origin documentation:
https://spring.io/guides/gs/rest-service-cors

---
🧩 Pokédex API – Backend
---
This project is the backend part of a database connected web application developed in Java using Spring Boot with Spring web and Spring Data JPA. It was built to practice backend development skills, and interacting between a public api while maintaining my own api separately in a database.

The application allows users to browse pokemon from the public api, save pokemon they found to a "pokedex". This application is designed to be used together with my frontend part of the program running as separate entities.

## Core Features
- Add Pokemon to a personal pokedex.
- Retrieve the pokedex in alphabetical order.
- Retrieve the pokedex in chronological order based on date added.
- Pokedex is handled using a SQL database.
- Each pokemon in the pokedex has a UUID for CRUD operations.
- Cross origin resource sharing (CORS) configuration. For a local environment with this config.

## Architecture

#### Controller Layer
Handles HTTP requests and REST endpoints.

#### Service Layer
Contains business logic, including sorting and repository calls.

#### Repository Layer
Interfaces with the database using Spring Data JPA.

#### Model Layer
Defines the Pokémon entity and its persistence mapping.

## Getting Started
#### Prerequisites

- Java 17 or higher.
- Maven.
- SQL database. 
###### Tools I used
- Initialised with Spring initializr with Spring Data JPA and Spring Web dependencies
- Code written and tested with Visual Studio Code
- Database was run with MAMP
  
#### Clone the Repository

git clone https://github.com/plugga-tech/skapa-en-tj-nst-utifr-n-ett-api-backend-Tibbe90.git
This will compile the project.
## Configuration
###### Application Properties
This CORS configuration is only suitable for a local environment. (WebMvcConfig.java)
The application is configured using the application.properties file  

###### Configuration includes:
Database connection URL.  
Database username and password.  
Server port.

###### These items must point to your database:
- spring.datasource.url.
- spring.datasource.username.
- spring.datasource.password.
##### Run the application
API endpoints:

http://localhost:8081  
/pokedex/by-name (GET)  
/pokedex/by-date (GET)  
/pokedex (POST)  
/pokedex/{id} (DELETE)  

###### Database Overview
Pokémon entities are stored in a sql database.  
UUIDs are used as primary keys.  
## Future Ideas for improvements
- Improved error handling
- Login and have each user be able to save a personal pokedex.
- Pagination for large Pokédex datasets.
- Search in pokedex.

## License
---
This project is intended for a education assignment.
