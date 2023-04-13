package Day23_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        //verilen 2 sayiyi toplayip yazdiran bir method olusturun

        topla(5,8);
        topla(5,7,3);
        topla(8,3,2); //13
        topla(7,3,4,6);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
    System.out.println("sayilarin toplami : "+ (sayi1+sayi2+sayi3+sayi4) ); //20
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("sayilarin toplami : "+ (sayi1+sayi2+sayi3)); //15
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("sayilarin toplami : "+ (sayi1+sayi2)); //13
    }
}
