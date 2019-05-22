/**
 * Copyright (c) 2014 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.generator.cpp.test;

import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.yakindu.sct.generator.c.gtest.GTest;
import org.yakindu.sct.generator.c.gtest.GTestRunner;
import org.yakindu.sct.generator.c.gtest.RunIfEnv;
import org.yakindu.sct.generator.c.gtest.GTestHelper.Compiler;
import org.yakindu.sct.generator.c.gtest.GTestHelper;

@GTest(sourceFile = "gtests/OperationsWithoutBracesTest/OperationsWithoutBracesTestCustom.cc", program = "gtests/OperationsWithoutBracesTest/OperationsWithoutBraces", model = "testmodels/SCTUnit/OperationsWithoutBraces.sct", statechartBundle = "org.yakindu.sct.test.models")
@RunWith(GTestRunner.class)
@RunIfEnv("FAILING_GENERATOR_TESTS")
public class OperationsWithoutBracesTestCustom {

	protected final GTestHelper helper = new GTestHelper(this, Compiler.GPLUSPLUS) {

		@Override
		protected void getTestDataFiles(Collection<String> files) {
			super.getTestDataFiles(files);
			files.add("gtests/OperationsWithoutBracesTest/OperationsWithoutBraces_OCB.h");
		}

		@Override
		protected void getSourceFiles(Collection<String> files) {
			super.getSourceFiles(files);
			files.add(getFileName(getTestProgram()) + ".cpp");
		}

	};

	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}
}
