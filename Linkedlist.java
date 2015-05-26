package data_structures;

import java.util.NoSuchElementException;

public class Linkedlist {
	public Node first;
	
	public Linkedlist(){
		this.first=null;
	}
	

	public void add(Object element) {
	 if(first==null){
		 Node n=new Node(element);
		 first=n;
	}else{
		Node n=new Node(element);
		first.next=n;
	}
	 
	 
		
	}


	public Object remove(Object elem) {
		// TODO Auto-generated method stub
		if(first.next==null){
			return first.data;
		}
		else{
			Node n=first;
			while(n!=null){
				Object element=n.data;
				if(elem.equals(element)){
					return element;
				}
				n=n.next;
				
			}
			
			
		}
		return null;

	}


}
