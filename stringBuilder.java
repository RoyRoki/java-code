import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sb.append("roki");
        sb.append("rini");
        sb.delete(1, 3);
        sb.setCharAt(0, 'R');
        sb.delete(4, 5);
        sb.append(name);
        System.out.println(sb);
    }
}
