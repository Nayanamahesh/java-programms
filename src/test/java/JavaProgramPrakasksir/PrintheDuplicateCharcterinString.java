package JavaProgramPrakasksir;

import java.util.LinkedHashSet;

public class PrintheDuplicateCharcterinString {

	public static void main(String[] args) {
		String s="india";
		//step 1
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();//it is used to remove the duplicate charcter
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//step 2
		for(char ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++; //step 3
				}
			}
		
			//step 4
			if(count>1)
			{
			System.out.println(ch+ " = " +count);
		}

		}
	}
}


