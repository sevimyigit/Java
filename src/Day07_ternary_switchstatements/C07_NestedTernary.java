package Day07_ternary_switchstatements;

public class C07_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi alin
        // sayi pozitif ise; citf sayi veya cidt sayi degil seceneklerinden birini yazdirin
        // sayi pozititif degilse. 3 basamakli veya 3 basamakli degil secenkelerinden birini yazdirin

        int sayi= 23;
        // System.out.println(sayi >=0 ? "Sayi pozitif" : "Sayi pozitif degil");

        System.out.println(sayi>0
                                ?
                        sayi%2==0 ? "cift sayi" : "tek sayi"
                                :
                        -100>sayi && sayi>=-999 ? "3 basamakli sayi" : "# basamakli degil");
    }
}
