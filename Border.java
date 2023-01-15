import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Rectangle;

public class Border extends JPanel
{
    
    public void paint(Graphics g)
    {
        Color YEET = new Color(63, 72, 204);//set colour of border purple

        g.setColor(YEET);//set it t borders
        
        //draw the borders
        g.fillRect(290, 265, 220, 6);

        g.fillRect(290, 160, 6, 110);

        g.fillRect(290, 160, 45, 6);

        g.fillRect(0, 0, 800, 6);

        g.fillRect(0, 0, 6, 436);

        g.fillRect(792, 0, 6, 436);

        g.fillRect(290, 340, 220, 6);

        g.fillRect(290, 85, 220, 6);

        g.fillRect(150, 160, 60, 6);

        g.fillRect(150, 260, 60, 6);

        g.fillRect(585, 160, 60, 6);

        g.fillRect(585, 260, 60, 6);

        g.fillRect(205, 0, 6, 95);

        g.fillRect(585, 0, 6, 95);

        g.fillRect(205, 340, 6, 95);

        g.fillRect(585, 340, 6, 95);

        g.fillRect(65, 95, 6, 80);

        g.fillRect(65, 95, 60, 6);

        g.fillRect(65, 260, 6, 80);

        g.fillRect(65, 340, 60, 6);

        g.fillRect(665, 90, 60, 6);

        g.fillRect(719, 90, 6, 80);

        g.fillRect(665, 340, 60, 6);

        g.fillRect(720, 260, 6, 80);

        g.fillRect(0, 430, 800, 6);

        g.fillRect(504, 160, 6, 110);

        g.fillRect(460, 160, 45, 6);

    }

    public Rectangle getBounds(int x, int y, int WIDTH, int HEIGHT) //gets the bounds of the borders when called
    {
		return new Rectangle(x, y, WIDTH, HEIGHT);
	}


}