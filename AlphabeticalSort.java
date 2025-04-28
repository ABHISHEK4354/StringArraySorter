import java.util.Arrays;

public class AlphabeticalSort {
    public static void main(String[] args) {
        // Define an array of strings
        String[] words = {"Banana", "Apple", "Mango", "Cherry", "Blueberry"};

        // Display original array
        System.out.println("Original array:");
        for (String word : words) {
            System.out.println(word);
        }

        // Sort the array alphabetically
        Arrays.sort(words);

        // Display sorted array
        System.out.println("\nSorted array:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
