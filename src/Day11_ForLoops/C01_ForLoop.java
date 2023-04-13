package Day11_ForLoops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        //kullanicisdan bir char alip
        //o karakterden sonra gelen 10 karakteri yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir rakam girin");
        char girilenkarakter=scan.next().charAt(0);

        for (int i = 1; i <=10; i++) {

            System.out.print((char) (girilenkarakter+i)+ " ");
        }

        }
    }

