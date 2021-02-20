import java.io.*;

public class WideBody 
{
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static String nb_model;

	static void Airbus() throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("\nChoose the model of the aircraft: ");
		System.out.println(" 1. A380 \t 2. A350 \t 3. A340");
		nb_model = br.readLine();
		if (nb_model.equalsIgnoreCase("A380") || nb_model.equalsIgnoreCase("1"))
			A380();
		else if(nb_model.equalsIgnoreCase("A350") || nb_model.equalsIgnoreCase("2"))
			A350();
		else if(nb_model.equalsIgnoreCase("A340") || nb_model.equalsIgnoreCase("3"))
			A340();
	}

	private static void A380()
	{
		System.out.println("\nThe checklist for the A380 will open in a new tab in a few seconds: ");
	}

	private static void A350()
	{
		System.out.println("\nThe checklist for the A350 will open in a new tab in a few seconds: ");
	}

	private static void A340() throws IOException
	{
		System.out.println("\nThe checklist for the A340 will open in a new tab in a few seconds: ");
		Display_Image.DisplayImageA340();
	}

	static void Boeing() throws IOException
	{
		System.out.print("\nChoose the model of the aircraft: ");
		System.out.println(" 1. B747 \t ");
		nb_model = br.readLine();
		if (nb_model.equalsIgnoreCase("B747") || nb_model.equalsIgnoreCase("1"))
			B747();
		else
			CheckList.main(null);
	}

	public static void B747() throws IOException
	{
		System.out.println();
		System.out.println("The checklist for the B747 will open in a new tab in a few seconds: ");
		Display_Image.DisplayImageB747();
	}
}
