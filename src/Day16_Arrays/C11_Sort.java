package Day16_Arrays;

import java.util.Arrays;

public class C11_Sort {
    public static void main(String[] args) {


        // verilen bir Array'i Natural Order'a gore siralayip yazdirin
        String [] isimler= {"Huseyin","Yusuf","Mehmet","Akile","Said", "Mahmut","ahmet","adnan"};

        System.out.println(Arrays.toString(isimler)); // [Huseyin, Yusuf, Mehmet, Akile, Said, Mahmut, ahmet, adnan]
        Arrays.sort(isimler);


        System.out.println(Arrays.toString(isimler));

        // [Akile, Huseyin, Mahmut, Mehmet, Said, Yusuf, adnan, ahmet]
        // Eger buyukten kucuge siralamak istersek , once sort kullanarak natural order'a gore siralar
        // sonra gecici bir array kullanarak siralamayi terse ceviririz


    }
}
