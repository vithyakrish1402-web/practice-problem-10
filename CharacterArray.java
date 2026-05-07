import java.util.Scanner;

public class CharacterArray {

    // User-defined method
    public static char[] getCharacters(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    // Compare char arrays
    public static boolean compareArrays(char[] a1, char[] a2) {

        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {

            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);

        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(userArray, builtInArray);

        System.out.println("Arrays are equal: " + result);
    }
}