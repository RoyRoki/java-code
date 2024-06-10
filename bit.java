public class bit {
    public static void main(String[] args) {
        //get bit
        int n = 5;
        int pos = 1;
        int BitMask = 1<<pos;
     
         if((BitMask & n )== 0) System.out.println("0");
         else System.out.println("1");

         //set bit
         int Bitset = 1<<pos;
         int newN = n | Bitset;
         System.out.println(newN);

         //clear bit
         int clear = 1<<pos;
         newN = ~clear & newN;
         System.out.println(newN);

         


    }
}
