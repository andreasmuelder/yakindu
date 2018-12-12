#include <string>
#include "gtest/gtest.h"
#include "StatechartLocalReactions.h"
#include "sc_runner.h"
#include "sc_types.h"

namespace  {

StatechartLocalReactions* statechart;



//! The timers are managed by a timer service. */
static SctUnitRunner * runner;

class StatechartLocalReactionsTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		statechart = new StatechartLocalReactions();
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


TEST_F(StatechartLocalReactionsTest, statechartLocalReactionsTest) {
	
	statechart->enter();
	
	EXPECT_TRUE(statechart->isStateActive(StatechartLocalReactions::main_region_S1));
	
	EXPECT_TRUE(statechart->isStateActive(StatechartLocalReactions::region2_a));
	
	sc_integer cycles = 0;
	
	while (cycles< 10) {
		EXPECT_TRUE(statechart->isStateActive(StatechartLocalReactions::region2_a));
		if (statechart->getDefaultSCI()->get_myInt()%2== 0) {
			EXPECT_TRUE(statechart->isStateActive(StatechartLocalReactions::main_region_S1));
		}
		else {
			EXPECT_TRUE(statechart->isStateActive(StatechartLocalReactions::main_region_S2));
		}
		runner->proceed_cycles(1);
		cycles += 1;
		EXPECT_TRUE((statechart->getDefaultSCI()->get_myInt()== cycles));
	}
	
	
}

}

