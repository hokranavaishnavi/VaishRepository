package Logics;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,5,7,4,8};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
