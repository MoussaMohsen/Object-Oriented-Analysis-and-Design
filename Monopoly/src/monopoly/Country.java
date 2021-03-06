package monopoly;
import java.util.*;

public class Country extends Location
{
    private int Cost;
    private int Rent;
    private boolean Bought =false;
    private int nHotels;
    private int nHouses;
    private String Owner;
    private static ArrayList<Country> CountryList = new ArrayList<Country>();
    
    public Country(String Name, int Cost, int Rent)
    {
        super(Name);
        this.Cost = Cost;
        this.Rent = Rent;
        Owner = "None";
        CountryList.add(this);
    }
    
    public static ArrayList<Country> getList(){return CountryList;}
    
    public int getCost(){return Cost;}

    public void setCost(int Cost){this.Cost = Cost;}

    public int getRent(){return Rent;}
 
    public void setRent(int Rent){this.Rent = Rent;}

    public boolean isBought(){return Bought;}
        
    public void setBought(boolean Bought){this.Bought = Bought;}

    public int getnHotels(){return nHotels;}

    public void setnHotels(int nHotels){this.nHotels = nHotels;}

    public int getnHouses(){return nHouses;}
        
    public void setnHouses(int nHouses){this.nHouses = nHouses;}
    
    public String getOwner(){return Owner;}
    
    public void setOwner(String Owner){this.Owner = Owner;}
    
    public String viewInformation()
    {
        return
        "Name: "+getName()+"\n"+
        "Cost: "+"$"+Cost+"\n"+        
        "Rent: "+"$"+Rent+"\n"+
        "Owner: "+Owner;  
    }
}
