package ArraysStackQueue;
import LinkedList.Node;


public class Queue {
	Node first,  last;
		 
		  void enqueue(int item)  {
		 if (first == null)  {
		  last = new Node(item) ;
		 first = last;
		 }  else {
		 last.next = new Node(item) ;
		 last = last.next;
		  }
		  }
		
		  int dequeue() {
		  if (first!= null)  {
		  int item = first.num;
		 first = first.next;
		  return item;
		  }
		  return -1;
	 }
		  
		
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.dequeue());// TODO Auto-generated method stub

	}

}
