// ......Prime Number.....
import java.util.*;
public class p3a{
    public static boolean isPrime(int num){
        if(num==2)
            return true;
        if(num==1)
            return false;
        for(int i=2;i<=num-1;i++){
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