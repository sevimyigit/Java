package Day24_StringBuilder;

public class EncapsuleClass {

    /*
    Java class uyelerini right and read olarak ayrilmasi istendiginde
    Encapsulation kullanir.

    Bunun icin oncelikle bu class uyelerine normal yollarla erisim kapatilir

    sonra istediginiz yetkiyi verecek public method olusturun
     */
    private int satis; //satis bolumunden deger girilebilsin ama degeri gorunmesin ==>setter
    private int toplamSatis=0; //gorulebilsin ama degistirilemesin ==>getter

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    private int halkaAcikSayi=10;// herkese acik olsun ==>


    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis+= this.satis;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }





}
