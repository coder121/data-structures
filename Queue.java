package data_structures;
/**
 * This is the implementation of Queue.Queue is the data structure which follows FIFO structure
 * i.e the elements are added first are removed first
 * We will be implementing this using linked list
 * @author Siddiq Ahmed Syed
 *
 */
public class Queue {
	public Node first;
	public Node last;

	public Queue(){
		this.first=null;
		this.last=null;
	}
	public void enqueue(Object element) {
		if(last==null && first==null){
			Node n=new Node(element);
			first=n;
			last=n;
			
			
		}
		else {
			Node n=new Node(element);
     		last.next=n;
     		last=n;
			
			
			
			
		}
		
	}
	public Object dequeue() {
	    Object element=first.data;
	    first=first.next;
	    		
	    return element;
	    	
	}

}
