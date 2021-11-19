
public class Order 
{
	
	private String name;
	private Sandwich sand;
	private String time;
	
	public Order()
	{
		this.name = "";
		this.sand = new Sandwich();
		this.time = "";
		
	}
	
	public Order(String name, Sandwich sand, String time)
	{
		this.name = name;
		this.sand = sand;
		this.time = time;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Sandwich getsand()
	{
		return sand;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSandwich(Sandwich sand)
	{
		this.sand = sand;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public String toString()
	{
		return getTime() + "	" + getName() + "	" + sand.toString();
	}
}
