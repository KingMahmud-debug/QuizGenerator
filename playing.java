package quizGenerator;

import java.util.Random;
import java.util.Scanner;

public class playing {
    void defaultPlaying(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        defaultQs Default = new defaultQs();
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        String[] QUESTION = null;
        String[] ANSWER = null;
        String[] HINTS = null;
        System.out.println("From what subject you want to answer the questions?(1/2/3)");
        System.out.println("1.Mathematics");
        System.out.println("2.Physics");
        System.out.println("3.General knowledge");
        int choice = scanner.nextInt();
        System.out.println("Choose your difficulty level?(1/2/3)");
        System.out.println("1.Easy(default)");
        System.out.println("2.Intermediate");
        System.out.println("3.Hard");
        int level = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:{
                defaultQs.Math question = Default.new Math();
                switch (level){
                    case 1:{
                        question= Default.new Math();
                        break;
                    }
                    case 2:{
                        question= Default.new Math("intermediate");
                        break;
                    }
                    case 3:{
                        question= Default.new Math(3);
                        break;
                    }
                    default:question = Default.new Math();
                }
                QUESTION = question.math;
                ANSWER = question.mathSl;
                HINTS = question.mathHn;
                break;
            }
            case 2:{
                defaultQs.physics question = Default.new physics();
                switch (level){
                    case 1:{
                        question= Default.new physics();
                        break;
                    }
                    case 2:{
                        question= Default.new physics("intermediate");
                        break;
                    }
                    case 3:{
                        question= Default.new physics(3);
                        break;
                    }
                    default:question = Default.new physics();
                }
                QUESTION = question.physics;
                ANSWER = question.physicsSl;
                HINTS = question.physicsHn;
                break;
            }
            case 3:{
                defaultQs.GK question= Default.new GK();
                switch (level){
                    case 1:{
                        question= Default.new GK();
                        break;
                    }
                    case 2:{
                        question= Default.new GK("intermediate");
                        break;
                    }
                    case 3:{
                        question= Default.new GK(3);
                        break;
                    }
                    default:question = Default.new GK();
                }
                QUESTION = question.gk;
                ANSWER = question.gkSl;
                HINTS = question.gkHn;
                break;
            }
            default:{
                System.out.println("INVALID CHOICE.DEFAULT (EASY) WILL CONDUCT");
            }
        }


        int score = 0,chance = 5,index =2;
        boolean isPlaying = true, wantHints = false, changeQs = true, triedOnce = false;
        while(isPlaying && chance>0){
            if(changeQs) {
                try {
                    index = random.nextInt(0,9);
                }
                catch (NullPointerException e) {
                    System.out.println("please wait");
                }
            }
            System.out.println(QUESTION[index]);
            if(!triedOnce){
                System.out.println("Do you want hint? (yes/no)");
                String hint = scanner.nextLine();
                if(hint.equalsIgnoreCase("yes")) {
                    triedOnce = true;
                    wantHints = true;
                    System.out.println(HINTS[index]);
                }
            }
            System.out.println("Now give the answer : ");
            String ans = scanner.nextLine();
            if(ans.equalsIgnoreCase(ANSWER[index])){
                if(wantHints) {
                    score += 7;
                    wantHints = false;
                    triedOnce = false;
                }
                else score+=10;
                System.out.println("CONGRATULATIONS!YOU GUESSED RIGHT.WANTS TO TRY MORE?(yes/no)");
                String play = scanner.nextLine();
                if(play.equalsIgnoreCase("no")) isPlaying = false;
            }
            else {
                chance--;
                System.out.println("You have "+chance+" remaining.Think before you answer..");
                if(chance>0){
                    System.out.println("Incorrect answer! Wants to move another question?(yes/no)");
                    String next = scanner.nextLine();
                    if(next.equalsIgnoreCase("no")) changeQs = false;
                    else{
                        changeQs = true;
                        triedOnce = false;
                    }
                }
                else{
                    System.out.println("You don't have any more chances.");
                }
            }
        }
        System.out.println(name+" your final score is : "+score);
    }
    void Quiz(setQs set){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        boolean wantHint;
        int score = 0,correct = 0;
        String[] question = set.question;
        String[] answer = set.answer;
        String[] hint = set.hints;
        String[] myAnswer = new String[question.length];
        int time = question.length;
        System.out.println("You have "+time+" questions to answer with in "+time+" minute.");
        if(hint==null){
            System.out.println("MR."+set.name+" didn't set any hint for these questions.So you have no option for hint.Best of luck.");
        }
        long maxTime = time;
        long start = System.currentTimeMillis()/1000*60;
        for(int i=0;i<question.length;i++){
            long current = System.currentTimeMillis()/1000*60;
            long timePassed = current - start;
            System.out.println("time left : "+(maxTime - timePassed)+" minute");
            if(timePassed>=maxTime) break;
            wantHint = false;
            System.out.println("Q-"+(i+1)+" : "+question[i]);
           if(hint!=null){
               System.out.print("Do you want hint for the question?(yes/no) : ");
               String hnt = scanner.nextLine();
               if(hnt.equalsIgnoreCase("yes")) wantHint = true;
               if(wantHint) System.out.println("hint for Q-"+(i+1)+" : "+hint[i]);
           }
            System.out.print("answer : ");
            String ans = scanner.nextLine();
            if(ans.equalsIgnoreCase(answer[i])){
                correct++;
                myAnswer[i] = ans+"-->correct";
                if(wantHint){
                    score+=set.scoreAfter;
                }
                else {
                    score+=set.score;
                }
            }
            else{
                myAnswer[i] = ans+"-->wrong answer.Correct answer is : "+answer[i];
            }
        }
        int mark = correct*100/ question.length;
        System.out.println("You got "+mark+" % in the quiz.");
        if(mark>80) System.out.println("Very good your response was impressive!Carry on.");
        else if(mark>60) System.out.println("Good grade.But have to work a little more");
        else if(mark>40) System.out.println("Not bad.Have to improve more.");
        else System.out.println("Bad performance.Extra class for you!!");
        System.out.println("Your paper : ");
        for(int i=0;i< question.length;i++){
            System.out.println("Q-"+(i+1)+" : "+question[i]);
            System.out.println("Ans-"+(i+1)+" : "+myAnswer[i]);
        }
        System.out.println(name+" your final score is : "+score);
    }
}
