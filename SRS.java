import java.util.Scanner;

public class SRS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Student Result Processing System");

        while (true) {
            System.out.print("\nEnter student name (or type exit to stop): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;  
            }

            int marks = inputMarks();

            double percentage = calculatePercentage(marks);
            String grade = calculateGrade(percentage);

            displayResult(name, marks, percentage, grade);
        }

        System.out.println("\nProgram finished. Thank you!");
    }

    static int inputMarks() {
        int marks;

        while (true) {
            System.out.print("Enter marks (0 - 100): ");
            marks = sc.nextInt();
            sc.nextLine(); 

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Try again.");
                continue;  
            }
            break;
        }

        return marks;
    }

    static double calculatePercentage(int marks) {
        return marks;
    }

    static String calculateGrade(double percentage) {

        int gradeKey = (int) percentage / 10;

        switch (gradeKey) {
            case 10:
            case 9:
                return "A+";
            case 8:
                return "A";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }

    static void displayResult(String name, int marks, double percentage, String grade) {

        System.out.println("Result Summary");
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);

        if (grade.equals("F")) {
            System.out.println("Status     : Fail");
        } else {
            System.out.println("Status     : Pass");
        }
    }
}
