package JavaProgramPrakasksir;

import java.util.LinkedHashSet;

public class NumberOfAccuranceOfgivenStringOfChracter {

	public static void main(String[] args) {
		String s="india";
		//step 1
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();//it is used to remove the duplicate charcter
		for(int i=0;i<s.length();i++)//used to read the chracter from the string
		{
			set.add(s.charAt(i));// add charcters into the set
		}
		//step 2
		for(char ch:set) //to fetch each charcter
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i)) //compare the charcaters
				{
					count++; //step 3
				}
			}
			//step 4
			System.out.println(ch+ " " +count);
		}

	}

}
