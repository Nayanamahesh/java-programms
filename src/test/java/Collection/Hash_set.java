package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hash_set {

	public static void main(String[] args) {
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(null);
		set.add("hai");
		set.add('N');
		set.add(null);
		set.add(10);
		set.add("hai");
		Iterator<Object> i=set.iterator();
		while(i.hasNext())
		{
		
		System.out.println(i.next());
		}
	}
	}


