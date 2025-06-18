//  Pairs in an Array
class p12{

    public static void arrrayPair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        int []a={1,2,3,4,5};
        arrrayPair(a);
    }
}
/* 
    time complexity = O(n^2);
 */