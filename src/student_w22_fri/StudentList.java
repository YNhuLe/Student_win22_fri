/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_w22_fri;

/**
 *
 * @author lenhu
 */
public class StudentList {
    public static void main(String[] args){
     Student[] studentList = new Student[3];
     studentList[0] = new Student("s1","Nancy");
      studentList[1] = new Student("s2","Tim");
       studentList[2] = new Student("s3","John");

for( int i =0; i<studentList.length; i++){
    System.out.print(studentList[i].getStudentName() + " ");
    
    
  
    System.out.println(studentList[i].getStudentId()+ " ");
        
    }
}
}