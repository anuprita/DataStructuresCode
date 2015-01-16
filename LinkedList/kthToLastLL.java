package LinkedList;

public class kthToLastLL {
	
	public void print(Node head,int k)//print k to last
	{
		Node node=head;
		int counter=0;
		while(node!=null)
		{
			counter++;
			if(counter<k)
			{
				
			}
			else
			{
				System.out.print(node.data+" ");
			}
			node=node.next;
		}
	}
	public void deleteInMiddle(Node node)
	{
		Node prev=node;
		node=node.next;
		prev.data=node.data;
		prev.next=node.next;
		
	}
	public void returnKthLast(Node head,int k)
	{
		Node node=head;
		int counter=0;
		while(node!=null)
		{
			counter++;
			node = node.next;
		}
		System.out.println(counter);
		int i=0;
		int element=counter-k+1;
		Node n=head;
		Node prev=head;
		while(i<element)
		{
			System.out.println("for i="+i+"   "+"prev:"+prev.data+"    n:"+n.data);
			prev=n;
			n=n.next;
			i++;
			
		}
		if(i==element)
		{
			System.out.println("element is:"+prev.data);
		}
		
	}
	public Node sortPartition(int value,Node head)
	{
		Node node=head;
		Node beforeList=null;
		Node afterList=null;
		while(node!=null)
		{
			Node next = node.next;
			if(node.data<value)
			{
				node.next=beforeList;
				beforeList=node;
				System.out.println(node.data+" added to before list");
			}
			else
			{
				node.next=afterList;
				afterList=node;
				System.out.println(node.data+" added to after list");
			}
			node=next;
		}
		if(beforeList==null)
			return afterList;
		head=beforeList;
		while(beforeList.next!=null)//merge beforelist with afterlist
		{
			beforeList=beforeList.next;
			
		}
		
		beforeList.next=afterList;
		return head;
	}
public static void main(String args[])
{
	Node n=new Node('F');
	Node head = n;
	n.add(head, 'O');
	n.add(head, 'L');
	n.add(head, 'L');
	n.add(head, 'O');
	n.add(head, 'W');
	n.add(head, 'U');
	n.add(head, 'P');
	int i=0;
	Node someMiddle = head;
	while(i<4) 
		{someMiddle=someMiddle.next;
		i++;
		}
	
	
	kthToLastLL object=new kthToLastLL();
	//object.print(head, 3);
	object.returnKthLast(head, 2);
	//object.deleteInMiddle(someMiddle);
	/*Node tr = head;
	while(tr!=null)
	{
		System.out.println(tr.data);
		tr = tr.next;
	}*/
	
	/*Node returned=object.sortPartition('P', head);
	while(returned!=null)
	{
		System.out.println(returned.data);
		returned=returned.next;
	}*/
}
}
