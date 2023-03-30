// import java.util.Scanner;  
import javax.swing.JOptionPane;                                  // import scanner
public class RockPaperScissors {
    public static void main(String[] args) {
        String play;
        String choice;
       
        // Scanner scan = new Scanner(System.in);   // call scanner
        
        JOptionPane.showMessageDialog(null, "Let's play Rock Paper Scissors."); //showMessageWindow
        JOptionPane.showMessageDialog(null, "When I say 'shoot', Choose: Rock, Paper, or Scissors.");

        play =
        JOptionPane.showInputDialog( "Are you ready? Write 'yes' if you are"); //store data from the user
        // String answer = scan.nextLine();   // get input
       

    if (play.equals("yes")) {

       //  System.out.println("\nGreat?");
       //  System.out.println("Rock - Paper - Scissors, shoot!");

       
        JOptionPane.showMessageDialog(null, "\nGreat!");
        JOptionPane.showMessageDialog(null, "\nRock - Paper - Scissors, shoot!");

        choice =
        JOptionPane.showInputDialog( "Your choice: ");
        
       // String yourChoice = scan.nextLine(); // get input
        String computerChoice = computerChoice();      // call function
        String result = result(choice, computerChoice); // compare results

        JOptionPane.showMessageDialog(null, "\n" + choice + computerChoice + result);
        //printResult(choice, computerChoice, result);
    

}   else {
        System.out.println("next time!");
}
       //  scan.close();
        System.exit(0);
}
    public static String computerChoice() {
        double randomNumber = Math.random() * 3;   // range: 0-2.999;
        int integer = (int)randomNumber;           // range 0-2
        switch(integer){
        case 0: return "Rock"; 
        case 1: return "Paper"; 
        case 2: return "Scissors"; 
        default: return " ";

    }
        }

    public static String result(String choice, String computerChoice) {
        String result = " ";
    if (choice.equals("Rock") && computerChoice.equals("Scissors")) {
        result = "\nYou win";
    } else if (choice.equals("Scissors") && computerChoice.equals("Rock")) {
        result = "\nYou lose";
    } else if (choice.equals("Rock") && computerChoice.equals("Paper")) {
        result = "\nYou win";
    } else if (choice.equals("Paper") && computerChoice.equals("Rock")) {
        result = "\nYou lose";
    } else if (choice.equals("Paper") && computerChoice.equals("Scissors")) {
        result = "\nYou lose";
    } else if (choice.equals("Scissors") && computerChoice.equals("Paper")) {
        result = "\nYou win";
    } else if (choice.equals(computerChoice)) {
        result = "\nIt's a tie!";
    } else {
        System.out.println("Invalid choice");
        System.exit(0);

    }         

        return result;
}
    public static void printResult(String choice, String computerChoice, String result) {
        System.out.println("\nYou chose: " + choice);
        System.out.println("\nThe computer chose: " + computerChoice);
        System.out.println(result);


    }
}
