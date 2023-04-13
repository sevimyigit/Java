import java.sql.*;

public class JDBC01_Query01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1- Ilgili driver i yuklemeliyiz.MySQL kullandigimizi bildiriyoruz
        //Driver i bulamama ihtimaline karsi forName metodu icin ClassNotFoundException
        //method signature imiza exception firlatmamizi istiyor



        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2- Baglantiyi olusturmak icin user name ve password girmeliyiz
        // Buradada bu user name ve password un yanlis olma ihtimaline karsi
        //bir sql exception firlatmamizi ister

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234");

        // 3- SQL query'leri icin bir statemnet objesi olusturuo ,
        //java da sql sorgularimiz icin bir alan acicaz

        Statement st = con.createStatement();

        // 4- SQL wury lerimizi yazip calistirabiliriz.

       ResultSet veri= st.executeQuery("SELECT*FROM personel");

       //5- sonuclari gormek icin iteration ile set icerisindeki elemanlari bir
       // while donguusu ile yazidiririz.

        while (veri.next()){
            System.out.println(veri.getInt(1)+" " + veri.getString(2) +
                    " " + veri.getString(3)+ " "+veri.getInt(4)+" "+
                    veri.getString(5));
        }
        //6 - olusturulan nesneleri kapatalim

        con.close();
        st.close();
        veri.close();

    }
}
