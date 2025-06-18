// ......Factorioal of a Number.....
import java.util.*;
public class p1{
    public static int factorial(int num){
        int f=1;
        for(int i=2;i<=num;i++){
            f = f *i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(factorial(n));
        
    }
}