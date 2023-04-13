package Day14_WhileLoop_Scope;

public class C05_Scope {
    int sayi=10;
    static int number;
    public static void main(String[] args) {
        String mainStr="Java";
        number=10;
       // sayi=20;
       // System.out.println(method2);

    }
    public static void method1(){
        String method1Str="Guzeldir";
        number=20;
        //sayi=14;
    }
    public static void method2 (){
        String method2Str="Candir";
        number=30;
        //sayi=30;
    }

}
