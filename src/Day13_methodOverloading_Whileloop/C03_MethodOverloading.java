package Day13_methodOverloading_Whileloop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3);//11.7
        toplama('a','b'); //195.0 in ve double methodu calisir

        //ilk olarak yuzde yuz uyumlu parametreleri arar
        //%100 uyumlu yoksa calisabilecek method varmi diye kontrol eder
        //calisacak method birden fazla olursa , min. casting yaparak kullanabilecegini tercih eder

        toplama(8.4,6);// double ve double methodu calisir 14.4
    }

    public static void toplama(int sayi2 , double sayi1){

        System.out.println("int ve double toplami:" + (sayi2+sayi1));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("double ve double toplami:" + (sayi1+sayi2));
    }
}
