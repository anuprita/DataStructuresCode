package LinkedList;
import java.util.*;
public class RemoveDuplicateLL {

	public LinkedList<Character> findDuplicate(LinkedList<Character> r)
	{
		
	for(int i=0;i<r.size();i++)
	{
		for(int j=0;j<r.size();j++)
		{
			if(r.get(i)==r.get(j) && i!=j)
			{
				r.remove(j);
			}
		}
	}
	return r;	
		
		
		
	}
	
	public static void main(String args[])
	{
		LinkedList<Character> r=new LinkedList<Character>();
		r.add('F');
		r.add('O');
		r.add('L');
		r.add('L');
		r.add('O');
		r.add('W');
		r.add('U');
		r.add('P');
		RemoveDuplicateLL duplicate=new RemoveDuplicateLL();
		LinkedList<Character> list=duplicate.findDuplicate(r);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
	}
	
	
}
