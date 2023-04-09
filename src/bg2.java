
import java.awt.*;
import javax.swing.*;

public class bg2 extends JPanel{
    private Image image;
    
    public bg2(){
        image = new ImageIcon(getClass().getResource("gambar/image.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(image,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
