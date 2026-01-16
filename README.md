# ☕ Java SE Portfolio

![Program](https://img.shields.io/badge/Program-ITI%209--Month%20Training-D00000?style=for-the-badge&logo=knowledge-graph&logoColor=white)
![Track](https://img.shields.io/badge/Track-Open%20Source%20Applications-2ea44f?style=for-the-badge)
![Tech](https://img.shields.io/badge/Java-Standard%20Edition-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## 📖 About The Repository

This repository contains the lab assignments and projects developed during the **Java Standard Edition (Java SE)** module of the **Information Technology Institute (ITI) - 9-Month Professional Training Program (Open Source Application Development Track)**.

The focus of these labs is to build a strong foundation in **Object-Oriented Programming (OOP)**, **Data Structures**, **Concurrency**, and **Functional Programming** using Java.

---

## 📂 Project Structure & Modules

The repository is organized into specific modules, each targeting a core Java concept:

| Module / Project | Key Concepts Applied |
| :--- | :--- |
| **1. Generic Library System** | **Generics**, Abstract Classes, Interfaces, Custom Exceptions. |
| **2. World Data Analysis** | **Streams API**, **DAO Pattern**, Lambda Expressions, Singleton Pattern. |
| **3. Console Dictionary** | **Collections Framework** (`Map`, `TreeSet`), String Manipulation. |
| **4. Student Registration** | **OOP Relationships** (Association/Composition), **Inner Classes**. |
| **5. Desktop Animations** | **Swing/AWT** (GUI), **Multithreading**, Event Handling. |

---

## 🚀 Projects Overview

### 🏛️ 1. Library Management System (Generics & OOP)
A console-based application to manage library resources, demonstrating Type Safety and Error Handling.
* **Generics:** Implemented a `Library<T>` class to handle various item types (`Books`, `Magazines`) in a type-safe manner.
* **Exception Handling:** Designed custom exceptions (e.g., `ItemNotFoundException`) for robust logic.
* **Architecture:** Decoupled logic using Interfaces (`CRUDOperations`) and Abstract Classes (`LibraryItem`).

### 🌍 2. World Statistics Engine (Streams & DAO)
A data processing tool that analyzes high-dimensional population data.
* **Data Access:** Implemented the **DAO Pattern** to separate business logic from data storage.
* **Functional Programming:** Utilized **Java Streams** to filter, map, and reduce data (e.g., finding the highest-populated city per continent).
* **Thread Safety:** Used `ConcurrentHashMap` for in-memory data storage.

### 📚 3. Intelligent Dictionary (Collections)
A fast lookup dictionary application.
* **Data Structures:** Used `Map<Character, TreeSet<String>>` to ensure categories are **O(1)** accessible and words are automatically **sorted** and **unique**.

### 🎓 4. Student Registration System (Relationships)
A system modeling university enrollments.
* **Encapsulation:** Utilized **Private Inner Classes** to securely manage the relationship between Students and Courses/Grades.
* **String Processing:** Optimized report generation using `StringBuilder`.

### 🎨 5. GUI & Concurrency Labs
Interactive desktop applications built with Swing.
* **Bouncing Ball:** Implements a physics game loop with collision detection.
* **Digital Clock & Banner:** Real-time UI updates using **Background Threads**.

---

## 🛠 Technical Skills Matrix

This portfolio demonstrates proficiency in the following Core Java areas:

* **OOP Principles:** Solid understanding of Inheritance, Polymorphism, Encapsulation, and Abstraction.
* **Java Generics:** Creating reusable and type-safe components.
* **Java Collections:** Proficient use of `Lists`, `Sets`, and `Maps` based on performance requirements.
* **Functional Java:** Using Lambdas and Streams for declarative data processing.
* **Multithreading:** Managing threads and synchronization for responsive applications.
* **GUI Development:** Basic desktop application development using Swing/AWT.

---

## 💻 How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Mostafa-Khalifaa/ITI-JAVA-course-tasks.git](https://github.com/Mostafa-Khalifaa/ITI-JAVA-course-tasks.git)
    ```
2.  **Navigate to a specific project (e.g., Library):**
    ```bash
    cd Library-System
    ```
3.  **Compile & Run:**
    ```bash
    javac -d bin src/**/*.java
    java -cp bin com.iti.library.Main
    ```

---
*Developed by Mostafa Khalifa as part of the ITI 9-Month Open Source Track intake.*
