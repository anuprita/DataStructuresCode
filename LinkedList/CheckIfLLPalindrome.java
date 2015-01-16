package LinkedList;

public class CheckIfLLPalindrome {
	public boolean checkPalindrome(Node head)
	{
		Node newLLptr=null;
		Node n=head;
		while(n!=null)
		{
			Node temp = new Node();
			temp.num=n.num;
			if(newLLptr==null)
				newLLptr=temp;
			else
			{
			temp.next=newLLptr;
			newLLptr=temp;
			}
			n=n.next;
		}
		//start with  heads of the two LL
		while(head!=null && newLLptr!=null)
		{
			if(head.num!=newLLptr.num)
				return false;
			head=head.next;
			newLLptr=newLLptr.next;
		}
		return true;
	}
	public static void main(String args[])
	{
		// First number 329
		Node n=new Node(1);
		Node head1 = n;
		n.add(head1, 2);
		n.add(head1, 2);
		n.add(head1, 1);
		
		boolean b=new CheckIfLLPalindrome().checkPalindrome(head1);
		if(b)
			System.out.println("LL is palindrome");
		else
			System.out.println("LL is not palindrome");
	}
}
