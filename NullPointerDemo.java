public class NullPointerDemo {

    // Method to generate exception
    public static void generateException() {

        String text = null;

        // Generates NullPointerException
        System.out.println(text.length());
    }

    // Method to handle exception
    public static void handleException() {

        try {

            String text = null;

            System.out.println(text.length());

        } catch (NullPointerException e) {

            System.out.println("NullPointerException handled successfully.");
        }
    }

    public static void main(String[] args) {

        // Uncomment to generate exception
        // generateException();

        // Handle exception
        handleException();
    }
}