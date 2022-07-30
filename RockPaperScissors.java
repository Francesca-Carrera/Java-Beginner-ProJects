package beginnerProject;
import java.util.Scanner;

/* - Rock Paper Sciccosrs Game -  
Rock-scissors: rock will win (rock crushes scissors).
Rock - paper: paper wins (paper covers rock).
Scissors - paper: scissors wins (scissors cuts paper).
If both players choose the same thing, it's a draw. */

public class RockPaperScissors {

    /* First, we need to generate a random number between 1 to 3 because 
    the computer only has to choose between three options: rock, paper, and 
    scissors. 
    To accomplish this, we will be using the Math.random() method. */
    static String getComputerChoice(){
        
        int randomNumber = (int)(Math.random()*3 + 1);
        String computerChoice;
        
        /* Now, in the next stop, we will use the random number to make the 
        computer choose between either rock, paper, or scissors.
        If the random number is 1, it means the computer's pick is rock.
        If the random number is 2, it means the computer's pick is paper.
        If the random number is 3, it means the computer's pick is 
        scissors. */
        if(randomNumber == 1){
            computerChoice = "Rock";
        } else if(randomNumber == 2){
            computerChoice = "Paper";
        } else {
            computerChoice = "Scissors";
        }
        return computerChoice;
    }
    
    // Let's create a method to take user input among "rock", "paper", or 
    // "scissors".
    static String getUserInput(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rock, paper or scissors: \n> ");
        String userInput = input.nextLine();
        input.close(); 
        return userInput;
    } 
    
    /* Now let's create a method to decide whether the user won, lost or 
    draw. This method will:
    - take two arguments (the user input and computer's pick);
    - Return a string: either "win", "lose", or "draw". */
    static String getResult(String userInput, String computerChoice){
        if(userInput.equals(computerChoice)){
            return "Draw";   
        } else if(userInput.equalsIgnoreCase("Paper") 
        && computerChoice.equals("Rock")){
            return "Win";
        } else if (userInput.equalsIgnoreCase("Rock") 
        && computerChoice.equals("Scissors")) {
            return "Win";
        } else if (userInput.equalsIgnoreCase("Scissors") 
        && computerChoice.equals("Paper")) {
            return "Win";
        } else {
            return "Lose";
        }
    }
    
    public static void main(String[] args)
    {
        String userInput = getUserInput();
        String computerChoice = getComputerChoice();
        
        System.out.println("Computer choice: " + computerChoice);
        String result = (getResult(userInput, computerChoice));
        System.out.println(result);  
    }
}

/* EXAMPLE OF OUTPUT:
Enter rock, paper or scissors: 
> Rock
Computer choice: Scissors
Win  */
    
    

