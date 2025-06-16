
/* Write a program that takes two numbers as input from the user and prints
their sum.*/

import java.util.Scanner;

public class sumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
        scanner.close();
    }
}
