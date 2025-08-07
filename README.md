# Railway-Ticket-Booking-System

This project is a Spring Boot application for an Indian Railway Ticket Booking System. It provides functionalities for searching trains and booking tickets, along with a simple web interface.

Group member

Sanchit Sanjay Kale

Ajit Vitthal Wagh

Piyush Dnyandev Revande

## Table of Contents

*   [Features](#features)
*   [Technologies Used](#technologies-used)
*   [Getting Started](#getting-started)
    *   [Prerequisites](#prerequisites)
    *   [Installation](#installation)
    *   [Running the Application](#running-the-application)
*   [API Endpoints](#api-endpoints)
*   [Frontend Usage](#frontend-usage)
*   [Project Structure](#project-structure)
*   [Further Reference](#further-reference)
*   [License](#license)

## Features

*   **Train Search:** Users can search for available trains between a source and destination.
*   **Ticket Booking:** Allows passengers to book tickets for available trains, specifying the number of seats.
*   **Booking Management:** View bookings made by a specific passenger email.
*   **Seat Availability:** Updates train seat availability after a booking.
*   **Error Handling:** Global exception handling for common scenarios like train not found or insufficient seats.

## Technologies Used

*   **Spring Boot:** Framework for building the backend application.
*   **Spring Data JPA:** For data persistence and interaction with the database.
*   **Spring Web:** For building RESTful APIs.
*   **PostgreSQL:** Relational database for storing train and booking information.
*   **Maven:** Dependency management and build automation tool.
*   **HTML, CSS, JavaScript:** For the frontend web interface.
*   **Jakarta Persistence API (JPA):** For object-relational mapping.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

*   Java Development Kit (JDK) 21 or higher
*   Apache Maven 3.x
*   PostgreSQL database server
*   A web browser to access the frontend

### Installation

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/Railway-Booking.git
    cd Railway-Booking/Railway-Ticket-Booking-System
    ```

2.  **Configure PostgreSQL:**
    *   Create a PostgreSQL database (e.g., `railway_db`).
    *   Update the `src/main/resources/application.properties` file with your PostgreSQL database credentials. (Note: This file is currently a binary in the provided context, you'll need to create or modify it with your database configuration).
        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/railway_db
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
        ```
    *   You might also want to add a `data.sql` file in `src/main/resources` to pre-populate some train data for testing.

3.  **Build the project:**
    ```bash
    ./mvnw clean install
    ```
Sanchit Sanjay Kale📧 sanchitkale445@gmail.com
                   📧  ajitwagh997@gmail.com
                   📧 piyushrevande@gmail.com
### Running the Application

You can run the Spring Boot application using Maven:

```bash
./mvnw spring-boot:run
