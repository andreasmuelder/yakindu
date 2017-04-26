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
#include "EntryExitSelfTransition.h"
#include "sc_types.h"
EntryExitSelfTransition* statechart = new EntryExitSelfTransition();
statechart->init();

TEST(StatemachineTest, SelfTransitionToChildState) {
	
	
	statechart->enter();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_entries()== 1l);
	
	EXPECT_TRUE(statechart->isStateActive(EntryExitSelfTransition::main_region_A__region0_B));
	
	statechart->getDefaultSCI()->set_entries(0l);
	
	statechart->raise_e();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_entries()== 1l);
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_exits()== 1l);
	
	EXPECT_TRUE(statechart->isStateActive(EntryExitSelfTransition::main_region_A__region0_C));
	
	delete statechart;
}
TEST(StatemachineTest, SelfTransitionFromChildState) {
	
	
	statechart->enter();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_entries()== 1l);
	
	statechart->getDefaultSCI()->set_entries(0l);
	
	statechart->raise_e1();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_entries()== 0l);
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_exits()== 0l);
	
	EXPECT_TRUE(statechart->isStateActive(EntryExitSelfTransition::main_region_A__region0_C));
	
	statechart->raise_e1();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->isStateActive(EntryExitSelfTransition::main_region_A__region0_B));
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_entries()== 1l);
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_exits()== 1l);
	
	delete statechart;
}
