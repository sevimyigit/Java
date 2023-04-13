package Day21_StaticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi); // 20

       //  int sayi=30; bir scopeta tanimlanan variable in yeniden tanimlama imkani yoktur

      //  String sayi="Hasan"; data turunu yeniden tanimlamak da mumkun degildir,vunku kullanirken variable in
        //ismini yazidiginizda hangi sayi variable in kullanilacagi mechul olur

        method1();
    }

    public static void method1(){
        method2(5);
        String s="Hasan";
        System.out.println(s.toLowerCase()); //hasan
    }

    public static void method2(int s){
        s=s*s;
        System.out.println(s); // 20

    }
}
