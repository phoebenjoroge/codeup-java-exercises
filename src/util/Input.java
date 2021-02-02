package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner =new Scanner(System.in);

    Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        return this.scanner.nextLine();
    }
    boolean yesNo(){
        return this.scanner.nextBoolean();
    }
    int getInt(){
        return this.scanner.nextInt();
    }
    int getInt(int min, int max){
        while(true){
            int userInput = this.scanner.nextInt();
            if(userInput >= min && userInput <= max){
                return userInput;
            }
        }
    }
    double getDouble(){
        return this.scanner.nextDouble();
    }
    double getDouble(double min, double max){
        while(true){
            double userInput = this.scanner.nextDouble();
            if(userInput >= min && userInput <= max){
                return userInput;
            }
        }
    }


    public static void main(String[] args) {


    }
}
