/* Generated by YAKINDU Statechart Tools code generator. */
#include <string>
#include "gtest/gtest.h"
#include "StateIsActive.h"
#include "sc_runner.h"
#include "sc_types.h"

namespace  {

StateIsActive* statechart;



//! The timers are managed by a timer service. */
static SctUnitRunner * runner;

class StateIsActiveTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		statechart = new StateIsActive();
		statechart->init();
		runner = new SctUnitRunner(
			statechart,
			false,
			200
		);
	}
	virtual void TearDown() {
		delete statechart;
		delete runner;
	}
};


TEST_F(StateIsActiveTest, stateIsActive) {
	
	statechart->enter();
	
	EXPECT_TRUE(statechart->isStateActive(StateIsActive::R1_R1A));
	
	EXPECT_TRUE(statechart->isStateActive(StateIsActive::R2_R2A));
	
	statechart->getDefaultSCI()->raise_event1();
	
	runner->proceed_cycles(1);
	
	runner->proceed_cycles(1);
	
	EXPECT_TRUE(statechart->isStateActive(StateIsActive::R1_R1B));
	
	EXPECT_TRUE(statechart->isStateActive(StateIsActive::R2_R2B));
	
	
}


}
