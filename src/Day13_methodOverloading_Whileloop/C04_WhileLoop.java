package Day13_methodOverloading_Whileloop;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //Iki basamakli sayilardan 7 ile bolunebilenleri yazdirin

        for (int i = 10; i <100 ; i++) {
            if (i%7==0){
                System.out.print(i +" ");
            }

        }
        System.out.println("");

        int sayi=10;
        while (sayi<100){
            if ((sayi&7)==0){
                System.out.println(sayi+ " ");
            }
            sayi++;

        }

        //for loop ile yapilabilecek bir soruyu illa da while ile yazmak biraz zahmetli
    }
}
