## Spring MVC Job Application Platform

This project is a simple Spring MVC-based server-side job application platform where users can add and view job postings. It follows a three-layer architecture: 

- **Controller Layer:** Handles HTTP requests with **three GET controllers** (returning JSP pages) and **one POST controller** (saving job posts and returning the `JobPost` object to the server).  
- **Service Layer:** Acts as an intermediary between the controller and repository layers, ensuring business logic execution.  
- **Repository Layer:** Manages job data using an in-memory **list**, preloaded with default job posts, and allows adding new job entries dynamically.  

This lightweight application demonstrates core **Spring Boot MVC concepts**, including request handling, JSP-based UI rendering, and basic in-memory data storage. 🚀  

---


