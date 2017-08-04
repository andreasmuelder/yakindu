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
 * Unit TestCase for LogicalOr
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class LogicalOrTests extends AbstractExecutionFlowTest {
	@Before
	public void setup() throws Exception{
		ExecutionFlow flow = models.loadExecutionFlowFromResource("LogicalOr.sct");
		initInterpreter(flow);
	}
	@Test
	public void operandEvaluationOrder() throws Exception {
		interpreter.enter();
		interpreter.runCycle();
		assertTrue("logical or expression was executed in wrong order...",getInteger("x") == 4l && getBoolean("b"));
	}
}
