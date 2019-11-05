/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warna = new WarnaKoordinat (0,0,"");
        
        warna.setNamaWarna("Jingga");
        warna.setX(10);
        warna.setY(4);
        System.out.println("Warna Koordinat : " + warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warna.getX()+ ", " 
                + "y : " + warna.getY());
    }
    
}
