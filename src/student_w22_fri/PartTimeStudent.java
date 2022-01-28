
package student_w22_fri;
public class PartTimeStudent extends Student{
    private int numCourse;
public PartTimeStudent(String studentId, String studentName, int numCourse){
    super(studentId, studentName);
    this.numCourse =numCourse;
}
    
    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }
    
}
