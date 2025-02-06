# Spring MVC Job Application Platform

## Overview
This project is a simple **Spring MVC**-based server-side job application platform where users can add and view job postings. It follows a three-layer architecture and demonstrates key Spring concepts.

## 🛠️ Technologies & Concepts
- **Maven**: Used for dependency management and project build automation.
- **Spring MVC**: Implements the Model-View-Controller pattern for handling requests and responses.
- **Spring Web**: Provides essential web functionalities, such as controllers, request mappings, and JSP rendering.

## 🏗️ Architecture Overview
### 1️⃣ Controller Layer
Handles HTTP requests with:
- **Three GET controllers**: Serve JSP pages.
- **One POST controller**: Saves job posts and returns the `JobPost` object to the server.

### 2️⃣ Service Layer
- Acts as an intermediary between the controller and repository layers.
- Ensures business logic execution.

### 3️⃣ Repository Layer
- Manages job data using an in-memory **list**.
- Preloaded with default job posts and allows adding new job entries dynamically.

## 🚀 Features
- View job postings.
- Add new job postings dynamically.
- JSP-based UI rendering.

This lightweight application showcases core **Spring Boot MVC concepts**, including request handling, JSP rendering, and basic in-memory data storage. 🚀

---

## 📌 Getting Started
### Prerequisites
- Java 8+
- Maven 3+
- Spring Boot 2+

### Installation & Running
```sh
# Clone the repository
git clone <repository-url>
cd spring-mvc-job-application

# Build the project using Maven
mvn clean install

# Run the application
mvn spring-boot:run
```

### Access the Application
Once the server is running, open a browser and navigate to:
```
http://localhost:8080
```

## 📂 Project Structure
```
📦 spring-mvc-job-application
 ┣ 📂 src/main/java/com/example/jobapp
 ┃ ┣ 📂 controller
 ┃ ┃ ┗ 📜 JobController.java
 ┃ ┣ 📂 service
 ┃ ┃ ┗ 📜 JobService.java
 ┃ ┣ 📂 repository
 ┃ ┃ ┗ 📜 JobRepository.java
 ┣ 📂 src/main/webapp/views
 ┃ ┗ 📜 job-list.jsp
 ┣ 📜 pom.xml
 ┗ 📜 README.md
```

## 🛠️ Built With
- **Spring Boot** – For building the application.
- **Maven** – For dependency management.
- **Spring MVC & Spring Web** – For handling web requests and responses.
- **JSP** – For UI rendering.

## 🤝 Contributing
Feel free to fork this repository and contribute by submitting a pull request. 😊


