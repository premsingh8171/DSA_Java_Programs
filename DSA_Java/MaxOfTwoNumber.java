import java.util.*;
import java.lang.Math;

public class MAxOfTwoNumber {

    static int Max_version1(int a, int b) {
        return (a > b) ? a : b;
    }

    static int Max_version2(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int a = sc.nextInt();

        System.out.println("Enter b value");
        int b = sc.nextInt();

        System.out.println("Maximum of " + a + " and " + b + " is: " + Max_version1(a, b));
        System.out.println("Maximum of " + a + " and " + b + " is: " + Max_version2(a, b));

        sc.close();
    }
}