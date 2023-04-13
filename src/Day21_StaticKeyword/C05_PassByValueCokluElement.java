package Day21_StaticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {

    public static void main(String[] args) {

        int [] arr ={3,6,9,7};

        //bir moethod olusturup arr yi methoda yollayalim
        //method da array in elementleri uzerinde degisiklik yapalim ve array i ayzdiralim

        elementleriDegistir(arr);
        System.out.println(Arrays.toString(arr)); //[13, 6, 19, 7]
    }

    public static void elementleriDegistir(int[] b){
        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b)); // [13,6,19,1,7]
    }
}
