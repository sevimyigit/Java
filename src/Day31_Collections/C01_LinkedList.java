package Day31_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
            Colletions objeleri bir arada tutan yapilardir
            Gercek hayattaki ihtiyaclara gore Java farkli collection yapilari olsuturmustur
            Bir uygulamadan hangi collection  kullanacagimiza istedigimiz ozelliklere gore karar veririz
                 Collection temel de 3 ana gruba ayrilir ve 3 Interface ile kurallari belirlenmistir
                 -List
                 -Queue
                 -Set
             Ancak Interface'lerden obje olusturulmayacagi icin
             child class'lardan constructor kullanilir
             Burada ozellikleri belirleyen constructor degil DATA TURU olarak secilen collection'dir.

             Ornegin LinkList olustururken sececegimiz data turu ile
             Que,Deque,List veya tumunun ozelliklerini tasiyan  LinkedList 'ler olusturabiliriz.
         */


        LinkedList<String> ll1=new LinkedList<>();
        List<String> ll2= new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4= new LinkedList<>() ;


    }
}
