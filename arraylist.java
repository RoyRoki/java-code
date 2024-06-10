import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
 public static void main(String[] args) {
    ArrayList<String>sub=new ArrayList<String>();
    ArrayList<String>name=new ArrayList<>();
    ArrayList<String>clg=new ArrayList<>();
    ArrayList<Integer>num=new ArrayList<>();
    ArrayList<ArrayList<String>>dittle=new ArrayList<>();


    sub.add("Mathamatics");
    sub.add("Geoghaphy");
    sub.add("BCA");
    sub.add("Pol.Science");
    
    name.add("Rakesh");
    name.add("Ronit");
    name.add("Roki");
    name.add("Koushik");
    
    clg.add("Vivekananda");
    clg.add("AAAACCCCC");
    clg.add("siliguri clg");
    clg.add("Birpara clg");
 
    num.add(80);
    num.add(95);
    num.add(99);
    num.add(75);
 
    dittle.add(clg);
    dittle.add(name);
    dittle.add(sub);
     
    int size =clg.size();

    for(int i=0 ; i<size;i++){
        System.out.print(clg.get(i)+"-->");
        System.out.print(name.get(i)+"-->");
        System.out.print(sub.get(i)+"-->");
        System.out.println(num.get(i));

    }



 }    
}
