
import java.util.ArrayList;

public class GPAcalculator {
    private ArrayList<Course> courses = new ArrayList<>();
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    /**
     * 
     */
    public void displayResult() {
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE  | COURSE UNIT  | GRADE | GRADE-UNIT |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        int totalQualityPoints = 0;
        int totalGradeUnits = 0;

        for (Course course : courses) {
            int gradePoint = GradingSystem.getGradePoint(course.getScore());
            int qualityPoint = course.getUnit() * gradePoint;

            totalQualityPoints += qualityPoint;
            totalGradeUnits += course.getUnit();

            System.out.printf("| %-30s | %-15d | %-6s | %-15d |%n",
                  course.getName() + " (" + course.getCode() + ")",
                  course.getUnit(),
                  getGrade(gradePoint),
                  qualityPoint);

        }

        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.println("\nYour GPA is = " + calculateGPA(totalQualityPoints, totalGradeUnits) + " to 2 decimal places.\n");
    }

    private String getGrade(int gradePoint) {
        switch (gradePoint) {
            case 5:
                return "A";
            case 4:
                return "B";
            case 3:
                return "C";
            case 2:
                return "D";
            case 1:
                return "E";
            default:
                return "F";
        }
    }

    private double calculateGPA(int totalQualityPoints, int totalGradeUnits) {
        if (totalGradeUnits == 0) {
            return 0.0;
        }
        return (double) totalQualityPoints / totalGradeUnits;
    }
}

