import java.util.*;

public class AdditionOfTwoMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //fist matrix A
        System.out.println("Enter matrix A row size:");
        int rsize1 = sc.nextInt();
        System.out.println("Enter matrix A column size:");
        int csize1 = sc.nextInt();
            
        //second matrix B
        System.out.println("Enter matrix B row size:");
        int rsize2 = sc.nextInt();
        System.out.println("Enter matrix B column size:");
        int csize2 = sc.nextInt();

        if (rsize1 == rsize2 && csize1 == csize2) 
        {

        int i,j;
        int a[][] = new int[rsize1][csize1];
        int b[][] = new int[rsize2][csize2];
        int c[][] = new int[rsize1][csize1];

        System.out.println("Enter matrix A element one-by-one :");

       
        for( i=0; i<rsize1; i++){
            for( j=0; j<csize1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A elements are:");
        for( i=0; i<rsize1; i++){
            for( j=0; j<csize1; j++){
                System.out.print(a[i][j]+ "["+ i + " "+ j +"]" + " ");
            }
            System.out.println();
        }
    
        System.out.println("Enter matrix B element one-by-one :");
        for( i=0; i<rsize2; i++){
            for( j=0; j<csize2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix B elements are:");
        for( i=0; i<rsize2; i++){
            for( j=0; j<csize2; j++){
                System.out.print(b[i][j]+ "["+ i + " "+ j +"]" + " ");
            }
            System.out.println();
        }

        // Perform addition
        for( i=0; i<rsize1; i++){
            for( j=0; j<csize1; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display the result
        System.out.println("Resultant matrix C is:");
        for( i=0; i<rsize1; i++){
            for( j=0; j<csize1; j++){
                System.out.print(c[i][j]+ "["+ i + " "+ j +"]" + " ");
            }
            System.out.println();
        }
        
        } else {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
        }
    
    }
}