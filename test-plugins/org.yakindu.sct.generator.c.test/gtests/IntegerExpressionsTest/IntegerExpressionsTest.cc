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
#include "IntegerExpressions.h"

IntegerExpressions handle;

class StatemachineTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		integerExpressions_init(&handle);
	}
};


TEST_F(StatemachineTest, integerExpressions) {					
	integerExpressions_enter(&handle);
	EXPECT_TRUE(integerExpressions_isStateActive(&handle, IntegerExpressions_main_region_StateA));
	EXPECT_TRUE(integerExpressionsIface_get_myInt1(&handle)== 10l);
	EXPECT_TRUE(integerExpressionsIface_get_myInt2(&handle)== 5l);
	integerExpressionsIface_raise_e1(&handle);
	integerExpressions_runCycle(&handle);
	EXPECT_TRUE(integerExpressionsIface_get_less(&handle)== false);
	EXPECT_TRUE(integerExpressionsIface_get_greater(&handle)== true);
	EXPECT_TRUE(integerExpressionsIface_get_equalOrLess(&handle)== false);
	EXPECT_TRUE(integerExpressionsIface_get_equalOrGreater(&handle)== true);
	EXPECT_TRUE(integerExpressionsIface_get_equal(&handle)== false);
	EXPECT_TRUE(integerExpressionsIface_get_notEqual(&handle)== true);
	EXPECT_TRUE(integerExpressionsIface_get_plus(&handle)== 15l);
	EXPECT_TRUE(integerExpressionsIface_get_minus(&handle)== 5l);
	EXPECT_TRUE(integerExpressionsIface_get_multiply(&handle)== 50l);
	EXPECT_TRUE(integerExpressionsIface_get_division(&handle)== 2l);
	EXPECT_TRUE(integerExpressionsIface_get_modulo(&handle)== 0l);
	EXPECT_TRUE(integerExpressionsIface_get_negat(&handle)== - 10l );
	EXPECT_TRUE(integerExpressionsIface_get_multiAssign(&handle)== 20l);
	EXPECT_TRUE(integerExpressionsIface_get_divAssign(&handle)== 2l);
	EXPECT_TRUE(integerExpressionsIface_get_plusAssign(&handle)== 12l);
	EXPECT_TRUE(integerExpressionsIface_get_minusAssign(&handle)== - 8l );
	EXPECT_TRUE(integerExpressionsIface_get_moduloAssign(&handle)== 0l);
}


