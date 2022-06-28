package javapractice;

public class Stringpolindrome {
	public static void main(String[] args) {
		String s1="AMMA";//CIVIC,APPA,MOM,DAD
		String rev=rev(s1);
		if(s1.equals(rev))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not a palindrome");
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
