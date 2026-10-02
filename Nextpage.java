import java.util.Scanner;

public class Nextpage {
    static void mathsQuiz() {
        Scanner sc = new Scanner(System.in);
        int score=0;
        
            System.out.println("Let's start maths quiz");
            System.out.print("press enter to continue:");
            sc.nextLine(); 
            
        
        // first question
        System.out.println("1. Who was the inventor of zero?");
        System.out.println("A.Babylonians      B.Brahmagupta     C.Mayans   D.Aryabhata");
        // answer
        String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("D")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.println("Wrong!");
            sc.nextLine();
            System.out.println("As you got an easy answer wrong , now you have to do the dare");
            System.out.println("Are you ready ? , you have to do it anyway");
            sc.nextLine();
            System.out.println("Do 5 Push-Ups");
        }
        sc.nextLine();
        // second question
        System.out.println("2. Evaluate the expression: (12 - 3 x 2 + 8 /4)");
        System.out.println("A.16    B.6   C.8   D.20");
        //answer
         String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
             score=score+2;
        } else {
            System.out.println("Wrong!, are you serious ??");
            System.out.println("As you got an easy answer wrong , now you have to do the dare");
            System.out.println("Are you ready ? , you have to do it anyway");
            sc.nextLine();
            System.out.println("Pinch your cheek little hard ");
        }
        sc.nextLine();
        // Third question
        System.out.println("What is the Roman numeral for 100?");
        System.out.println("A.D     B.C    C.L   D.M");
         //answer
         String ans3 = sc.nextLine();
        if (ans3.equalsIgnoreCase("B")) {
            System.out.println("Correct!");
             score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println("As you got answer wrong , now you have to do the dare");
            //System.out.println("Are you ready ? , you have to do it anyway");
            sc.nextLine();
            System.out.println("Bark aloud atlest 3 times");
        }
        sc.nextLine();
        // forth question;
        System.out.println("Which famous sequence begins 1, 1, 2, 3, 5, 8…?");
        System.out.println(
                "A.Harmonic Sequence     B.Arithmetic Sequence    C. palindrome Sequence     D.Fibonacci Sequence");
         //answer
         String ans4 = sc.nextLine();
        if (ans4.equalsIgnoreCase("D")) {
            System.out.println("Correct!");
             score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println("It ok but you have to do the dare");
           // System.out.println("Are you ready ? , you have to do it anyway");
           sc.nextLine();
            System.out.println("There is no dare for this one ;) ");
        }
        sc.nextLine();
        // Fivth question
        System.out.println("Solve for [x]: (4x - 7 = 17)");
        System.out.println("A.4   B.5.5   C.6    D.10");
         //answer
         String ans5 = sc.nextLine();
        if (ans5.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
             score=score+2;
        } else {
            System.out.println("Wrong!");
            sc.nextLine();
            System.out.println(" now do the dare");
            sc.nextLine();
            System.out.println("Text you sibling that: I am Idiot");
        }
        sc.nextLine();
          // Final score
            System.out.println("Quiz finished!");
            System.out.println("Your score is: " + score + "/10");
    }
    

    //java
    static void javaQuiz(){

        Scanner sc = new Scanner(System.in);      
        System.out.println("Let's start Java quiz");
        System.out.print("press enter to continue:");
         sc.nextLine(); 
         int score=0;

        //first
        System.out.println("What is Java mainly known for?");
        System.out.println("A. High memory usage\r\n" + //
                           "B.Slow performance\r\n" + //
                           "C.Platform independence\r\n" + //
                           "D.Complex syntax");
        //anwer
          String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.println("Wrong!");
            sc.nextLine();
            System.out.println("As Rule, now you have to do the dare");
            System.out.println("Are you ready ?");
            sc.nextLine();
            System.out.println("stay in squard position for 5 mins");
        }
        sc.nextLine();
        //second 
        System.out.println("Which company originally developed Java?\r\n" + //
                        "\r\n" + //
                        " A.Microsoft\r\n" + //
                        " B.Google\r\n" + //
                        " C.Oracle\r\n" + //
                        " D.Sun Microsystems\r\n" + //
                        "");
        //Answer
          String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("D")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println("Now, do the dare");
            //System.out.println("Are you ready ?");
            sc.nextLine();
            System.out.println("Praise you sibling");
        }
        sc.nextLine();
        //third
        System.out.println("What does the term WORA in Java stand for?");
        System.out.println("A.Write Once, Run Anytime\r\n" + //
                           "B.Write Often, Run Anywhere\r\n" + //
                           "C.Write Once, Run Anywhere\r\n" + //
                           "D.Write Once, Read Anywhere");
        //Answer
          String ans3 = sc.nextLine();
        if (ans3.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.print("Wrong!");
            sc.nextLine();
            System.out.print("This one the easiest haiyaaaa!!,now do the dare");
            sc.nextLine();
            //System.out.println("Are you ready ?");
            System.out.print("pinch your cheek");
        }                  
        sc.nextLine();
        //fourth
        System.out.println("Which of the following correctly describes Java?");
        System.out.println("A.Java is a scripting language\r\n" + //
                           "B.Java can only run on Windows\r\n" + //
                           "C.Java is compiled and interpreted\r\n" + //
                           "D.Java is used only for game development");
        //Answer
          String ans4 = sc.nextLine();
        if (ans4.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.println("Wrong!");
           // System.out.println("now do the dare");
            System.out.print("Are you ready for the dare?");
            sc.nextLine();
            System.out.print("No dare;)");
        }                  
        sc.nextLine();
        //fivth
        System.out.println("Which one of these is not a benefit of Java?");
        System.out.println("A.Secure\r\n" + //
                           "B.Platform independent\r\n" + //
                           "C.Object-oriented\r\n" + //
                           "D.Slower execution than C");
        //Answer
           String ans5 = sc.nextLine();
        if (ans5.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println("As Rule, now you have to do the dare");
            System.out.println("Are you ready ?");
            sc.nextLine();
            System.out.println("stay in squard position for 5 mins");
        }
        sc.nextLine();
         // Final score
            System.out.println("Quiz finished!");
            System.out.println("Your score is: " + score + "/10");
                          
    }

    //General
    static void generalQuiz(){
        Scanner sc = new Scanner(System.in);       
        System.out.println("Let's start General quiz");
        System.out.print("press enter to continue:");
         sc.nextLine(); 
         int score=0;

        //first
        System.out.println("What is a word, phrase, number, or other sequence of characters that reads the same backward as forward?");
        System.out.println("A.Palindrome    B.Fibonacci   C.Arithmetic");
        //answer
         String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("A")) {
            System.out.println("Correct!");
             score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println("Here is your dare");
            sc.nextLine();
            System.out.println("Text you sibling that: I am Idiot");
        }
        sc.nextLine();
        //second
        System.out.println(" How many minutes are in a full week?");
        System.out.println("A. 1504   B.8410   C.1120   D.10,080");
         //answer
         String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("D")) {
            System.out.println("Correct!");
             score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println(" now do the dare");
            sc.nextLine();
            System.out.println("stare at object for 2 mins without blinking");
        }
        sc.nextLine();
        //third
        System.out.println("Which is the longest river in India?");
        System.out.println("A.Ganga   B.Yamuna   C.Godavari   D.Brahmaputra");
        //answer
         String ans3 = sc.nextLine();
        if (ans3.equalsIgnoreCase("A")) {
            System.out.println("Correct!");
             score=score+2;
        } else {
            System.out.println("Wrong!");
            sc.nextLine();
            System.out.println("Are you ready for dare");
            sc.nextLine();
            System.out.println("hehehe  just kidding ");
        }
        sc.nextLine();
        //fourth
        System.out.println("Which Indian state has the longest coastline?");
        System.out.println("A.Maharashtra    B.TamilNadu   C.Andhra Pradesh   D.Gujarat");
         // answer
        String ans4 = sc.nextLine();
        if (ans4.equalsIgnoreCase("D")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println("As you got an easy answer wrong , now you have to do the dare");
            sc.nextLine();
            System.out.println("Are you ready ? , you have to do it anyway");
            sc.nextLine();
            System.out.println("Do 5 Push-Ups");
        }
        sc.nextLine();
        //fifth
        System.out.println("What is the upper house of the Parliament of India called?");
        System.out.println("A.Rajay Sabha   B.Lok Sabha   C.Vidhan Sabha");
        //Answer
          String ans5 = sc.nextLine();
        if (ans5.equalsIgnoreCase("A")) {
            System.out.println("Correct!");
            score=score+2;
        } else {
            System.out.println("Wrong!");
            System.out.println("you answer wrong agian , now you have to do the dare");
           // System.out.println("Are you ready ? , you have to do it anyway");
           sc.nextLine();
            System.out.println("Go out and do checkin dance");
        }
        sc.nextLine();
        // Final score
            System.out.println("Quiz finished!");
            System.out.println("Your score is: " + score + "/10");

    }
    public static void main(String[] args) {
       mathsQuiz();
    }
}
