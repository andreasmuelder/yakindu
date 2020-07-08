/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.events.OutEventWithPayloadStatemachine;
import org.yakindu.scr.events.OutEventWithPayloadStatemachine.State;	

/**
 * Unit TestCase for OutEventWithPayload
 */
@SuppressWarnings("all")
public class OutEventWithPayload {
	
	private OutEventWithPayloadStatemachine statemachine;	
	
	
	@Before
	public void outEventWithPayload_setUp() {
		statemachine = new OutEventWithPayloadStatemachine();
		
		statemachine.init();
		
	}

	@After
	public void outEventWithPayload_tearDown() {
		statemachine = null;
		
	}
	
	@Test
	public void out_events_must_have_payload() {
		statemachine.enter();
		statemachine.raiseI(21l);
		assertTrue(statemachine.isRaisedO());
		assertTrue(statemachine.getOValue() == 42l);
		statemachine.exit();
	}
}
