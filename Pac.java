import java.awt.Rectangle;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Pac extends JPanel
{
    //initialize variabels for pacman sprite
    protected ImageIcon image;
    int x, y, sprtX, sprtY, width, height;

    int directInt = 0;
    

    //Positions for pacman in frame.
    public Pac(int x, int y)//Constructor for Pac class
    {   
        //gets sprite from sprite sheet
        image = new ImageIcon("pacManSpriteMaster.png");   
            
        
        this.x = x;
        this.y = y;
        sprtX = 1;
        
        width = 56;
        height = 56;

        System.out.println("Event: Pac Sprites Found");
    
    }
    
    public void draw(Graphics g)//draws pacman sprite
    {
      
        g.drawImage(image.getImage(), x, y, x+width, y+height, sprtX, sprtY, sprtX+width, sprtY+width, null);  

    }

    public void update(int x, int y)//updates sprite depending on its direction
    {
        if(sprtX+width>=224)
        {
            sprtX = 1;
        }
        else
        {
            sprtX = sprtX + width;
        }

        
        if(directInt == 0) // right
        {
            sprtY = 1;
            
        }
        
        else if(directInt == 1)// left
        {
            sprtY = 56;
             
        }

        else if(directInt == 2)// down
        {
            sprtY = 112;
             
        }

        else if (directInt == 3)// up
        {
            sprtY = 168;
           
        }
         
        //System.out.println(directInt); //prints in the console what directInt is being used

        this.x = x;
        this.y = y;

    }

    public Rectangle getBounds() //gets bounds of pacman
    {
		return new Rectangle(x, y, width, height);
	}
    
}
