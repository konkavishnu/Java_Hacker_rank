import java.util.*;

public class Array_list_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the number of list needed: ");

        int n = sc.nextInt();

        // List <Integer> N = new ArrayList<Integer>();

        for(int i = 1 ; i <= n ; i++){

            System.out.println("Please Enter the number of elements for the "+ i+ " : ");

            int Size = sc.nextInt();

            List <Integer> l = new ArrayList<Integer>(Size);

            for(int k=1 ; k <= Size ; k++){

                l.add(sc.nextInt());
            }



        } 
        sc.close();
        System.out.println("Please Enter the number of elements to access: ");
        // int k = sc.nextInt();

      
        


        

    }
    
}
