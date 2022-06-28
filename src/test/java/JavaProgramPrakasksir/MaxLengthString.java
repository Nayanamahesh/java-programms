package JavaProgramPrakasksir;

public class MaxLengthString {

	public static void main(String[] args) {
		String str[]= {"hello","hi","am","abc","welcome","tyss"};
		String max=str[0];
		for(int i=1; i<str.length;i++)
		{
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		System.out.println(max);

	}

}
