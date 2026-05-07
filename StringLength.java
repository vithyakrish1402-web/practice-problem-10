import java.util.Scanner;

public class StringLength {

    // User-defined method without using length()
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.next();

        int userLength = findLength(text);

        int builtInLength = text.length();

        System.out.println("User-defined length: " + userLength);

        System.out.println("Built-in length(): " + builtInLength);
    }
}