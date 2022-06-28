package javapractice;

public class NumberPolindrome {
	public static void main(String[] args) {
		int no=161;
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(copy==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
