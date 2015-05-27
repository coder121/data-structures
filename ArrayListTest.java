package data_structures;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void addElemTest() {
		ArrayList al=new ArrayList();
		for(int i=0;i<11;i++){
			al.add(i);
		}
		
		Assert.assertEquals(11, al.size());
	}
	@Test
	public void removeElemTest() {
	
		ArrayList al=new ArrayList();
		for(int i=7;i<11;i++){
			al.add(i);
		}
		Assert.assertEquals(8,al.remove(1));
	}
	@Test
	public void getElemTest() {
	
		ArrayList al=new ArrayList();
		for(int i=7;i<11;i++){
			al.add(i);
		}
		Assert.assertEquals(7, al.get(0));
		Assert.assertEquals(10, al.get(3));
	}
	@Test
	public void setElemTest() {
	
		ArrayList al=new ArrayList();
		for(int i=0;i<11;i++){
			al.add(i);
		}
		al.set(0,10);
		Assert.assertEquals(10, al.get(0));
		
	}
	

}
