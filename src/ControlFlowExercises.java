import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;

        //Question 1: WHILE Loop
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        //Question 1B: DO WHILE loop
//        int x=2;
//        do{
//            System.out.println(x);
//            x+=2;
//        }while(x<=100);
        //do-while 2
//        int y=100;
//        do{
//            System.out.println(y);
//            y-=5;
//        }while(y>=-10);
        //do while-3
//        double z=2;
//        do{
//            System.out.println(z);
//            z = Math.pow(z, 2);
//        }while(z<=1000000);
//
//        // Question 1C
//        for(int a =2; a<=100; a+=2){
//            System.out.println(a);
//        }
//        for(int b =100; b>=-10; b-=5){
//            System.out.println(b);
//        }
//        for(double c=2; c<=1000000; c*=c){
//            System.out.println(c);
//        }
        //Question 3 -FizzBuzz
//        for(int f=1; f<=100; f++){
//            if(f%15 ==0){
//                System.out.println("FizzBuzz");
//            }else if(f%5==0){
//                System.out.println("Buzz");
//            }else if(f%3==0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(f);
//            }
//        }
        //Question 3 -Power


        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int num1 = input.nextInt();
//        squareCubed(num1);
//
//        boolean play = true;
//        System.out.print("Would you like to continue? [y/n]: ");
//        char answer = input.next().charAt(0);
//
//        while (play==true && answer=='y') {
//
//            if (answer == 'y') {
//                System.out.print("Enter another integer: ");
//                int num2 = input.nextInt();
//                squareCubed(num2);
//            }
//            System.out.print("Would you like to continue? [y/n]: ");
//            answer = input.next().charAt(0);
//        }
        //Question 4 -Grades
        System.out.print("Please enter grade between 0-100: ");
        int grade = input.nextInt();
        char continueGrade ='y';

        while (grade >0 && continueGrade=='y') {

            if (grade<100 && grade>=88) {
                System.out.println("Grade is an A");
            }else if(grade<88 && grade>=80){
                System.out.println("Grade is  B");
            }else if(grade<80 && grade>=67){
                System.out.println("Grade is C");
            }else if(grade<67 && grade>=60){
                System.out.println("Grade is D");
            }else
                System.out.print("Grade is F");

            System.out.print("Would you like to enter another grade? [y/n]: ");
            continueGrade = input.next().charAt(0);

            System.out.print("Please enter grade between 0-100: ");
            grade = input.nextInt();
        }

    }

    public static int squareCubed(int num) {
        System.out.println("number | Squared | Cubed ");
        System.out.println("------ | ------- | ----- ");
        for (int g = 1; g <= num; g++) {
            System.out.println(g + "   | " + (g * g) + "    | " + (Math.pow(g, 3)));
        }
        return num;
    }
}
