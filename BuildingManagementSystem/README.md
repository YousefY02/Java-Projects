# Building Management System

This project is a Java-based application for managing buildings, apartments, and Canadian addresses. It demonstrates object-oriented programming (OOP) concepts such as inheritance, encapsulation, and method overriding.

---

## Features

- **Building Class**: Represents a building with properties like name, address, and square footage.
- **Apartment Class**: Extends the `Building` class and adds functionality for managing apartments (e.g., total units).
- **CanadianAddress Class**: Represents a Canadian address with properties like street address, city, province, postal code, and country. It includes methods for printing and comparing addresses.
- **Test Classes**:
  - `TestApartment`: Demonstrates how to create and update an apartment object.
  - `TestCanadianAddress`: Demonstrates how to create, update, and compare Canadian address objects.

---

## How to Run

1. Navigate to the `src/` folder:
 ```
cd src/
 ```
2. Compile the Java files:
 ```
javac *.java
 ```
3. Run the test classes:
- To test the `Apartment` class:
  ```
  java TestApartment
  ```
- To test the `CanadianAddress` class:
  ```
  java TestCanadianAddress
  ```

## Code Structure

- **Building.java**: Defines the `Building` class.
- **Apartment.java**: Defines the `Apartment` class, which extends `Building`.
- **CanadianAddress.java**: Defines the `CanadianAddress` class.
- **TestApartment.java**: Demonstrates the usage of the `Apartment` class.
- **TestCanadianAddress.java**: Demonstrates the usage of the `CanadianAddress` class.

---

## Author

- **Name**: Yousef
- **GitHub**: https://github.com/YousefY02
