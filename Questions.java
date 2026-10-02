import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Questions{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ai="";

      
        int Choose;
        //start 
        
        System.out.print("Hello, User :) ");
        sc.nextLine();
        System.out.print("This is Quiz game");
        sc.nextLine();
        System.out.print("In this quiz you will get points with correct answers but also have to do dare on the wrong answers.");
        sc.nextLine();
        System.out.println("If you want to play the game");
        System.out.print("Press enter to continue: ");
        sc.nextLine();
  

    System.out.print("Okay, Let's go");
    sc.nextLine();
    System.out.println("Each question take two points and there are totol of 5 questions.");
    System.out.print("Select any one number from these: ");
    System.out.print("1. MAths    2.Java   3.General  ");
      Choose=sc.nextInt();
        
    switch(Choose){
        case 1: 
                Nextpage.mathsQuiz();
                break;
        case 2:
               Nextpage.javaQuiz();
               break;
        case 3:
              Nextpage.generalQuiz();
              break;
        default: 
            System.out.println("You dummy enter the wrong key , oops sorry but now try again from the start selecting from the above options.");

    }

}
}