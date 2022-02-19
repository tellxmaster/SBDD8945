
package assets;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author tellxmaster
 */
public class BackgroundPanel extends JPanel{
    private Image background;
    public void paint(Graphics g)
    {
        background = new ImageIcon(getClass().getResource("/img/background.png")).getImage();
        g.drawImage(background, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
