package Day21_StaticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {

        int[] arr={3,6,8};

        //bir method olusturun
        //methoda array 5 elementli bir array atayin
        //ve yazdirin
        //main methoda donduktan sonra yine arr yazdirin

        arrayiDegistir(arr);

        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]
    }


    public static void arrayiDegistir(int [] b){
        b=new int[5];
        System.out.println(Arrays.toString(b)); //[3, 6, 8]
    }
}
