/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_w22_fri;
import java.util.Scanner;
/**
 *
 * @author lenhu
 */
public class Student_w22_fri {
    public static void main(String[] args) {
//       char[] myWord = new char[7];
//       myWord[0]='S';
//        myWord[1]='t';
//         myWord[2]='u';
//          myWord[3]='d';
//           myWord[4]='e';
//            myWord[5]='n';
//             myWord[6]='t';
//             for( int i =0; i<myWord.length; i++){
//             System.out.print(myWord[i]);
//    }
//             System.out.println(" ");
//             System.out.println("Reversing the word.....");
//    for( int i =myWord.length-1;i>=0; i--){
//        System.out.print(myWord[i]);
//        
//}}
    
Scanner in = new Scanner(System.in);

System.out.println("Pleaes enter the word: ");
String word = in.nextLine();
char[] myLetter = new char[word.length()];
for( int i =0; i<myLetter.length;i++){
 myLetter[i]=word.charAt(i); 
 System.out.print(myLetter[i] + " ");
 System.out.println(myLetter[i]);
}
}
}