/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffrogproject.view;

import java.util.Scanner;
import leaffrogproject.DAO.StudentsDAO;
import leaffrogproject.entity.Students;

/**
 *
 * @author Sandesh heka
 */
public class StudentsView {

    private Scanner Sca;
    private StudentsDAO stdAO;

    public StudentsView(Scanner Sca, StudentsDAO stdAO) {
        this.Sca = Sca;
        this.stdAO = stdAO;
    }

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Add student");
        System.out.println("2. Show students");
        System.out.println("3.Search");
        System.out.println("4.Delete");
        System.out.println("5. Exit");

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Please enter your choice[1-5]");

    }

    public void add() {
        Students std = new Students();
        System.out.println("please enter the ID");
        std.setStdID(Sca.nextInt());
        System.out.println("please enter the First name");
        std.setFname(Sca.next());
        System.out.println("please enter the Last name");
        std.setLname(Sca.next());
        System.out.println("please enter the Email");
        std.setEmail(Sca.next());
        System.out.println("please enter the Contact");
        std.setContact(Sca.next());

        stdAO.insert(std);
    }

    public void showall() {
        System.out.println("Student list");
        for (Students em : stdAO.getAll()) {
            System.out.println(em.toString());
        }
    }

    public void searchbyId() {
        System.out.println("Get By ID");
        int id = Sca.nextInt();
        System.out.println(stdAO.getById(id).toString());
    }

    public void delete() {
        System.out.println("Delete By ID");
        int id = Sca.nextInt();
        if (stdAO.delete(id) == true) {
            System.out.println("Deleted");

        } else {
            System.out.println("ID not registered");
        }
    }

    public void controller() {

        while (true) {
            menu();
            int choice = Sca.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    showall();
                    break;

                case 3:
                    searchbyId();
                    break;

                case 4:
                     delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            System.out.println("Do you want to continue[y/n]");
            String check = Sca.next();
            if (check.equalsIgnoreCase("n")) {
                break;
            }

        }
    }
}
