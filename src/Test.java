import java.util.*;
// import java.util.stream.IntStream;
// import java.util.function.Function;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {
        


        // List<Integer> L = Arrays.asList(2,1,3);
        // List<String> Str = Arrays.asList("radar");

        List<Integer> Eve = Arrays.asList(10,15,8,49,25,98,98,32);

        // Stream.iterate(new int[] {0,1}, B -> new int[] {B[1],B[0]+B[1]} ).limit(10).forEach(i -> System.out.println(Arrays.toString(i)));
       
            
        long c =  Eve.stream().count();
        System.out.println(c);

        // if(c == 0){
        //     System.out.println("Empty list");
        // }

        List<Integer> Salary = Arrays.asList(2000,3000,4000);

        int A = Salary.stream().mapToInt(Integer::intValue).sum();

        System.out.println(A);
        // List<Integer> update = Salary.stream().filter(n -> n==2000).map(n -> n*2000).toList();
        // System.out.println(update);

        // Salary.stream().filter(n -> n%2 != 0).toList();

        // List<Integer> Sorted = Eve.stream().sorted(Collections.reverseOrder()).toList();

        // List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        // Map<String,Long> namesCount = names
        //                         .stream()
        //                         .collect(
        //                          Collectors.groupingBy(
        //                            Function.identity()
        //                          , Collectors.counting()
        //                          ));

        // System.out.println(namesCount);


        // int v = Eve.stream().max(Comparator.naturalOrder()).get(); ---> find the max value
        // System.out.println(v);
       
        // Set<Integer> duplicatesSet = Eve.stream()
        //         .filter(n -> Collections.frequency(Eve,n)>1).collect(Collectors.toSet()); ---> to find the dup values

        // System.out.println("Duplicate elements (Set): " + duplicatesSet);

        // int M = Eve.stream().reduce(0,(total,element)->total+element); --> sum of elements in list using streams

        // System.out.println(Sorted);
        // Eve.stream().findFirst().ifPresent(System.out::println); --> to find first
         
        // List<Integer> Fil = Eve.stream().filter(n -> n.toString().startsWith("1")).toList(); --> to filter integers starting with 1

        // List<Integer> V = L.stream().sorted().collect(Collectors.toList());

        // Collections.addAll(V);
        // System.out.println(V);
        // Collections.reverse(V);
        
        // System.out.println(V);

      


       

        
    }
    
}
