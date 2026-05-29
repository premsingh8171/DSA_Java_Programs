import java.util.*;

class Demo{
     static void towerOfHanoi(int n, String src , String helper, String dest){
        if(n==1){
            System.out.println("Move The Disk "+n+" From "+src+" to "+dest+"");
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Move The Disk "+n+" From "+src+" to "+dest+"");
        towerOfHanoi(n-1, helper, src, dest);
     }
}

class TowerOfHanoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int n = sc.nextInt();
        Demo.towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}