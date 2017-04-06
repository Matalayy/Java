package projejdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBConnetion {
    private Connection conn;
    String dbUrl = "jdbc:mysql://localhost:3306/BIGDB";
    String user = "root";
    String pass = "";
    
    public Connection baglan()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Baglanti Basarili");
            conn = (Connection) DriverManager.getConnection(dbUrl, user, pass);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.out.println("Baglantida Hata Olustu!");
        }
        return conn;
    }
    
    public void personelListe()
    {
        if(conn == null)
        {
            System.out.println("Baglantida Sorun var!! Baslatiliyor....");
            baglan();
        }
        try {
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from person");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("ID \t ISMI \t SOYISMI");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"\t " +rs.getString(2) +" \t"+ rs.getString(3));
            }
            
        } catch (SQLException e) {
        }
    }
    
    public void personelEkle(int id,String name,String surname)
    {
        if(conn == null)
        {
            System.out.println("Baglantida Sorun var!! Baslatiliyor....");
            baglan();
        }
        try {
            try (Statement st = (Statement) conn.createStatement()) {
                st.executeUpdate("Insert into bigdb.person values("+id+",'"+name+"','"+surname+"')");
            }
            conn.close();
        } catch (SQLException e) {
        }
    }
    
    public void personelSil(int id)
    {
        if(conn == null)
        {
            System.out.println("Baglantida Sorun var!! BAslatiliyor....");
            baglan();
        }
        try {
            try (Statement st = (Statement) conn.createStatement()) {
                st.executeUpdate("Delete from bigdb.person where personId="+id);
            }
            conn.close();
        } catch (SQLException e) {
        }
    }
    
    public void personelGuncelle(int id,String name,String surname)
    {
        if(conn == null)
        {
            System.out.println("Baglantida Sorun var!! Baslatiliyor....");
            baglan();
        }
        try {
            try (Statement st = (Statement) conn.createStatement()) {
                st.executeUpdate("Update bigdb.person set personName='"+name+"',personSurname='"+surname+"' where personId="+id);
            }
            conn.close();
        } catch (SQLException e) {
        }
    }
}
