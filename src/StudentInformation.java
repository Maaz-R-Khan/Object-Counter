public class StudentInformation {
    private int studentID;

    private String studentName;

    public static int objectCounter = 0;
    StudentInformation() {
        studentID = 0;
        studentName = "Maaz";
        objectCounter++;
    }

    //parametric constructor - accepts input
    public void setStudentID(int studentID) {

        this.studentID  = studentID;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public void printObjectCounter() {
        System.out.println("The Current Object Counter = "  + objectCounter);
    }


}
