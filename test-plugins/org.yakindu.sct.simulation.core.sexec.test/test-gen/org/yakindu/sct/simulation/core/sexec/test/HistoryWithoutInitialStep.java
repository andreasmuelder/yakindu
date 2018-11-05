/* Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.simulation.core.sexec.test;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.model.sexec.interpreter.test.util.AbstractExecutionFlowTest;
import org.yakindu.sct.model.sexec.interpreter.test.util.SExecInjectionProvider;
import org.yakindu.sct.test.models.SCTUnitTestModels;
import com.google.inject.Inject;
import static org.junit.Assert.*;

/**
 * Unit TestCase for HistoryWithoutInitialStep
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class HistoryWithoutInitialStep extends AbstractExecutionFlowTest {
	
	@Before
	public void setup() throws Exception{
		ExecutionFlow flow = models.loadExecutionFlowFromResource("HistoryWithoutInitialStep.sct");
		initInterpreter(flow);
	}
	@Test
	public void enterThroughInitialEntry() throws Exception {
		init();
		assertTrue(isStateActive("C"));
		raiseEvent("next");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("D"));
	}
	@Test
	public void enterCThroughHistory() throws Exception {
		init();
		assertTrue(isStateActive("C"));
		raiseEvent("toA");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("A"));
		raiseEvent("toHistory");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("C"));
	}
	@Test
	public void enterDThroughHistory() throws Exception {
		init();
		raiseEvent("next");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("D"));
		raiseEvent("toA");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("A"));
		raiseEvent("toHistory");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("D"));
	}
	@Test
	public void enterThroughHistoryWithoutInit() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("A"));
		raiseEvent("toHistory");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("C"));
	}
	public void init() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("A"));
		raiseEvent("toB");
		timer.timeLeap(getCyclePeriod());
	}
}
