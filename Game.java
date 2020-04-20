import java.util.Scanner;
import java.util.Random;
public class Game{
    public static void main( String [] args){
        Scanner scanner = new  Scanner(System.in);
        Random random = new Random();
        int cpuScore= 0;
        int playerScore= 0 ;
        int counter= 0;

        while(counter == 0){
            int compChoice =random.nextInt(3);
            System.out.println("Enter 1 for rock,2 for paper and 3 for scissors");
            int playerChoice = scanner.nextInt();
            if(playerChoice == cpuScore){
                System.out.println("its a tie, no points gained ");
            } else if(playerChoice == 1){
                if(compChoice ==2){
                    System.out.println("Computer has choosen paper");
                    System.out.println("Sorry, you lost this round");
                    cpuScore++;
                    System.out.println("Computer:" + cpuScore);
                    System.out.println("Player:" + playerScore);
                }else if(compChoice==3){
                    System.out.println("Computer has choosen scissors");
                    System.out.println("You win!");
                    playerScore++;
                    System.out.println("Computer:" + cpuScore);
                    System.out.println("Player:" + playerScore);
                }
            }
            else if(playerChoice==2){
                if(compChoice==1){
                    System.out.println("Computer has choosen rock");
                    System.out.println("You win!");
                    playerScore++;
                    System.out.println("Computer:" + cpuScore);
                    System.out.println("Player:" + playerScore);
                }else if(compChoice==3){
                    System.out.println("Computer has choosen scissor");
                    System.out.println("Sorry, you lost this round");
                    cpuScore++;
                    System.out.println("Computer:" + cpuScore);
                    System.out.println("Player:" + playerScore);
                }
            }else if (playerChoice==3){
                if(compChoice==1){
                    System.out.println("Computer has choosen rock");
                    System.out.println("Sorry, you lost this round");
                    cpuScore++;
                    System.out.println("Computer:"+ cpuScore);
                    System.out.println("Player:" + playerScore);
                }else if(compChoice==2){
                    System.out.println("Computer has choosen paper");
                    System.out.println("You win!");
                    playerScore++;
                    System.out.println("Computer:" + cpuScore);
                    System.out.println("Player:" + playerScore);
                }
                
                 if(playerScore==5){
                     System.out.println("Congrats you win");
                    }
                    
                    if(cpuScore==5){{
                        System.out.println("Sorry, the computer won");
                    }

                
            
            }    
        
        }

        }
    }

}
