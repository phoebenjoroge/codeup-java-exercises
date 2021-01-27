import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        randomNumber();

    }

    public static String randomNumber(){
        Random rand = new Random();
        Scanner input =new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100 : ");
        int userNumber = input.nextInt();
        int randomNumber = rand.nextInt(100);
        System.out.println(randomNumber);
            if(userNumber == randomNumber){
                System.out.println("GOOD  GUESS");
                return "Game over, you won!";
            }else if(userNumber > randomNumber){
                System.out.println("LOWER");
            }else if(userNumber < randomNumber){
                System.out.println("HIGHER");
            }
            return randomNumber();

    }
}
