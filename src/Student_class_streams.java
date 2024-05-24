import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student_class_streams {

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

    

    // System.out.println(list);


        
    // List<Student> Stud_with_A = list.stream().filter(n -> n.getFirstName().startsWith("A")).toList();
    // System.out.println(Stud_with_A);

    // Map<String , Integer> Sum_Of_id = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName , Collectors.summingInt(Student:: getId)));
    // System.out.println(Sum_Of_id);    



//    List<String> A = list.stream().collect(Collections.frequency(list,n.getDepartmantName)>1);   


   

   Map<String, Long> countStudentInEachdept = list.stream()
    .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
    System.out.println(countStudentInEachdept);
    

    System.out.println(countStudentInEachdept.entrySet().stream().filter(n-> n.getKey()=="Mechanical Engineering").toList());
   
    System.out.println(countStudentInEachdept.keySet().stream().filter(n-> n =="Mechanical Engineering").toList());




    }

    
}
