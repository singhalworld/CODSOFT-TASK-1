import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int lowernumber=1;
        int uppernumber=100;
        int maximumattempts=10;
        int roundWon=0;
        System.out.println("****Welcoming you the most exciting game ,here you can guess number****");
        
        while(true)
        {
            int trueNumber=random.nextInt(uppernumber-lowernumber+1)+lowernumber;
            int attempts=0;
            System.out.println("*******I'HAVE CHOOSE A NUMBER BETWEEN 1 TO 100*******");
            System.out.println("===========PLEASE TRY TO GUESS IT==========");
            while(attempts<maximumattempts)
            {
                System.out.print("@@@@@  PLEASE CHOOSE A NUMBER  @@@@@@");
                int userGuess=sc.nextInt();
                
                if(userGuess<lowernumber || userGuess>uppernumber)
                {
                    System.out.println("you have choose a wrong number,please guess number within the range ");
                }
                else if(userGuess==trueNumber)
                {
                    System.out.println("#*#*#*#*****Congratulations!******#*#*#*#");
                    System.out.println("YOU HAVE GUESSED THE CORRECT NUMBER:"+trueNumber);
                    roundWon++;
                    break;
                    
                }
                else if(userGuess<trueNumber)
                {
                    System.out.println("=====TOO LOW ,Try little bit heigher number====."); ;
                }
                else
                {
                    System.out.println("====TOO HIGH,Try little bit lower number=====");
                }
                attempts++;
            }
            if(attempts==maximumattempts)
            {
                System.out.println("--------Sorry you have tried anough .The correct number is ." + trueNumber);
            }
            System.out.println("%%%%%%%%----DO YOU WANTS TO PLAY AGAIN-----%%%%%%%%");
            System.out.println("SAY (YES/NO)");
            String playAgain=sc.next();
          
        if(!playAgain.equalsIgnoreCase("yes"))   
        {
            break;
        }
    
        }
        System.out.println("******GAME OVER*******");
        System.out.println("=======YOUR SCORE IS======"+roundWon);
        System.out.println("BETTER LUCK PLAY AGAIN ");
        //sc.close();
        
    }
  

    
}
