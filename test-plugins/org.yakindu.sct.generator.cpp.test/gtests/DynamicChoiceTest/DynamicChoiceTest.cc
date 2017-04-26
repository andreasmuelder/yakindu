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
#include "DynamicChoice.h"
#include "sc_types.h"
DynamicChoice* statechart = new DynamicChoice();
statechart->init();

TEST(StatemachineTest, DynamicChoiceTest) {
	
	
	statechart->enter();
	
	EXPECT_TRUE(statechart->isStateActive(DynamicChoice::main_region_Start));
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->isStateActive(DynamicChoice::main_region_A));
	
	delete statechart;
}
