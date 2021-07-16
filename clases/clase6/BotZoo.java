package clases.clase6;

import java.util.Scanner;

public class BotZoo {

    public static void welcome(){
        System.out.println("Welcome to the Zoo");
    }

    public static void menu(){
        String menu = "Which animal you want to see?\n" +
                "1. Bird\n" +
                "2. Lion\n" +
                "3. Elephant\n" +
                "4. Eagle\n" +
                "5. Ant\n" +
                "6. Dolphin.\n";
        System.out.println(menu);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isClosed = false;

        welcome();

        while(!isClosed){

            menu();

            String option = scan.nextLine();

            switch (option){

                case "1":
                    System.out.println("👀 a 🐔");
                    break;

                case "2":
                    System.out.println("👀 a 🦁");
                    break;

                case "3":
                    System.out.println("👀 a 🐘");
                    break;

                case "4":
                    System.out.println("👀 a 🦅");
                    break;

                case "5":
                    System.out.println("👀 a 🐜");
                    break;

                case "6":
                    System.out.println("👀 a 🐬");
                    break;

                case "secretclose":
                    System.out.println("Closing... 🔐");
                    isClosed = true;
                    break;

                default:
                    System.out.println("😞 We dont have that option, we're sorry.");
                    break;
            }


        }



    }
}
