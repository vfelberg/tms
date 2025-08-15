# TMS Project

A simple Kotlin project initialized with Gradle.

## Project Structure

This project follows the standard Gradle project structure:

```
tms/
├── build.gradle.kts       # Gradle build configuration
├── settings.gradle.kts    # Gradle settings
├── src/
│   ├── main/
│   │   └── kotlin/        # Main Kotlin source files
│   └── test/
│       └── kotlin/        # Test Kotlin source files
└── .gitignore             # Git ignore file
```

## Prerequisites

- JDK 17 or higher
- Gradle 8.4 or higher (or use the Gradle wrapper)

## Building the Project

To build the project, run:

```bash
./gradlew build
```

## Running the Application

To run the application, execute:

```bash
./gradlew run
```

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