package lab2BMatusiakPawel;

public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wyjatek = "dzielenie";
		try 
		{
			generuj(wyjatek);
		 System.out.println("Wyjatek przy operacji typu:\"" + wyjatek + "\" nie zostal wygenerowany");
		} 
		catch (Exception e) 
		{
			
			
			
			
		 System.out.println("Przy operacji typu \"" + wyjatek + "\" wystapil wyjatek: \n" + e.getClass() 
					+ "\n Z nastepujaca informacja: " + e.getMessage());
		 
		 
		 
		 
		}			
	}




static int generuj(String s) throws DivException 
{
	try 
	{
		if (s.equals("dzielenie")) 
		{
			int i = 0;
			return i/i;
		}
		
		return 0;
	} 
	finally 
	{
		System.out.println("\n[wygeneruj(\"" + s +"\") zakonczone]");
	}
}
}

class DivException extends Exception 
{
	int nrBledu;
	DivException() 
	{ this("");
	this.nrBledu=500;}

	DivException(String s) 
	{ 
		super("\n***\n\tNic sie nie stalo to tylko: " + "NaszWyjatek\n***\n\t"+s); 
	}
}

