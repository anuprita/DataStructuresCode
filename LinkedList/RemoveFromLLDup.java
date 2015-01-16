package LinkedList;

public class RemoveFromLLDup
{
public static void main(String args[])
{
	Node n = new Node('F');
	
	Node head = n;
	n.add(head, 'O');
	n.add(head, 'L');
	n.add(head, 'L');
	n.add(head, 'O');
	n.add(head, 'W');
	n.add(head, 'U');
	n.add(head, 'P');
	Node outer = head;
	Node prev=head;
	Node inner = null;
	
	while(outer!=null)//first pointer
	{
		inner = outer.next;//second pointer from next node to check first with all elements from next node
		System.out.println("outer:"+outer.data);
		while(inner!=null)
		{
			if(outer.data==inner.data)
			{
				prev.next = inner.next;//when u delete the current element ,i.e inner
				// you need to have a previous which will hold the net element
			}
			else
			{
				prev=inner;
				System.out.println("inner:"+inner.data);
			}
		
			inner=inner.next;
		}
		
		outer=outer.next;
	}
	
	outer=head;
	while(outer!=null)
	{
		System.out.println(outer.data);
		outer=outer.next;
	}
	
	
}
	

}
