package JavaProgramPrakasksir;

public class AdditionIntegerNumber {

	public static void main(String[] args) {
		String s="2#3a&5b*5";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				int n=s.charAt(i)-48;
				System.out.println(n);
				sum=sum+n;
			}
		}
		System.out.println("sum of given numbers " +sum);

	}

}
