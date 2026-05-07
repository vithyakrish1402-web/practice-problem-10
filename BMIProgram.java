import java.util.Scanner;

public class BMIProgram {

    // Method to compute BMI and Status
    public static String[][] computeBMI(double[][] persons) {

        String[][] result = new String[persons.length][4];

        for (int i = 0; i < persons.length; i++) {

            double weight = persons[i][0];
            double heightCm = persons[i][1];

            // Convert cm to meter
            double heightM = heightCm / 100;

            // BMI Formula
            double bmi = weight / (heightM * heightM);

            String status;

            // Determine status
            if (bmi <= 18.4) {
                status = "Underweight";
            }
            else if (bmi <= 24.9) {
                status = "Normal";
            }
            else if (bmi <= 39.9) {
                status = "Overweight";
            }
            else {
                status = "Obese";
            }

            // Store values
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Display table
    public static void displayResult(String[][] result) {

        System.out.println("\n---------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s%n",
                "Height", "Weight", "BMI", "Status");
        System.out.println("---------------------------------------------");

        for (String[] row : result) {

            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 persons, 2 columns
        double[][] persons = new double[10][2];

        // Input
        for (int i = 0; i < persons.length; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        // Compute BMI
        String[][] result = computeBMI(persons);

        // Display
        displayResult(result);
    }
}