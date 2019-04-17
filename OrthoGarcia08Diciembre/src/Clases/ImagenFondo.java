/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author USUARIO
 */
public class ImagenFondo implements Border{
public BufferedImage back;

public ImagenFondo(){
    try {
        URL imagepath= new URL(getClass().getResource("../images/logo3.png").toString());
        back=ImageIO.read(imagepath);
    } catch (Exception e) {
    }
}

    
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth())/2),(y + (height - back.getHeight())/2), null);
    }

    
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0,0, 0);
    }

    
    public boolean isBorderOpaque() {
        return false;
    }
  
    
    
    
}
