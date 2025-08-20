import java.util.*;
public class Show {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] names=new String[5];

        for(int i=0;i<names.length;i++){

            names[i]=sc.next();

        }


        for(String val : names){

            
            System.out.println(val);
        }



        sc.close();
    }
}
