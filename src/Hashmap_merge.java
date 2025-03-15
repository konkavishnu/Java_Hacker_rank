import java.util.*;
import java.util.stream.Collectors;

public class Hashmap_merge {

    

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        
        
        map.put("list1", new ArrayList<>(Arrays.asList(1, 2, 3)));
        map.put("list2", new ArrayList<>(Arrays.asList(4, 5, 6)));

       

        ArrayList<Integer> combinedList = 
        new ArrayList<>(map.values().stream().flatMap(List::stream).collect(Collectors.toList()));

        List<String> combined_key = map.keySet().stream().collect(Collectors.toList());


        
        

        System.out.println("Combined List: " + combinedList);

        String v ="Vishnu";
        
        StringBuilder sb = new StringBuilder(v);
        sb.reverse();
        System.out.println(sb);
    }
}
    

