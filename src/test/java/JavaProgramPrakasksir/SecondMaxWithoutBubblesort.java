package JavaProgramPrakasksir;

public class SecondMaxWithoutBubblesort {

	public static void main(String[] args) {
		int a[]= {30,2099,45,51,2};
		int Fmax=a[0];
		int Smax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(Fmax<a[i])
			{
				Smax=Fmax;
				Fmax=a[i];
			}
			else if(Smax<a[i])
			{
				Smax=a[i];
			}
		}
		System.out.println(Fmax+ " "+Smax);
		}
	
	
}

