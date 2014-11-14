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
public class Block1Panel extends JPanel{

    ImageIcon Image2;
    int counter = 0;
    double denominator = 2;
    double answer = 0;
   
    
    public Block1Panel(){
    
    try{
    Image2 = new ImageIcon(getClass().getResource("/resources/2/0_2.png"));
    
    }
    catch(Exception e){
    e.printStackTrace();
              }
        }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(Image2.getImage(), 0, 0, null);
       
    }
    
    public void nextImage(){
        counter++;
        Image2 = new ImageIcon(getClass().getResource("/resources/2/"+counter+"_2.png"));
        this.repaint();
        answer = (double)counter / (double)denominator;
        
    }

}
