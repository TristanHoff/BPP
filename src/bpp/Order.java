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
public class Order {
    
    private ArrayList<Product> producten;   //Lijst met producten in de order

    public Order() {
        producten = new ArrayList<>();
    }
    
    public ArrayList getProducten(){
        return producten;
    }
    
    //Functie om producten toe te voegen aan order.
    public void voegToe(Product p){
        this.producten.add(p);
    }
    
    //Functie om producten in order out te printen.
    public void printOrder(){
        for (Product p: this.producten){
            System.out.println(p);
        }
    }
}
