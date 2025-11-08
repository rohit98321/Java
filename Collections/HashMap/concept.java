import java.util.*;

public class concept {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insert
        map.put("india",140);
        map.put("china",150);
        map.put("usa",50);
        map.put("russia",30);
        map.put("japan",20);
        map.put("germany",10);
        map.put("france",5);

        
        System.out.println(map);


        //remove
        map.remove("china");
        System.out.println(map);


        System.out.println(map.size());

    }
}
