public class AdmissionSystem {

    public static void allotCourses(Student[] students, Course[] courses) {
        for (Student s : students) {
            for (Course c : courses) {
                if (c.allotSeat()) {
                    s.setAllottedCourse(c.getCourseName());
                    break;
                }
            }
        }
    }

    public static void showAllotment(Student[] students) {
        System.out.println("\n--- Final Allotment ---");
        for (Student s : students) {
            System.out.println(s.getName() + " (Rank: " + s.getRank() + ") -> "
                    + s.getAllottedCourse());
        }
    }
}