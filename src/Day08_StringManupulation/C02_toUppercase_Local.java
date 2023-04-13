package Day08_StringManupulation;

import java.util.Locale;

public class C02_toUppercase_Local {
    public static void main(String[] args) {

        String str="JAVA JANDIR";

        System.out.println(str.toUpperCase()); //java candir

        str=str.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(str);
    }
}
