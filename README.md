# TMS Project

A Task Management System built with Kotlin, Spring Boot, and Spring Data JPA.

## Project Structure

This project follows the standard Spring Boot project structure:

```
tms/
├── build.gradle.kts                # Gradle build configuration
├── settings.gradle.kts             # Gradle settings
├── src/
│   ├── main/
│   │   ├── kotlin/                 # Main Kotlin source files
│   │   │   └── com/example/
│   │   │       ├── controller/     # REST controllers
│   │   │       ├── entity/         # JPA entities
│   │   │       ├── repository/     # Spring Data repositories
│   │   │       └── Main.kt         # Application entry point
│   │   └── resources/
│   │       └── application.properties # Application configuration
│   └── test/
│       └── kotlin/                 # Test Kotlin source files
└── .gitignore                      # Git ignore file
```

## Prerequisites

- JDK 17 or higher
- Gradle 8.4 or higher (or use the Gradle wrapper)

## Technologies

- **Kotlin**: Modern, concise JVM language
- **Spring Boot**: Framework for building production-ready applications
- **Spring Data JPA**: Simplifies data access with the Java Persistence API
- **H2 Database**: In-memory database for development
- **Spring Web**: For building RESTful APIs

## Building the Project

To build the project, run:

```bash
./gradlew build
```

## Running the Application

To run the application, execute:

```bash
./gradlew bootRun
```

The application will start on port 8080 by default.

## API Endpoints

The application provides the following REST API endpoints:

- `GET /api/tasks`: Get all tasks
- `GET /api/tasks/{id}`: Get a task by ID
- `GET /api/tasks/completed?completed=true|false`: Get completed or incomplete tasks
- `GET /api/tasks/overdue`: Get overdue tasks
- `GET /api/tasks/search?title=keyword`: Search tasks by title
- `POST /api/tasks`: Create a new task
- `PUT /api/tasks/{id}`: Update a task
- `DELETE /api/tasks/{id}`: Delete a task
- `PATCH /api/tasks/{id}/complete`: Mark a task as completed

## H2 Console

The H2 database console is enabled and available at:

```
http://localhost:8080/h2-console
```

Use the following connection details:
- JDBC URL: `jdbc:h2:mem:tmsdb`
- Username: `sa`
- Password: `password`

## Running Tests

To run tests, execute:

```bash
./gradlew test
```

## Gradle Wrapper Initialization

This project includes Gradle wrapper scripts (`gradlew` and `gradlew.bat`), but the binary JAR file (`gradle-wrapper.jar`) needs to be downloaded separately. To complete the Gradle wrapper setup:

1. Download the Gradle distribution from https://gradle.org/releases/
2. Extract the distribution and locate the `gradle-wrapper.jar` file
3. Copy it to the `gradle/wrapper/` directory in this project

Alternatively, if you have Gradle installed, you can run:

```bash
gradle wrapper
```

This will generate all necessary wrapper files automatically.

## License

[Add your license information here]