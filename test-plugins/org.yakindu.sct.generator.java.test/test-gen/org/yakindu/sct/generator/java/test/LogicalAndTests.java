/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.logicaland.LogicalAndStatemachine;
import org.yakindu.scr.logicaland.LogicalAndStatemachine.State;	
import org.yakindu.sct.VirtualTimer;
import org.yakindu.sct.VirtualTimer.VirtualTimeTask;
import org.yakindu.sct.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for LogicalAnd
 */
@SuppressWarnings("all")
public class LogicalAndTests {
	
	private LogicalAndStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void logicalAndTests_setUp() {
		statemachine = new LogicalAndStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void logicalAndTests_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void operandEvaluationOrder() {
		statemachine.enter();
		timer.cycleLeap(1l);
		assertTrue("logical and expression was executed in wrong order...",statemachine.getX() == 4l && statemachine.getB());
	}
}
