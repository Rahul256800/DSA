// Binary to Decimal.........
import java.util.*;
class p6{
    public static  void binToDec(int binNum){
        int temp=binNum;
        int pow=0;
        int decNum=0;
        while(binNum >0){
            int last = binNum%10;
            decNum=decNum + (last * (int)Math.pow(2,pow));
            pow++;
            binNum /= 10;
        }
        System.out.println("Bimary number "+ temp+" in decimal is "+decNum);
    }
    public static void main(String args[]){
        binToDec(1000);
        
    }
}