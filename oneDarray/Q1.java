
//take 10 students name and print them
import java.util.*;

public class Q1 {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        String students[] = new String[10];

        System.out.println("enter 10 number of students name");

        for (int i = 0; i < students.length; i++) {

            students[i] = sc.next();
        }

        System.out.println("all students are :");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        sc.close();
    }

}
