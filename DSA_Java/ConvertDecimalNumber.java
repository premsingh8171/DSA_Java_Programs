import java.util.*;

class Demo{
    static int convert(int n){
        if(n==0)
        return 0;
        else 
        return (n%2 + 10 * convert(n/2));
    }
}

class ConvertDecimalNumber{
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Binary equivalent of the number is: " + Demo.convert(n));
    }
}