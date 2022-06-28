package JavaProgramPrakasksir;

public class FirstMaxWithoutBubbleSort {

	public static void main(String[] args) {
		int a[]= {10,45,809,3,11,22};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
