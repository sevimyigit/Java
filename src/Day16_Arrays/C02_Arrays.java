package Day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //verilen bir string array in tum elementlerini yazdirin

        String[] isimler= {"Huseyi,", "Yusuf", "Mehmet", "Akile","Said"};

        System.out.println(Arrays.toString(isimler)); //[Huseyi,, Yusuf, Mehmet, Akile, Said]

        for (int i = 0; i < isimler.length ; i++) {
            System.out.print(isimler[i] + " ");
        }

    }
}
