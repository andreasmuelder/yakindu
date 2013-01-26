/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.model.sexec.interpreter.test;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yakindu.sct.model.sexec.interpreter.test.util.AbstractExecutionFlowTest;
import org.yakindu.sct.model.sexec.interpreter.test.util.SExecInjectionProvider;
import com.google.inject.Inject;
import org.junit.Before;
import org.yakindu.sct.model.sexec.interpreter.IExecutionFlowInterpreter;
import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.test.models.SCTUnitTestModels;

import static junit.framework.Assert.*;
/**
 *  Unit TestCase for RaiseEvent
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class RaiseEventTest extends AbstractExecutionFlowTest {

	@Inject
	private SCTUnitTestModels models;

	@Before
	public void setup() throws Exception {
		ExecutionFlow flow = models
				.loadExecutionFlowFromResource("RaiseEvent.sct");
		initInterpreter(flow);
	}
	@Test
	public void raiseEvent() throws Exception {
		interpreter.enter();
		assertTrue(isActive("SateA"));
		assertTrue(isActive("StateA"));
		raiseEvent("e2");
		interpreter.runCycle();
		interpreter.runCycle();
		assertTrue(isActive("StateB"));
		assertTrue(isActive("StateB"));
	}
}
