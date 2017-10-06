package monopoly;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Game extends JFrame 
{
    private Container c;
    private JTextArea Info = new JTextArea();
    private Board Board = new Board(null,2); 
    private JPanel Data = new JPanel(); 
    private JButton Buy = new JButton("Buy"); 
    private JButton Roll = new JButton("Roll"); 
    private JButton InfoButton = new JButton("View Tile Information");
    
    private JLabel player1 = new JLabel("player 1 : 1500");
    private JLabel player2 = new JLabel("player 2 : 1500");
    private JLabel player3 = new JLabel("player 3 : 1500");
    private JLabel player4 = new JLabel("player 4 : 1500");
    private ImageIcon car1;
    
    
    private Player p1 = new Player("Player1",null,0,0);
    private Player p2 = new Player("Player2",null,0,0);
    private Player p3 = new Player("Player3",null,0,0);
    private Player p4 = new Player("Player4",null,0,0);
    private Player currPlayer = p1;
    
    private ArrayList<Location> Countries = new ArrayList();
    
    private Die dice = new Die();
    
    public Game() { init(); } 
    
    public void init() 
    {
        c = getContentPane(); 
        setSize(1000,730);
        setTitle("Monopoly");
        setLocation(150,0);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        
        Data.setPreferredSize(new Dimension(293,700));
        Data.add(Buy); 
        Data.add(Roll); 
        Data.add(InfoButton);
        Data.add(Info);
//        Data.add(player1);
//        Data.add(player2);
//        Data.add(player3);
//        Data.add(player4);
        
        
        Buy.setPreferredSize(new Dimension(80,40));
        InfoButton.setPreferredSize(new Dimension(165,40));
        Roll.setPreferredSize(new Dimension(80,40));
        Info.setPreferredSize(new Dimension(165,150));
        Info.setEditable(false);
        
        c.add(Board);
        c.add(Data , BorderLayout.WEST) ; 

        InfoButton.addActionListener(new InfoButtonListener());
      //Data.setBackground(Color.gray);
        
         
        startGame();
    }
    
    void startGame()
    {
        initializeCountries();
        startRound();
    }
    
    void initializeCountries()
    {
        Countries.add(new Location("GO"));
        
        Countries.add(new Country("Times Square",60,2));
        Countries.add(new Chance("Community Chest"));
        Countries.add(new Country("Baltic Avenue",60,4));
        Countries.add(new Location ("Income Tax"));
        Countries.add(new RailRoad("Reading Railroad"));
        Countries.add(new Country("Oriental Avenue",100,6));
        Countries.add(new Chance("Chance"));
        Countries.add(new Country("Vermont Avenue",100,6));
        Countries.add(new Country("Ellis Island",120,8));
        
        Countries.add(new Jail());
        
        Countries.add(new Country("East Village",140,10));
        Countries.add(new waterelec("Electric Company"));
        Countries.add(new Country("States Avenue",140,10));
        Countries.add(new Country("Virginia Avenue",160,12));
        Countries.add(new RailRoad("Pennsylvania Railroad"));
        Countries.add(new Country("St James Place",160,14));
        Countries.add(new Chance("Community Chest"));
        Countries.add(new Country("Tennesee Avenue",180,14));
        Countries.add(new Country("New York Avenue",200,16));
        
        Countries.add(new Location("Free Parking"));
        
        Countries.add(new Country("Kentucky Avenue",220,18));
        Countries.add(new Chance("Chance"));
        Countries.add(new Country("Indiana Avenue",220,18));
        Countries.add(new Country("Illinois Avenue",240,20));
        Countries.add(new RailRoad("B&O Railroad"));
        Countries.add(new Country("Atlantic Avenue",260,22));
        Countries.add(new Country("Ventor Avenue",260,22));
        Countries.add(new waterelec("Water Works"));        
        Countries.add(new Country("Marvin Gardens",280,24));
        
        Countries.add(new Location ("Go to Jail"));
        
        Countries.add(new Country("Pacific Avenue",300,26));      
        Countries.add(new Country("Central Park",300,26));
        Countries.add(new Chance("Community Chest"));
        Countries.add(new Country("Penn Avenue",320,28));
        Countries.add(new RailRoad("Short Line"));
        Countries.add(new Chance("Chance"));
        Countries.add(new Country("Park Place",350,35));
        Countries.add(new Location ("Luxury Tax"));
        Countries.add(new Country("Wall Street",400,50));
    }
    
    void startRound()
    {
        int n = dice.Roll();
        
        for(int i = 0; i < Countries.size(); i++)
        {
            //Country cc = (Country) Countries.get(i);
            //(cc.getName().equals(currPlayer.getCurrentLocation().getName()))
                ;
        }    
    }
 
    class InfoButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Location l = Countries.get(1);
            Game.this.Info.setText(l.viewInformation());
            Game.this.Info.setFont(new Font("Arial",Font.BOLD,14));
        }
    }
}
 

