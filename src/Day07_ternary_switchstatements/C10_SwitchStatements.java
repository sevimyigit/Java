package Day07_ternary_switchstatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {
        /* kullanicidan gun numarasini alin
           Hafta ici veya hafta sonu oldugunu yazdirin
         */
        int gunNo=5;
        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta Ici");
                break;
            case 6 :
            case 7:
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
        }

    }
}
