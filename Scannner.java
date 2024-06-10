import java.util.*;;
public class Scannner {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
      }
      public static void leftScreen() {
        System.out.print("\033[H");
      }
      public static void clear() {
        System.out.print("\033[2J");
      }
      public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input = ");
        int x1 = sc.nextInt();
        System.out.print("Input = ");
        int x2 = sc.nextInt();
        System.out.println(x1+x2);
      }
 public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
     sum();
     sc.nextLine();
     clearScreen();
     sum();
     clear();
 }
}
