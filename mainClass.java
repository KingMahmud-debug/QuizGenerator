package quizGenerator;

import java.util.Scanner;

public class mainClass {

    class node{
        setQs set = null;
        node next ;
        node(setQs set){
            this.set = set;
            next = null;
        }
    }
    node head = null;
    void add(setQs sett){
        node temp = head;
        if(head==null) {
            head = new node(sett);
            return;
        }
        else{
            while(temp.next!=null) temp = temp.next;
        }
        temp.next = new node(sett);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nowPlaying = true;
        mainClass main = new mainClass();
        playing play = new playing();
        System.out.println("***DESCRIPTION:IN TEACHER MODE YOU CAN SET QUESTIONS FOR YOUR STUDENTS.AND IN STUDENT MODE YOU CAN ANSWER THE QUIZ'S.***");
        System.out.println("1.Teacher Mode");
        System.out.println("2.Student Mode");
        System.out.println("3.Rulebook");
        System.out.println("4.Exit");
        while(nowPlaying){
            System.out.print("Choose your mode : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                {
                    System.out.println("***ENTERING TEACHER MODE***");
                    setQs sett = new setQs();
                    main.add(sett);
                    break;
                }
                case 2:{
                    System.out.println("***ENTERING STUDENT MODE***");
                    if(main.head==null){
                        System.out.println("There is no quiz from your teachers.You have to give the default quiz");
                        play.defaultPlaying();
                    }
                    else{
                        node temp = main.head;
                        System.out.println("You have quiz's of the following teachers : ");
                        while(temp!=null) {
                            System.out.println(temp.set.name);
                            temp = temp.next;
                        }
                        System.out.println("Want to give a default quiz or one of your teacher's quiz or wants to read the rulebook?");
                        System.out.println("1.Default");
                        System.out.println("2.Academic quiz");
                        int chc = scanner.nextInt();
                        switch (chc){
                            case 1: {
                                play.defaultPlaying();
                                break;
                            }
                            case 2:{
                                System.out.println("Enter the teacher's name whose quiz you wants to give.");
                                scanner.nextLine();
                                String name = scanner.nextLine();
                                node temp2 = main.head;
                                while(!temp2.set.name.equalsIgnoreCase(name)){
                                    temp2 = temp2.next;
                                }
                                int cnt=0;
                                String pass;
                                    if(temp2.set.passwordProtected) {
                                        do{
                                            cnt++;
                                            System.out.print("Thw quiz is password protected.Enter the password : ");
                                            pass = scanner.nextLine();
                                            if(pass.equalsIgnoreCase(temp2.set.password)) play.Quiz((temp2.set));
                                            else{
                                                System.out.println("Wrong password!"+(3-cnt)+" chances left");
                                            }
                                        }
                                        while(!pass.equalsIgnoreCase(temp2.set.password) && cnt<=3);
                                    }
                                else play.Quiz(temp2.set);
                                break;
                            }
                            default:play.defaultPlaying();
                        }
                    }
                    break;
                }
                case 3:{
                    rules rule = new rules();
                    break;
                }
                default: {
                    nowPlaying = false;
                }
            }
        }
    }
}
