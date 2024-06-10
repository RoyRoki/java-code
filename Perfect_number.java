/*1+2=3
 * 3 is prime
 * 2*3=6
 * 
 * 1+2+4=7
 * 7 is prime
 * 4*7=28
 * 
 * 1+2+4+8=15 X
 * 
 */
public class Perfect_number {
    public static long n = 2;
    public static long sum = 1;
    
    public static boolean isprime(long sum) {
        for (long i = 2; i < sum / 2; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getSum() {
        if (sum > 1000000000) {
    
            return;
        }
        sum = sum + n;
        if (isprime(sum)) {
            System.out.println(n * sum);
            n = n * 2;
            getSum();
        }
        n = n * 2;
        getSum();
    }

    public static void main(String[] args) {
        getSum();
    }
}
