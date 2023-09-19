/* Program 1: Find the Largest of Three Numbers
   Write a program to input three integer numbers at runtime and print the largest number.
*/
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

// Program 2: Add Two 1D Arrays
// Write a program to take two 1D arrays of length five and insert integer values in each.
// Take a third 1D array that shows the output of the addition of the first two arrays.
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] sumArray = new int[5];
        System.out.println("Enter 5 integer values for array1:");
        for (int i = 0; i < 5; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter 5 integer values for array2:");
        for (int i = 0; i < 5; i++) {
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        System.out.println("Sum of arrays:");
        for (int value : sumArray) {
            System.out.print(value + " ");
        }
    }
}

// Program 3: Add Two 2D Arrays
// Write a program to take two 2D arrays of length five and insert integer values in each.
// Take a third 2D array that shows the output of the addition of the first two arrays.
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] sumArray = new int[5][5];
        System.out.println("Enter 25 integer values for array1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter 25 integer values for array2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Sum of arrays:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Program 4: Matrix Multiplication
// Write a program to multiply two matrices of type 3x3 and print the appropriate output.
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] productMatrix = new int[3][3];
        System.out.println("Enter 9 integer values for matrix1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter 9 integer values for matrix2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        // Matrix multiplication logic
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Program 5: Largest and Smallest in Array
// Write a program to insert 6 different integer values in a 1D array and find the largest and smallest values in the array using any kind of sorting.
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        System.out.println("Enter 6 different integer values:");
        for (int i = 0; i < 6; i++) {
            array[i] = scanner.nextInt();
        }
        int smallest = array[0];
        int largest = array[0];
        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
            if (value > largest) {
                largest = value;
            }
        }
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);
    }
}

// Program 6: Count Even and Odd Numbers in Array
// Write a program to count the even and odd numbers between the elements of a 9-element array.
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter 9 integer values:");
        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

// Program 7: Search for a Number in Array
// Write a program to find a particular number entered by the user and match this number with the five elements of an array.
// If the number is found, then print "Found"; otherwise, print "Not found".
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 integer values for the array:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int value : array) {
            if (value == searchNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number found.");
        } else {
            System.out.println("Number not found.");
        }
    }
}

// Program 8: Replace Number in Array
// In Program 7, if the number is found, then replace that number with another number.
import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 integer values for the array:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to search and replace: ");
        int searchNumber = scanner.nextInt();
        System.out.print("Enter a replacement number: ");
        int replaceNumber = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                array[i] = replaceNumber;
            }
        }
        System.out.println("Array after replacement:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

// Program 9: Separate Even and Odd Numbers in Array
// Write a program to insert 7 integer values in an array and store even and odd numbers in two separate arrays.
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[7];
        int[] evenArray = new int[7];
        int[] oddArray = new int[7];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter 7 integer values for the array:");
        for (int i = 0; i < 7; i++) {
            inputArray[i] = scanner.nextInt();
            if (inputArray[i] % 2 == 0) {
                evenArray[evenCount] = inputArray[i];
                evenCount++;
            } else {
                oddArray[oddCount] = inputArray[i];
                oddCount++;
            }
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}

// Program 10: Count Prime Numbers in Array
// Write a program to insert 10 integer values and count all prime numbers and their values.
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int primeCount = 0;
        System.out.println("Enter 10 integer values for the array:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
            if (isPrime(array[i])) {
                primeCount++;
                System.out.println(array[i] + " is a prime number.");
            }
        }
        System.out.println("Total prime numbers in the array: " + primeCount);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Program 11: Categorize Employees by Age
// Write a program to accept and categorize 20 employees in the age groups 22-30, 31-40, 41-50, and 51-60.
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ageGroups = new int[4];
        System.out.println("Enter ages of 20 employees:");
        for (int i = 0; i < 20; i++) {
            int age = scanner.nextInt();
            if (age >= 22 && age <= 30) {
                ageGroups[0]++;
            } else if (age >= 31 && age <= 40) {
                ageGroups[1]++;
            } else if (age >= 41 && age <= 50) {
                ageGroups[2]++;
            } else if (age >= 51 && age <= 60) {
                ageGroups[3]++;
            }
        }
        System.out.println("Age group 22-30: " + ageGroups[0] + " employees");
        System.out.println("Age group 31-40: " + ageGroups[1] + " employees");
        System.out.println("Age group 41-50: " + ageGroups[2] + " employees");
        System.out.println("Age group 51-60: " + ageGroups[3] + " employees");
    }
}

// Program 12: Find Employees Earning More than 50000
// Write a program to accept salaries of 20 employees and find out people who are earning more than rupees 50000 per month.
import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int above50000 = 0;
        System.out.println("Enter salaries of 20 employees:");
        for (int i = 0; i < 20; i++) {
            double salary = scanner.nextDouble();
            if (salary > 50000) {
                above50000++;
            }
        }
        System.out.println("Number of employees earning above 50000: " + above50000);
    }
}


// Program 13: Find City with Maximum Temperature
// Write a program to accept names and temperatures of 10 cities and find the city with the maximum temperature.
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[10];
        double[] temperatures = new double[10];
        double maxTemperature = Double.MIN_VALUE;
        String hottestCity = "";
        System.out.println("Enter names and temperatures of 10 cities:");
        for (int i = 0; i < 10; i++) {
            cities[i] = scanner.next();
            temperatures[i] = scanner.nextDouble();
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
                hottestCity = cities[i];
            }
        }
        System.out.println("City with maximum temperature: " + hottestCity);
    }
}

// Program 14: Find Student with Maximum Marks
// Write a program to accept marks of 10 students in a subject and display the name of the student who has got maximum marks.
import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        int[] marks = new int[10];
        int maxMarks = Integer.MIN_VALUE;
        String topStudent = "";
        System.out.println("Enter names and marks of 10 students:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.next();
            marks[i] = scanner.nextInt();
            if (marks[i] > maxMarks) {
                maxMarks = marks[i];
                topStudent = names[i];
            }
        }
        System.out.println("Student with maximum marks: " + topStudent);
    }
}

// Program 15: Find Highest and Smallest Numbers in an Array
// Write a program to find the highest and smallest numbers in an array.
public class Program15 {
    public static void main(String[] args) {
        int[] arr = {45, 3, 6, 7, 21, 5, 62, 9};
        int highest = arr[0];
        int smallest = arr[0];
        for (int num : arr) {
            if (num > highest) {
                highest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Highest number: " + highest);
        System.out.println("Smallest number: " + smallest);
    }
}

// Program 16: Remove Duplicates from an Array
// Write a program to remove duplicates from an array.
import java.util.ArrayList;
import java.util.Arrays;
public class Program16 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 3, 3, 2, 4, 5, 4, 5};
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueList.toArray()));
    }
}

// Program 17: Find Number of Occurrences in an Array
// Write a program to find the number of occurrences of each number in an array.
import java.util.HashMap;
public class Program17 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 3, 3, 2, 4, 5, 4, 5};
        HashMap<Integer, Integer> occurrencesMap = new HashMap<>();
        for (int num : arr) {
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }
        for (int num : occurrencesMap.keySet()) {
            int occurrences = occurrencesMap.get(num);
            System.out.println(num + " occurred " + occurrences + " times.");
        }
    }
}
