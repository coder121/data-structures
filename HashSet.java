package data_structures;
/**
 * This is an example HashSet data structure which uses seperate chaining to 
 * added elements with collision. It is very effective and simple way
 * of adding elements based on the hashcode.
 * @author Siddiq Ahmed Syed
 *
 */
public class HashSet {
	private int current_size;
	private Node[] buckets;

	public HashSet(int size) {
		buckets=new Node[size];
		current_size=0;
	}
	/**
	 * This method puts an element in a Node array.The hashcode of the element
	 * is determined and is used for storing the element at the index.If there exist
	 * and element than false is returned as it does not allow duplication.When collision 
	 * occurs than separate chaining methodology is used to add an element at the position 
	 * based on the hashcode
	 * @param element to be added
	 * @return true-new element false-existing element
	 *  
	 */

	public boolean put(Object element) {
		int h=element.hashCode();
		if(h<0){h=-h;}
		h=h%buckets.length;
		Node current=buckets[h];
		while(current!=null){
			if(current.data.equals(element)){
				return false;
			}
			current=current.next;
		}
		Node newNode=new Node(element);
		newNode.next=buckets[h];
		buckets[h]=newNode;
		current_size++;
		return true;
		
	}
	/**
	 * This method will check whether the element is present in the hashset
	 * and it basically follows the same strategy as the put method
	 * @param element to be verified
	 * @return true-found  false-not found
	 */
	public boolean contains(Object element) {
		int h=element.hashCode();
		if(h<0){h=-h;}
		h=h%buckets.length;
		Node n=buckets[h];
		while(n!=null){
		if(n.data.equals(element)){return true;}
		n=n.next;
		}
		return false;
	}
	/**
	 * This method will return the current size of the hash set based 
	 * on the elements that are stored. We are using the current_size variable
	 * to keep track of elements that are being added
	 * @return current_size
	 */
	public int size() {
		// TODO Auto-generated method stub
		return current_size;
	}
	/**
	 * This method will remove the element 
	 * @param element to be removed
	 * @return true-if removed false-does not exist
	 */
	public boolean remove(Object element) {
		// TODO Auto-generated method stub
		int h=element.hashCode();
		if(h<0){h=-h;}
		h=h%buckets.length;
		Node current=buckets[h];
		while(current!=null){
			if(current.data.equals(element))
			{current=null;
			return true;
			}
			current=current.next;
		}
		return false;
	}

}
