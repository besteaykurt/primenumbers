
public class primenumbers {

	
	
		static int number;
		static int a=68;  
		static public int IsPrime(int number)	{
		if (number == 1 || number == 2)	
			return 1;
		
		for (int i=2; i<a; i++)	{
		if ( (number/i)==(int)(number/i) )
		return 0;
		}
		return 1;
		
		}

		public static void main(String[] args) {
        System.out.println("Asal sayılar = " + number);
		}
	

	

}
