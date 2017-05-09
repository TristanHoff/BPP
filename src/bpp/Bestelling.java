/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp;

import java.util.ArrayList;



public class Bestelling {
    private double tijd;
    private ArrayList<Product> producten = new ArrayList();
    private ArrayList<Doos> dozen = new ArrayList();
    private ArrayList volgorde;
    private boolean placed;

    
    public ArrayList getProducten() {
        return producten;
    }

    public ArrayList getDozen() {
        return dozen;
    }

    public ArrayList getVolgorde() {
        return volgorde;
    }

    public void nieuweDoos(Doos d){
        dozen.add(d);
    }
    
    public void addProduct(Product p){
        producten.add(p);
    }
    
    public void vulB(Doos d, Bestelling b){
        for (Doos doos: dozen){
        if(d.getRuimte() < d.getMaxRuimte() && placed  == false){
            d.addInhoud(b);
            this.placed = true;
        } else {
            this.placed = false;
            
        }
    }
    }
    
    public void vulP(Doos d, Product p){
        for (Doos doos: dozen){
        if(d.getRuimte() < d.getMaxRuimte() && placed  == false){
            d.addInhoud(p);
            this.placed = true;
        } else {
            this.placed = false;
            
        }
    }
    }
    
    public void listProducten(int I){
        int i = 1;
        int totaal = 0;
        System.out.println("Order " + I);
        System.out.println("");
        for (Product p: producten){
        System.out.println("Product " + i);
        System.out.println(p);
        i++;
        totaal = totaal + p.getGrootte();
        }
        System.out.println("");
        System.out.println("Totaal: " + totaal);
        System.out.println("");
        System.out.println("");
    }
    }
    

