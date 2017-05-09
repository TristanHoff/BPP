/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp;

/**
 *
 * @author Tristan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bestelling b1 = new Bestelling();
        Bestelling b2 = new Bestelling();
        Bestelling b3 = new Bestelling();
        
        Doos d1 = new Doos(10);
        Doos d2 = new Doos(10);
        Doos d3 = new Doos(10);
        Doos d4 = new Doos(10);
        Doos d5 = new Doos(10);
        
        Product p1 = new Product("appel", 2, "0012586");
        Product p2 = new Product("meloen", 7, "0012589");
        Product p3 = new Product("druif", 1, "0012584");
        Product p4 = new Product("CHIEKEN", 5, "0012585");
        Product p5 = new Product("taart", 8, "0012585");
  
    
    b1.addProduct(p1);
    b1.addProduct(p2);
    b1.addProduct(p3);
    b2.addProduct(p1);
    b2.addProduct(p3);
    b2.addProduct(p5);
    b3.addProduct(p2);
    b3.addProduct(p4);
    b3.addProduct(p5);
           
    b1.listProducten(1);
    b2.listProducten(2);
    
    b1.vulB(d1, b1);
    
    } 
}