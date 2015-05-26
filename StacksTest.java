package data_structures;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class StacksTest {

	@Test
	public void pushElemTest() {
		Stacks s=new Stacks();
		s.push("A");
		s.push("B");
		s.push("V");
		Assert.assertEquals("V", s.pop());
		Assert.assertEquals("B", s.pop());
		Assert.assertEquals("A", s.pop());
		
	}

}
