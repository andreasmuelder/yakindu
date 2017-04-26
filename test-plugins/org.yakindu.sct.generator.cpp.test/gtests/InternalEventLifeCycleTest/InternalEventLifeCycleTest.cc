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
#include "InternalEventLifeCycle.h"
#include "sc_types.h"
InternalEventLifeCycle* statechart = new InternalEventLifeCycle();
statechart->init();

TEST(StatemachineTest, InternalEventLifeCycleTest) {
	
	
	statechart->enter();
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r1_A));
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r2_C));
	
	statechart->raise_e();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r1_A));
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r2_D));
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r1_A));
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r2_D));
	
	statechart->raise_f();
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r1_A));
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r2_C));
	
	statechart->runCycle();
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r1_A));
	
	EXPECT_TRUE(statechart->isStateActive(InternalEventLifeCycle::r2_C));
	
	delete statechart;
}
