class p4{
    public static void main(String args[]){
        int a=10;
        int b=30;
        a=a+(~b+1); // Equivalent to a = a - b
        b=a+b;      // Now b = (a - b) + b = a
        a=b+(~a+1); // Equivalent to a = b - a (i.e., original b)
        System.out.println(a);
        System.out.println(b);
    }
}