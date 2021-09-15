package View;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Canvas extends JPanel{
    public Canvas(){
        setLayout(new BorderLayout());
        add(new JButton("Prueba0"), BorderLayout.WEST);
        add(new JButton("Prueba1"), BorderLayout.CENTER);
        add(new JButton("Prueba2"), BorderLayout.EAST);
    }
}
