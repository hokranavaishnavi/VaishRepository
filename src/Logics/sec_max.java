package Logics;

public class sec_max {
    public static void main(String[] args) {
        int[] arr={1,4,6,8};
        int max=0,sec_max=0;
        for (int i=0;i<arr.length; i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if (arr[i]>sec_max){
                sec_max=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(sec_max);

    }
}
