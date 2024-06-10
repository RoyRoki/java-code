import java.util.*;

public class removeDublicate_Str {

    public static String rmDublicate(String str) {
        Set<Character>set = new HashSet<>();
        StringBuffer sbf = new StringBuffer();

        for(int i=0; i<str.length(); i++) {
            if(!set.contains(str.charAt(i))) {
             set.add(str.charAt(i));
             sbf.append(str.charAt(i));
            }
        }
        return sbf.toString();
    }
    
    public static void main(String[] args) {
        String Str="Roookki";
        System.out.println(rmDublicate(Str));
    }
}
