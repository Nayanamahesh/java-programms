package javapractice;

public class ReverseString4 {

	public static void main(String[] args) {
		String s="Welcome to TYSS Welcome to RMG";
		String[] arr=s.split(" ");
		for( int i=0;i<arr.length; i++) {
			if((arr[i].equals("Welcome")||arr[i].equals("to"))) {
				System.out.print(rev(arr[i])+"{"+arr[i].length()+"}");
			}
			else {
				System.out.print(arr[i]+"{"+arr[i].length()+"}");
			}
			System.out.print(" ");
		}

	}

	public static String rev(String s) {
		String rev=" ";
		for (int i =s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);

		}
		return rev;
	}

}


