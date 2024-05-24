import java.util.Scanner;

public class Convert_to_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);

        if (s.equals(Integer.toString(n)))   {

            System.out.println("Good job");

        }else {

            System.out.println("Wrong answer");
        }
        sc.close();
        

    }
    
}
