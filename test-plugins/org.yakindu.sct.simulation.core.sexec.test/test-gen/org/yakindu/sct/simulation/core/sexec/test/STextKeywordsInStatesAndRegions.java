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
 * Unit TestCase for STextKeywordsInStatesAndRegions
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class STextKeywordsInStatesAndRegions extends AbstractExecutionFlowTest {
	@Before
	public void setup() throws Exception{
		ExecutionFlow flow = models.loadExecutionFlowFromResource("STextKeywordsInStatesAndRegions.sct");
		initInterpreter(flow);
	}
	@Test
	public void activeCheckWithSTextNamedStates() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("raise"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("active"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("interface"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("event"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("in"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("var"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("external"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("default"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("entry"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("always"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
		assertTrue(isStateActive("namespace"));
		assertTrue(isStateActive("internal"));
		assertTrue(isStateActive("local"));
		assertTrue(isStateActive("out"));
		assertTrue(isStateActive("readonly"));
		assertTrue(isStateActive("operation"));
		assertTrue(isStateActive("else"));
		assertTrue(isStateActive("exit"));
		assertTrue(isStateActive("oncycle"));
		assertTrue(isStateActive("valueof"));
	}
}
