// A private Cab service company provides services within the city at the following rates:

// type     upto 5 km   beyond 5 km
// ac car   rs 150      10rs per km
// Non-Ac   rs 120      8rs  per km

package Questions;

import java.util.Scanner;

class CabService {

    String CarType = "";
    double distance = 0.0;
    double bill = 0.0;

    void Accept(String CarType, double distance) {
        this.CarType = CarType.toLowerCase();
        this.distance = distance;

        switch (this.CarType) {
            case "non-ac":
                if (distance <= 5)
                    bill = 120;
                else
                    bill = 120+((distance-5)*8);
                break;
            case "ac":
                if(distance<=5) bill=150;
                else bill=150+((distance-5)*10);

                break;

            default:
                System.out.println("this type of car not available");
                break;
        }

        Display();

    }

    void Display(){
        System.out.println("CarType : "+CarType.toUpperCase());
        System.out.println("total bill : "+bill);
    }

}

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String Cartype="";
        double distance=0;
        System.out.println("please enter car type Non-ac/Ac : ");
        Cartype=sc.nextLine();
        System.out.println("enter your total distance : ");
        distance=sc.nextDouble();

        CabService c1=new CabService();

        c1.Accept(Cartype, distance);


        sc.close();

    }
}
