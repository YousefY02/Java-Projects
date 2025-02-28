# StackQueues

## Overview
This project implements basic stack and queue data structures to store and manage `Student` objects. It consists of three Java classes:
- `Student.java`
- `MyQueue.java`
- `MyStack.java`

## Files and Descriptions

### 1. Student.java
This class represents a student with the following attributes:
- `aNum`: A unique identifier for the student.
- `firstName`: The first name of the student.
- `lastName`: The last name of the student.

#### Methods:
- `getaNum()`: Returns the student's ID.
- `getFirstName()`: Returns the first name.
- `getLastName()`: Returns the last name.

### 2. MyQueue.java
This class implements a queue using a linked list to store `Student` objects. It follows the First-In-First-Out (FIFO) principle.

#### Methods:
- `enqueue(Student o)`: Adds a student to the end of the queue.
- `dequeue()`: Removes and returns the first student in the queue.
- `findElement(String name)`: Checks if a student with the given ID exists in the queue.
- `getSize()`: Returns the number of students in the queue.

### 3. MyStack.java
This class implements a stack using an array list to store `Student` objects. It follows the Last-In-First-Out (LIFO) principle.

#### Methods:
- `push(Student o)`: Adds a student to the top of the stack.
- `pop()`: Removes and returns the student from the top of the stack.
- `peek()`: Returns the student at the top without removing it.
- `getSize()`: Returns the number of students in the stack.

## Usage
This project provides basic operations for managing students using stacks and queues, which can be integrated into larger applications requiring structured data storage.

## Author
Yousef Yousef