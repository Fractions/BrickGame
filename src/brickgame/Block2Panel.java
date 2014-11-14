/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickgame;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author brandonturner
 */
public class Block2Panel extends JPanel{
    
     ImageIcon Image6;
    int counter = 0;
    double denominator = 6;
    double answer = 0;
    
   
    
    public Block2Panel(){
    
    try{
    Image6 = new ImageIcon(getClass().getResource("/resources/6/0_6.png"));
    
    }
    catch(Exception e){
    e.printStackTrace();
              }
        }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(Image6.getImage(), 0, 0, null);
       
    }
    
    public void nextImage(){
        counter++;
        Image6 = new ImageIcon(getClass().getResource("/resources/6/"+counter+"_6.png"));
        this.repaint();
        answer = (double)counter / (double)denominator;
    }
    
}
