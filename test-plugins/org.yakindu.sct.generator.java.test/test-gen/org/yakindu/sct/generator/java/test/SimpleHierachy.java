
package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.simplehierachy.SimpleHierachyStatemachine;
import org.yakindu.scr.simplehierachy.SimpleHierachyStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for SimpleHierachy
 */
@SuppressWarnings("all")
public class SimpleHierachy {
	
	private SimpleHierachyStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void simpleHierachy_setUp() {
		statemachine = new SimpleHierachyStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void simpleHierachy_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void simpleHierachyTest() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_A));
		statemachine.getSCInterface().raiseEvent1();
		statemachine.getSCInterface().raiseEvent1();
		statemachine.getSCInterface().raiseEvent1();
		timer.cycleLeap(1);
		assertTrue(statemachine.isStateActive(State.main_region_B));
		assertTrue(statemachine.isStateActive(State.main_region_B_subregion1_B1));
	}
}
