package leaffrogproject;

import java.util.Scanner;
import leaffrogproject.view.MainView;

public class LeaffrogProject {

  
    private static Scanner input = new Scanner(System.in) ;
     private static MainView mv =new MainView(new Scanner(System.in));

    public static void main(String[] args) {
        while (true) {
            mv.controller();
          
        }
    }
}
        

    
