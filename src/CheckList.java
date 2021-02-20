import java.io.*;

/*
 * Super Class
 * Functionality :  
 */
public class CheckList 
{
	static String yesOrNo;
	static String aircraft_type;
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static String inputMake;
	
	public static void main(String[] args)
	{
		System.out.println ("This program provides a very detailed checklist for several aircrafts\n");
		try
		{
			do {
				System.out.print("Select the category of Aircraft: ");
				System.out.println("\t A. Narrow Body \t  B. Wide Body\n");
				System.out.print ("Please type the category of aircraft: ");
				aircraft_type = inputType();
				if (aircraft_type.equalsIgnoreCase("a") || aircraft_type.equalsIgnoreCase("Narrow Body"))
					NarrowBody();
				else if (aircraft_type.equalsIgnoreCase("b") || aircraft_type.equalsIgnoreCase("Wide Body"))
					WideBody();
				System.out.println();
				System.out.println("Do you want to continue? (Yes or No)");
				yesOrNo = input();
				if (yesOrNo.equalsIgnoreCase("yes"))
					continue;
			} while (!yesOrNo.equalsIgnoreCase("no"));
		}catch (Exception e)
		{
			System.out.println("Sorry, invalid input. Please try again!\n");
		}
		System.out.println("Thank you for trying the checklist program!");
	}

	private static String inputType() throws IOException
	{
		return br.readLine();
	}
	
	public static String input() throws IOException
	{
		return br.readLine();
	}

	private static void NarrowBody() throws IOException
	{
		System.out.println();
		System.out.print("Choose the make of the Narrow-body aircraft: ");
		System.out.println(" \t  A. Airbus \t or \t B. Boeing");
		inputMake = br.readLine();
		if (inputMake.equalsIgnoreCase("Airbus") || inputMake.equalsIgnoreCase("a"))
			NarrowBody.Airbus();
		else if (inputMake.equalsIgnoreCase("Boeing") || inputMake.equalsIgnoreCase("b"))
			NarrowBody.Boeing();
	}

	private static void WideBody()throws IOException
	{
		System.out.println();
		System.out.print("Choose the make of the Wide-body aircraft: ");
		System.out.println(" \t A. Airbus \t B. Boeing");
		inputMake = br.readLine();
		if (inputMake.equalsIgnoreCase("Airbus") || inputMake.equalsIgnoreCase("a"))
			WideBody.Airbus();
		else if(inputMake.equalsIgnoreCase("Boeing") || inputMake.equalsIgnoreCase("b"))
			WideBody.Boeing();
	}
}
