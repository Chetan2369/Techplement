package ch;

import java.util.Scanner;

/**
 * quiz
 */
public class cc {
    static int count = 0;
    Scanner sc = new Scanner(System.in);

    public cc(){
    	System.out.println("What is 2 + 2?");
		System.out.println("a) 2");
		System.out.println("b) 3");
		System.out.println("c) 4");
		System.out.println("d) 5");
		
		System.out.println("What is the capital of North Carolina?");
		System.out.println("a) Raloigh");
		System.out.println("b) Durham");
		System.out.println("c) Cary");
		System.out.println("d) Winston-Salom");
		
		System.out.println("What is the fastest land animal?");
		System.out.println("a) tiger");
		System.out.println("b) Cheetah");
		System.out.println("c) Giraffe");
		System.out.println("d) Wolf");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A':
                count++;
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            default:
                System.out.println("invalid choice!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the quiz");
        System.out.println("________________________________________________");
        
        new cc();
        System.out.println("your score is : "+ count);
    }
}