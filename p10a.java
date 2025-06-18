// ..................Binary Search(Iterative method)............
import java.util.*;
public class p10a{
    public static int binarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid +1 ;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int []a=new int[10];
        System.out.println("Enter array of 10 elements in sorted order:");
        for(int i=0;i<10;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter key element:");
        int key= in.nextInt();
        System.out.println(binarySearch(a,key));
        }
    }

    /*
    Best Case: O(1)
    Average Case: O(log N)
    Worst Case: O(log N)
*/
