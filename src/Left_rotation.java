import java.util.Scanner;

public class Left_rotation {
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

        System.out.print("Enter the number of left‐rotations: ");
        int r = sc.nextInt();

        // Normalize the number of rotations
        r = r % n;
        if (r < 0) {
            // optional: allow negative meaning right‐rotation
            r += n;
        }

        if (r == 0) {
            System.out.println("Rotated array (no change):");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        int[] temp = new int[n];

        // Copy the part from index r to end into front of temp
        for (int i = 0; i < n - r; i++) {
            temp[i] = arr[i + r];
        }
        // Copy the first r elements of arr to the end of temp
        for (int i = 0; i < r; i++) {
            temp[n - r + i] = arr[i];
        }

        System.out.println("Rotated array:");
        for (int x : temp) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
