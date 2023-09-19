// Program 1: Find the Largest of Three Numbers
// Write a program to input three integer numbers at runtime and print the largest number.
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("The largest number is: " + largest);
    }
}

// Program 2: Check if a Character is Vowel or Consonant
// Write a program to input a character at runtime and check if it is a vowel or a consonant.
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }
    }
}

// Program 3: Find Even and Odd Numbers between a Range
// Write a program to find and display even and odd numbers between 11 and 109.
public class Program3 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 11 and 109:");
        for (int i = 12; i <= 108; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nOdd numbers between 11 and 109:");
        for (int i = 11; i <= 109; i += 2) {
            System.out.print(i + " ");
        }
    }
}

// Program 4: Count Even and Odd Numbers between a Range
// Write a program to count and display the total number of even and odd numbers between 11 and 109.
public class Program4 {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 11; i <= 109; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}

// Program 5: Check if a Number is Prime or Not
// Write a program to input a number at runtime and check if it is a prime number.
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


// Program 6: Sum of Digits using while loop
// Write a program to take any number more than 3 digits and sum its digits using a while loop.
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (more than 3 digits): ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

// Program 7: Reverse a Number
// Write a program to take a number more than 1 digit at runtime and print the same number in reverse order.
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (more than 1 digit): ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}

// Program 8: Palindrome Number
// Write a program to take a number through the keyboard and check if it is a palindrome number.
import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }
    }
}

// Program 9: Armstrong Number
// Write a program to take any three-digit number and check if it is an Armstrong number.
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int num = scanner.nextInt();
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

// Program 10: Print Table of a Number
// Write a program to print the table of a number.
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

// Program 11: Find the Factorial of a Number
// Write a program to input a number at runtime and calculate its factorial.
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

// Program 12: Fibonacci Series
// Write a program to print the Fibonacci series up to 10 terms.
public class Program12 {
    public static void main(String[] args) {
        int terms = 10;
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(" " + firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

// Program 13: Decimal to Binary Conversion
// Write a program to convert a decimal number to binary.
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        System.out.println("Binary equivalent: " + binary);
    }
}

// Program 14: Binary to Decimal Conversion
// Write a program to convert a binary number to decimal.
import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();
        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Decimal equivalent: " + decimal);
    }
}

// Program 15: Basic Calculator using Switch
// Write a program to perform addition, subtraction, multiplication, and division using a switch statement.
import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("Result: " + result);
    }
}

// Program 16: Print Days of the Week using Switch
// Write a program to print the days of the week using switch statement.
import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1 to 7): ");
        int day = scanner.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
        }
        System.out.println("Day: " + dayName);
    }
}