import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] morePeople = Arrays.copyOf(people, people.length+1);
        morePeople[morePeople.length-1] = newPerson;
        return morePeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));


//        Person[] people = new Person[3];
        Person phoebe = new Person("Phoebe");
        Person pipper = new Person("Pipper");
        Person peter = new Person("Peter");

        Person[] people = {phoebe, pipper, peter};
        System.out.println(people);

        Person oneMorePerson = new Person("Perry");
        System.out.println(Arrays.toString(addPerson(people, oneMorePerson)));

    }


}