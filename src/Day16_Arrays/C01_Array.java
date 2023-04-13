package Day16_Arrays;

import java.util.Arrays;

public class C01_Array {
    public static void main(String[] args) {


        String[] arr1=new String[4];

        int [] arr2={3,4,5,6,7,8};

        System.out.println(arr2[2]); //5
        System.out.println(arr1[3]); // null

       // System.out.println(arr1[8]); ArrayIndexOutOfBoundsException

        arr2[2]=15;
        arr2[0]=7;

        //tum array i yazdiralim
        System.out.println(arr2); //[I@4c203ea1

        //Array in tamamini yazdirmak isterseniz , Array classdan yardim almalisiniz

        System.out.println(Arrays.toString(arr2)); // [7, 4, 15, 6, 7, 8]
        System.out.println(Arrays.toString(arr1)); //[7, 4, 15, 6, 7, 8]

    }

}
