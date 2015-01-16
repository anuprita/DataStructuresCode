package LinkedList;

public class StartOfACircularLL {

	public static void main(String[] args) {
		Node n=new Node(1);
		Node head1 = n;
		n.add(head1, 2);
		n.add(head1, 3);
		n.add(head1, 4);
		n.add(head1, 5);
		n.add(head1, 6);
		n.add(head1, 7);
		n.add(head1, 8);
		n.add(head1, 9);
		Node node=head1;
		// creating a linked list with a non-loop and a looped part
		int i=0;
		while(i<6)
		{
			node=node.next;
			i++;
		}
		Node loopStart=node;
		node=head1;
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=loopStart;
				
      StartOfACircularLL c=new StartOfACircularLL();
      Node startLoop=c.returnLoopStart(head1);
      System.out.print(startLoop.num);
      
	}
	
	public Node returnLoopStart(Node head)
	{
		//initialize both to head
		Node fastPointer=head;
		Node slowPointer=head;
		
		//condition checks for circular and non-circular both
		//used fastpointer as it traverses thru ythe LL fatser than slow
		//check when  fastpointer is on last element.Helps check if the last elements.next is null or no
		while(fastPointer!=null && fastPointer.next!=null)
		{
			fastPointer=fastPointer.next.next;
			slowPointer=slowPointer.next;
			//System.out.println(fastPointer.num+" "+slowPointer.num);
			if(slowPointer==fastPointer)
			{
				break;
			}
		}
		//if the while condition fails..then it is because one of the below so its not a circular LL
		if(fastPointer==null || fastPointer.next==null)
			return null;
		//once u get collision point get slow to head and fast where it is
		slowPointer=head;
		//System.out.println("out of the first while ");
		//run the while till fast==slow as here we cant have head!=null or any other such condition
		// this is circular ll
		while(slowPointer!=fastPointer)
		{
			//System.out.println("aaa");
			slowPointer=slowPointer.next;
			
		
		}
		//once slow==fast,send slow or fast as the start of the loop
		return slowPointer;
	}

}
