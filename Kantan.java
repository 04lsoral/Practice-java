import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

  public class Houteishiki{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
       String ln =  sc.nextLine();
       if (ln.equals("quit")) {
           break;
       }
        
        String[] abc = ln.split(",", 0);
        Double a = Double.parseDouble(abc[0]);
        Double b = Double.parseDouble(abc[1]);
        Double c = Double.parseDouble(abc[2]);

        if (a == 0) {
            System.out.println(-1*c/b);
        }
        else {
            Double x1 = -b+(Math.sqrt(Math.pow(b, 2)-4*a*c) / (2*a));
            Double x2 = -b-(Math.sqrt(Math.pow(b, 2)-4*a*c) / (2*a));
            if (x1.equals(x2)) {
                System.out.println(x1);
            }2x
            else {
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }
       
    }
}