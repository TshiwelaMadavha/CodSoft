
import java.util.Random;
import java.util.Scanner;
public class NumbeGame {

   
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random number = new Random();
        
        String playAgain;
        int min=1,max=100,maxAttempts=10,rounds=0,totalScore=0,attempts=0,userGuess;
        int targetNumber;
        
        System.out.println("Welcome to Number Game!! ");
        
        do{
         targetNumber = kb.nextInt(max-min+1)+min;
         System.out.println("Round" + (rounds +1 )+ " Guess the number between " + min +"and " + max);
         while(attempts <maxAttempts){
             System.out.println("Enter your guess for the generated number? ");}
         
         userGuess =kb.nextInt();
         attempts++;
         
         if(userGuess==targetNumber){
             System.out.println("WELL DONE!The guess number is correct in" + attempts + "attempts");
             totalScore += maxAttempts - attempts +1;
             break;
         }
         else
             if(userGuess<targetNumber)
             {
                 System.out.println("Too low.Try another number again");
             }
             else{
                 System.out.println("Too high.Try another number again");
             }
        }
       /* rounds++;
        System.out.println("Do you want to play the number game again? (Yes/No)");
        playAgain=kb.next().toLowerCase();
        
        if(!playAgain.equals("Yes")){
            System.out.println("Game over.Your total score is: " + totalScore);
            break;
        }
    }
    while(true);
    
    
}
}
