package Day28_Exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptions {
    public static void main(String[] args) {

        //kullanicidan yasini girmesini isteyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        try {
            if (yas<0){
              throw new IllegalArgumentException("hata");
            }else {
                System.out.println("yasiniz kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
