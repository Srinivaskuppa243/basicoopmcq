package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int ages[] = {22, 33, 44, 22, 55, 66, 33};
        int n = ages.length;

        // 1. Copy array and print
        int newarr[] = Arrays.copyOf(ages, n);
        System.out.println("Copied array:");
        for (int i : newarr) {
            System.out.println(i);
        }

        // 2. Print even and odd elements
        for (int i : ages) {
            if (i % 2 == 0) {
                System.out.println("Even element: " + i);
            } else {
                System.out.println("Odd element: " + i);
            }
        }

        // 4. Binary search for 22
        int k = Arrays.binarySearch(ages, 22);
        System.out.println("Index of 22: " + (k >= 0 ? k : "not found"));

        // 5. Sum of negative numbers
        int sumn = 0;
        for (int i : ages) {
            if (i < 0) {
                sumn += i;
            }
        }
        System.out.println("Sum of negative numbers: " + sumn);

        // 6. Print duplicate elements
        System.out.println("Duplicate elements are:");
        boolean[] seen = new boolean[100]; 
        for (int i : ages) {
            if (seen[i]) {
                System.out.println(i);
            } else {
                seen[i] = true;
            }
        }

        // 7. Sum of positive numbers
        int sump = 0;
        for (int i : ages) {
            if (i > 0) {
                sump += i;
            }
        }
        System.out.println("Sum of positive numbers: " + sump);

        // 8. Calculate average
        int avg = 0;
        for (int i : ages) {
            avg += i;
        }
        System.out.println("Average: " + (avg / n));

        // 9. Total sum of elements
        System.out.println("Total sum: " + sumArray(ages));

        // 10. Merge with another array
        int ages2[] = {12, 23, 45, 32, 22, 14};
        int m = ages2.length;
        int merged[] = new int[n + m];
        System.arraycopy(ages, 0, merged, 0, n);
        System.arraycopy(ages2, 0, merged, n, m);
        System.out.println("Merged array:");
        for (int i : merged) {
            System.out.println(i);
        }

        // 11. Remove alphanumeric characters from a string
        String str = "HelloWorld";
        String cstr = str.trim().toLowerCase().replaceAll("[a-zA-Z0-9]", "");
        System.out.println("Characters removed: " + cstr);

        // 12. Check if string ends with "World"
        String suffix = "World";
        boolean endsWith = str.endsWith(suffix);
        System.out.println("Does string end with 'World'? " + endsWith);

        // 13. Check if string equals "World"
        boolean equals = str.equals(suffix);
        System.out.println("Does string equal 'World'? " + equals);

        // 15. Compare main string with character sequence
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the character sequence to compare: ");
        String characterSequence = sc.nextLine();
        compareStrings(mainString, characterSequence);

        // 16. Concatenate strings
        String str2 = "Hi";
        String str3 = str + str2;
        System.out.println("Concatenated string: " + str3);

        // 17. Count uppercase and lowercase letters
        int ucase = 0;
        int lcase = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ucase++;
            } else if (Character.isLowerCase(c)) {
                lcase++;
            }
        }
        System.out.println("Uppercase count: " + ucase);
        System.out.println("Lowercase count: " + lcase);

        // 19. Compare strings
        if (str.compareTo(str3) > 0) {
            System.out.println("Larger string: " + str);
        } else {
            System.out.println("Larger string: " + str3);
        }

        // 20. Double the characters in the string
        StringBuilder res = new StringBuilder();
        for (char ch : str.toCharArray()) {
            res.append(ch).append(ch);
        }
        System.out.println("Doubled characters: " + res.toString());
        sc.close();
    }

    // Method to sum elements of an array
    private static int sumArray(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    // Method to compare two strings
    private static void compareStrings(String mainString, String characterSequence) {
        int comparisonResult = mainString.compareTo(characterSequence);
        if (comparisonResult == 0) {
            System.out.println("The main string is equal to the character sequence.");
        } else if (comparisonResult < 0) {
            System.out.println("The main string is less than the character sequence.");
        } else {
            System.out.println("The main string is greater than the character sequence.");
        }
    }
}
