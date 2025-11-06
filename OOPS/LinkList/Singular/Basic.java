package LinkList.Singular;
import java.util.*;

public class Basic {

    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }

    }
    
//first node 
    Node head=null;


    public void AddFirst(String data ){

        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }

    public void AddLast(String data){

        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }

        Node currentNode=head;

        while(currentNode.next != null){
            currentNode=currentNode.next;
        }

        currentNode.next=newNode;
        



    }

    public void Display(){

        if(head==null){
            System.out.println("Empty list");
            return ;
        }
        Node currentNode=head;

        while(currentNode != null){
            System.out.println("data --> "+currentNode.data);
            currentNode=currentNode.next;
        }

        System.out.println("null");
    }
    
    public void DeleteFirst(){
       

        if(head==null){
            System.out.println("Empty");
        }

       head=head.next;


    }

    public void DeleteLast(){
        if(head==null){
            System.out.println("Empty");
            return ;
        }

        if(head.next == null ){
            head=null;
            return ;
        }

        Node secondLastNode=head;
        Node LastNode =head.next;

        while(LastNode.next != null){
            LastNode=LastNode.next;
            secondLastNode=secondLastNode.next;
        }

        secondLastNode.next=null;


    }
    public static void main(String[] args) {
        
        Basic list=new Basic();

        list.AddFirst("rohit");
        list.AddFirst("sandeep");
        list.AddLast("rohan");
        list.Display();

        list.DeleteLast();
        list.Display();
    }

}
