package HomeWorkWeek2;

public class Course {

    public Course(){
        System.out.println("Course constructor.");
    }

    public Course(int courseID, String courseName){
        this();
        this.courseID=courseID;
        this.courseName=courseName;
    }

    int courseID;
    String courseName;
}
