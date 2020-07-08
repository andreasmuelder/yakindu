/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.eventbuffers.InEventLifeCycleUnbufferedStatemachine;
import org.yakindu.scr.eventbuffers.InEventLifeCycleUnbufferedStatemachine.State;	
import org.yakindu.sct.VirtualTimer;
import org.yakindu.sct.VirtualTimer.VirtualTimeTask;
import org.yakindu.sct.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for InEventLifeCycle
 */
@SuppressWarnings("all")
public class InEventLifeCycleUnbuffered {
	
	private InEventLifeCycleUnbufferedStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void inEventLifeCycleUnbuffered_setUp() {
		statemachine = new InEventLifeCycleUnbufferedStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void inEventLifeCycleUnbuffered_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void inEventLifeCycleUnbufferedTest() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r1_A));
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r2_C));
		statemachine.raiseE();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r1_A));
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r2_D));
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r1_A));
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r2_D));
		statemachine.raiseF();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r1_A));
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r2_C));
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r1_A));
		assertTrue(statemachine.isStateActive(State.inEventLifeCycle_r2_C));
	}
}
