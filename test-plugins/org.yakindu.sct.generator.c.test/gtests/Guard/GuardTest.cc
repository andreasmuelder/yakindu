/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "Guard.h"

#include "sc_timer_service.h"


static Guard statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class GuardTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		guard_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &guard_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(GuardTest, guardTest) {
	
	guard_enter(&statechart);
	EXPECT_TRUE(guard_isStateActive(&statechart, Guard_main_region_A));
	guardIface_raise_event1(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(guard_isStateActive(&statechart, Guard_main_region_A));
	guardIface_raise_event2(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(guard_isStateActive(&statechart, Guard_main_region_B));
	guardIface_raise_return(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(guard_isStateActive(&statechart, Guard_main_region_A));
	guardIface_raise_event1(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(guard_isStateActive(&statechart, Guard_main_region_B));
	guardIface_raise_return(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(guard_isStateActive(&statechart, Guard_main_region_A));
}


