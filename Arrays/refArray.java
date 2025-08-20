import java.util.*;

public class refArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int extra=0;
        System.out.println("enter student size : ");
        int size=sc.nextInt();

        int[] marks= new int[size];
        System.out.println("enter student " + size + " marks");

        for(int i=0; i<size; i++){
            marks[i]=sc.nextInt();
        }



        System.out.println("students marks are : ");
        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }

        System.out.println("do you want to add extra students marks : yes/no");
        String choice=sc.next();


        
        if(choice.equalsIgnoreCase("yes")){
                System.out.println("enter extra student size : ");
                 extra=sc.nextInt();
        }else
        {
            System.out.println("ok");
        }


        int[] newArray= new int[size+extra];

        for(int i=0;i<size;i++){
            newArray[i]=marks[i];
        }

        System.out.println("enter extra student marks : ");
        for(int i=size;i<newArray.length;i++){
            newArray[i]=sc.nextInt();
        }


        marks=newArray;
        System.out.println("updated data");

        for(int i=0; i<marks.length ;i++){
            System.out.println(marks[i]);
        }
        

        // public static void printArray(int[] arr){
        //     for(int val : arr){
        //             System.out.print(val + " ");
        //     }

        // }

        sc.close();

    }
}
