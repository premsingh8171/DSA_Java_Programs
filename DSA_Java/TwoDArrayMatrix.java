import java.util.*;

public class TwoDArrayMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix row size:");
        int rsize = sc.nextInt();
        System.out.println("Enter matrix column size:");
        int csize = sc.nextInt();

        int i,j, a[][] = new int[rsize][csize];
        System.out.println("Enter matrix element one-by-one :");
       
        for( i=0; i<rsize; i++){
            for( j=0; j<csize; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for( i=0; i<rsize; i++){
            for( j=0; j<csize; j++){
                System.out.print(a[i][j]+ "["+ i + " "+ j +"]" + " ");
            }
            System.out.println();
        }
    }
}