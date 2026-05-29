import java.util.*;
import java.lang.Math;

class Demo{
    static int  reverse(int n, int len){
        if(n == 0){
            return 0;
        }else{
            return ((n%10) * (int)Math.pow(10, len -1)) + reverse(n/10, --len);
        }
    }
}

class Reverse{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      int len = (int)(Math.log10(n) + 1);
      System.out.println("Reversed number: " + Demo.reverse(n, len));
    }
}