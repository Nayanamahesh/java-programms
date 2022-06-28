package javapractice;

public class FirstmaxwithBubbleSort {
	public static void main(String[] args) {
		int[] arr= {98,3,789,45,30,12};
		
			for(int j=0;j<arr.length;j++)
			{
				for(int i=1;i<arr.length-j;i++)
				{
					if(arr[i-1]>arr[i])
					{
						int temp=arr[i-1];
						arr[i-1]=arr[i];
						arr[i]=temp;
					}
				}
			}
			
			System.out.println(arr[arr.length-1]);

}
}