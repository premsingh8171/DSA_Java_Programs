import java.util.*;

class Demo {
    static void swap(int a, int b) {
        System.out.println("Before swapping a = " + a + " and b = " + b);
        
        //Logic 1
        // int temp = a;
        // a = b;
        // b = temp;

        //Login2
        // a= a+b;
        // b= a-b;
        // a= a-b;

        //Logic 3
        // a = a*b; 
        // b = a/b; 
        // a = a/b; 

        //Logic 4
        // a = a^b;
        // b = a^b;
        // a = a^b;

        // Logic 5
         a = a+b - (b = a);
        
        System.out.println("After swapping a = " + a + " and b = " + b);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int a = sc.nextInt();

        System.out.println("Enter b value");
        int b = sc.nextInt();

        Demo.swap(a, b);
    }
}