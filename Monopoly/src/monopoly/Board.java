package monopoly;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;


public class Board extends JPanel
{
    private ArrayList<Player> Players = new ArrayList<Player>();
    private ArrayList<Tile> Tiles = new ArrayList<Tile>();
    private int numberOfPlayers;
    
    
    public Board(ArrayList<Player> Players , int numberOfPlayers)
    {
        drawBoard();
        this.Players = Players;
        this.numberOfPlayers = numberOfPlayers;
    }
    
    public void initComponents()
    {
        
    }
    
    public void drawBoard()
    {
        setLayout(null);
        int x = 615;
        int y = 615;
        Tile t = null;
        for(int i=0 ; i < 40 ; i++)
        {
            if(i >= 0 && i <= 10)
            {
                if(i == 0)
                {
                    t = new Tile(i+1+".png",x,y,85,85);
                    x -= 58;
                }
                
                else if( i == 10)
                {
                    t = new Tile(i+1+".png",x,y,85,85);
                    y -= 58;
                }
                
                else
                {
                    if(i == 9)
                    {
                        t = new Tile(i+1+".png",x,y,58,85);
                        x -= 85;
                    }
                    
                    else
                    {
                        t = new Tile(i+1+".png",x,y,58,85);
                        x -= 58;
                    }
                }
            }
            
            else if(i >= 11 && i <= 20)
            {            
                if( i == 20)
                {
                    t = new Tile(i+1+".png",x,y,85,85);
                    x += 85;
                }
                
                else
                {
                    if(i == 19)
                    {
                        t = new Tile(i+1+".png",x,y,85,58);
                        y -= 85;
                    }
                    
                    else
                    {
                        t = new Tile(i+1+".png",x,y,85,58);
                        y -= 58;
                    }
                }
            }
            
            else if(i >= 21 && i <= 30)
            {            
                if( i == 30)
                {
                    t = new Tile(i+1+".png",x,y,85,85);
                    y += 85;
                }
                
                else
                {
                    t = new Tile(i+1+".png",x,y,58,85);
                    x += 58;                   
                }
            }
            
            else if(i >= 31 && i <= 39)
            {            
                t = new Tile(i+1+".png",x,y,85,58);
                y += 58;
            }
            
            add(t);
            Tiles.add(t);
        }      
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
//        player1.draw(g, this);
//        player2.draw(g, this);
//        player3.draw(g, this);
//        player4.draw(g, this);
    }
}
