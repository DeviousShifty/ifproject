package model;

public class IfDumboWumbo
{	//its about skylark
	private double distance ;
	private String name ;
	private int timeMinutes ;
	private int timeHours;
	/**
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet about the IfDumboWumbo.
	 */
	
	
	
	public IfDumboWumbo()
	{
		this.distance = -99.99;
		this.name= "unnamed run";
		this.timeMinutes = -99;
		this.timeHours = -99;
		
	}
	
	public IfDumboWumbo(double distance) 
	{
	this.distance = distance;
	}
	public double getDistance()
	
	
		{
			
		}
	
		public String toString()
		{
			String description = "This is a Run!";
			description+= "The Run is name" + name;
			return description;
		}

		public void setDistance(double parseDouble)
		{
			// TODO Auto-generated method stub
			
		}
}		
		
		
