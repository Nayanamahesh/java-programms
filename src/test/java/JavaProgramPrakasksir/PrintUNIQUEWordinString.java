package JavaProgramPrakasksir;

import java.util.LinkedHashSet;

public class PrintUNIQUEWordinString {

	public static void main(String[] args) {
		String s="welcome to india india";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();//it is used to remove the duplicate charcter
		for(int i=0;i<str.length;i++)//used to read the chracter from the string
		{
			set.add(str[i]);//
		}
		//step 2
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++; //step 3
				}
			}if(count==1)
			//step 4
			System.out.print(word+ " ");

		}
	}

}
