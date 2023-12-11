public class Course {
    private String name;
    private String code;
    private int unit;
    public int getUnit() {
        return this.unit;
    }

    public String getCode() {
        return this.code;
    }

    public int getScore() {
        return this.unit;
    }

    public Course(String name, String code, int unit, int score) {
        this.name = name;
        this.code = code;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    // Additional methods if needed

    // Setters if needed
}
