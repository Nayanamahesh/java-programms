package Collection;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(20);
		list.add('a');
		list.add("hai");
		list.add(30);
		list.add(20.45);
		System.out.println(list);
		list.add(2,"hello");
		System.out.println(list);
		
		ArrayList<Object> list1=new ArrayList<Object>();
		list.add(200);
		list.add('b');
		list.add("haiii");
	
		
		list.remove("hai");
		System.out.println(list);
		
		

	}

}
