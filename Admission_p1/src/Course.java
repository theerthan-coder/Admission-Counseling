public class Course {
    private String courseName;
    private int seats;

    public Course(String courseName, int seats) {
        this.courseName = courseName;
        this.seats = seats;
    }

    public String getCourseName() {
        return courseName;
    }

    public boolean allotSeat() {
        if (seats > 0) {
            seats--;
            return true;
        }
        return false;
    }

    public int getRemainingSeats() {
        return seats;
    }
}