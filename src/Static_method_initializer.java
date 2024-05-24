import java.util.Scanner;

public class Static_method_initializer {
    public static void main(String[] args) throws Exception {
        
        Scanner Inp = new Scanner(System.in);

        float x = Inp.nextFloat();
        float y = Inp.nextFloat();

       
            if(x>0 && y>0){
                float z = x*y;
                System.out.println(((int)z));
            } else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }

            Inp.close();


    }
}
