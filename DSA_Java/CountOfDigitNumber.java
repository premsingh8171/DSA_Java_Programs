import java.util.*;

class Demo {

    static int c = 0;
    static int count(int n){
        if(n!=0){
            c++;
            count(n/10);
        }
        return (c!=0)?c:1;
        //return c;
    }
}

class CountOfDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Count of digits in the number is: " + Demo.count(n));
    }
}