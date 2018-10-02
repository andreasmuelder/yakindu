/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "SimpleHierachy.h"

#include "sc_timer_service.h"


static SimpleHierachy statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class SimpleHierachyTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		simpleHierachy_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &simpleHierachy_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(SimpleHierachyTest, simpleHierachyTest) {
	
	simpleHierachy_enter(&statechart);
	EXPECT_TRUE(simpleHierachy_isStateActive(&statechart, SimpleHierachy_main_region_A));
	simpleHierachyIface_raise_event1(&statechart);
	simpleHierachyIface_raise_event1(&statechart);
	simpleHierachyIface_raise_event1(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(simpleHierachy_isStateActive(&statechart, SimpleHierachy_main_region_B));
	EXPECT_TRUE(simpleHierachy_isStateActive(&statechart, SimpleHierachy_main_region_B_subregion1_B1));
}


