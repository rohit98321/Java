import java.util.Scanner;

public class tcatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] names={"rohit","vivek","vishal"};

        
        try {
            System.out.println(names[3]);
            
        } catch (Exception e) {
           System.out.println(e);
        }


















        sc.close();
    }
}
