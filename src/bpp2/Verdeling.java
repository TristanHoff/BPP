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
public class Verdeling {

    private ArrayList<Product> volgorde = new ArrayList<>();
    private ArrayList<Doos> dozen = new ArrayList<>();
    private boolean bruteForce = false;
    private boolean fullBin = false;
    private boolean nextFit = false;
    private boolean bestFit = false;
    private int nummer = 0;
    //private Doos doos;

    public Verdeling() {
        //nieuweDoos();
        if(bruteForce){
            fullBin = false;
            nextFit = false;
            bestFit = false;
        } else if(fullBin){
            bruteForce = false;
            nextFit = false;
            bestFit = false;
        } else if(nextFit){
            bruteForce = false;
            fullBin = false;
            bestFit = false;
        } else if(bestFit){
            bruteForce = false;
            fullBin = false;
            nextFit = false;
        }
    }

    public ArrayList<Doos> getDozen() {
        return dozen;
    }


    public void addDoos() {
        
         dozen.add(new Doos(nummer));
         nummer++;
    }

    //Vullen van producten
    public void vul(Order o) {
            
            if(bruteForce) {
                //bruteForce(o);
            }
    }

    //vullen van een order
//    public void vul(Order or) {
//        for (Object p : or.getProducten()) {
//            Product temp = (Product) p;
//            vul(temp);
//        }
//    }
}
