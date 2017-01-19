
package leaffrogproject.view;

import java.util.Scanner;
import leaffrogproject.DAO.CourseDAO;
import leaffrogproject.entity.Course;


public class CourseView {
     private Scanner Input;
    private CourseDAO courseDAO;

    public CourseView(Scanner Input, CourseDAO courseDAO) {
        this.Input = Input;
        this.courseDAO = courseDAO;
    }

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Add course");
        System.out.println("2. Show Course");
        System.out.println("3.Search by ID");
        System.out.println("4.Delete by ID");
        System.out.println("5. Exit");

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Please enter your choice[1-5]");

    }

    public void add() {
        Course std = new Course();
        System.out.println("please enter the ID");
        std.setCourseId(Input.nextInt());
        System.out.println("please enter the Course name");
        std.setCoursename(Input.next());
        System.out.println("please enter the Mentor name");
        std.setMentor(Input.next());
        System.out.println("please enter the Price");
        std.setPrice(Input.next());
      

        courseDAO.insert(std);
    }

    public void showall() {
        System.out.println("Course list");
        for (Course em : courseDAO.getAll()) {
            System.out.println(em.toString());
        }
    }

    public void searchbyId() {
        System.out.println("Get By ID");
        int id = Input.nextInt();
        System.out.println(courseDAO.getById(id).toString());
    }

    public void delete() {
        System.out.println("Delete By ID");
        int id = Input.nextInt();
        if (courseDAO.delete(id) == true) {
            System.out.println("Deleted");

        } else {
            System.out.println("ID not registered");
        }
    }

 public void controller() {

        while (true) {
            menu();
            int choice = Input.nextInt();

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
            String check = Input.next();
            if (check.equalsIgnoreCase("n")) {
               break;
            }
}
}
}
