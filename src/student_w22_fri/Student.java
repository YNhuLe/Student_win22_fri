/*
Author: Jenny Le
Date: Jan 28th 2022
*/
package student_w22_fri;
public class Student {
   private String studentId;
   private String studentName;
//get: 
    public String getStudentId() {
        return studentId;
    }
//heello
    public String getStudentName() {
        return studentName;
    }
//set
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    //constructor
    //"this" mean current object, specify the object's characteristics with this keyword
   public Student(String studentId, String studentName){
       this.studentId=studentId;
       this.studentName=studentName;
}
}
