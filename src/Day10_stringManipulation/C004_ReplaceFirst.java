package Day10_stringManipulation;

public class C004_ReplaceFirst {
    public static void main(String[] args) {

        String str= "Java heyecandir";
        // eger tum a'lari degil de sadece ilk a'yi degistirmek isterseniz
        System.out.println(str.replaceFirst("a", "A"));// JAva heyecandir
        // ilk harf veya rakami * yap
        System.out.println(str.replaceFirst("\\w", "*"));
    }
}
