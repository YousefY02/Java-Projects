//Author: Yousef Yousef
//This class have main method to test MyMatrixOperator class methods for Matrices

import java.util.Scanner;

public class MyMatrixDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Creating object from MyMatrixOperator class
        MyMatrixOperator operator = new MyMatrixOperator();
        // Ask the user which operation to use
        System.out.println("Enter a number to perform an operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Scalar Multiplication");
        System.out.println("3. Matrix Multiplication");
        int choice = scan.nextInt();

        System.out.println("Enter the dimension n for n x n matrices: ");
        int n = scan.nextInt();
        int[][] m1 = new int[n][n];

        System.out.println("Enter a matrix row by row: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
    //If the user wants to do scalar multiplication then no need to input 2nd matrix
        if (choice == 2) {
            // Using scalar multiplication
            System.out.print("Enter a scalar value for multiplication: ");
            int scalar = scan.nextInt();
            int[][] scalarResult = operator.scalar(scalar, m1);
            System.out.println("Result after scalar multiplication is:");
            printMatrix(scalarResult);
        } else {
            int[][] m2 = new int[n][n];
            System.out.println("Enter the second matrix row by row: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m2[i][j] = scan.nextInt();
                }
            }

            switch (choice) {
                case 1:
                    // Using matrix addition
                    int[][] additionResult = operator.add(m1, m2);
                    System.out.println("Result after addition is:");
                    printMatrix(additionResult);
                    break;

                case 3:
                    // Using matrix multiplication
                    int[][] productResult = operator.product(m1, m2);
                    System.out.println("The resulting matrix after multiplication is:");
                    printMatrix(productResult);
                    break;
            }
        }
    }

    //method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
