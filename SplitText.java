import java.util.Scanner;

public class SplitText {

    // Find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {

            while (true) {

                text.charAt(count);

                count++;
            }

        } catch (Exception e) {

            return count;
        }
    }

    // Split text without using split()
    public static String[] splitText(String text) {

        int length = findLength(text);

        int wordCount = 1;

        // Count words
        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        String currentWord = "";

        int index = 0;

        // Extract words
        for (int i = 0; i < length; i++) {

            if (text.charAt(i) != ' ') {

                currentWord += text.charAt(i);

            } else {

                words[index] = currentWord;

                index++;

                currentWord = "";
            }
        }

        // Last word
        words[index] = currentWord;

        return words;
    }

    // Compare arrays
    public static boolean compareArrays(String[] a1, String[] a2) {

        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {

            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        String[] userSplit = splitText(text);

        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("User-defined split:");

        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("Comparison Result: " + result);
    }
}