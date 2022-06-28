package JavaProgramPrakasksir;

public class SetOfPrimeNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,6,5,7,8,9,10,11};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
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
				System.out.println(a[i]);
			
			}
		}

	}

}
