package JavaProgramPrakasksir;

public class Demo1 {

	public static void main(String[] args) {
		/*String s1="my name is nayana";//reverse the string
		String[] arr=s1.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}*/
		
		
		
		
	/*int[] arr= {78,4,3456,7890,22,0};              
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			}
		}
	}
	
	{
		System.out.println(arr[0]);
	}
	}
}*/
		
		
		
/*String s1="India";
String rev= " ";
for(int i=s1.length()-1;i>=0;i--)
{
	rev=rev+s1.charAt(i);
}
	System.out.println(rev);	
		
		
	}	
		
}	*/
		
	/*String s="welcome to india";
	String arr[]=s.split(" ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	}
}*/
		
		
int fib1=0;
int fib2=1;
int fib3=0;
System.out.print(fib1+ " "+fib2+ " ");
for(int i=1;i<=10;i++)
{

fib3=fib1+fib2;
fib1=fib2;
fib2=fib3;
}
System.out.print(fib3+ " ");
	}
}
		
		
