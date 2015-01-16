package LinkedList;


public class Node
{
	public Character data;
	public int num;
	public Node next;
	public Node(){num=0;}
	public Node(Character d)
	{
		data = d;
	}
	public Node(int d)
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