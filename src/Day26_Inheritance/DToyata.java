package Day26_Inheritance;

public class DToyata {
    /*
        Bir objenin data turu, constructor olarak kullanilan class
        veya o class'in parent class'lari olabilir

        Data turu olarak parent class secilmesindeki amac
        child class'dan olusturulan objenin parent class'in tum child class'larinin tasidigi
        ortak ozellikleri vurgulamaktir.
        (personel toplantisina katilan doktor Kemal, bashemsire ayse gibi)

        Data turu ile constructor farkli oldugunda
        variable ile method'lar farkli davranirlar

        Variable'larin alacagi degeri bulmak icin
        aramaya data turu olan class'dan baslariz
        o class'da yoksa parent'larina bakariz
        ve ilk buldugumuz degeri atama yapariz

        data turu olan class veya parent'larinda bulunamazsa CTE olur
     */



    String marka="Toyata";
    String model="Model Belirtilmedi";
    String motor="Motor Belirtilmedi";
    String yakit="yakit belirtilmedi";
}
