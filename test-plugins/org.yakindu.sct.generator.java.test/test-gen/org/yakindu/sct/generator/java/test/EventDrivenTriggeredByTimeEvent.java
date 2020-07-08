/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.eventdriven.EventDrivenTriggeredByTimeEventStatemachine;
import org.yakindu.scr.eventdriven.EventDrivenTriggeredByTimeEventStatemachine.State;	
import org.yakindu.sct.VirtualTimer;

/**
 * Unit TestCase for EventDrivenTriggeredByTimeEvent
 */
@SuppressWarnings("all")
public class EventDrivenTriggeredByTimeEvent {
	
	private EventDrivenTriggeredByTimeEventStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void eventDrivenTriggeredByTimeEvent_setUp() {
		statemachine = new EventDrivenTriggeredByTimeEventStatemachine();
		timer = new VirtualTimer(200);
		statemachine.setTimer(timer);
		
		statemachine.init();
		
	}

	@After
	public void eventDrivenTriggeredByTimeEvent_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void timeEventTriggersRunCycle() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.eventDrivenTriggeredByTimeEvent_r_A));
		assertTrue(statemachine.getX() == 0l);
		timer.timeLeap(999l);
		assertTrue(statemachine.isStateActive(State.eventDrivenTriggeredByTimeEvent_r_A));
		assertTrue(statemachine.getX() == 0l);
		timer.timeLeap(1l);
		assertTrue(statemachine.isStateActive(State.eventDrivenTriggeredByTimeEvent_r_B));
		assertTrue(statemachine.getX() == 0l);
		assertTrue(statemachine.getTransition_count() == 1l);
		timer.timeLeap(1l*1000l);
		assertTrue(statemachine.isStateActive(State.eventDrivenTriggeredByTimeEvent_r_A));
		assertTrue(statemachine.getX() == 0l);
		assertTrue(statemachine.getTransition_count() == 2l);
		timer.timeLeap(999l*1000l);
		assertTrue(statemachine.isStateActive(State.eventDrivenTriggeredByTimeEvent_r_B));
		assertTrue(statemachine.getX() == 0l);
		assertTrue(statemachine.getTransition_count() == 1001l);
		timer.timeLeap(999l*1000l);
		assertTrue(statemachine.isStateActive(State.eventDrivenTriggeredByTimeEvent_r_A));
		assertTrue(statemachine.getX() == 0l);
		assertTrue(statemachine.getTransition_count() == 2000l);
		statemachine.exit();
	}
}
