package quizGenerator;

import java.util.Scanner;

public class setQs {
    Scanner scanner = new Scanner(System.in);
    String name;
    int number;
    int score;
    int scoreAfter;
    boolean withHints = false, passwordProtected = false;
    String password;
    String[] question = null;
    String[] answer = null;
    String[] hints = null;
            setQs(){
        System.out.println("-----INFO REGISTRATION-----");
        System.out.print("Hello,please enter your name : ");
        name = scanner.nextLine();
        System.out.print("How many question you wants to register? ");
        number = scanner.nextInt();
        question = new String[number];
        answer = new String[number];
        System.out.print("Do you wants to register with hints?(yes/no) ");
        scanner.nextLine();
        String decision = scanner.nextLine();
        if(decision.equalsIgnoreCase("yes")) {
            withHints = true;
            hints = new String[number];
        }
        System.out.print("Each one will have how many points? ");
        score = scanner.nextInt();
        if(withHints){
            System.out.print("Each one will have how many points after the hint is taken? ");
            scoreAfter = scanner.nextInt();
        }
        System.out.print ("Wants to give any password for the quiz?(yes/no) ");
        scanner.nextLine();
        String protect = scanner.nextLine();
        if(protect.equalsIgnoreCase("yes")) passwordProtected = true;
        if(passwordProtected) {
            System.out.print("Enter password : ");
            password = scanner.nextLine();
        }
        System.out.println("Now Mr."+name+" please register the questions :");
        for(int i=0;i<number;i++){
            System.out.println("Enter question no : "+(i+1));
            question[i] = scanner.nextLine();
            System.out.println("Solution : ");
            answer[i] = scanner.nextLine();
            if(withHints) {
                System.out.println("Hint for question-" + (i + 1) + " : ");
                hints[i] = scanner.nextLine();
            }
        }
                System.out.println("Thanks for the response MR."+name+".Your response is stored.");
    }
}
