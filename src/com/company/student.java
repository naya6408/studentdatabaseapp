package com.company;

import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse  = 600;
    private static int id = 1000;


    // contructor set name and grad year

    public student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 for sophomore \n3 for junior \n4 for senior \n enter student level: ");
        this.gradYear = in.nextInt();
        setstudentID();

        System.out.println(firstName + " " + lastName + " grade year: " + gradYear + " " + studentID);
    }

    private void setstudentID(){
        // gradelevel + ID
        id++;
        this.studentID = gradYear + "" + id;
    }


    public void enroll(){
        do {
            System.out.println("Enter course to enroll, Q to quit: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + course + "\n";
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolled in: " + courses);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("enter how much you want to pay: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        if (payment > tuitionBalance){
            System.out.println("you are overpaying!");
        }
        else {
            tuitionBalance = tuitionBalance - payment;
            System.out.println("thank you for your payment of $" + payment);
            viewBalance();
        }
    }

    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    }


    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\n Grade level: " + gradYear +
                "\n Student ID: " + studentID +
                "\n Courses Enrolled: " + courses +
                "\n Balance: $ " + tuitionBalance;
    }


}
