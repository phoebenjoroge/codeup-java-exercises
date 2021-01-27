import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //Question one
        long add = addition(3,5);
        System.out.println(add);
        //Question two
//        verifyUserNumber(1,20);

        //Question 3
        System.out.print("PLease enter a number between 1 and 10: ");
        Scanner input =new Scanner(System.in);
        int factorialNumber = input.nextInt();
//        factorial(factorialNumber);

        //Question 4
        System.out.print("How many sides does the Dice have? : ");
        int diceSides =input.nextInt();
        diceRoll(diceSides);
    }
    //Number 1 -Functions that perform basic arithmetic
    public static long addition(int num1, int num2) {
        return num1+ num2;
    }
    public static long subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static long multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static long division(int num1, int num2) {
        return num1 / num2;
    }
    public static long modulus(int num1, int num2) {
        return num1 % num2;
    }
//    public static long multiplicationReloaded(int num1, int num2) {
//
//        return num2;
//    }
    //Number two, Verify User input
    public static void  verifyUserNumber(int min, int max){
        Scanner input =new Scanner(System.in);
        char continueNumber ='y';


        while (continueNumber == 'y') {
            System.out.print("Enter a number between 1 and 20: ");
            int response = input.nextInt();

            if(response>= min && response <= max){
                System.out.println("you entered : " + response);
            }else{
                System.out.print("Try again, please enter a number between 1 and 20: ");
                response = input.nextInt();
            }
            System.out.print("Would you like to continue? [y/n] : ");
            continueNumber = input.next().charAt(0);

        }

    }
    // Question 3 - Create factorial of number
    public static void factorial(int num){

        String print = num + "! = ";
        int i,fact=1;
        for(i=1;i<=num;i++) {
            fact = fact * i;

//            System.out.println(fact);
        }
        System.out.println(print + fact );
    }

    //Question Four
    public static void  diceRoll(int num){
        Scanner input =new Scanner(System.in);
        char rollDice ='y';
        Random rand = new Random();
        while (rollDice == 'y') {
            if(num >=1){
                System.out.print("Roll dice: ");
                int roll = rand.nextInt(num);
                System.out.println("You rolled " + roll);
                System.out.print("Would you like to roll? [y/n] : ");
                rollDice = input.next().charAt(0);
            }

        }

    }
}
