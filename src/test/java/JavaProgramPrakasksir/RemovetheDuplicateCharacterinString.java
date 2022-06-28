package JavaProgramPrakasksir;

import java.util.LinkedHashSet;

public class RemovetheDuplicateCharacterinString {

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
			System.out.print(ch);
		}

	}

}
