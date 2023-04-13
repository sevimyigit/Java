package Day07_ternary_switchstatements;

public class C11_SwitchCase {
    public static void main(String[] args) {
        /* Kullacidan ISTQB kisaltmasindan hangi harfin
           anlamini ogrenmek istedigini alin
           ve girilen harfin karsiligini yazdirin.
           I : International S : Software T:Testing Q :Qualification B : Board
         */
        char harf='I';

        switch (harf){
            case 'i' :
            case 'I' :
            System.out.println("International");
            break;
            case 's' :
            case 'S' :
                System.out.println("Software T:Testing");
            break;
            case 't':
            case 'T' :
                System.out.println("T:Testing");
            break;
            case 'q':
            case 'Q' :
            System.out.println("Q :Qualification");
            break;
            case 'b' :
            case 'B' :
                System.out.println("B : Board");
            default:
                System.out.println("yanlis harf");
            }

    }
}
