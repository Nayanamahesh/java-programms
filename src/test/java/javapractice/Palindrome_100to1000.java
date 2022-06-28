package javapractice;

public class Palindrome_100to1000 {
	public static void main(String[] args) {
		
		for(int i=100; i<1000; i++)
		{
			if(rev(i)==i)
			{
				System.out.println(i + "is a palindrome number");
			}
		}
	}
	
	public static int rev(int i) {
		int rev=0;
		while(i!=0)
		{
			int rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		return rev;
			
		}
	}
