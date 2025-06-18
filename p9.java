import java.util.*;
public class p9{
    public static int largestNum(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int []a=new int[5];
        System.out.println("Enter array of 5 elements:");
        for(int i=0;i<5;i++){
            a[i]=in.nextInt();
        }
        System.out.println(largestNum(a));
        }
    }
