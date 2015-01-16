

package ArraysStackQueue;
import LinkedList.*;


public class StackSorted
{
	Node top1;
	//Node top2;
	
	 public int pop()
	 {
		 if (top1 != null)
		 {
			 int item = top1.num;
			 top1 = top1.next;
			 return item;
		 }
		 return -1;
	 }
	
	 public void push(int item) 
	 {
		 
		 Node t = new Node(item) ;
		 t.next = top1;
		 top1 = t;
	 
	 }

	public StackSorted compareAndSort(StackSorted s)
	{
		StackSorted r=new StackSorted();
		while(!s.isEmpty())
		{
			int temp=s.pop();
			while(!r.isEmpty() && r.peek()>temp  )
			{
				s.push(r.pop());
			}
			r.push(temp);
		}
		return r;
			
	}
	public void display()
	{
		System.out.println("Here is the list");
	while(top1!=null)
		System.out.println(pop());
	}
	public int peek() {
		if(top1!=null)
			return top1.num;
		return -1;
	}

	public boolean isEmpty()
	{
		if(top1!=null)
			return false;
		else 
			return true;
	}
	public static void main(String args[])
	{
		StackSorted s =new StackSorted();
		s.push(3);
		s.push(1);
		s.push(7);
		s.push(2);
		s.push(8);
		
		StackSorted r = s.compareAndSort(s);
		
		r.display();
		
		
	}

}
