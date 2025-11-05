package Logics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s1=sc.nextLine();
//        char[] s2=s1.toCharArray();
//        Map<Character,Integer> map=new LinkedHashMap<>();
//        for(int i=0; i<s2.length; i++){
//            map.put(s2[i], map.getOrDefault(s2[i],0)+1);
//        }

        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
}