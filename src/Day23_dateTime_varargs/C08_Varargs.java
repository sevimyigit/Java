package Day23_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {

        /*
        Argument olarak tam sayilar alip
        ilk argument haric geriye kalanlari topplayip bulunan toplami ilk argument ile carpip
        sonucu yazdiran bir method olusturun

        Not:nargument sayisi degisken olabilir
         */
        
        IslemYap(3,4,5,8,1,2); //60
        IslemYap(5,1);//5
        IslemYap(4);//0
        IslemYap(3,4,5,6);//45
    }

    private static void IslemYap(int ilksayi, int... geriyekalanlar) {

        int geriyeKalanlarToplami=0;

        for (int each:geriyekalanlar
             ) {
            geriyeKalanlarToplami+=each;
        }
        System.out.println(geriyeKalanlarToplami*ilksayi);
    }
}
