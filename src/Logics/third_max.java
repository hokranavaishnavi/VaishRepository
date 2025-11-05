package Logics;

public class third_max {
    public static void main(String[] args) {
        int[] arr={1,7,9,6,9,6,8};
        int max=0,sec_max=0,third=0;
        for (int i=0;i<arr.length; i++){
            if(arr[i]>max){
                third=sec_max;
                sec_max=max;
                max=arr[i];
            }
            else if (arr[i]>sec_max){
                third=sec_max;
                sec_max=arr[i];

            } else if (arr[i]>third) {
                third=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(sec_max);
        System.out.println(third);

    }
}
