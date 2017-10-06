package monopoly;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InfoWindow extends JFrame 
{
    private JTextArea Information = new JTextArea();
    
    public InfoWindow(String info, JButton b)
    {
        Container c = getContentPane(); 
        setTitle("Tile Information");
        setLocation(500,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true); 
        
        c.add(Information);
        
        Information.setEditable(false);
        Information.setText(info);
        
        addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent e)
            {
                b.setEnabled(true);
            }
        });
 
        pack();         
    }
   
}
