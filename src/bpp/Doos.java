/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp;

import java.util.ArrayList;

/**
 *
 * @author Tristan
 */
public class Doos {
    private int nummer;
    private int ruimte;
    private int maxRuimte;
    private Product product;
    private boolean placed;
    private ArrayList inhoud = new ArrayList();

    public Doos(int maxRuimte) {
        this.nummer = 1;
        this.maxRuimte = maxRuimte;
        this.ruimte = 0;
    }

    public ArrayList getInhoud() {
        return inhoud;
    }
    
    public int getMaxRuimte() {
        return maxRuimte;
    }

    public void setMaxRuimte(int maxRuimte) {
        this.maxRuimte = maxRuimte;
    }

    public int getNummer() {
        return nummer;
    }

    public int getRuimte() {
        return ruimte;
    }
    
    public void addInhoud(Bestelling b){
        inhoud.add(b);
    }
    
    public void addInhoud(Product p){
        inhoud.add(p);
    }
    
    public void check(){
        System.out.println("Doos " + getNummer());
        System.out.println("Inhoud: " + getRuimte());
        System.out.println("MaxGroote: " + getMaxRuimte());
        System.out.println(""); 
    }
}
