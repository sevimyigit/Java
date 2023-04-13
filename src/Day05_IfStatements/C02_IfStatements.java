package Day05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        /* basit if cumleleri kodun geri kalanindan bagimsizdir
        sadece bir sarta odaklanir o sart tru ise if body calisir
        sart false ise if body calismaz ama kod calisir

        birden fazla bagimsiz if cumlesi kullanilmissa her umle birbirinden bagimsiz
        olacagindan, bazi degerler icin tum if body leri calisirken
        bazi degerler icin hicbir if body si calismayabilir
         */

        //Kullanicdan bir sayi alip
        //Pozitif ise "pozitif sayi";
        //100 ile 999 arasinda ise (sinirlar dahil) "pozitif 3 basamakli sayi";
        //3 ile bolunebiliyorsa "3 un kati";
        //birler basamagi 7 ise "mukemmel"
        //Seceneklerinden uygun olanlari yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi>0){
            System.out.println("pozitif sayi");
        }
        if (100<=sayi &&  sayi<=999){
        System.out.println("pozitif 3 basamakli sayi");
        }
        if (sayi%3==0){
            System.out.println("3 un kati");
        }

        if (sayi%10==7 || sayi%10==-7){
            System.out.println("mukemmel");
        }
        }}
