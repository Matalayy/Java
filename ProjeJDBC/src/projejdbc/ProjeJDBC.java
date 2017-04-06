/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projejdbc;

/**
 *
 * @author HP
 */
public class ProjeJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnetion dbc = new DBConnetion();
        dbc.baglan();
       // dbc.personelEkle(1, "Melih", "Atalay");
        //dbc.personelListe();
        //dbc.personelGuncelle(2, "Süret", "Yorulmaz");
        dbc.personelListe();
        
    }
    
}
