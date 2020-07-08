/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.eventdriven.EventDrivenInternalEventStatemachine;
import org.yakindu.scr.eventdriven.EventDrivenInternalEventStatemachine.State;

/**
 * Unit TestCase for EventDrivenInternalEvent
 */
@SuppressWarnings("all")
public class EventDrivenInternalEvent {
	
	private EventDrivenInternalEventStatemachine statemachine;	
	
	
	@Before
	public void eventDrivenInternalEvent_setUp() {
		statemachine = new EventDrivenInternalEventStatemachine();
		
		statemachine.init();
		
	}

	@After
	public void eventDrivenInternalEvent_tearDown() {
		statemachine = null;
		
	}
	
	@Test
	public void checkInternlEventQueueing() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(EventDrivenInternalEventStatemachine.State.R1_A));
		assertTrue(statemachine.isStateActive(EventDrivenInternalEventStatemachine.State.R2_C));
		assertTrue(statemachine.isStateActive(EventDrivenInternalEventStatemachine.State.CHECK_VALID));
		statemachine.raiseStart();
		assertTrue(statemachine.isStateActive(EventDrivenInternalEventStatemachine.State.R1_B));
		assertTrue(statemachine.isStateActive(EventDrivenInternalEventStatemachine.State.R2_D));
		assertTrue(statemachine.isStateActive(EventDrivenInternalEventStatemachine.State.CHECK_VALID));
		assertTrue(statemachine.getI1_sequence() == 2l);
		assertTrue(statemachine.getI2_sequence() == 3l);
		statemachine.exit();
	}
}
