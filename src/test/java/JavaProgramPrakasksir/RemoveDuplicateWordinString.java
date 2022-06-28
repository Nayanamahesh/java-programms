package JavaProgramPrakasksir;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordinString {

	public static void main(String[] args) {
		String s="welcome to india  mandya india";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();//it is used to remove the duplicate charcter
		for(int i=0;i<str.length;i++)//used to read the chracter from the string
		{
			set.add(str[i]);
		}
		//step 2
		for(String word:set)
		{
			System.out.print(word+ " ");
		}
	

	}

}
