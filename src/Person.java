public class Person {
    private String name;

    public void setName(String name) {
//TODO: change the name property to the passed value
        this.name =name;
    }
    public String getName() {
//TODO: return the person's name
        return this.name;
    }



    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + getName());
    }

    public static void main(String[] args) {
        Person phoebe = new Person();
        phoebe.setName("Phoebe");
        System.out.println(phoebe.getName());


    }

}