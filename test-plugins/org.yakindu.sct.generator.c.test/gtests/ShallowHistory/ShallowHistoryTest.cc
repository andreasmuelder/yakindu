/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "ShallowHistory.h"

#include "sc_timer_service.h"


static ShallowHistory statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class ShallowHistoryTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		shallowHistory_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &shallowHistory_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(ShallowHistoryTest, shallowHistoryTest) {
	
	shallowHistory_enter(&statechart);
	shallowHistoryIface_raise_event1(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	shallowHistoryIface_raise_event3(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	shallowHistoryIface_raise_event5(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	shallowHistoryIface_raise_event7(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State1));
	EXPECT_TRUE(shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State7__region0_State9));
	shallowHistoryIface_raise_event6(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State7__region0_State9));
	EXPECT_TRUE(shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State6));
	shallowHistoryIface_raise_event5(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State7__region0_State8));
	EXPECT_TRUE(shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State7__region0_State9));
	shallowHistoryIface_raise_event2(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State7__region0_State9));
	EXPECT_TRUE(shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State1));
	shallowHistoryIface_raise_event1(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State6));
	EXPECT_TRUE(!shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State1));
	shallowHistoryIface_raise_event5(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State6));
	EXPECT_TRUE(shallowHistory_isStateActive(&statechart, ShallowHistory_mainRegion_State2__region0_State4__region0_State7__region0_State9));
}


