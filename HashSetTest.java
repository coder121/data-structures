package data_structures;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class HashSetTest {

	@Test
	public void addElementTest() {
		HashSet hs=new HashSet(10);
		hs.put("A");
		hs.put("A");
	
		Assert.assertEquals(true, hs.contains("A"));
		Assert.assertEquals(false, hs.contains("b"));
	}

	@Test
	public void getSizeTest() {
		HashSet hs=new HashSet(10);
		hs.put("A");
		hs.put("b");
		hs.put("A");
	
		Assert.assertEquals(2, hs.size());
		
	}
	@Test
	public void removeElementTest() {
		HashSet hs=new HashSet(10);
		hs.put("A");
		hs.put("b");
	
	
		Assert.assertEquals(true, hs.remove("A"));
		Assert.assertEquals(false, hs.remove("C"));
		
	}

}
