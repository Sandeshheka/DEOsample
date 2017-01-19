/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffrogproject.view;

import java.util.Scanner;
import leaffrogproject.DAO.impl.CourseDAOImpl;
import leaffrogproject.DAO.impl.StudentsDAOImpl;

/**
 *
 * @author Sandesh heka
 */
public class MainView {
     private Scanner Input;
     private static CourseView cv =new CourseView(new Scanner(System.in),new CourseDAOImpl());
    private static StudentsView sv = new StudentsView(new Scanner(System.in), new StudentsDAOImpl());
     public MainView(Scanner Input) {
        this.Input = Input;
}
     public void controller(){
         while(true){
           System.out.println("Menu");
        System.out.println("1. for students");
        System.out.println("2. For Course");
                System.out.println("3. for enrollment");
        System.out.println("4. Exit");

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Please enter your choice[1-4]");
     int choice = Input.nextInt();
     
     switch(choice){
         case 1:
             sv.controller();
             break;
         case 2:
             cv.controller();
             break;
     }
      System.out.println("Do you want to continue[y/n]");
            String check = Input.next();
            if (check.equalsIgnoreCase("n")) {
                System.exit(0);
            }
     }
}
}