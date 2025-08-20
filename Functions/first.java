import java.util.Scanner;

public class first {

    public static void printhello(String name){
        System.out.println("hello" + name);
    }

    public static void sum(int a , int b) {

        int sum=a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sum(5,5);
       
       
       
        sc.close();
    }
}
