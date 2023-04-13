package Day15_Scope_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        int [] arr1={1,2,3}; // bu sekilde yazildiginda kac element yazildi ise onu length olarak kabul eder
        int arr2[]={4,5,6,7,8,9};

        String [] harfler=new String[4000];


        System.out.println(arr1.length); //3

        System.out.println(arr2.length); //6

        System.out.println(harfler.length); // 4000

        /*
        String de kullandiimiz harfler length () bir mothod iken
        Array deki length varible'dir arr.length
         */
        System.out.println(Arrays.toString(arr1));

    }
}
