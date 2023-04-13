package Day08_StringManupulation;

public class C03_Equals {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";
        String str3=new String("Java");

        String str4="Ja";

        String str5=str4.concat("va");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str5);


        /*
        ==string icin bekledigimiz sonuclari vermeyebilir
          cunku hem metnin dgerini hem de objenin referansini karsilastirir

          Java da string objelerinin metinlerinin ayni olup olmadigini kontrol etmek icin double ==
          yerine .equals methodu kullanilmalidir
         */

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str5));
    }
}
