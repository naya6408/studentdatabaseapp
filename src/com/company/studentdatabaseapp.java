package com.company;

import java.util.Scanner;

public class studentdatabaseapp {

    public static void main(String[] args) {
        System.out.println("Enter number of new students to enroll");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];

        for (int n = 0; n < numOfStudents ; n++){
            students[n] = new student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
        for (int n = 0; n < numOfStudents ; n++){
            System.out.println(students[n].toString());
        }
//        System.out.println(students[0].toString());
//        System.out.println(students[1].toString());
//        System.out.println(students[2].toString());
//        System.out.println(students[3].toString());


    }
}
