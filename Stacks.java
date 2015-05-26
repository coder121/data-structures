package data_structures;

import java.util.EmptyStackException;

public class Stacks {
	public Node head;
	
	public Stacks(){
		this.head=null;
	}

	public void push(Object elem) {
		if(head==null){
			Node n=new Node(elem);
			head=n;
			head.next=null;
		}
		else{
			Node n=new Node(elem);
			Node prev=head;
			head=n;
			head.next=prev;
			
			
		}
		
	}

	public Object pop() {
		// TODO Auto-generated method stub
		if(head==null){
			return new EmptyStackException();
		}
		else{
			Object data=head.data;
			head=head.next;
			return data;
			
		}
	}

}
