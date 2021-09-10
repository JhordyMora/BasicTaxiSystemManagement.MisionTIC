package View;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class BasicStructure extends JFrame{
    public BasicStructure(){
        Toolkit screen  = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth/2,screenHeight/2);
        setLocation(screenWidth/4,screenHeight/4);
        setTitle("Taxi System Management Program ");
        Image image = screen.getImage("MiLogo.png");
        setIconImage(image);
    }
}
