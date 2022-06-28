package JavaProgramPrakasksir;

public class ReverseGivenStringwithrespectToWord {

	public static void main(String[] args) {
		String s="Welcome to india";
		String[] arr=s.split(" ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
