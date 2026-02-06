Car Rental Management System
BSD 214: Object-Oriented Programming II
Project Overview
This repository features a console-based Car Rental System written to exemplify the fundamental principles of Object-Oriented Programming (OOP) in Java. The system handles inventory of vehicles, customer-related data and provides a secure authentication, which guarantees a scalable and modular architecture.

Core Features
Secure Authentication Gatekeeper Implemented within LoginSystem.java, the system provides a secure entry point requiring a valid username and password. It features a strict three-attempt threshold and utilizes the Java Console API to ensure password privacy during entry.
Automated Fleet Management The RentalAgency.java controller handles the lifecycle of the vehicle fleet. It dynamically manages car availability, ensuring that once a vehicle is rented, it is removed from the active listing until returned.
Data Encapsulation Entities such as Car.java and Customer.java utilize private data members and public accessor/mutator methods. This ensures that the internal state of the objects is protected from unauthorized outside interference.

Technical Implementation (OOP Principles)
Encapsulation: Each class maintains its own data. For instance, the Car class encapsulates the Available boolean, which can only be modified through controlled logic within the agency.
Abstraction: The complexity of the search and rental logic is hidden from the Main execution loop. The user interacts with simple methods while the backend handles the verification and state changes.
Modularity: The project is strictly decoupled. If the authentication logic needs to change, only the LoginSystem file is modified, leaving the rental logic untouched.

Setup and Installation
Prerequisites
Java Development Kit (JDK) 17 or higher
A standard Terminal or Command Prompt

Execution Steps
Clone the repository to your local environment.
Open your terminal in the project root folder.
Compile all source files: javac *.java
Run the main application: java -cp . Main
Run the validation test suite: java -cp . TestSystem

System Credentials
Default Username: admin
Default Password: password123
