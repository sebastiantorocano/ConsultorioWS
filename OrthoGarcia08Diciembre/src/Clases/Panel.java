

package Clases;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Panel extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
    Dimension tam=getSize();
    
    
    ImageIcon image = new  ImageIcon( new ImageIcon(getClass().getResource("/images/logo.jpg")).getImage());
    g.drawImage(image.getImage(), 0, 0,tam.width,tam.height,null);
    }
    
}
