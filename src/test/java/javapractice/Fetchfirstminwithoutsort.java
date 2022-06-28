package javapractice;

public class Fetchfirstminwithoutsort {
	
		 public static void main(String[] args) {
			int[] arr= {12, 54, 78, 19, 7, 420};  
			int max =arr[0];
			for(int i=1; i<arr.length;i++) {
				if (max>arr[i]) {
					max=arr[i];
				}
				
			}
			System.out.println(max);
		}
	}


