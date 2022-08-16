package beginnerProject;
import java.util.Scanner;

class Game {
    
    String userPick; 
    String computerPick; 
    String result; 

    public String getComputerPick() {
        
        String computerPick;
        int randomNumber = (int)(Math.random()*3 + 1);
        
        if(randomNumber == 1){
            computerPick = "Rock";
        } else if(randomNumber == 2){
            computerPick = "Paper";
        } else {
            computerPick = "Scissors";
        }        
        return computerPick;
    }
    
    public String getUserPick() {
        
        Scanner input = new Scanner(System.in);
        String userPick;

        while (true) {
        System.out.print("Enter rock, paper or scissors: \n> ");
        userPick = input.nextLine();
        if (userPick.equals("rock") || userPick.equals("paper") || 
                userPick.equals("scissors")) {
        break;
        }
    }
    return userPick;      
    }
    
    public String getResult(String userInput, String computerChoice) {
        
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
}

public class RockPaperScissors_OOP {
    
    public static void main(String[] args) {
        Game obj = new Game();
        String userPick = obj.getUserPick();
        String computerPick = obj.getComputerPick();
        String result = obj.getResult(userPick, computerPick);
        
        System.out.println("User Pick: " + userPick);
        System.out.println("Computer Pick: " + computerPick);
        System.out.println("You " + result);
    }    
}
