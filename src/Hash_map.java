import java.util.*;

public class Hash_map {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Integer> M1 = new HashMap<>();

        

        int Num_person = sc.nextInt();

        for (int i = 1 ; i <= Num_person ; i++) {

            String S = sc.nextLine();
            sc.nextLine();;
            int V = sc.nextInt();

            M1.put(S,V); 

            System.out.println(M1);
        }
        for (int K = 1 ; K <= Num_person ; K++) {

            String l = sc.next();

            if(M1.containsKey(l)) {
                System.out.println(l+"="+M1.get(l));
            }
            else {
                System.out.println("Not found");
            } 
        }

        sc.close();

    }
    
}
