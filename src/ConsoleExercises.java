import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("%.2f%n",pi);

        Scanner input = new Scanner(System.in);
        //Question 1 TO DO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.print("Please enter an integer: ");
//        int userInt = input.nextInt();
//        System.out.println("You entered: " +userInt);
        //What happens if you input something that is not an integer? - the system throws an exception: input mismatch

        //Question 2 TO DO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.print("Please enter a three word sentence: ");
        String wordOne =input.next();
        String wordTwo =input.next();
        String wordThree =input.next();
        System.out.println("You entered: \n" +wordOne + "\n" +wordTwo + "\n" + wordThree + "\n");
        //What happens if you enter less than 3 words? - The program will not terminate as it will expect and wait for a third input
        //What happens if you enter more than 3 words? - The program will only read and write the first three words

        // Question 3 TO DO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.print("Please enter a  sentence: ");
        String userSentence =input.next();
        System.out.println("Your Sentence is: " +userSentence);
        //do you capture all the words? - no, because next only captures all the character till space

        //Question 4 TO DO: Rewrite the above example using the nextLine method.
        System.out.print("Please enter a  sentence: ");
        String userSentence2 =input.nextLine();
        System.out.println("Your Sentence is: " +userSentence2);
    }
}
