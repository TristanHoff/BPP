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
public abstract class Algoritme {
    int maxRuimte;
    ArrayList producten;

    public Algoritme(ArrayList p, int m) {
    this.producten=p;
    this.maxRuimte=m;
    }
    
    public abstract int getResult();
    
    public abstract void printBesteDoos();
    
    //Kopie van lijst voor algoritmes
    List<Doos> kopie(List<Doos> dozen) {
        ArrayList<Doos> copy = new ArrayList<>();
        for (int i = 0; i < dozen.size(); i++) {
            copy.add(dozen.get(i).kopie());
        }
        return copy;
    }
}