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
#include "gtest/gtest.h"
#include "AlwaysOncycle.h"

/** Attention - this file is NOT generated */

AlwaysOncycle handle;

class StatemachineTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
            // do NOT init the statechart
        }
};


TEST_F(StatemachineTest, alwaysOncycleTest) {					
        EXPECT_TRUE(alwaysOncycle_isActive(&handle) == false);
}

