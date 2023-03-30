import java.util.Scanner;
import java.util.Random;

public class Casino {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to online Java Roulette!");
        System.out.println("Have you played before? Answer Y/N");
        String input1 = scan.nextLine();
            while (!(input1.equals("Y"))  && !(input1.equals("N")) && 
                   !(input1.equals("y")) && !(input1.equals("n"))) {
                  System.out.println("Invalid answer!");
                  input1 = scan.nextLine();
            }
            if (input1.equals("Y") || (input1.equals("y"))) {
                System.out.println("Good luck!");
            }        
            if (input1.equals("N") || (input1.equals("n"))) {
                System.out.println("You start off with $1000, and your goal is to cash out with as much money as possible.");
                System.out.println("Each time you cash out, your money will get sent to the high scores if it is within the top 5.");
                System.out.println("If your money goes to $0 or below, you will lose.");
                System.out.println("WARNING: Cashing out will reset the game.");
                System.out.println("You will be able to see the commands at any time, by typing 'commands'.");
                System.out.println("+--------------------------------------------------------------+");
        System.out.println("| This game is based on real-life roulette tables.             |");
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| Bet                    | Pays | Probability Win | House Edge |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Red                    | 1    | 47.37%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Black                  | 1    | 47.37%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Odd                    | 1    | 47.37%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("|Even                    | 1    | 47.37%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| 1 to 18                | 1    | 47.37%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| 19 to 36               | 1    | 47.37%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| 1 to 12                | 2    | 31.58%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| 13 to 24               | 2    | 31.58%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| 25 to 36               | 2    | 31.58%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Six line (6 numbers)   | 5    | 15.79%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| First five (5 numbers) | 6    | 13.16           | 7.89%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Corner (4 numbers)     | 8    | 10.53%          | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Street (3 numbers)     | 11   | 7.895           | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Split (2 numbers)      | 17   | 5.26%           | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("| Any one number         | 35   | 2.62%           | 5.26%      |");
        System.out.println("+------------------------+------+-----------------+------------+");
        System.out.println("SCROLL up for full instructions.");
            }
                
            
    


        scan.close();
    }
}

