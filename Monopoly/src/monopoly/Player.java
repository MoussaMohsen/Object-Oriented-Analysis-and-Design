package monopoly;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Player
{
    private String Name;
    private Location currentLocation;
    private ArrayList OwnedCountries = new ArrayList();
    private int Money = 1500;
    private ImageIcon Img;
    private int x;
    private int y;
    
    public Player(String name,ImageIcon Img, int x , int y){this.Name = Name; this.Img = Img; this.x = x ; this.y = y;}

    public ImageIcon getImage(){return Img;};
    
    public String getName(){return Name;}
    
    public int getMoney(){return Money;}

    public void addMoney(int Money){this.Money += Money;}
               
    public void deductMoney(int Money){this.Money -= Money;}
    
    public Location getCurrentLocation(){return currentLocation;}

    public void setCurr(Location currentLocation){this.currentLocation = currentLocation;}

    public ArrayList getOwnedCountries(){return OwnedCountries;}
    
    public void addOwned(Country c){this.OwnedCountries.add(c);}
    
    public void Buy()
    {
        if(currentLocation instanceof Country)
        {
            Country c = (Country) currentLocation;
            if(c.isBought())
                System.out.println("Country is already owned by "+c.getOwner());
            
            else
            {
                c.setOwner(this.Name);
                this.deductMoney(c.getCost());
            }
        }
            
        else if(currentLocation instanceof RailRoad)
        {
            RailRoad r = (RailRoad) currentLocation;
            if(r.isBought())
                System.out.println("RailRoad is already owned by "+r.getOwner());
            
            else
            {
                r.setOwner(this.Name);
                this.deductMoney(r.getCost());
            }
        }
        
        else
            System.out.println("This tile cannot be bought");
        
    }
    
    public void draw(Graphics g , Board b)
    {
        g.drawImage(Img.getImage(),x,y,30,30,b);
    }
}
