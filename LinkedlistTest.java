package data_structures;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class LinkedlistTest {

	@Test
	public void addNodeTest() {
		Linkedlist ll=new Linkedlist();
		ll.add("A");
		ll.add("B");
		System.out.println(ll.remove("C"));
		Assert.assertEquals("B", ll.remove("B"));
	
	}

}
