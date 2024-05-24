import java.util.*;
import java.util.stream.Stream;

public class Array_list_filter {

    public static void main(String[] args) {

         List<String> l1 = Arrays.asList("Chennai", "pune", "Bangalore");
         List<String> l2 = Arrays.asList("Hyderabad", "pune", "Agra","Name1",null);

         listcomparison lc = new listcomparison();
         int result = lc.compareTo(l2);
         System.out.println(result);

         

         List<String> l3 = Stream.concat(l1.stream(), l2.stream()).distinct().toList(); 
         
         // Arrays.asList("Chennai", "pune", "Bangalore", "Hyderabad", "Agra", null);
         List<String> l6 = new ArrayList<>();
         for (String x : l2) {
            if(x != null){
            l6.add(x.trim());
            }
         }
         System.out.println(l6);


         Set<String> l4 = new HashSet<>();
         l4.add("Name1");

         List<String> l5 = l3.stream().filter(s -> s != null).toList();

         System.out.println(l5);

         String c = "Something";
        //  StringBuffer sb = new StringBuffer(c);
        //  sb.capacity();  
        
        System.out.println(Arrays.toString(c.split("e")));

        
    }

    public static class listcomparison implements Comparable<List<String>> {

        @Override
        public int compareTo(List<String> o ) {

            if(o.contains("pune") && o.contains("Hyderabad")) {
                return 0;   
            }
            else{
                return 1;
            }
     }
    }

    

}
