import java.util.Arrays;
import java.util.Scanner;

public class Right_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Nothing to rotate.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int r = sc.nextInt();

        // Normalize r
//        r = r % n;
//        if (r < 0) {
//            r += n;
//        }
//
//        if (r == 0) {
//            System.out.println("Rotated array (no change):");
//            for (int x : arr) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        int[] temp = new int[n];
//        for (int i = 0; i < r; i++) {
//            temp[i] = arr[n - r + i];
//        }
//        // Copy first (n-r) elements after them
//        for (int i = 0; i < n - r; i++) {
//            temp[r + i] = arr[i];
//        }

//        for(int i=0;i<n-1;i++){
//            int first=arr[0];
//            for(int j=0;j<n;j++){
//                arr[j]=arr[j+1];
//            }
//            arr[n-1]=first;
//        }

        System.out.println("Rotated array:");

        System.out.println(Arrays.toString(arr));
    }
}
