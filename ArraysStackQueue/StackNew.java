package ArraysStackQueue;
import LinkedList.*;
public class StackNew
{
	 Node2 top;
		
	 public int pop()
	 {
	if (top != null)
	{
	 int item = top.num;
	top = top.next;
	 return item;
	 }
	 return -1;
	 }
	
	 public void push(int item) 
	 {
		 
	 Node2 t = new Node2(item) ;
	t.next = top;
	if(top==null)
	{
		t.minimum=t.num;
	}
	else
	{
		setMinimum(t,top);
	}
	 top = t;
	 
	 }
	
	public void setMinimum(Node2 t,Node2 top)
	{
		int minimum=Math.min(t.num, top.minimum);
		t.minimum=minimum;
	}
	public int findMinimum()
	{
		if (top != null)
		{
		 int min = top.minimum;
		 return min;
		 }
		 return -1;
	}

	public int peek()
	 {
	 return top.num;
	 }
	public static void main(String args[])
	{
		StackNew s=new StackNew();
		s.push(-2);
		s.push(34);
		s.push(4);
		s.push(11);
		s.push(100);
		s.push(98);
		
		System.out.println(s.findMinimum());
	}
}

class Node2
{
	Character data;
	int num;
	Node2 next;
	int minimum;
	public Node2(){num=0;}
	public Node2(Character d)
	{
		data = d;
	}
	public Node2(int d)
	{
		num = d;
	}

	public void add(Node head, Character d)
	{
		Node n = head;
		while(n.next!=null) n = n.next;
		
		Node newNode = new Node(d);
		n.next = newNode;
	}
	public void add(Node head, int d)
	{
		Node n = head;
		while(n.next!=null) n = n.next;
		
		Node newNode = new Node(d);
		n.next = newNode;
	}
	public Node remove(Node head,Character d)
	{
		Node n = head;
		if(n.data==d)
		{
			return head.next;
		}
		else
		{
			while(n.next!=null)
			{
				if(n.next.data==d)
				{
					n.next=n.next.next;
					return head;
				}
				n=n.next;
			}
			return head;
		}
	}
}