/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

import java.util.Random;

/**
 *
 * @author Tristan
 */
public class Product {
    
    private int grootte;    //Grootte van product
    private int nummer;     //Artikelnummer

    //Maakt random grootte van product
    public Product(int n) {
        Random rn = new Random();
        this.grootte = rn.nextInt(5)+1;     
        this.nummer = n;
    }
    
    //Kan specifieke grootte meegeven aan product
    public Product(int n, int g) {
        this.nummer = n;
        this.grootte = g;
    }
    
    public int getGrootte(){
        return grootte;
    }

    @Override
    public String toString() {
        return "Product: " + nummer + "  Grootte: " + grootte;
    }
    
    
}
