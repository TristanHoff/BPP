/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp;

/**
 *
 * @author Tristan
 */
public class Product {
    private String naam;
    private int grootte;
    private String artikelNummer;

    public Product(String naam, int grootte, String artikelNummer) {
        this.naam = naam;
        this.grootte = grootte;
        this.artikelNummer = artikelNummer;
    }
    

    public String getNaam() {
        return naam;
    }

    public int getGrootte() {
        return grootte;
    }

    public String getArtikelNummer() {
        return artikelNummer;
    }

    @Override
    public String toString() {
        return  "ArtikelNummer= " + artikelNummer + ", Naam= " + naam + ", Grootte= " + grootte;
    }
    
    
}
