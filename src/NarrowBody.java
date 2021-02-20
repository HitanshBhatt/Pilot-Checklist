import java.io.*;

public class NarrowBody 
{
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static String nb_model;

	private static void Main(String[]args) 
	{
		System.out.println("Narrow Body manual: ");
	}

	static void Airbus() throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("\nChoose the model of the aircraft: ");
		System.out.println(" 1. A320 \t 2. A319 ");
		nb_model = br.readLine();
		if (nb_model.equalsIgnoreCase("A320") || nb_model.equalsIgnoreCase("1"))
			A320();
		else if(nb_model.equalsIgnoreCase("A319") || nb_model.equalsIgnoreCase("2"))
			A319();
	}
		
	private static void A320() throws IOException
	{
		System.out.println();
		System.out.println("The checklist for the A320 will open in a new tab in a few seconds: ");
		Display_Image.DisplayImageA320();
	}

	private static void A319()
	{
		System.out.println();
		System.out.println("The checklist for the A319 will open in a new tab in a few seconds: ");
	}


	static void Boeing() throws IOException
	{
		System.out.print("\nChoose the model of the aircraft: ");
		System.out.println(" 1. B737 \t ");
		nb_model = br.readLine();
		if (nb_model.equalsIgnoreCase("B737"))
			B737();
	}

	static void B737() throws IOException
	{
		System.out.println("\nThe checklist for the A320 will open in a new tab in a few seconds: ");
		Display_Image.DisplayImageB737();
	}
}
