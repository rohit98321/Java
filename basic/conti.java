public class conti {
    public static void main(String[] args) {
        String[] boys ={"rohit","vivek","vishal","pratit","sandeep","bibhash","baidu"};


        for(int i=0;i<boys.length;i++){

            if(boys[i] == "pratit") break;
            System.out.println(boys[i]);
        }


        for(int i=0;i<boys.length;i++){

            if(boys[i] == "pratit") continue;
            System.out.println(boys[i]);
        }
    }
}
