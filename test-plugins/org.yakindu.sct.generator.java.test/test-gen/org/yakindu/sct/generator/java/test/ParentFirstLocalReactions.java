/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.parentfirstlocalreactions.ParentFirstLocalReactionsStatemachine;
import org.yakindu.scr.parentfirstlocalreactions.ParentFirstLocalReactionsStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for ParentFirstLocalReactions
 */
@SuppressWarnings("all")
public class ParentFirstLocalReactions {
	
	private ParentFirstLocalReactionsStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void parentFirstLocalReactions_setUp() {
		statemachine = new ParentFirstLocalReactionsStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void parentFirstLocalReactions_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void expectBottomUpLocalReactionOrder() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		assertTrue(statemachine.getSm_local() == 1l);
		assertTrue(statemachine.getA_local() == 2l);
		assertTrue(statemachine.getAa_local() == 3l);
		assertTrue(statemachine.getAaa_local() == 4l);
	}
	
	@Test
	public void expectParentLocalReactionOnChildLocalTransition() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		statemachine.raiseE();
		statemachine.setDisable_a(true);
		statemachine.setDisable_aa(true);
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAB));
		assertTrue(statemachine.getSm_local() == 1l);
		assertTrue(statemachine.getA_local() == 2l);
		assertTrue(statemachine.getAa_local() == 3l);
		assertTrue(statemachine.getAaa_local() == 0l);
	}
	
	@Test
	public void expectParentLocalReactionOnChildSelfTransition() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		statemachine.raiseDoSelfTransition();
		statemachine.setDisable_a(true);
		statemachine.setDisable_aa(true);
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		assertTrue(statemachine.getSm_local() == 1l);
		assertTrue(statemachine.getA_local() == 2l);
		assertTrue(statemachine.getAa_local() == 3l);
		assertTrue(statemachine.getAaa_local() == 0l);
	}
	
	@Test
	public void expectGrandparentLocalReactionOnParentLocalTransition() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		statemachine.setDisable_a(true);
		statemachine.raiseE();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AB));
		assertTrue(statemachine.getSm_local() == 1l);
		assertTrue(statemachine.getA_local() == 2l);
		assertTrue(statemachine.getAa_local() == 0l);
		assertTrue(statemachine.getAaa_local() == 0l);
	}
	
	@Test
	public void expectNoLocalReactionOnGrandparentTransition() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		statemachine.setDisable_aaa(true);
		statemachine.setDisable_aa(true);
		statemachine.raiseE();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_B));
		assertTrue(statemachine.getSm_local() == 1l);
		assertTrue(statemachine.getA_local() == 0l);
		assertTrue(statemachine.getAa_local() == 0l);
		assertTrue(statemachine.getAaa_local() == 0l);
	}
	
	@Test
	public void expectNoLocalReactionOnGrandparentSelfTransition() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A_r_AA_r_AAA));
		statemachine.setDisable_aaa(true);
		statemachine.setDisable_aa(true);
		statemachine.raiseDoSelfTransition();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.parentFirstLocalReactions_r_A));
		assertTrue(statemachine.getSm_local() == 1l);
		assertTrue(statemachine.getA_local() == 0l);
		assertTrue(statemachine.getAa_local() == 0l);
		assertTrue(statemachine.getAaa_local() == 0l);
	}
}
