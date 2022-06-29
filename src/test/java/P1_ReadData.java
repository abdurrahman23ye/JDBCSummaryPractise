import java.sql.*;

public class P1_ReadData {

    //MySql de day3 de..

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "1234");

        Statement st = con.createStatement();

        // SORU1: Talebeler tablosundan tum kayitları listeleyiniz.

       /* ResultSet sonuc= st.executeQuery("Select * from talebeler;");

        while (sonuc.next())

        {
            System.out.printf("%-6d  %-15.15s  %-8s  %-5d\n", sonuc.getInt(1),sonuc.getString(2),
                    sonuc.getString(3), sonuc.getInt(4));
        }

        */

        // SORU2: Talebeler tablosunda notları 90 uzeri olan kayitları listeleyiniz.

       /* ResultSet sonuc= st.executeQuery("Select * from talebeler where yazili_notu>90;");

        while (sonuc.next())

        {
            System.out.printf("%-6d  %-15.15s  %-8s  %-5d\n", sonuc.getInt(1),sonuc.getString(2),
                    sonuc.getString(3), sonuc.getInt(4));
        }

        */

        // SORU3: Talebeler tablosunda id'si 124 olan öğrencilerin tüm bilgilerini listeleyiniz.

       /* ResultSet sonuc = st.executeQuery("Select * from talebeler where id=124;");

        while (sonuc.next()) {
            System.out.printf("%-6d  %-15.15s  %-8s  %-5d\n", sonuc.getInt(1), sonuc.getString(2),
                    sonuc.getString(3), sonuc.getInt(4));}

        */

            // SORU4: Talebeler tablosunda notu 70 ile 90 arasindaki kisilerin isimlerini listeleyiniz.

        /*ResultSet sonuc = st.executeQuery("Select isim,yazili_notu from talebeler where yazili_notu between '70' and '90';");

        while (sonuc.next()) {
            System.out.printf("%-6s  %-7d \n", sonuc.getString(1), sonuc.getInt(2));}

         */

            // SORU5: Talebeler tablosunda isminin 2. harfi e olan kisilerin veli_isimleri ile birlikte listeleyiniz.

        ResultSet sonuc = st.executeQuery("Select isim,veli_isim from talebeler where isim like '_e%';");

        while (sonuc.next()) {
            System.out.printf("%-6s  %-7s \n", sonuc.getString(1), sonuc.getString(2));}




    }
}


