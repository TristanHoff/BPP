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
public abstract class Algoritme {
    private long tijd;
    private ArrayList volgorde ;
    private ArrayList result;
    private Order order;

    public Algoritme() {
    }
    
    public ArrayList getResult(){
        return result;
    }
}
