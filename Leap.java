import java.util.*;

public class Leap {
    public static boolean isLeapYear(int year){
        if(year %4 == 0){
            if(year%100 != 0 || year%400 == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int year=in.nextInt();
        System.out.println(isLeapYear(year));
    }
}
