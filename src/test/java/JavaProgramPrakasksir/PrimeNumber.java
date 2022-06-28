package JavaProgramPrakasksir;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=10;
		int j=2;
		while(n>=j)
		{
			if(n%j==0)
			{
				break;
		    }
			
			j++;
			
		}
		if(n==j)
		{
			System.out.println("primenumber");
		}	
			else
			
				System.out.println("not a prime");
		}
	}

