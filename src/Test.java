import java.util.*;
import java.util.stream.Collectors;
// import java.util.stream.IntStream;
// import java.util.function.Function;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
import java.util.stream.Stream;

public class Test {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        


        // List<Integer> L = Arrays.asList(2,1,3);
        // List<String> Str = Arrays.asList("radar");

        String A = "Vishnu";

        String reversed = A.chars().mapToObj(c -> (char)c).reduce("",(s,c) -> c+s , (s1,s2) -> s2+s1);

        System.out.println(reversed);

        List<Integer> Eve = Arrays.asList(10,15,8,49,25,98,98,32);

        double out = Eve.stream().mapToInt(Integer:: intValue).sum(); // --> to find sum
        double out1 = Eve.stream().mapToInt(Integer:: intValue).average().orElse(0); // -> to find average.

        int out5 = Eve.stream().mapToInt(Integer:: intValue).max().orElse(0);

        System.out.println(out1);
        System.out.println("MAX VALUE IS : "+ out5);


        String SD = "Vishnu";
        String CD = "Vardhan";

        String Fi = SD.concat(CD);



        // Stream.iterate(new int[] {0,1}, B -> new int[] {B[1],B[0]+B[1]} ).limit(10).forEach(i -> System.out.println(Arrays.toString(i)));
       
            
        long c =  Eve.stream().count();
        System.out.println(c);
      

        // if(c == 0){
        //     System.out.println("Empty list");
        // }

        // Set <String> fun = new HashSet<>();
        

        List<Integer> Salary = Arrays.asList(2000,3000,4000);

        List<Integer> asc = Salary.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<Integer> desc = Salary.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(desc);

        System.out.println(asc);

        List<Integer> comb = Stream.concat(Salary.stream(), Eve.stream()).collect(Collectors.toList());

        System.out.println(comb);

        boolean i = Salary.stream().allMatch(n -> (n%2==0));

        System.out.println(i);
        

        int Sal = Salary.stream().mapToInt(Integer::intValue).sum();

        System.out.println(Sal);
        List<Integer> update = Salary.stream().filter(n -> n==2000).map(n -> n*2000).collect(Collectors.toList());
        System.out.println(update);

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
