// optimised prime number
import java.util.*;
public class p3b{
    public static boolean isPrime(int num){
        if (num <= 1) return false; //0 and 1 are not prime
        if (num == 2) return true; // 2 is the only even prime
        if (num % 2 == 0) return false;  // eliminate even numbers
        for(int i=2;i<= Math.sqrt(num);i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(isPrime(n));
        
    }
}