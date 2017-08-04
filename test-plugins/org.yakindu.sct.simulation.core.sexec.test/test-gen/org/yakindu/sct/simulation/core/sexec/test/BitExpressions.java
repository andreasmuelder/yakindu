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
import static org.junit.Assert.assertTrue;
/**
 * Unit TestCase for BitExpressions
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class BitExpressions extends AbstractExecutionFlowTest {
	@Before
	public void setup() throws Exception{
		ExecutionFlow flow = models.loadExecutionFlowFromResource("BitExpressions.sct");
		initInterpreter(flow);
	}
	@Test
	public void bitExpressions() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("StateA"));
		assertTrue(getInteger("myBit1") == 5l);
		assertTrue(getInteger("myBit2") == 7l);
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("StateB"));
		assertTrue(getInteger("leftBitshift") == 10l);
		assertTrue(getInteger("rightBitshift") == 2l);
		assertTrue(getInteger("complementBitshift") == - 6l );
		assertTrue(getInteger("bitwiseAnd") == 5l);
		assertTrue(getInteger("bitwiseOr") == 7l);
		assertTrue(getInteger("bitwiseXor") == 2l);
	}
}
