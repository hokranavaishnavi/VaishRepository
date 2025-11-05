package Logics;

public class Find_largest {
    public static void main(String[] args) {
        int[] arr={1,4,6,7,9,8};
        int max=arr[0];
        for (int i=0;i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
