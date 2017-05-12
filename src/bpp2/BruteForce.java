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
public class BruteForce extends Algoritme{
    private List<Doos> dozen = new ArrayList<>();
    private int besteOplossing;
    private ArrayList<Doos> besteDozen;
    
    BruteForce(ArrayList<Integer> p, int m) {
        super(p, m);
        this.besteDozen = new ArrayList<>();
        for (int product : p) {
            dozen.add(new Doos(m));
        }
        besteOplossing = p.size();
    }
    
    public int getAantalVolleDozen() {
        int gevuldeDozen = 0;
        for (Doos doos : dozen) {
            if (doos.aantalProducten() != 0 ) {
            gevuldeDozen++;
        }
        }
        return gevuldeDozen;
    }
    
    public void printBesteDoos() {
        System.out.println("Dozen: ");
            for (Doos huidigeDoos : besteDozen) {
                if (huidigeDoos.aantalProducten() != 0) {      
                    System.out.println(huidigeDoos.toString());
                }
            }
        }
    
    private void bruteforce(ArrayList<Integer> producten, int positie) {
        if (positie >= producten.size()) {
            int volleDozen = getAantalVolleDozen();
            if (volleDozen < besteOplossing) {
                besteOplossing = volleDozen;
                besteDozen = (ArrayList<Doos>)kopie(dozen);
            }
        }
            
        Integer huidigeProduct = producten.get(positie);
        for (Doos doos : dozen) {
            if (doos.fit(huidigeProduct)) {
                doos.vul(huidigeProduct);
                bruteforce(producten, positie + 1);
                doos.leeg(huidigeProduct);
            }
        }
    }
    
    public int getBesteOplossing() {
        return besteOplossing;
    }
    
    public ArrayList<Doos> getDozen() {
        return besteDozen;
    }
    
    public int getResult() {
        bruteforce(producten, 0);
        return besteOplossing;
    }

}
