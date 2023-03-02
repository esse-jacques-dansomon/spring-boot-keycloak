# Spring Boot Keycloak Authentication Demo

This is a simple Spring Boot application that demonstrates how to implement authentication and authorization using Keycloak.

## Prerequisites

Before you can run this application, you need to have the following prerequisites installed on your machine:

- Java 17 or later
- Maven 3.6 or later
- Keycloak 18.0 or later

## Setup

1. Clone this repository to your local machine: git clone https://github.com/your-username/spring-boot-keycloak-demo.git
2. Navigate to the project directory: cd spring-boot-keycloak-demo
3. Start Keycloak: kb.bat or kb.sh (depending on your operating system)  start-dev  -Djboss.http.port=8100
4. Import the `realm-export.json` file into Keycloak:

   - Open the Keycloak admin console at http://localhost:8080/auth/admin
   - Log in as the admin user (username: `admin`, password: `admin`)
   - Click on "Add realm" and select "Import realm"
   - Select the `realm-export.json` file from the project directory and click "Create"

5. Build and run the application: mvn spring-boot:run

6. Test the application:

- Open a web browser and navigate to http://localhost:8081
- You should be redirected to the Keycloak login page
- Log in with one of the predefined users (username: `user1` or `user2`, password: `password`)
- You should be redirected back to the home page and see a welcome message with your username

## Configuration

The application is configured to use the `keycloak` realm in Keycloak. The `realm-export.json` file contains the predefined users and roles used in this demo.

The application properties are defined in the `application.properties` file:





