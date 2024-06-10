import java.util.*;
public class decimal2Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal no  ");
        int deci = sc.nextInt();

        int pos=8;//256
        while(pos>=0) {
            int bit = 1<<pos;
            
            if((deci & bit)==0) System.out.print(0);
            else System.out.print(1);

            pos--;
        }

    }
}
