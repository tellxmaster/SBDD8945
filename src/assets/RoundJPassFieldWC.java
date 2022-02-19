
package assets;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class RoundJPassFieldWC extends JPasswordField {

    private static final long serialVersionUID = 1L;
    private Color backgroundColor = Color.WHITE;
        
    public RoundJPassFieldWC() {
    	setBackground(new Color(255,255,255,0));
        setOpaque(false); 
        setBorder(new EmptyBorder(10,10,10,10)); 
        setFont(new Font("Roboto", Font.PLAIN, 14));
        setEchoChar('•');
        setSelectionColor(new Color(0, 173, 181 ,100));

    }
    
    @Override
    protected void paintComponent(Graphics g) {
    	int width = getWidth();
    	int height = getHeight();
    	Graphics2D g2= (Graphics2D) g;
    	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    	g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    	g2.setColor(backgroundColor);
    	g2.fillRoundRect(0, 0, width, height, height, height);
    	super.paintComponent(g);
    }

}