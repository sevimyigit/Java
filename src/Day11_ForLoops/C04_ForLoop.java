package Day11_ForLoops;

public class C04_ForLoop {
    public static void main(String[] args) {

        // egr sart i'nin hic bir degeri icin oluyorsa
        //input olarak verilen sayidan bire kadar tum sayilari yazdirin

        int input =-23;

        if(input>1)
        for (int i =input; i >1 ; i--) {
            System.out.print(i+" ");

        }
        else  {   for (int i =input; i >1 ; i++) {
            System.out.print(i+" ");

        }
    }
        // eger sart i'nin tum degerleri icin dogru oluyorsa

        // input olarak verilen sayidan 100'e kadar tum sayilari yazdirin

        input=10;
        System.out.println("");
        for (int i = input; i <100 ; i++) {
            System.out.print(i+" ");

        }


}}
