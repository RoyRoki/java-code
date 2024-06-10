import java.util.Scanner;

public class addToCart {

    public static void main(String[] args) {
        String iteams[] ={" ","Chocolate","Milk","pizza","pineapple","Mango","Barger","vegs","dall","popkon"};
        for(int i=1; i<iteams.length ; i++) {
            System.out.println(i +")"+iteams[i]);
        }
        System.out.println("Enter numbers to Add iteams//101 to ok  ");
        Scanner sc =  new Scanner(System.in);
        int addto[]=  new int[15];
        int number=0;
        for(int j=1; ;j++) {
            number = sc.nextInt();
            
            addto[j] = number;
            if(number==101) break;
            
        }
        System.out.println("iteams Are ");
        for(int j=1;j<addto.length ; j++ ) {
            if(addto[j]==101) break;
            System.out.println(j+1 +")"+iteams[addto[j]]);
        }
    }
    

}