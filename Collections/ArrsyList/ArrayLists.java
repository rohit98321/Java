import java.util.ArrayList;
import java.util.Collections;
class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
       //add element
       list.add(0);
       list.add(2);
       list.add(3);

       System.out.println(list);

       //get

       int element=list.get(2);
       System.out.println(element);

       //add element in between
       list.add(1,20);
       System.out.println(list);


       //set element
       list.set(0,100);
       System.out.println(list);

       //delete element
       list.remove(3);
       System.out.println(list);

       //size
       int size=list.size();
       System.out.println(size);

       //loops
       System.out.println("through for loop");
       for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }

     
       
       
    }
}