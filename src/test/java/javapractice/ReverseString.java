package javapractice;

public class ReverseString {
	public static void main(String[] args) {
		String s1="welcome to tyss";//output emoclew ot ssyt
		String[] arr = s1.split(" ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(rev(arr[i]));
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
