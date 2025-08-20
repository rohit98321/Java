import java.util.*;
public class vowelCons {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter a character to check vowel or consonent");

        char alphabet=sc.next().charAt(0);
        char ch =Character.toLowerCase(alphabet);

        switch (ch) {
            
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            System.out.println("its a vowel character");
            break;

           

            default:
            if( ch >= 'a'  && ch <= 'z'){
                System.out.println("it's a consonant");
            }
            else{
                System.out.println("it's not a character");
            }

            

        }
















        sc.close();
    }
}
