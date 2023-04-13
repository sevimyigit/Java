package Day12_MethodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        //verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun
        //Bir method ancak method call yapildiginda calisir
        //methodCall icin method adi parametlere uygun argument yazilmalidir
        //Method call icerisinde yazilan variable lara argument denir

        carpyazdir(5,8); // 40
        carpyazdir(7.4,8.6); // 63.64

       //  carpyazdir("ali","veli"); argument ve paremetreler uyumlu degilse CTE olur
    }

    public static void carpyazdir(double sayi1, double sayi2){
        System.out.println(sayi1 * sayi2);


    }

}
