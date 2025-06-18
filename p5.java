// Prime numbers in a range.........
class p5{
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
    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
        if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    System.out.println("");
    }
    public static void main(String args[]){
        primesInRange(16);
    }
}