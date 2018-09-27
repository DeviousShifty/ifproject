package controller;
//import

import model.IfDumboWumbo;
import javax.swing.JOptionPane;
//private

public class MyController
{
	public MyController()

	/**
	 * Builds the instance of the Controller.
	 */
	{

	}

	/**
	 * This is where the program starts calling methods to run the program.
	 */

	public void start()
	{
		loopy();
	}

	{
		JOptionPane.showMessageDialog(null, "Hello My Friends \n I hope you have had a good day so far ;)");
	}

	private void loopy()
	{ // Define variable before loop
		boolean isDone = false;
		int count = 0;

		while (!isDone) // ! is not, or the opposite. So false goes to true.
		{
			// JOptionPane.showMessageDialog(null, " Brother may I have some loops?");
			// //eventually change the loop variable
			// count++; //means subtract 1. So its doing 0 minus 1 = -1 which is not greater
			// than 10. Or if you do ++ it adds 1.
			// if (count >= 10)
			{
				// isDone = true; //update variable
			}

		}

	}

	{
		loopys();
	}

	{

	}

	private void loopys()
	{
		boolean isDone = false;
		int count = 0;
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "Numbers");
			count++;
			if (count == 1)
				isDone = true;
			{
				JOptionPane.showMessageDialog(null, "1");
				count++;
				if (count == 2)
					isDone = true;
				{
					JOptionPane.showMessageDialog(null, "2");

				}
			}
			{
			}
		}
	}

	{
		int count = 0;
		for (int loop = 30; loop >= 0; loop -= 15)
		{
			UserInput();
			JOptionPane.showMessageDialog(null, "The loop value is: " + loop);
		}

	}

	private void UserInput()
	{
		IfDumboWumbo userIfDumboWumbo = new IfDumboWumbo();

		String response = JOptionPane.showInputDialog(null, "What is the distance?");

		// repeat until finished correctly
		while (!validDouble(response))
			while (response != null && !validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "No! type in a valid number for the distance");
		}
		// assign
		userIfDumboWumbo.setDistance(Double.parseDouble(response));
		
	response=JOptionPane.showInputDialog(null,"what is the name of the run");
		if(response.equalsIgnoreCase("CTEC"))
	
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing :(");
		}
			
		JOptionPane.showMessageDialog(null, userIfDumboWumbo);
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an integer value like -12345");
		}
		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type is a correct value.");
		}
		JOptionPane.showMessageDialog(null, "You dumbo");
		return isValid;
	}
}
