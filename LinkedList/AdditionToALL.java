package LinkedList;

public class AdditionToALL {
	
	public Node additionLL(Node head1,Node head2,Node n,Node m)
	{
		//add is the third linkedlist that stores the result. it has 2 ptrs, first/head and last/tail
		Node addFirst=null;
		Node addLast=null;
		//when the sum exceeds 9, we need to carry forward the ten's digit
		int carry=0;
		// while either of the numbers have more digits, continue
		while(head1!=null||head2!=null)
		{
			//create a new node to store the digit of the sum
			Node sum=new Node();
			// for the 1's digit, when the add linkedlist is empty
			if(addFirst==null)
			{
				//assuming each linked list has at least one digit. That is neither number is null
				sum.num=head1.num + head2.num + carry;
				addFirst=sum;
				addLast=addFirst;
				head1=head1.next;
				head2=head2.next;
			}
			// for 10's, 100's and so on
			else
			{
				// the first number has no more digits, so only add carry and the second number's digit
				if(head1==null)
				{
					sum.num=head2.num+carry;
					head2 = head2.next;
				}
				// the other case when second number has no more digits
				else if(head2==null)
				{
					sum.num=head1.num+carry;
					head1 = head1.next;
				}
				// third case when both have digits, mentioned the case explicitly just to be safe
				else if(head1!=null && head2!=null)
				{
					sum.num=head1.num+head2.num+carry;
					head1=head1.next;
					head2=head2.next;
				}
				//add the new digit to the linked list
				addLast.next=sum;
				addLast=sum;
			}
			//check if there is carry
			if(sum.num>9)
			{
				carry=sum.num/10;
				sum.num = sum.num % 10;
			}
			// clear old carry
			else
				carry=0;
			
		}
		// if the final addition had any leftover carry...
		if(carry>0)
			{Node newNode = new Node(carry);
			addLast.next=newNode;
			}
		return addFirst;
			
	}
	
	
public static void main(String args[])
{
	// First number 329
	Node n=new Node(9);
	Node head1 = n;
	n.add(head1, 2);
	n.add(head1, 3);
	// Second number 32
	Node m=new Node(2);
	Node head2 = m;
	m.add(head2, 3);
	AdditionToALL a=new AdditionToALL();
	Node sum=a.additionLL(head1, head2, n, m);
	//display 
	while(sum!=null)
	{
		System.out.print(sum.num+" ");
		sum=sum.next;
	}
}
}
