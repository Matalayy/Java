/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class DBKatmani {
    private Connection conn;
    String dburl="jdbc:derby://localhost:1527/IlkDatabase";
    String user = "IlkDatabase";
    String pass = "";
    public Connection baglan()
    {
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        System.out.println("Baglanti Basarili");
        conn = DriverManager.getConnection(dburl, user, pass);
        }
        catch(Exception e){
            System.out.println("Baglantida Hata Olustu!!");
        }
        return conn;
    }
    
    public void kullanicilistesi()
    {
        if(conn == null)
        {
            System.out.println("veritabani Bagli Degil!! Baslatiliyor....");
            baglan();
        }
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from kullanici");
        ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("kullaniciadi \t sifre \t soyisim \t telefon");
        while (rs.next())
        {
            System.out.println(rs.getString(1)+"\t \t" +rs.getString(2) +" \t"+ rs.getString(3)+"  \t"+rs.getString(4));
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean kullanicikontrol(String kullaniciAdi,String sifre)
    {
        if(conn == null)
        {
            System.out.println("veritabani Bagli Degil!! Baslatiliyor....");
            baglan();
        }
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select sifre from kullanici where isim='"+kullaniciAdi+"'");
        rs.next();
        return sifre.equals(rs.getString(1)); // String ler equal ile denkligi olculur
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String args[])
    {
        DBKatmani dbk = new DBKatmani();
       // dbk.baglan();
        dbk.kullanicilistesi();
    }
}
