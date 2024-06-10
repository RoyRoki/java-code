//Tower of hanoi
import java.util.*;
public class hello {
    public static void towerOfHanoi(int n , String sou , String helper , String desti){

    if(n==1){System.out.println("transfer"+n+"from"+sou+"to"+desti);return;}
     towerOfHanoi(n - 1, sou, desti , helper );//step 2
     System.out.println("transfer"+n+"from"+sou+"to"+desti);
     towerOfHanoi(n - 1, helper, sou , desti );//step 3
    }
 public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
  System.out.print("Ender disk");
  int n = sc.nextInt();
  towerOfHanoi(n," s "," H "," D ");
 }
}