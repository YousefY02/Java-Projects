# Matrix Operations

## Author: Yousef Yousef

## Overview
This project consists of two Java files that implement basic matrix operations: addition, scalar multiplication, and matrix multiplication. It provides a simple command-line interface for users to input matrices and perform operations interactively.

## Files Included
1. **MyMatrixOperator.java** - Implements the matrix operations.
2. **MyMatrixDriver.java** - Provides a main method for user interaction and testing.

## Features
- Matrix Addition
- Scalar Multiplication
- Matrix Multiplication

## Usage Instructions

### Compilation and Execution
1. Compile both Java files:
   ```sh
   javac MyMatrixOperator.java MyMatrixDriver.java
   ```
2. Run the program:
   ```sh
   java MyMatrixDriver
   ```

### User Interaction
- The program prompts the user to select an operation:
  1. Matrix Addition
  2. Scalar Multiplication
  3. Matrix Multiplication
- The user specifies the dimension **n** for **n x n** matrices.
- The user enters matrix elements row by row.
- If scalar multiplication is selected, the user provides a scalar value.
- The program computes and displays the result.

## Class Descriptions

### MyMatrixOperator.java
This class contains the following methods:
- **add(int[][] m1, int[][] m2)**: Adds two matrices and returns the resulting matrix.
- **scalar(int s, int[][] m1)**: Multiplies a matrix by a scalar value.
- **product(int[][] m1, int[][] m2)**: Performs matrix multiplication.

### MyMatrixDriver.java
- Prompts the user for input.
- Calls methods from `MyMatrixOperator` to perform operations.
- Prints the resulting matrix to the console.

## Example Run
```
Enter a number to perform an operation:
1. Matrix Addition
2. Scalar Multiplication
3. Matrix Multiplication
> 1

Enter the dimension n for n x n matrices:
> 2

Enter a matrix row by row:
1 2
3 4

Enter the second matrix row by row:
5 6
7 8

Result after addition is:
6 8
10 12
```

## Notes
- The matrices must be square (n x n).
- Only integer values are supported.


