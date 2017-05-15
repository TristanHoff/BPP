/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

/**
 *
 * @author Tristan
 */
public class Main {

    
    public static void main(String[] args) {
    
        Verdeling v = new Verdeling();
        
        //Aanmaken producten
        Product p1 = new Product(1, 5);
        Product p2 = new Product(2);
        Product p3 = new Product(3);
        Product p4 = new Product(4);
        Product p5 = new Product(5, 5);
        //Aanmaken van orders en dozen
        Order o0 = new Order();
        Order o1 = new Order();
        
        
        
        o0.voegToe(p1);
        o0.voegToe(p2);
        o0.voegToe(p3);
        o0.voegToe(p4);
        o0.voegToe(p5);

        o1.voegToe(p1);
        o1.voegToe(p2);
        o1.voegToe(p3);
        
        v.vul(o1);
        
        
        Scherm s1 = new Scherm();
        s1.setVisible(true);
    }
}
