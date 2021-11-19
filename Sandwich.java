
import java.util.ArrayList;
public class Sandwich 
{

	private String bread;
	private ArrayList<String> vegetables;
	private String meat;
	private double price;
	
	public Sandwich()
	{
		this.bread ="";
		this.vegetables = new ArrayList<String>();
		this.meat = "";
		this.price = 0.0;	
	}
	
	public Sandwich(String bread, ArrayList<String> vegetables, String meat, double price)
	
	{
		this.bread = bread;
		this.vegetables = vegetables;
		this.meat = meat;
		this.price = price;
	}
	
	public String getBread()
	{
		return bread;
	}
	
	public ArrayList<String> getVegetables()
	{
		 return vegetables;
	}
	
	public String getMeat()
	{
		return meat;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setBread(String bread)
	{
		this.bread = bread;
	}
	
	public void setVegetable(ArrayList<String> vegetables)
	{
		this.vegetables = vegetables;
	}
	
	public void setMeat(String meat)
	{
		this.meat = meat;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String toString()
	{
		String veggy = "";
		for(int i = 0; i < vegetables.size();i++)
		{
			veggy += vegetables.get(i);
			veggy += ", ";
		}
			
		return getBread() + "	" + veggy + "	" + getMeat() + "	$" + getPrice();
	}
}
