package uva324;

import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author aarifin
 */
public class Uva324 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger factorial = bigFactorial(scan.nextInt());
        String string = "";
        string = string + factorial;
        int [] arr = new int [10];
        for(int x=0;x<string.length();x++) {
            char c = string.charAt(x);
            arr[c-'0']++;
        }
        for(int i = 0;i<arr.length;i++) {
            System.out.println("("+i+")\t"+arr[i]);
        }   
    }
    public static BigInteger bigFactorial(int n) {
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        for (int count = 1; count <= n; count++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        return fact;
    }  
}
