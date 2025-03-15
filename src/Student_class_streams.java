
import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Student_class_streams {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        List<Student> list = Arrays.asList(
    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

      
        list.stream().map(Student::getDepartmantName).forEach(System.out::print);

        List <Student> ag11 = list.stream().sorted(Comparator.comparing(Student:: getAge)).collect(Collectors.toList());
     
        
    
        List <Student> ag = list.stream().sorted(Comparator.comparing(Student:: getAge).reversed()).collect(Collectors.toList());

        list.stream().sorted(Comparator.comparing(Student:: getAge).thenComparing(Student::getFirstName)).collect(Collectors.toList());

        List <Student> ag2 = list.stream().filter(n -> n.getId()>5 && n.getGender().equals("Female") ).collect(Collectors.toList());

        System.out.println(ag);

        int[] A = {1,2,3,4,5} ;


        Comparable<String> v = new Comparable<String>() {

            @Override
            public int compareTo(String name) {
                
                return 0;
            }
            
        };
    
        Consumer<String> con = new Consumer<String>() {
            public void accept (String name){
                System.out.println(name);
            }
        };

        con.accept("null");

        BiFunction<String,Integer,Integer> By = new BiFunction<String,Integer,Integer>() {

            @Override
            public Integer apply(String t, Integer u) {
                
                return 5 ;
            }
            
        };

    // System.out.println(list);


    List<Integer> numbers = Arrays.asList(123, 45, 101, 789, 12, 321);

    

        
    // List<Student> Stud_with_A = list.stream().filter(n -> n.getFirstName().startsWith("A")).toList();
    // System.out.println(Stud_with_A);

    Map<String , Integer> Sum_Of_id = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName , Collectors.summingInt(Student:: getId)));
    System.out.println("SUM OF ID =="+Sum_Of_id);    



//    List<String> A = list.stream().collect(Collections.frequency(list,n.getDepartmantName)>1);   

 


    List<Integer> numbers1 = Arrays.asList(123, 45, 101, 789, 12, 321);

  

// Sort the list such that numbers containing "1" come first
    List<Integer> sortedList = numbers1.stream()
        .sorted((n1, n2) -> {
            boolean containsOne1 = String.valueOf(n1).contains("1");
            boolean containsOne2 = String.valueOf(n2).contains("1");
            if (containsOne1 && !containsOne2) {
                return -1; // n1 comes before n2
            } else if (!containsOne1 && containsOne2) {
                return 1; // n2 comes before n1
            } else {
                return Integer.compare(n1, n2); // Keep original order
            }
        })
        .collect(Collectors.toList());

    System.out.println("Sorted list: " + sortedList);

    


        String originalString = "Hello, World!";  
        IntStream charStream = originalString.chars();  
    
        Stream<String> charStringStream = charStream.mapToObj(ch -> String.valueOf((char) ch));  
        String reversedString = charStringStream.reduce((acc, ch) -> ch + acc).orElse(""); 

   


   Map<String, Long> countStudentInEachdept = list.stream()
    .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
    System.out.println(countStudentInEachdept);

   
    

    System.out.println(countStudentInEachdept.entrySet().stream().filter(n-> n.getKey()=="Mechanical Engineering").collect(Collectors.toList()));
   
    System.out.println(countStudentInEachdept.keySet().stream().filter(n-> n =="Mechanical Engineering").collect(Collectors.toList()));




    }

    
}
