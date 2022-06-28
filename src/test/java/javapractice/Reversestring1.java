package javapractice;

public class Reversestring1 {
	public static void main(String[] args) {
		
		String s="welcome to tyss";//output->ssyt emoclew
		String[] arr = s.split(" ");
		for(int i=arr.length-1; i>=0; i--)
		{
			if(i%2==0)
			{
				System.out.print(rev(arr[i]));
			}
			else
			{
			System.out.print(arr[i]);
			}
			System.out.print(" ");
		}
	}

	public static String rev(String s1) 
	{
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) 
		{
			
			rev=rev+s1.charAt(i);
		}
		return rev;
	}
	}
