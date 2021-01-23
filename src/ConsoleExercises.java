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
//        System.out.print("Please enter a three word sentence: ");
//        String wordOne =input.next();
//        String wordTwo =input.next();
//        String wordThree =input.next();
//        System.out.println("You entered: \n" +wordOne + "\n" +wordTwo + "\n" + wordThree + "\n");
        //What happens if you enter less than 3 words? - The program will not terminate as it will expect and wait for a third input
        //What happens if you enter more than 3 words? - The program will only read and write the first three words

        // Question 3 TO DO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.print("Please enter a  sentence: ");
//        String userSentence =input.next();
//        System.out.println("Your Sentence is: " +userSentence);
        //do you capture all the words? - no, because next only captures all the character till space

        //Question 4 TO DO: Rewrite the above example using the nextLine method.
//        System.out.print("Please enter a  sentence: ");
//        String userSentence2 =input.nextLine();
//        System.out.println("Your Sentence is: " +userSentence2);

        //Calculate the perimeter and area of Codeup's classrooms.
        /*Question 1 TO DO: Prompt the user to enter values of length and width of a classroom at Codeup.
        Use the nextLine method to get user input and parse the resulting string to a numeric type.
        Assume that the rooms are perfect rectangles.
        Assume that the user will enter valid numeric data for length and width.
        * */
//        System.out.println("Please enter the length and width of room: ");
//        String length= input.next();
//        String width= input.next();
//        float intLength = Float.parseFloat(length);
//        float intWidth = Float.parseFloat(width);
//
//        System.out.println( intLength);
//        System.out.println(intWidth);

        //Question 2: Display the area and perimeter of that classroom.
//        float area = intLength * intWidth;
//        float perimeter = 2 *(intLength + intWidth);
//        System.out.println("The area of the room is: " + area + "\nThe Perimeter of the room is: " +perimeter);

        //Bonus In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
        System.out.println("Please enter the length, width and height of room: ");
        String length2= input.next();
        String width2= input.next();
        String height2= input.next();
        float intLength2 = Float.parseFloat(length2);
        float intWidth2 = Float.parseFloat(width2);
        float intHeight2 = Float.parseFloat(height2);
        float volume = intLength2 * intWidth2 *intHeight2;
        System.out.println("The volume of the room is: " +volume);

    }
}
