import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        long add = addition(3,5);
        System.out.println(add);
        verifyUserNumber(1,20);
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
                System.out.println("Try again, please enter a number between 1 and 20 ");
                response = input.nextInt();
            }
            System.out.print("Would you like to continue? [y/n] : ");
            continueNumber = input.next().charAt(0);

        }



    }
}
