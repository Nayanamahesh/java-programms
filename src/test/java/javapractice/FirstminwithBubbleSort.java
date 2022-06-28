package javapractice;


public class FirstminwithBubbleSort {
	public static void main(String[] args) {
		int[] arr= {198,3,890,52,30,131};
		
			for(int j=0;j<arr.length;j++)
			{
				for(int i=1;i<arr.length-j;i++)
				{
					if(arr[i-1]<arr[i])
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
