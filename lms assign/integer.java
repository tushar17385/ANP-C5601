//  Program 1: Swap Two Integer Values using Third Variable
// Write a program to swap two integer values using a third variable.
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer values: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:");
        System.out.println("Value 1: " + num1);
        System.out.println("Value 2: " + num2);
    }
}

// Program 2: Swap Two Integer Values without using Third Variable
// Write a program to swap two integer values without using a third variable.
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer values: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping:");
        System.out.println("Value 1: " + num1);
        System.out.println("Value 2: " + num2);
    }
}

// Program 3: Convert Temperature from Celsius to Fahrenheit
// Write a program to convert temperature in degrees Celsius to degrees Fahrenheit.
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

// Program 4: Calculate Area and Perimeter of Shapes
// Write a program to calculate the area and perimeter of a circle, square, and rectangle.
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to calculate:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                double circlePerimeter = 2 * Math.PI * radius;
                System.out.println("Circle Area: " + circleArea);
                System.out.println("Circle Perimeter: " + circlePerimeter);
                break;
            case 2:
                System.out.print("Enter side of square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                double squarePerimeter = 4 * side;
                System.out.println("Square Area: " + squareArea);
                System.out.println("Square Perimeter: " + squarePerimeter);
                break;
            case 3:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                double rectanglePerimeter = 2 * (length + width);
                System.out.println("Rectangle Area: " + rectangleArea);
                System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

// Program 5: Check Leap Year
// Write a program to check if a given year is a leap year or not.
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

// Program 6: Calculate Total Salary
// Write a program to calculate the total salary of an employee, where the basic salary is 10,000
// and TA is 10%, DA is 20%, and HRA is 30% of the basic salary.
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        final int BASIC_SALARY = 10000;
        final double TA_PERCENTAGE = 0.1;
        final double DA_PERCENTAGE = 0.2;
        final double HRA_PERCENTAGE = 0.3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        double totalSalary = BASIC_SALARY + (BASIC_SALARY * TA_PERCENTAGE) + (BASIC_SALARY * DA_PERCENTAGE) + (BASIC_SALARY * HRA_PERCENTAGE);
        System.out.println("Total Salary for " + name + " is: " + totalSalary);
    }
}