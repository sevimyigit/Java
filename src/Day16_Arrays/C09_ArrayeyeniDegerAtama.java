package Day16_Arrays;

import java.util.Arrays;

public class C09_ArrayeyeniDegerAtama {
    public static void main(String[] args) {

        int [] arr1={1,2,3};
        //arr1={3,6,1,}
       // arr1={5,7,1}

     //   arr1=new int[5];

        System.out.println(Arrays.toString(arr1));

        // 12 satirdaki atama ile Java arr1 in pointerini eski array den silip new keywprord ile olusturdugumuz
        //arraye yonlendirir

        //eski elementleri de korumak istersek ne yapmaliyiz
        //o zaman atama yapmadan once yeni array i hazierlamaliyiz

        //bunun icin bos bir yeni array olusturup eski array deki elementleri yeni array e tasiyip sonra
        //atamayi yapabiliriz


       int[] temp=new int[5];

        for (int i = 0; i < arr1.length ; i++) {

            temp[i]=arr1[i];
            
        }

        System.out.println(Arrays.toString(arr1)); //[1, 2, 3]
        System.out.println(Arrays.toString(temp)); //[1, 2, 3, 0, 0]

     arr1=temp;

        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 0, 0]
        System.out.println(Arrays.toString(temp)); //[1, 2, 3, 0, 0]
    }
}
