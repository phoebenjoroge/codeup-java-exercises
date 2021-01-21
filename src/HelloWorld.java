public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //SYNTAX EXERCISE
        //Number One
        int myFavoriteNumber =12;
        System.out.println(myFavoriteNumber);
        //Number TWO
        String myString = "Hello, Phoebe";
        /*Number Three
        myString ='C';
        Reassigning a character to String gives an error and says requires String
         */
        /*Number Four
        myString = 4.14159;
        Reassigning a character to double gives an error and says requires String
        */
        //Number 5 - Gives error and says variable might not have been initialized
        long myNumber;
        //System.out.println(myNumber);
        /*Number 6 -Gives an error says requires long not double
        myNumber = 3.14;
        */
        //Number 7
        myNumber =123L;
        //Number 8 -long does not take in decimal numbers however does take in whole numbers
        myNumber =123;
        //Number 9 -says number is already defined in the scope. To reassign, myNumber needs to be casted to a float
        //float myNumber = 3.14;
        float floatingNumber =myNumber; //implicit casting
        float pi = (float) myNumber;  //Explicit casting
        //Number 10
        int x = 5;
        System.out.println("Print x++ " + x++); //Code block one post increments therefore first line prints x as is then increments x
        System.out.println("Print x " + x); //and new value of x is incremented

         x = 5;
        System.out.println("Print ++x " + ++x); //Code block two increments x then prints
        System.out.println("Print x " + x);     //therefore x remains the same as it was incremented in the previous line prior to printing

        //Number 11
        //String class = "Class"; cannot create a class variable as 'class' is a reserved word

        //Number 12
        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(o);
        //int three = (int) o; gives an error for casting String into an integer

        //Number 13
        x= 4;
        x+=5;
        System.out.println(x);

        x=3;
        int y=4;
        y *=x;
        System.out.println(y);

        x= 10;
        y=2;
        x/=y;
        System.out.println(x);
        y-=x;
        System.out.println(y);

        //Number 14 - assigning a larger numerical value than the type can hold will return the smallest value the type can hold and vice versa for a smaller assignment
        //incrementing past the type's capacity will also cause the type to loop and start from the smallest value the type can hold
        byte number = -128;
        System.out.println(--number);

    }
}
