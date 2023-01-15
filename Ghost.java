//imports
import java.awt.Rectangle;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.util.Random;

class Ghost extends JPanel
{
    //initialize variables for ghost sprite
    protected ImageIcon image;
    int x, y, sprtX, sprtY, width, height;

    //Positions for ghosts in frame.
    public Ghost(int x, int y) //Constructor for ghost class
    {
        image = new ImageIcon("Ghosts.png");
        this.x = x;
        this.y = y;
        sprtX = (114);// You can change the sprite colors by changing the values by increments of 38
        sprtY = 1;
        width = 38;
        height = 38;

        System.out.println("Event: Ghost Sprites Found");
        // make x and y equal to parameters sent when called
    }

    public void draw(Graphics g)//draws the ghosts
    {
        g.drawImage(image.getImage(), x, y, x+width, y+height, sprtX, sprtY, sprtX+width, sprtY+width, null);
    }
    public void update(int x, int y)//updates the animation of the ghost sprite

    {
        if(sprtX+width>=330)
        {
            sprtX = 114;
        }
        else
        {
            sprtX = sprtX + width;
        }

        this.x = x;
        this.y = y;

    }

    public Rectangle getBounds() //gets bound of ghosts
    {
		return new Rectangle(x, y, width, height);
	}
}