class Demo{
    int x,y;
    void f(){

    }

    Demo(int a,int b){

        System.out.println("contructor has called here");
        x=a;
        y=b;
        System.out.println(x +" "+ y);
    }

   
}



public class constructore {
    public static void main(String[] args) {
        Demo d1= new Demo(0,0);
        
    }



}
