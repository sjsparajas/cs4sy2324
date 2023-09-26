/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_charm_parajas_exercise.pkg4;
import java.util.Scanner;    
/**
 *
 * @author samue
 */
public class CS4_Charm_Parajas_Exercise4 {
    /**
     * @param args the command line arguments
     */
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    int firstChoice = 0; 
    int neededToWin = 3;
    Scanner mainScanner = new Scanner(System.in);
    do{
        int choice;
        do{ 
            System.out.println("\n" + "Welcome to Rock, Paper, Scissors. "
                + "Please choose an option:\n" +
                "1. Start game\n" +
                "2. Change number of rounds\n" +
                "3. Exit application");

        while(true){
            try{
                choice = Integer.parseInt(mainScanner.next());
                
                break;
            }catch (NumberFormatException n){
                System.out.println("Error Wrong data type");
            }
        }
        firstChoice = choice;
        
        if(choice > 3){
            System.out.println("ERROR! Incorrect Choice, Try Again\n");
        }
        } while (choice > 3);
        
        switch(firstChoice){
            case 1:
                int playerWins = 0, computerWins = 0, gameChoice;
                for(int i = 0; i < ((neededToWin*2)-1); i++){
                    Move rock = new Move("Rock");
                    Move paper = new Move("Paper");
                    Move scissors = new Move("Scissors");
                    Move playerMove = null;
                    Move computerMove = null;
                    rock.setStrongAgainst(scissors);
                    paper.setStrongAgainst(rock);
                    scissors.setStrongAgainst(paper);
                    do{
                    System.out.printf("This match will be first to %d wins.%n" +
                        "The computer has selected its move. Select your move:%n" +
                        "1. Rock%n" +
                        "2. Paper%n" +
                        "3. Scissors%n", neededToWin);  
                        while(true){
                            try{
                                gameChoice = Integer.parseInt(mainScanner.next());

                                break;
                            }catch (NumberFormatException n){
                                System.out.println("Error Wrong Data Type");
                            }
                        }
                    System.out.printf("> %d%n", gameChoice);
                    if(gameChoice > 3){
                        System.out.println("ERROR! Incorrect Choice, Try Again\n");
                    }
                    } while (gameChoice > 3);   
                    
                    switch(gameChoice){
                        case 1:
                            playerMove = rock;
                            break;
                        case 2:
                            playerMove = paper;
                            break;
                        default:
                            playerMove = scissors;
                    }
                    int random = (int) Math.floor(Math.random()*3) + 1;
                    
                    switch(random){
                        case 1:
                            computerMove = rock;
                            break;
                        case 2:
                            computerMove = paper;
                            break;
                        default:
                            computerMove = scissors;
                    }
                    int score = Move.compareMoves(playerMove, computerMove);
                    if (playerMove.equals(computerMove))
                        score = 2;
                    switch(score){
                        case 2:
                            System.out.println("Player chose " + playerMove.getName() + 
                            ". Computer chose "  + computerMove.getName() + ". Draw No Wins No Losses\n");
                        break;
                        case 1:
                        computerWins++;
                        System.out.println("Player chose " + playerMove.getName() + 
                            ". Computer chose "  + computerMove.getName() + 
                            ". Computer wins round!\n" );
                        break;
                        case 0:
                        playerWins++;
                        System.out.println("Player chose " + playerMove.getName() + 
                            ". Computer chose "  + computerMove.getName() + 
                            ". Player wins round!\n" );
                        break;
                    }
                    System.out.printf("Player: %d - Computer: %d%n%n", playerWins, computerWins);
                    if(playerWins == neededToWin){
                        System.out.println("Player Wins!");
                        i = ((neededToWin*2)-1);
                    } 
                    if (computerWins == neededToWin){
                        System.out.println("Computer Wins!");
                        i = ((neededToWin*2)-1);
                    }
                }
                break;
            case 2:
                System.out.println("How many wins are needed to win a match?");
                    while(true){
                        try{
                            neededToWin = Integer.parseInt(mainScanner.next());

                            break;
                        }catch (NumberFormatException n){
                            System.out.println("Error Wrong Data Type");
                        }
                    }
                System.out.printf("> %d%n", neededToWin);
                break;
            default:
                System.out.println("Thank you for playing!");
        }
     } while (firstChoice != 3);

    }
    
}
