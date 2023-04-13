package Day09_StringManipulations;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str="Java ile kodlama cok kolay";
        System.out.println(str.length());

        // str "cok" iceriyor mu ?

        System.out.println(str.contains("cok")); // true

        //kullanicidan aldigimiz cumle "cok"  ile baslayan ilk kelimeyi yazdrin.

        System.out.println(str.endsWith("cok")); // false
        System.out.println(str.startsWith("cok")); // false
        System.out.println(str.indexOf('a')); //1
        System.out.println(str.indexOf("v")); //2

        System.out.println(str.indexOf("cok")); //17

        System.out.println(str.indexOf("a",5)); //13

        //2. O nun indexini buluun
        //once ilk onun indexini buluruz
        //sonra o indexten sonrasinda ikinci o yu aratiriz

       int ilkOindexi= str.indexOf("o"); // 10
       int ikinciOindexi =str.indexOf("o",ilkOindexi+1) ;

        System.out.println(ilkOindexi +" "+ikinciOindexi);


    }
}
