import java.util.*;
public class buzz {
    
    static boolean isBuzz(int n) {
        return (n%10==7 || n%7==0);
    }

    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        System.out.println(sum);
        return (sum==n);
    }
    public static void main(String[] args) {
        
        boolean checkBuzz=isBuzz(13);
        System.out.println(checkBuzz);

        boolean checkPerfect=isPerfect(28);
        System.out.println(checkPerfect);



    };
};
