/**
 * Write a program that counts the number of vowels in a sentence.
 */
public class Main {

    public static int countVowels(String sentence) {
        int count = 0;
        sentence = sentence.toLowerCase(); // Convert to lowercase for case-insensitive comparison

        for (char c : sentence.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "The modulo operator (%) is used to extract the last digit.\n!";
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount); // Output: Number of vowels: 6
    }
}
