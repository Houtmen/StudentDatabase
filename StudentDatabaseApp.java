/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseapp;

/**
 *
 * @author marti
 */
public class StudentDatabaseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.showInfo());
        // ask how many user we want to add
        
        // Create a knumber of new students
        
    }
    
}
