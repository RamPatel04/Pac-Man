//imports
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.Rectangle;
import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;


//contains ball, paddle 1 and 2, collission, points
public class Game extends JPanel implements KeyListener
{
    //call classes in variables
    Border border;
    Pac pac;
    Ghost ghost1;
    Ghost ghost2;
    Score score;
    ////////////////////////////
    

    //game loop to check if game is won or lost
    boolean loop = true;

    //booleans for pac man movement
    boolean up = false;
    boolean down = false;
    boolean left = false; 
    boolean right = false;

    //boolean to start ghost movement
    boolean start1 = true;
    boolean start2 = true;

    //x, y ints values movement for ghost 1
    int g1XValue = 5;
    int g1YValue = 5;

    //x, y ints values movement for ghost 2
    int g2XValue = 5;
    int g2YValue = 5;

    //ghost 1 random
    Random rand = new Random();
    int upperBounds = 4;
    int randomInt = 0;

    //ghost 2 random
    Random rand1 = new Random();
    int upperBounds1 = 4;
    int randomInt1 = 0;
    
    //background music for game
    boolean mute = false;
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("DuckTales.wav"));
    Clip music = AudioSystem.getClip();


    public Game() throws UnsupportedAudioFileException, IOException, LineUnavailableException //constructor
    {
        super();
        super.setFocusable(true);
        super.addKeyListener(this);
        pac = new Pac(385, 275);
        border = new Border();
        ghost1 = new Ghost(300, 200);
        ghost2 = new Ghost(400, 200);
        score = new Score();
    }

    public Rectangle getBounds(int x, int y, int WIDTH, int HEIGHT)//get bounds for any object in game
    {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }

    public boolean checkCollision()//checks if pac man collided with the border and sends a boolean back
    {
        boolean check = false;

        boolean bool1 = pac.getBounds().intersects(getBounds(290, 265, 220, 6));
        boolean bool2 = pac.getBounds().intersects(getBounds(290, 160, 6, 110));
        boolean bool3 = pac.getBounds().intersects(getBounds(290, 160, 45, 6));
        boolean bool4 = pac.getBounds().intersects(getBounds(0, 0, 800, 6));
        boolean bool5 = pac.getBounds().intersects(getBounds(0, 0, 6, 436));
        boolean bool6 = pac.getBounds().intersects(getBounds(794, 0, 6, 436));
        boolean bool7 = pac.getBounds().intersects(getBounds(290, 340, 220, 6));
        boolean bool8 = pac.getBounds().intersects(getBounds(290, 85, 220, 6));
        boolean bool9 = pac.getBounds().intersects(getBounds(150, 160, 60, 6));
        boolean bool10 = pac.getBounds().intersects(getBounds(150, 260, 60, 6));
        boolean bool11 = pac.getBounds().intersects(getBounds(585, 160, 60, 6));
        boolean bool12 = pac.getBounds().intersects(getBounds(585, 260, 60, 6));
        boolean bool13 = pac.getBounds().intersects(getBounds(205, 0, 6, 95));
        boolean bool14 = pac.getBounds().intersects(getBounds(585, 0, 6, 95));
        boolean bool15 = pac.getBounds().intersects(getBounds(205, 340, 6, 95));
        boolean bool16 = pac.getBounds().intersects(getBounds(585, 340, 6, 95));
        boolean bool17 = pac.getBounds().intersects(getBounds(65, 95, 6, 80));
        boolean bool18 = pac.getBounds().intersects(getBounds(65, 95, 60, 6));
        boolean bool19 = pac.getBounds().intersects(getBounds(65, 260, 6, 80));
        boolean bool20 = pac.getBounds().intersects(getBounds(65, 340, 60, 6));
        boolean bool21 = pac.getBounds().intersects(getBounds(665, 90, 60, 6));
        boolean bool22 = pac.getBounds().intersects(getBounds(719, 90, 6, 80));
        boolean bool23 = pac.getBounds().intersects(getBounds(665, 340, 60, 6));
        boolean bool24 = pac.getBounds().intersects(getBounds(720, 260, 6, 80));
        boolean bool25 = pac.getBounds().intersects(getBounds(0, 430, 800, 6));
        boolean bool26 = pac.getBounds().intersects(getBounds(504, 160, 6, 110));
        boolean bool27 = pac.getBounds().intersects(getBounds(460, 160, 45, 6));

        if (bool1 || bool2 || bool3 || bool4 || bool5 || bool6 || bool7 || bool8 || bool9 || bool10 || bool11 || bool12 || bool13 || bool14 || bool15 || bool16 || bool17 || bool18 || bool19 || bool20 || bool21 || bool22 || bool23 || bool24 || bool25 || bool26 || bool27)
        {
            check = true;
        }

        return check;
    }

    public boolean checkGhost1Collision()//checks if ghost collides with border and returns boolean
    {
        boolean ghost1Collision = false;
        
        boolean bool1 = ghost1.getBounds().intersects(getBounds(290, 265, 220, 6));
        boolean bool2 = ghost1.getBounds().intersects(getBounds(290, 160, 6, 110));
        boolean bool3 = ghost1.getBounds().intersects(getBounds(290, 160, 45, 6));
        boolean bool4 = ghost1.getBounds().intersects(getBounds(0, 0, 800, 6));
        boolean bool5 = ghost1.getBounds().intersects(getBounds(0, 0, 6, 436));
        boolean bool6 = ghost1.getBounds().intersects(getBounds(794, 0, 6, 436));
        boolean bool7 = ghost1.getBounds().intersects(getBounds(290, 340, 220, 6));
        boolean bool8 = ghost1.getBounds().intersects(getBounds(290, 85, 220, 6));
        boolean bool9 = ghost1.getBounds().intersects(getBounds(150, 160, 60, 6));
        boolean bool10 = ghost1.getBounds().intersects(getBounds(150, 260, 60, 6));
        boolean bool11 = ghost1.getBounds().intersects(getBounds(585, 160, 60, 6));
        boolean bool12 = ghost1.getBounds().intersects(getBounds(585, 260, 60, 6));
        boolean bool13 = ghost1.getBounds().intersects(getBounds(205, 0, 6, 95));
        boolean bool14 = ghost1.getBounds().intersects(getBounds(585, 0, 6, 95));
        boolean bool15 = ghost1.getBounds().intersects(getBounds(205, 340, 6, 95));
        boolean bool16 = ghost1.getBounds().intersects(getBounds(585, 340, 6, 95));
        boolean bool17 = ghost1.getBounds().intersects(getBounds(65, 95, 6, 80));
        boolean bool18 = ghost1.getBounds().intersects(getBounds(65, 95, 60, 6));
        boolean bool19 = ghost1.getBounds().intersects(getBounds(65, 260, 6, 80));
        boolean bool20 = ghost1.getBounds().intersects(getBounds(65, 340, 60, 6));
        boolean bool21 = ghost1.getBounds().intersects(getBounds(665, 90, 60, 6));
        boolean bool22 = ghost1.getBounds().intersects(getBounds(719, 90, 6, 80));
        boolean bool23 = ghost1.getBounds().intersects(getBounds(665, 340, 60, 6));
        boolean bool24 = ghost1.getBounds().intersects(getBounds(720, 260, 6, 80));
        boolean bool25 = ghost1.getBounds().intersects(getBounds(0, 430, 800, 6));
        boolean bool26 = ghost1.getBounds().intersects(getBounds(504, 160, 6, 110));
        boolean bool27 = ghost1.getBounds().intersects(getBounds(460, 160, 45, 6));
        boolean bool28 = ghost1.getBounds().intersects(getBounds(400, 260, 6, 10));

        if (bool1 || bool2 || bool3 || bool4 || bool5 || bool6 || bool7 || bool8 || bool9 || bool10 || bool11 || bool12 || bool13 || bool14 || bool15 || bool16 || bool17 || bool18 || bool19 || bool20 || bool21 || bool22 || bool23 || bool24 || bool25 || bool26 || bool27|| bool28)
        {
            ghost1Collision = true;
        }
        return ghost1Collision;
        
    }


    public boolean checkGhost2Collision()//checks for second ghost collision with border and returns boolean
    {    
        boolean ghost2Collision = false;
        
        boolean bool1 = ghost2.getBounds().intersects(getBounds(290, 265, 220, 6));
        boolean bool2 = ghost2.getBounds().intersects(getBounds(290, 160, 6, 110));
        boolean bool3 = ghost2.getBounds().intersects(getBounds(290, 160, 45, 6));
        boolean bool4 = ghost2.getBounds().intersects(getBounds(0, 0, 800, 6));
        boolean bool5 = ghost2.getBounds().intersects(getBounds(0, 0, 6, 436));
        boolean bool6 = ghost2.getBounds().intersects(getBounds(794, 0, 6, 436));
        boolean bool7 = ghost2.getBounds().intersects(getBounds(290, 340, 220, 6));
        boolean bool8 = ghost2.getBounds().intersects(getBounds(290, 85, 220, 6));
        boolean bool9 = ghost2.getBounds().intersects(getBounds(150, 160, 60, 6));
        boolean bool10 = ghost2.getBounds().intersects(getBounds(150, 260, 60, 6));
        boolean bool11 = ghost2.getBounds().intersects(getBounds(585, 160, 60, 6));
        boolean bool12 = ghost2.getBounds().intersects(getBounds(585, 260, 60, 6));
        boolean bool13 = ghost2.getBounds().intersects(getBounds(205, 0, 6, 95));
        boolean bool14 = ghost2.getBounds().intersects(getBounds(585, 0, 6, 95));
        boolean bool15 = ghost2.getBounds().intersects(getBounds(205, 340, 6, 95));
        boolean bool16 = ghost2.getBounds().intersects(getBounds(585, 340, 6, 95));
        boolean bool17 = ghost2.getBounds().intersects(getBounds(65, 95, 6, 80));
        boolean bool18 = ghost2.getBounds().intersects(getBounds(65, 95, 60, 6));
        boolean bool19 = ghost2.getBounds().intersects(getBounds(65, 260, 6, 80));
        boolean bool20 = ghost2.getBounds().intersects(getBounds(65, 340, 60, 6));
        boolean bool21 = ghost2.getBounds().intersects(getBounds(665, 90, 60, 6));
        boolean bool22 = ghost2.getBounds().intersects(getBounds(719, 90, 6, 80));
        boolean bool23 = ghost2.getBounds().intersects(getBounds(665, 340, 60, 6));
        boolean bool24 = ghost2.getBounds().intersects(getBounds(720, 260, 6, 80));
        boolean bool25 = ghost2.getBounds().intersects(getBounds(0, 430, 800, 6));
        boolean bool26 = ghost2.getBounds().intersects(getBounds(504, 160, 6, 110));
        boolean bool27 = ghost2.getBounds().intersects(getBounds(460, 160, 45, 6));
        boolean bool28 = ghost2.getBounds().intersects(getBounds(400, 260, 6, 10));
        if (bool1 || bool2 || bool3 || bool4 || bool5 || bool6 || bool7 || bool8 || bool9 || bool10 || bool11 || bool12 || bool13 || bool14 || bool15 || bool16 || bool17 || bool18 || bool19 || bool20 || bool21 || bool22 || bool23 || bool24 || bool25 || bool26 || bool27|| bool28)
        {
            ghost2Collision = true;
        }
        return ghost2Collision;
        
    }

    public void checkPointCollision()//checks if pacman makes contact with the points and increases the points and removes the point on the map
    {
        boolean food1 = pac.getBounds().intersects(getBounds(35, 40, 10, 10));
        boolean food2 = pac.getBounds().intersects (getBounds(160, 40, 10, 10));
        boolean food3 = pac.getBounds().intersects (getBounds(310, 40, 10, 10));
        boolean food4 = pac.getBounds().intersects (getBounds(460, 40, 10, 10));
        boolean food5 = pac.getBounds().intersects (getBounds(625, 40, 10, 1));
        boolean food6 = pac.getBounds().intersects (getBounds(750, 40, 10, 10));
        boolean food7 = pac.getBounds().intersects (getBounds(35, 125, 10, 10));
        boolean food8 = pac.getBounds().intersects (getBounds(160, 125, 10, 10));
        boolean food9 = pac.getBounds().intersects (getBounds(310, 125, 10, 10));
        boolean food10 = pac.getBounds().intersects(getBounds(460, 125, 10, 10));
        boolean food11 = pac.getBounds().intersects(getBounds(625, 125, 10, 10));
        boolean food12 = pac.getBounds().intersects(getBounds(750, 125, 10, 10));
        boolean food13 = pac.getBounds().intersects(getBounds(35, 210, 10, 10));
        boolean food14 = pac.getBounds().intersects(getBounds(160, 210, 10, 10));
        boolean food15 = pac.getBounds().intersects(getBounds(625, 210, 10, 10));
        boolean food16 = pac.getBounds().intersects(getBounds(750, 210, 10, 10));
        boolean food17 = pac.getBounds().intersects(getBounds(35, 295, 10, 10));
        boolean food18 = pac.getBounds().intersects(getBounds(160, 295, 10, 10));
        boolean food19 = pac.getBounds().intersects(getBounds(310, 295, 10, 10));
        boolean food20 = pac.getBounds().intersects(getBounds(460, 295, 10, 10));
        boolean food21 = pac.getBounds().intersects(getBounds(625, 295, 10, 10));
        boolean food22 = pac.getBounds().intersects(getBounds(750, 295, 10, 10));
        boolean food23 = pac.getBounds().intersects(getBounds(35, 380, 10, 10));
        boolean food24 = pac.getBounds().intersects(getBounds(160, 380, 10, 10));
        boolean food25 = pac.getBounds().intersects(getBounds(310, 380, 10, 10));
        boolean food26 = pac.getBounds().intersects(getBounds(460, 380, 10, 10));
        boolean food27 = pac.getBounds().intersects(getBounds(625, 380, 10, 10));
        boolean food28 = pac.getBounds().intersects(getBounds(750, 380, 10, 10));

        if(food1 && score.p1 == 0 )
        {
            score.p1++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food2 && score.p2 == 0 )
        {
            score.p2++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food3 && score.p3 == 0 )
        {
            score.p3++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food4 && score.p4 == 0 )
        {
            score.p4++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food5 && score.p5 == 0 )
        {
            score.p5++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food6 && score.p6 == 0 )
        {
            score.p6++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food7 && score.p7 == 0 )
        {
            score.p7++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food8 && score.p8 == 0 )
        {
            score.p8++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food9 && score.p9 == 0 )
        {
            score.p9++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food10 && score.p10 == 0 )
        {
            score.p10++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
         if(food11 && score.p11 == 0 )
        {
            score.p11++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food12 && score.p12 == 0 )
        {
            score.p12++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food13 && score.p13 == 0 )
        {
            score.p13++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food14 && score.p14 == 0 )
        {
            score.p14++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food15 && score.p15 == 0 )
        {
            score.p15++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food16 && score.p16 == 0 )
        {
            score.p16++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food17 && score.p17 == 0 )
        {
            score.p17++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food18 && score.p18 == 0 )
        {
            score.p18++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food19 && score.p19 == 0 )
        {
            score.p19++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food20 && score.p20 == 0 )
        {
            score.p20++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
         if(food21 && score.p21 == 0 )
        {
            score.p21++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food22 && score.p22 == 0 )
        {
            score.p22++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food23 && score.p23 == 0 )
        {
            score.p23++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food24 && score.p24 == 0 )
        {
            score.p24++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food25 && score.p25 == 0 )
        {
            score.p25++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food26 && score.p26 == 0 )
        {
            score.p26++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food27 && score.p27 == 0 )
        {
            score.p27++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
        if(food28 && score.p28 == 0 )
        {
            score.p28++;
            score.score1++;
            System.out.println("Event: Score Increased by 100");
        
        }
       
    

        
    }


    public void moveLeft()//moves pacman left when called
    {
        if (checkCollision() == false)
        {
            pac.x -=4;
        }
        else
        {
            pac.x += 5;
            left = false;
        }
    }

    public void moveRight()//moves pacman right when called
    {
        if (checkCollision() == false)
        {
            pac.x +=4;
        }
        else
        {
            pac.x -=5;
            right = false;
        }

    }

    public void moveP1Up() // method to move pacman up.
    {
        if (checkCollision() == false)// if it does not reach the border it can move up.
        {
            pac.y-=4;
        }
        else//else then pacman can't move up.
        {
            pac.y += 5;
            up = false;
        }

    }


    public void moveP1Down()// method to move pacman down.
    {

        if (checkCollision() == false)// if it doesn't reach the border it can move down.
        {
            pac.y+=5;
        }
        else//else then pacman can't move down
        {
            pac.y -= 5;
            down = false;
        }
    }

    public void ghost1Movement()//movement for ghost1 
    {  
        if (start1)
        {
            g1YValue = 0;
            if (checkGhost1Collision())
            {
                ghost1.x -=5;
                start1 = false;
                g1YValue = 0;
                g1XValue = 0;
            }
        }

        else if (checkGhost1Collision())
        {
            if (randomInt == 0)
            {
                ghost1.y += 5;
                g1YValue = 0;
                g1XValue = 0;
            }
            else if (randomInt == 1)
            {
                ghost1.y -= 5;
                g1YValue = 0;
                g1XValue = 0;
            }
            else if (randomInt == 2)
            {
                ghost1.x -= 5;
                g1YValue = 0;
                g1XValue = 0;
            }
            else if (randomInt == 3)
            {
                ghost1.x += 5;
                g1YValue = 0;
                g1XValue = 0;
            }
            randomInt = rand.nextInt(upperBounds);
        }
        else 
        {
            if (randomInt == 0)
            {
                g1YValue = -5;
                g1XValue = 0;
            }
            else if (randomInt == 1)
            {
                g1YValue = 5;
                g1XValue = 0;
            }
            else if (randomInt == 2)
            {
                g1YValue = 0;
                g1XValue = 5;
            }
            else if (randomInt == 3)
            {
                g1YValue = 0;
                g1XValue = -5;
            }

        }
        
        ghost1.x += g1XValue;
        ghost1.y += g1YValue;
    }

    public void ghost2Movement()//movement for ghost 2
    {  
        if (start2)
        {
            g2YValue = 0;
            if (checkGhost2Collision())
            {
                ghost2.x -=5;
                start2 = false;
                g2YValue = 0;
                g2XValue = 0;
            }
        }

        else if (checkGhost2Collision())
        {
            if (randomInt1 == 0)
            {
                ghost2.y += 5;
                g2YValue = 0;
                g2XValue = 0;
            }
            else if (randomInt1 == 1)
            {
                ghost2.y -= 5;
                g2YValue = 0;
                g2XValue = 0;
            }
            else if (randomInt1 == 2)
            {
                ghost2.x -= 5;
                g2YValue = 0;
                g2XValue = 0;
            }
            else if (randomInt1 == 3)
            {
                ghost2.x += 5;
                g2YValue = 0;
                g2XValue = 0;
            }
            randomInt1 = rand.nextInt(upperBounds1);
        }
        else 
        {
            if (randomInt1 == 0)
            {
                g2YValue = -5;
                g2XValue = 0;
            }
            else if (randomInt1 == 1)
            {
                g2YValue = 5;
                g2XValue = 0;
            }
            else if (randomInt1 == 2)
            {
                g2YValue = 0;
                g2XValue = 5;
            }
            else if (randomInt1 == 3)
            {
                g2YValue = 0;
                g2XValue = -5;
            }

        }
        ghost2.x +=g2XValue;
        ghost2.y +=g2YValue;
    }


    public void paint(Graphics g)

    {

        g.clearRect(0, 0, getWidth(), getHeight());

        pac.draw(g);

        ghost1.draw(g);

        ghost2.draw(g);

        border.paint(g);

        score.paint(g);

    }

    @Override
    public void keyPressed(KeyEvent key)
    {
        if (key.getKeyCode() == KeyEvent.VK_M)
        {
            if (mute)
            {
                mute = false;
            } 
            else
            {
                mute = true;
            }
        }

        //player inputs
        if (key.getKeyCode() == KeyEvent.VK_S) //move down for pacman if they press s
        {
            down = true;

            up = false;
            left = false;
            right = false;
        }
        else if (key.getKeyCode() == KeyEvent.VK_W)//move pacman up if they press w
        {
            up = true;

            down = false;
            left = false;
            right = false;
        }
        else if (key.getKeyCode() == KeyEvent.VK_A)//move pacman left if they press a
        {
            left = true;

            up = false;
            down = false;
            right = false;
        }
        else if (key.getKeyCode() == KeyEvent.VK_D)//move pacman right if they press d
        {
            right = true;

            up = false;
            left = false;
            down = false;
        }

        repaint(); //repaint 
    }
    @Override
    public void keyReleased(KeyEvent key) //key released
    {

    }


    @Override
    public void keyTyped(KeyEvent arg0) //key typed
    {

    }
    
    public void pacManMove()//makes pacman move depending on which boolean is true
    {
        if (left == true)
        {
            moveLeft();
            
        }
        else if (right == true)
        {
            moveRight();
            
        }
        else if (up == true)
        {
            moveP1Up();
            
        }
        else if (down == true)
        {
            moveP1Down();
            
        }
        
    }


    public void PacSpriteCheck()//checks what sprite to use for pacman depending on the direction
    {
        if (right == true)
        {
            pac.directInt = 0;
        }
        if (left == true)
        {
            pac.directInt = 1;
            
        }
        if (down == true)
        {
            pac.directInt = 2;
            
        }
        if (up == true)
        {
            pac.directInt = 3;
            
        }        
        else
        {
            
        }
    }

    public boolean winOrLose()//checks if player wins or lose either if they get 28 points or get hit by the ghost and returns boolean 
    {   
        boolean ghost1Kill = pac.getBounds().intersects(ghost1.getBounds());
        boolean ghost2Kill = pac.getBounds().intersects(ghost2.getBounds());; 
        if (score.score1 == 28)
        {
            loop = false;
            System.out.println("Event: Player Won");
            JOptionPane.showMessageDialog(null, "You win!!");
        }    
        
        else if (ghost1Kill || ghost2Kill)
        {
            loop = false;
            System.out.println("Event: Player Lost");
            JOptionPane.showMessageDialog (null, "You DIED!!");
        }
         
        return loop;
    }

    public void update()//updates the game and called in main
    {

        PacSpriteCheck();
        pacManMove();
        ghost1Movement();
        ghost2Movement();
        pac.update(pac.x, pac.y);
        checkPointCollision();
        repaint();
    }
    
}