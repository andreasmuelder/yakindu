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
package org.yakindu.sct.generator.c.test;

import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.yakindu.sct.generator.c.gtest.GTest;
import org.yakindu.sct.generator.c.gtest.GTestRunner;
import org.yakindu.sct.generator.c.gtest.GTestHelper;

@GTest(sourceFile = "gtests/AssignmentAsExpression/AssignmentAsExpression.cc", program = "gtests/AssignmentAsExpression/AssignmentAsExpression", model = "testmodels/SCTUnit/AssignmentAsExpression.sct")
@RunWith(GTestRunner.class)
public class AssignmentAsExpression {

	protected final GTestHelper helper = new GTestHelper(this) {

		@Override
		protected void getSourceFiles(Collection<String> files) {
			super.getSourceFiles(files);
			files.add(getFileName(getTestProgram()) + ".c");
		}
	};

	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}
}
