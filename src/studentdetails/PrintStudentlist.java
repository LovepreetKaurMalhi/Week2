/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetails;

/**
 *store and print student details
 * @author lovep
 */
public class PrintStudentlist {
    public static void main (String [] agrs){
        StudentDetails [] list = new StudentDetails[5];
        StudentDetails s1 = new StudentDetails();
        s1.setName("peter");
        s1.setAge(18);
        StudentDetails s2 = new StudentDetails ();
        s2.setName("Harman");
         s2.setAge(16);
         StudentDetails s3 = new StudentDetails();
         s3.setName("john");
         s3.setAge(20);
         list[0] = s1;
         list [1] = s2;
         list [2]= s3;
         for(int i = 0; i<=list.length;i++ ){
             System.out.println ( list[i].getName() + list[i].getAge());
         }
         
        
    }
}
// THIS PROGRAM IS A DEMA FOR ARRAY OF OBJECT
// ARRAY OF OBJECT IS USED TO STORE HETROGENEUS (DIFFERENT) DATATYPE