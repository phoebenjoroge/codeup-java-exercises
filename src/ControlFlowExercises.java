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
        for(int f=1; f<=100; f++){
            if(f%15 ==0){
                System.out.println("FizzBuzz");
            }else if(f%5==0){
                System.out.println("Buzz");
            }else if(f%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(f);
            }
        }
    }
}
