package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		TreeSet<Object> set=new TreeSet<Object>();
		set.add("hai");
		set.add("hello");
		set.add("bye");
		//set.add(null);//we can not add null as a value,it throw the nullpointer exception
		set.add("hoi");
		//set.add(4);// it is homogeneous collection,if we try to store heterogenous data it will throw class cast exception
		Iterator<Object> i=set.iterator();
		while(i.hasNext())
		{
		
		System.out.println(i.next());
		}

	}

}
