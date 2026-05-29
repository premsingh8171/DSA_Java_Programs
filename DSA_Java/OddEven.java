import java.util.*;

class Demo {

    static String OddEven(int a) {
        return (a % 2 == 0) ? "Even" : "Odd";
    }
   
}

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value");
        int a = sc.nextInt();

        System.out.println(Demo.OddEven(a));
    
    }
}