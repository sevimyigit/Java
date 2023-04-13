package Day12_MethodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {

        // verilen bir sayinin asal olup olmadigini true false olarak donduren
        //bir method olusturun

        //asalsayimi methodu boolean bir sonuc dondurdugunde bu methodu calistirtigimizda
        //ya direk yazdirmaliyiz
        System.out.println(asalsayiMi(34));
        //veya method call sonucu atamak icin bir variable olusturabilirim

        boolean asalmisonucu59=asalsayiMi(59);
        System.out.println("59 icin sonuc :" +asalmisonucu59); //true

    }
    public static boolean asalsayiMi(int input){
        boolean asalsayiMi=true;

        for (int i =2; i <input-1 ; i++) {
            if(input%i==0){ //eger burasu calisirsa asal sayi degil
            asalsayiMi=false;
            break;
        }
    }

        return asalsayiMi;
}}
