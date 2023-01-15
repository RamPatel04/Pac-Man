//Creators: Ram Patel and Nicholas Dyer
//Course: ICS4U1 F2021 P4
//ICS 4U Unit 6: ICS 4U Summative
//Teacher: Mr.Naccarato
//Creation Date: January 16, 2022
//Submission Date: January 23, 2022
//Task: Created a Pac-Man game with 2 ghosts, without fruit or power pellets.

//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.Color;
import java.io.IOException;

class Main
{

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        
        Game game = new Game();//import game class in variable game 

        JFrame frame = new JFrame("PAC MAN");//create jframe for pac man game

        //sets the frame colour and size
        frame.setBackground(Color.black);
        frame.setSize(800, 466); // Actual size 800 by 436

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adds class game in frame
        frame.add(game);
        frame.setVisible(true);//set frame visible

        game.music.open(game.audioInputStream);//allow music to run
        
        
        while(game.winOrLose()) //while player wins or lose run game
        {
            if(!game.mute) // if player does not presses m play music else mute music
            {
                game.music.start();

            }
            else
            {
                game.music.stop();
            }

            game.update();//run game update to run game


            try
            {
                Thread.sleep(50); // pause for half a second
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
                
        }


    }
}
