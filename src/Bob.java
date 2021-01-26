import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Communicate with Bob : ");
        String bobCommunication = input.nextLine().trim();
        if(bobCommunication.endsWith("?")){
            System.out.println("Sure");
        }else if(bobCommunication.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(bobCommunication.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever");
        }

    }
}
