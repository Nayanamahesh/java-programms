
package JavaProgramPrakasksir;

public class PositionOfWordWithoutLinkedHashSet {

	public static void main(String[] args) {
		String str="welcome to tyss welcome to banglore";
		String[] s1=str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]+ " = "+(i+1));
		}

	}

}
