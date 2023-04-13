package Day28_Exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {

        String str="25";

        //str'a sayisal olarak 5 ekleyip yazdirin

        System.out.println(Integer.parseInt(str)+5);

        //eger str icinde sayi olmayan bir karakter olursa NumberFormatException olur

        Object sayiobj=str;

        Integer sayiInt=(Integer) sayiobj;

        System.out.println(sayiInt); //ClassCastException
    }
}
