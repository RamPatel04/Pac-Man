import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Score extends JPanel
{
    //initialize integer variables for each point on the map
    int p1 = 0;
    int p2 = 0;
    int p3 = 0;
    int p4 = 0;
    int p5 = 0;
    int p6 = 0;
    int p7 = 0;
    int p8 = 0;
    int p9 = 0;
    int p10 = 0;
    int p11 = 0;
    int p12 = 0;
    int p13 = 0;
    int p14 = 0;
    int p15 = 0;
    int p16 = 0;
    int p17 = 0;
    int p18 = 0;
    int p19 = 0;
    int p20 = 0;
    int p21 = 0;
    int p22 = 0;
    int p23 = 0;
    int p24 = 0;
    int p25 = 0;
    int p26 = 0;
    int p27 = 0;
    int p28 = 0;
    
    //initialize variable for player score
    int score1 = 0;
    
    

    public void paint(Graphics g) //paints all the points on the map
    
    {


        Color coolpurple = new Color(190, 180, 226);//makes points yellow colour
        Color Blacc = new Color (0, 0, 0);

        g.setColor(coolpurple);

        g.drawString("SCORE:", 20, 16);

        // Row 1
        g.fillRect(35, 40, 10, 10); // 1

    

        g.fillRect(160, 40, 10, 10);// 2

        g.fillRect(310, 40, 10, 10);// 3

        g.fillRect(460, 40, 10, 10);// 4

        g.fillRect(625, 40, 10, 10);// 5

        g.fillRect(750, 40, 10, 10);// 6

        // Row 2
        g.fillRect(35, 125, 10, 10); // 1

        g.fillRect(160, 125, 10, 10);// 2

        g.fillRect(310, 125, 10, 10);// 3

        g.fillRect(460, 125, 10, 10);// 4

        g.fillRect(625, 125, 10, 10);// 5

        g.fillRect(750, 125, 10, 10);// 6

        // Row 3
        g.fillRect(35, 210, 10, 10); // 1

        g.fillRect(160, 210, 10, 10);// 2

        g.fillRect(625, 210, 10, 10);// 3

        g.fillRect(750, 210, 10, 10);// 4

        // Row 4
        g.fillRect(35, 295, 10, 10); // 1

        g.fillRect(160, 295, 10, 10);// 2

        g.fillRect(310, 295, 10, 10);// 3

        g.fillRect(460, 295, 10, 10);// 4

        g.fillRect(625, 295, 10, 10);// 5

        g.fillRect(750, 295, 10, 10);// 6

        // Row 5
        g.fillRect(35, 380, 10, 10); // 1

        g.fillRect(160, 380, 10, 10);// 2

        g.fillRect(310, 380, 10, 10);// 3

        g.fillRect(460, 380, 10, 10);// 4

        g.fillRect(625, 380, 10, 10);// 5

        g.fillRect(750, 380, 10, 10);// 6

        
        //filling whenever pacman eats a point it fills it black
        
        if (p1 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(35, 40, 10, 10); // 1
            
        }
        g.setColor(coolpurple);

        if (p2 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(160, 40, 10, 10); // 2
            
        }
        g.setColor(coolpurple);

        if (p3 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(310, 40, 10, 10); // 3
            
        }
        g.setColor(coolpurple);

        if (p4 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(460, 40, 10, 10); // 4
            
        }
        g.setColor(coolpurple);

        if (p5 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(625, 40, 10, 10);// 5
            
        }
        g.setColor(coolpurple);

        if (p6 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(750, 40, 10, 10);// 6
            
        }
        g.setColor(coolpurple);

         if (p7 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(35, 125, 10, 10); // 1
            
        }
        g.setColor(coolpurple);

        if (p8 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(160, 125, 10, 10); // 2
            
        }
        g.setColor(coolpurple);

        if (p9 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(310, 125, 10, 10); // 3
            
        }
        g.setColor(coolpurple);

        if (p10 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(460, 125, 10, 10); // 4
            
        }
        g.setColor(coolpurple);

        if (p11 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(625, 125, 10, 10);// 5
            
        }
        g.setColor(coolpurple);

        if (p12 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(750, 125, 10, 10);// 6
            
        }
        g.setColor(coolpurple);

         if (p13 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(35, 210, 10, 10); // 1
            
        }
        g.setColor(coolpurple);

        if (p14 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(160, 210, 10, 10); // 2
            
        }
        g.setColor(coolpurple);


        if (p15 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(625, 210, 10, 10);// 3
            
        }
        g.setColor(coolpurple);

        if (p16 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(750, 210, 10, 10);// 4
            
        }
        g.setColor(coolpurple);

         if (p17 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(35, 295, 10, 10); // 1
            
        }
        g.setColor(coolpurple);

        if (p18 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(160, 295, 10, 10); // 2
            
        }
        g.setColor(coolpurple);

        if (p19 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(310, 295, 10, 10); // 3
            
        }
        g.setColor(coolpurple);

        if (p20 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(460, 295, 10, 10); // 4
            
        }
        g.setColor(coolpurple);

        if (p21 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(625, 295, 10, 10);// 5
            
        }
        g.setColor(coolpurple);

        if (p22 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(750, 295, 10, 10);// 6
            
        }
        g.setColor(coolpurple);

         if (p23 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(35, 380, 10, 10); // 1
            
        }
        g.setColor(coolpurple);

        if (p24 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(160, 380, 10, 10); // 2
            
        }
        g.setColor(coolpurple);

        if (p25 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(310, 380, 10, 10); // 3
            
        }
        g.setColor(coolpurple);

        if (p26 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(460, 380, 10, 10); // 4
            
        }
        g.setColor(coolpurple);

        if (p27 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(625, 380, 10, 10);// 5
            
        }
        g.setColor(coolpurple);

        if (p28 != 0)
        {
            g.setColor(Blacc);
            g.fillRect(750, 380, 10, 10);// 6
            
        }
        g.setColor(coolpurple);

        //scorecount
        if(score1 == 0)
        {
            g.drawString("0000", 70, 16);


        }
        if(score1 == 1)
        {
            g.drawString("0100", 70, 16);


        }
        if(score1 == 2)
        {
            g.drawString("0200", 70, 16);


        }
        if(score1 == 3)
        {
            g.drawString("0300", 70, 16);


        }
        if(score1 == 4)
        {
            g.drawString("0400", 70, 16);


        }
        if(score1 == 5)
        {
            g.drawString("0500", 70, 16);


        }
        
        if(score1 == 6)
        {
            g.drawString("0600", 70, 16);


        }
                
        if(score1 == 7)
        {
            g.drawString("0700", 70, 16);


        }
        if(score1 == 8)
        {
            g.drawString("0800", 70, 16);


        }
        if(score1 == 9)
        {
            g.drawString("0900", 70, 16);


        }
        if(score1 == 10)
        {
            g.drawString("1000", 70, 16);


        }
        if(score1 == 11)
        {
            g.drawString("1100", 70, 16);


        }if(score1 == 12)
        {
            g.drawString("1200", 70, 16);


        }
        if(score1 == 13)
        {
            g.drawString("1300", 70, 16);


        }
        if(score1 == 14)
        {
            g.drawString("1400", 70, 16);


        }
        if(score1 == 15)
        {
            g.drawString("1500", 70, 16);


        }
        if(score1 == 16)
        {
            g.drawString("1600", 70, 16);


        }if(score1 == 17)
        {
            g.drawString("1700", 70, 16);


        }
        
        if(score1 == 18)
        {
            g.drawString("1800", 70, 16);


        }
        if(score1 == 19)
        {
            g.drawString("1900", 70, 16);


        }
        if(score1 == 20)
        {
            g.drawString("2000", 70, 16);


        }
        if(score1 == 21)
        {
            g.drawString("2100", 70, 16);


        }
        if(score1 == 22)
        {
            g.drawString("2200", 70, 16);


        }
        if(score1 == 23)
        {
            g.drawString("2300", 70, 16);


        }
        if(score1 == 24)
        {
            g.drawString("2400", 70, 16);


        }
        if(score1 == 25)
        {
            g.drawString("2500", 70, 16);


        }
        if(score1 == 26)
        {
            g.drawString("2600", 70, 16);


        }
        if(score1 == 27)
        {
            g.drawString("2700", 70, 16);


        }
        if(score1 == 28)
        {
            g.drawString("2800", 70, 16);
        }

    }
    
}