import java.util.*;
class p7{
    public static  void DecToBin(int decNum){
        int temp=decNum;
        int pow=0;
        int binNum=0;
        while(decNum >0){
            int rem = decNum%2;
            binNum=binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum /= 2;
        }
        System.out.println("Decimal number "+ temp+" in binary  is "+binNum);
    }
    public static void main(String args[]){
        DecToBin(7);
        
    }
}