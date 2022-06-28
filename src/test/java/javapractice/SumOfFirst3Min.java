package javapractice;
public class SumOfFirst3Min
{
	public static void main(String[] args) {
		int[] arr= {12, 54, 78, 19, 7, 420};  //7, 12, 19, 54, 78, 420
		for (int j=0; j<arr.length;j++) {
			for(int i=1; i<arr.length-j;i++) {
				if(arr[i-1]>arr[i]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0; i<3;i++) {
			sum=sum+arr[i];
		}
		System.out.print(sum);
	}

}
