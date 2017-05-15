/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tristan
 */
public class Doos {

    private int ruimte;                     //Ruimte vol in de doos
    private  int maxRuimte = 10;      //Ruimte in de doos.
    private List<Integer> producten;      //Inhoud van producten in de doos
    private int nummer;
    
    public Doos(int maxRuimte) {
        this.maxRuimte = maxRuimte;
        this.ruimte = 0;
        this.producten = new ArrayList<>();
    }

    public int getRuimte() {
        return ruimte;
    }

    public void setRuimte(int i) {
        this.ruimte = this.ruimte + i;
    }

    public int getMaxRuimte() {
        return maxRuimte;
    }

    int aantalProducten() {
        return producten.size();
    }
    
    List<Integer> getProducten() {
        return producten;
    }

    //Functies om producten/orders in de doos/dozen te doen.
    public void vul(Integer p) {
        if (ruimte + p <= maxRuimte) {
            producten.add(p);
            ruimte = ruimte + p;
        }
    }
    
    public boolean fit(Integer p) {
        return ruimte + p <= maxRuimte;
    }
    
    public void leeg(Integer p) {
        producten.remove(p);
        ruimte = ruimte - p;
    }
    
    Doos kopie() {
        Doos copy = new Doos(0);
        copy.producten = new ArrayList<>(producten);
        copy.ruimte = ruimte;
        copy.maxRuimte = maxRuimte;
        return copy;
    }

    @Override
    public String toString() {
        String res = "";
        for (Integer product : producten) {
            res = res + product + " ";
        }
        res = res + "\tGrootte: " + ruimte;
        return res;
    }

}
