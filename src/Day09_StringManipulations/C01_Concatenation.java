package Day09_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1= "Java";
        String str2="candir";

        System.out.println(str1+""+str2); //Java Candir
        System.out.println(str1.concat(str2)); // Javacandir
        System.out.println(str1.concat("").concat(str2)); //Java Candir
    }
}
