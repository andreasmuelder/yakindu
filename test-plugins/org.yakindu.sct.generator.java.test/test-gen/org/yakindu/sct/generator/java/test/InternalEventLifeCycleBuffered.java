/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.eventbuffers.InternalEventLifeCycleBufferedStatemachine;
import org.yakindu.scr.eventbuffers.InternalEventLifeCycleBufferedStatemachine.State;
import org.yakindu.sct.VirtualTimer;
import org.yakindu.sct.VirtualTimer.VirtualTimeTask;
import org.yakindu.sct.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for InternalEventLifeCycle
 */
@SuppressWarnings("all")
public class InternalEventLifeCycleBuffered {
	
	private InternalEventLifeCycleBufferedStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void internalEventLifeCycleBuffered_setUp() {
		statemachine = new InternalEventLifeCycleBufferedStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void internalEventLifeCycleBuffered_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void internalEventLifeCycleBufferedTest() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R1_A));
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R2_C));
		statemachine.raiseE();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R1_A));
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R2_D));
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R1_A));
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R2_D));
		statemachine.raiseF();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R1_B));
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R2_C));
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R1_B));
		assertTrue(statemachine.isStateActive(InternalEventLifeCycleBufferedStatemachine.State.R2_C));
	}
}
