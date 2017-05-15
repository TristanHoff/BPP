/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

import java.awt.event.*;
import static java.lang.Integer.parseInt;
import javax.swing.*;


/**
 *
 * @author Tristan
 */
public class DialoogDoos extends JDialog implements ActionListener{

    private JLabel jlHuidigeGrootte;
    private JButton jbOK;
    private JTextField jfInvoer;
    private int doosGrootte;
    private boolean isOK;
    
    public  DialoogDoos(JFrame frame) {
        super(frame, true);
//        JFrame doosFrame = new JFrame("Doos");
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jlHuidigeGrootte = new JLabel("Huidige grootte: " + doosGrootte);
        jbOK = new JButton("OK");
        jfInvoer = new JTextField(10);
        setVisible(true);
  
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == jbOK) {
       this.doosGrootte = parseInt(jfInvoer.getText());
       this.isOK = true;
    }
    }
    
    public int getDoosGrootte() {
        return doosGrootte;
    }
    
    public boolean getIsOK() {
        return isOK;
    }
}
