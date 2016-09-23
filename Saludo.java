
package applets;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Saludo extends JApplet 
{
    private JLabel label;
    
    @Override
    public void init()
    {
        String nombre=getParameter("nombre");
        this.label=new JLabel("Hola "+nombre,SwingConstants.CENTER);
        add(this.label);
    }
}
