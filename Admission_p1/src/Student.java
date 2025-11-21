public class Student {
    private String name;
    private int rank;
    private String allottedCourse;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
        this.allottedCourse = "Not Allotted";
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public void setAllottedCourse(String course) {
        this.allottedCourse = course;
    }

    public String getAllottedCourse() {
        return allottedCourse;
    }
}