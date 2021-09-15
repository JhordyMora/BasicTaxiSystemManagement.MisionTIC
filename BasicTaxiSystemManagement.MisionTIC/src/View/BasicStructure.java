package View;

<<<<<<< HEAD
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import View.Canvas;
import java.awt.BorderLayout;

public class BasicStructure extends JFrame{
    public BasicStructure(){
        // center aleigment of the window
        Toolkit screen  = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth/2,screenHeight/2);
        setLocation(screenWidth/4,screenHeight/4);
        // Basic characteristic of the window
        setTitle("Taxi System Management Program ");
        Image image = screen.getImage("MiLogo.png");
        setIconImage(image);
        // Window Distribution
        Canvas layoutYDemas = new Canvas();
        setLayout(new BorderLayout());
        add(layoutYDemas, BorderLayout.SOUTH);
=======
import javax.swing.*;

public class BasicStructure extends JFrame{
    public BasicStructure(){
        setSize(500,300);
        setLocation(500,300);
        setTitle("Taxi System Management Program ");
>>>>>>> d2101cca49f36732f70f49922eebef278602415c
    }
}
