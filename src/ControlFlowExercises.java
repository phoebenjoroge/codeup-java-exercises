public class ControlFlowExercises {
    public static void main(String[] args) {
        int i= 5;

        //Question 1: WHILE Loop
        while(i<=15){
            System.out.print(i +" ");
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
        double z=2;
        do{
            System.out.println(z);
            z = Math.pow(z, 2);
        }while(z<=1000000);
    }
}
