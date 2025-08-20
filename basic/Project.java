import java.util.*;

public class Project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int ranNum=(int)(Math.floor(Math.random()*100));
        System.out.println("--> ");
       

            int userNum=0;
            int turn=0;


        do{     

                if(userNum == 0){

                    System.out.println("guess the number");
                 }else System.out.println("guess the number again");


                 turn++;

                userNum=sc.nextInt();
                if(userNum == ranNum){
                    System.out.println("wow its the number");
                    break;
                }
                else if(userNum<ranNum){
                    System.out.println("oh no Number may be bigger");
                }
                else{
                    System.out.println("oh no Number may be smaller");
                }



        }while(userNum >= 0);

        System.out.println("you take " + turn + " times");
        



    }   
}
