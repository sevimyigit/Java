package Day07_ternary_switchstatements;

public class C04_Ternary {
    public static void main(String[] args) {
        /* Kullanican alinan deger
           100 den buyuk ise 2 ile carpin
           100 den kucuk ise sayiya 10 ekleyin
         */

        int input = 45;

        //ifelse ile

        if (input > 100) {
            input *= 2;
        } else {
            input +=10;
        }
        System.out.println("if else ile"  +input);
        input=45;
        input=input>100 ? input*2 : input+10;
        System.out.println("ternary ile"  +input);

        /*verilen inputu inceleyin
        eger 100 den buyuk ise bu 'e bolup bolum sonucunun tek sayi olup olamdigi kontrol edin
        eger 100 den buyuk degil ise 10 ile bolumunden kalani bulup bbu kalani +5 yapin

       Bu tur komplex islemleri ternary ile yapmayiz

         */

    }
}