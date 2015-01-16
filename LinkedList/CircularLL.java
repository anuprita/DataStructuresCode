package LinkedList;

public class CircularLL {
	public  boolean hasLoop(Node startNode){
		  Node slowNode=startNode;
		  Node fastNode1 = startNode;
		  Node fastNode2 = startNode;
		  while (slowNode!=null && fastNode1.next!=null && fastNode2.next!=null){
			  fastNode1 = fastNode2.next;
			  fastNode2 = fastNode1.next;
		    if (slowNode == fastNode1 || slowNode == fastNode2) return true;
		    slowNode = slowNode.next;
		  }
		  return false;
		}
	public static void main(String args[])
	{
		// First number 329
		Node n=new Node(9);
		Node head1 = n;
		n.add(head1, 2);
		n.add(head1, 3);
		n.add(head1, 4);
		Node node=head1;
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=head1;
		
		CircularLL cll = new CircularLL();
		System.out.println(cll.hasLoop(head1));
	}
}
