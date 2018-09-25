package model;

public class IfDumboWumbo
{	//its about skylark
	private String name;;
	private int length;
	private boolean isDumbo;
	private boolean likesLeague;
	
	/**
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet about the IfDumboWumbo.
	 */
	
	
	
	public IfDumboWumbo()
	{
		
	}
	
	public IfDumboWumbo(String name) 
	{
	this.name = name;
	}
	
	public IfDumboWumbo(String name, int length, boolean isDumbo, boolean likesLeague)
	{
		this.length = length;
		this.isDumbo = isDumbo;
		this.likesLeague = likesLeague;
	}
		public String getName()
		{
			return name;
		}
		public boolean getisDumbo()
		{
			return isDumbo;
		}
		public boolean getlikesLeague()
		{
			return likesLeague;
		}
		public int getlength()
		{
			return length;
		}
		
		public String toString()
		{
		String description = "DumboWumbo's name is + Skylar"+ length+"likes League"+"is Dumbo";
		return description;
		}
	
}		
		
		
