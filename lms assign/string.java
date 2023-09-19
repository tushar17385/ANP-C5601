/* Program 1: WAP to take a string and display the following result.
Ex:
String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
O/P:
"aaa" occurred: 3 times in the given string
"ddddd" occurred: 5 times in the given string
"gggggg" occurred: 6 times in the given string
"jjjjjjj" occurred: 7 times in the given string
"kk" occurred: 2 times in the given string
"nnnn" occurred: 4 times in the given string
{aa=3, bb=2, ccc=1, dddd=3}
*/
public class Program1 {
    public static void main(String[] args) {
        String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
        // Code for Program 1
        System.out.println("Program 1 Output:");
        // Create a map to store character occurrences
        Map<String, Integer> charOccurrences = new HashMap<>();

        // Use regular expressions to split the string by non-word characters
        String[] words = str.split("\\W+");

        for (String word : words) {
            charOccurrences.putIfAbsent(word, 0);
            charOccurrences.put(word, charOccurrences.get(word) + 1);
        }

        for (String word : charOccurrences.keySet()) {
            int count = charOccurrences.get(word);
            System.out.println("\"" + word + "\" occurred: " + count + " times in the given string");
        }
    }
}

/* Program 2: WAP to take any String and display the number of occurrences of each character that occurs more than once.
Ex:
String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
O/P:
g occurred: 7 Times.
a occurred: 3 Times.
d occurred: 5 Times.
j occurred: 7 Times.
k occurred: 2 Times.
n occurred: 4 Times.
*/
public class Program2 {
    public static void main(String[] args) {
        String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
        // Code for Program 2
        System.out.println("Program 2 Output:");
        Map<Character, Integer> charOccurrences = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurred: " + entry.getValue() + " Times.");
            }
        }
    }
}

/* Program 3: WAP to take any string and display words in reverse order.
Ex:
String string = "Java Concept Of The Day";
O/P:
Day The Of Concept Java
*/
public class Program3 {
    public static void main(String[] args) {
        String string = "Java Concept Of The Day";
        // Code for Program 3
        System.out.println("Program 3 Output:");
        String[] words = string.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}

/* Program 4: WAP to take any string and display the length of each reversed word.
Ex:
String str = "India is a great country";
O/P
aidnI length = 5
si length = 2
a length = 1
taerg length = 5
yrtnuoc length = 7
*/
public class Program4 {
    public static void main(String[] args) {
        String str = "India is a great country";
        // Code for Program 4
        System.out.println("Program 4 Output:");
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(new StringBuilder(word).reverse() + " length = " + word.length());
        }
    }
}

/* Program 5: WAP to take any string and print the largest word present in the string.
Ex:
String str = "India is my beautiful country";
O/P:
beautiful
*/
public class Program5 {
    public static void main(String[] args) {
        String str = "India is my beautiful country";
        // Code for Program 5
        System.out.println("Program 5 Output:");
        String[] words = str.split(" ");
        String largestWord = "";
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        System.out.println(largestWord);
    }
}

/* Program 6: WAP to an integer array and display the number of occurrences of each number.
Ex:
int[] arr = {7, 5, 9, 8, 5, 6, 7, 5, 4, 8};
O/P:
7 occurred: 2 times
5 occurred: 3 times
9 occurred: 1 time
8 occurred: 2 times
6 occurred: 1 time
4 occurred: 1 time
*/
public class Program6 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 8, 5, 6, 7, 5, 4, 8};
        // Code for Program 6
        System.out.println("Program 6 Output:");
        Map<Integer, Integer> numberOccurrences = new HashMap<>();
        for (int num : arr) {
            numberOccurrences.put(num, numberOccurrences.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numberOccurrences.entrySet()) {
            System.out.println(entry.getKey() + " occurred: " + entry.getValue() + " times");
        }
    }
}

/* Program 7: WAP to take a string and display the following result.
Ex:
String str = "aa bb cc aa bb cc bb aa bb ";
O/P:
"aa" occurred: 3 times in the given string
"bb" occurred: 4 times in the given string
"cc" occurred: 2 times in the given string
*/
public class Program7 {
    public static void main(String[] args) {
        String str = "aa bb cc aa bb cc bb aa bb ";
        // Code for Program 7
        System.out.println("Program 7 Output:");
        Map<String, Integer> stringOccurrences = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            stringOccurrences.put(word, stringOccurrences.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : stringOccurrences.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" occurred: " + entry.getValue() + " times in the given string");
        }
    }
}

/* Program 8: WAP to take a string and make it a palindrome.
Ex:
String str = "raj";
O/P:
"rajjar"
*/
public class Program8 {
    public static void main(String[] args) {
        String str = "raj";
        // Code for Program 8
        System.out.println("Program 8 Output:");
        StringBuilder palindrome = new StringBuilder(str);
        palindrome.append(palindrome.reverse());
        System.out.println("\"" + str + "\"" + palindrome.substring(str.length()));
    }
}
