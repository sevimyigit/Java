package Day12_MethodCreation;

public class C06_MethodKullanimi {
    public static void main(String[] args) {

        C03_AsalSayi.asalsayiMi(57); //false

        C04_Faktoryel.faktoryelYazdir(10); // Girilen 10 icin faktoryel : 3628800

        C04_Faktoryel.faktoryelYazdir(16); //Girilen 16 icin faktoryel : 20041891844

        System.out.println(C05_HesapMakinesi.hesapmakinasi(9.7, 6.5, '+'));  //16.2
    }
}
