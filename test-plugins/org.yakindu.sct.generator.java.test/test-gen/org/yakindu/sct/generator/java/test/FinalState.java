
package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.finalstate.FinalStateStatemachine;
import org.yakindu.scr.finalstate.FinalStateStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for FinalState
 */
@SuppressWarnings("all")
public class FinalState {
	
	private FinalStateStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void finalState_setUp() {
		statemachine = new FinalStateStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void finalState_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void statechartNameTest() {
		statemachine.enter();
		timer.cycleLeap(1);
		assertTrue(statemachine.isFinal());
	}
}
