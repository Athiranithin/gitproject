package mav;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example_interaction {
	public static void main(String args[])
	{
		Example_interaction ob=new Example_interaction();
		ob.link();

}
	public void link()
	{
		List<String>a1=new LinkedList<String>();
		a1.add("welcome");
		a1.add("to");
		a1.add("our");
		a1.add("website");
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext())
		{
      	System.out.println(itr.next());
			
	}
	itr.remove();
	System.out.println("after remove"+a1);
		}
	}

