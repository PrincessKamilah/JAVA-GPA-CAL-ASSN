import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GPAcalculator gpaCalculator = new GPAcalculator();

            System.out.println("Enter course details (name, code, unit, score) or type 'done' to finish:");

            while (true) {
                System.out.print("Course Name: ");
                String name = scanner.next();

                if (name.equalsIgnoreCase("done")) {
                    gpaCalculator.displayResult();
                    return;
                }

                System.out.print("Course Code: ");
                String code = scanner.next();
                
                System.out.print("Course Unit: ");
                int unit = scanner.nextInt();
                
                System.out.print("Course Score: ");
                int score = scanner.nextInt();

                Course course = new Course(name, code, unit, score);
                gpaCalculator.addCourse(course);
            }
        }
    }
}
