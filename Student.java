/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCource = 600;
    private static int id = 1001;
    
    // Constructor promt uset to enter name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("1 - First Year\n2 - Second Year\n3 - Third Year \n4 - Fourth Year\n Enther class your in: ");
        this.gradeYear = in.nextLine();
        
        setStudentID();
        
    }
    
    // generate an ID
    private void setStudentID() {
        // Grade level + id
        id++;
        this.studentID = gradeYear + "" + id;
    }
    
    // Enrole courses
    public void enroll() {
        // Get inside loop when user hits 0
        do {
        System.out.print("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (!course.equals("Q")) {
            courses = courses + "\n " + course;
            tuitionBalance = tuitionBalance + costOfCource;
            }
        else { break; }
        } while (1 != 0);
    }
    
    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    
    // Pay tution
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }
    
    // Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName + 
                "\nStudent Year: " + gradeYear + 
                "\nStudent ID " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
