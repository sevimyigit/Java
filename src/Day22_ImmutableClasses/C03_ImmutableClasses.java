package Day22_ImmutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java";

       str= str.replace("J" ,"H");

        System.out.println(str); //Hava


        //Asagidaki kod calisirsa Java kac obje olusturur ?

        String a="ABC"; //obje 1
        for (int i = 0; i <10 ; i++) {
            a=a+ i;

        } // 10 tane obje
        System.out.println(a); // ABC0123456789

    }

    //toplamda 11 obje olustu
}
