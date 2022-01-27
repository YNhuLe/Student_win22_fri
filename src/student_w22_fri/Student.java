/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_w22_fri;

/**
 *
 * @author lenhu
 */
public class Student {
   private String studentId;
   private String studentName;
//get: 
    public String getStudentId() {
        return studentId;
    }

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