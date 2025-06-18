// ..............Linear Search................................
import java.util.*;
public class p8{
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int []a=new int[5];
        System.out.println("Enter array of 5 elements:");
        for(int i=0;i<5;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter key element:");
        int key= in.nextInt();
        int index=linearSearch(a,key);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is found at index: "+index);
        }
    }
}

/*Time complexity ={
    WorstCase = O(n)
    AverageCase = O(n)
    BestCase = O(1)
}*/