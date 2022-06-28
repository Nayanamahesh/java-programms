package JavaProgramPrakasksir;

import java.util.LinkedHashSet;

public class PositionOfWordusingLinkedHashSet {
	public static void main(String[] args) {
		
	
	String s1="katham Ta ta Bye bye";
	String[] str = s1.split(" ");
	LinkedHashSet<String> set =new LinkedHashSet<String>();
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	for(String ch:set)
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(ch.equalsIgnoreCase(str[i]))
			{
				count++;
			}
		}
		System.out.println(ch+ " "+count);
	}
	}
	

}
