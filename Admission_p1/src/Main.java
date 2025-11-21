public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Arun", 1),
                new Student("Keerthi", 2),
                new Student("Vikas", 3),
                new Student("Meena", 4)
        };

        Course[] courses = {
                new Course("Computer Science", 2),
                new Course("Electrical", 1),
                new Course("Mechanical", 1)
        };

        AdmissionSystem.allotCourses(students, courses);
        AdmissionSystem.showAllotment(students);
    }
}