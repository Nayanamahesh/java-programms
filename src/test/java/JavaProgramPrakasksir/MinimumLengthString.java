package JavaProgramPrakasksir;

public class MinimumLengthString {

	public static void main(String[] args) {
		String str[]= {"hi","hello","abc","tyss","am"};
		String min=str[0];
		for(int i=0;i<str.length;i++)
		{
			if(min.length()>str[i].length())
			{
				min=str[i];
			}
		}//this for minvalue of string
		for(int i=0;i<str.length;i++) //this is for same length of string or duplicate variable
		{
			if(min.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}

	}

}
