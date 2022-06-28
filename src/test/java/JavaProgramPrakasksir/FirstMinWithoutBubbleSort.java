package JavaProgramPrakasksir;

public class FirstMinWithoutBubbleSort {

	public static void main(String[] args) {
		int a[]= {10,45,809,3,11,22};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);

	}

}


