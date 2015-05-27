package data_structures;
/**
 * This is the implementation of ArrayList which is one of the 
 * data structure in Java that facilitates the concept of shrinking 
 * and growing of arrays and proving random access and random addition of 
 * elements at desired positions.
 * It consists of following methds
 * 1. add
 * 2. set
 * 3. remove 
 *  
 * @author Siddiq Ahmed Syed
 *
 */

public class ArrayList {
	private  final int SIZE=10;
public Object [] elements;
	private int current_size;
	
	
	public ArrayList(){
		elements=new Object[SIZE];//initializing to default size of 10
		this.current_size=0;//for checking the current size of array
	}
	/**
	 * This method adds an element at the last position of an array
	 * We increase the capacity by calling in checkbound methods
	 * @param element to be added to the array
	 */

	public void add(int elem) {
		checkbound();
		
	
		elements[current_size]=elem;
		
		current_size++;
		
	}
	/**
	 * This method verifies whether the current_size is less than the 
	 * actual size of an elements array. If not than a new array is 
	 * declaraed which is twice the size of an array and the elements from
	 * old array are copied to the new array
	 * and the reference of new array is given to old array i.e elements array
	 * @param Array elements 
	 */
	private void checkbound() {
		if(current_size==elements.length){
			Object [] newElements=new Object[2*SIZE];//Declaring a new array
			for(int i=0;i<elements.length;i++){
				newElements[i]=elements[i];
			}
	
			elements=newElements;
		
			
		}
		
	
		
	}
	/**
	 * This method returns the current size of Elements Arrays based on the elements
	 * it holds.
	 * @return
	 */
	public int size() {
		
		return current_size;
	}
	/**
	 * This method removes the element from the index specified
	 * @param index
	 * @return element that is removed
	 */
	public Object remove(int index) {
		checkforRange(index);
		Object element=elements[index];
		elements[index]=null;
		return element;
		
		
	}
	private void checkforRange(int index) {
		if(index<0||index>current_size){
			throw new IndexOutOfBoundsException();
		}

		
	}
	/**
	 * This method returns the element at the specified index
	 * @param index
	 * @return element at index
	 */
	public Object get(int index) {
		// TODO Auto-generated method stub
		checkforRange(index);
		Object element=elements[index];
	
		return element;
	}
	/**
	 * Replaces the element at the specified position in this list with the specified element
	 * @param index i.e specified position 
	 * @param element to be stored at that position
	 */
	public void set(int index, Object element) {
		checkforRange(index);
		elements[index]=element;
		
	}

}
