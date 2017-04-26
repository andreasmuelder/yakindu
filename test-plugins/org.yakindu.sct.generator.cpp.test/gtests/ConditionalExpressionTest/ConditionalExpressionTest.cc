/**
* Copyright (c) 2017 committers of YAKINDU and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     committers of YAKINDU - initial API and implementation
*/
#include <string>
#include "gtest/gtest.h"
#include "ConditionalExpressions.h"
#include "sc_types.h"
ConditionalExpressions* statechart = new ConditionalExpressions();

TEST(StatemachineTest, ConditionalExpressionTest) {
	
	
	statechart->init();
	statechart->enter();
	
	EXPECT_TRUE(statechart->isStateActive(ConditionalExpressions::main_region_A));
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_condition()== 1l);
	
	statechart->raise_e();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->isStateActive(ConditionalExpressions::main_region_B));
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_condition()== 2l);
	
	delete statechart;
}
