import java.util.*;

class LenearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int t, i , n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+ n + " elements:");
        for(i=0; i<n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();

        int index = -1;

        for(i=0; i<n; i++){
            if(a[i] == key){
                index = i;
                break;
            }
        } 
    
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + index);

    }
}