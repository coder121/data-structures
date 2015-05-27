package data_structures;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class QueueTest {

	@Test
	public void enqueueElemtest() {
		Queue q=new Queue();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		Assert.assertEquals("A", q.dequeue());
		Assert.assertEquals("B", q.dequeue());
		Assert.assertEquals("C", q.dequeue());
	}

}
