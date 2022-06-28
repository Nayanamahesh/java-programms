package javapractice;

public class FirstmaxString {
	public static void main(String[] args) {
		
		String[] arrString= {"nayana", "good", "channagiri", "hi"};
		int max=arrString[0].length();
		String maxlength="";
		
		for(int i=1; i<arrString.length; i++)
		{
			if(arrString[i].length()>max) 
			{
				max=arrString[i].length();
				maxlength=arrString[i];
			}
		}
		System.out.println(maxlength);
	}

}
