import java.util.*;

 class RotateLeftDemo {
    static int[] rotateLeft_TempM2(int a[], int r) {
        r = r % a.length;
        int i, n = a.length;
        int temp[] = new int[n];
        for (i = 0; i < n; i++) {
            temp[i] = a[(i + r) % n];
        }
        for (i = 0; i < n; i++) {
            a[i] = temp[i];
        }
        return a;
    }
}


public class RotateLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("Enter the number of rotations(r): ");
        int r = sc.nextInt();
        System.out.println("Before rotation: " + Arrays.toString(a));
        a = RotateLeftDemo.rotateLeft_TempM2(a, r);
        System.out.println("After rotation: " + Arrays.toString(a));
    }
}