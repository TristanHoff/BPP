/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

import java.util.ArrayList;

/**
 *
 * @author Tristan
 */
public class Doos {

    private int ruimte;                     //Ruimte vol in de doos
    private static int maxRuimte = 10;      //Ruimte in de doos.
    private ArrayList<Product> inhoud;      //Inhoud van producten in de doos
    private int nummer;

    public Doos(int nummer) {
        inhoud = new ArrayList<>();
        this.nummer = nummer;
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

    public ArrayList getInhoud() {
        return inhoud;
    }

    public void addInhoud(Product p) {
        inhoud.add(p);
    }

    //Functies om producten/orders in de doos/dozen te doen.
    public void vul(Product p) {
        if (this.ruimte + p.getGrootte() <= this.maxRuimte) {
            inhoud.add(p);
            this.ruimte = this.ruimte + p.getGrootte();
        } else {
            System.out.println("Doos zit vol");
        }
    }

    public void vul(Order or) {
        for (Object p : or.getProducten()) {
            Product temp = (Product) p;
            vul(temp);
        }
    }

    //Functie om inhoud te printen
    public void check() {
        for (Product p : inhoud) {
            System.out.println(p);
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Doos{" + "ruimte=" + ruimte + ", inhoud=" + inhoud + '}';
    }

}
