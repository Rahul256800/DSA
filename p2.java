// ......Binomial co-efficient.....
import java.util.*;
public class p2{
    public static int factorial(int num){
        int f=1;
        for(int i=2;i<=num;i++){
            f = f *i;
        }
        return f;
    }
    public static int bcf(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int Binomial=fact_n/(fact_n*fact_nmr);
        return Binomial;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(bcf(n,r));
        
    }
}