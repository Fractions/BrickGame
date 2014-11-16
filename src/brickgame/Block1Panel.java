/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickgame;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author brandonturner
 */
public class Block1Panel extends JPanel{

    ImageIcon Image;
    int counter = 0;
    double answer = 0;
    Random gen = new Random();
    int randomImageSelect = gen.nextInt(2)+2;
    
    public Block1Panel(){
     
    
    try{
    Image = new ImageIcon(getClass().getResource("/resources/"+randomImageSelect+"/0_"+randomImageSelect+".png"));
    
    }
    catch(Exception e){
    e.printStackTrace();
              }
        }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(Image.getImage(), 0, 0, null);
       
    }
    
    public void nextImage(){
        counter++;
        Image = new ImageIcon(getClass().getResource("/resources/"+randomImageSelect+"/"+counter+"_"+randomImageSelect+".png"));
        this.repaint();
        answer = (double)counter / (double)randomImageSelect;
       
        
    }

}
