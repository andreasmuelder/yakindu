/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "EventDrivenInternalEvent.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static EventDrivenInternalEvent statechart;

class EventDrivenInternalEventTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		eventDrivenInternalEvent_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &eventDrivenInternalEvent_runCycle,
			true,
			200,
			&statechart
		);
	}
};


TEST_F(EventDrivenInternalEventTest, checkInternlEventQueueing) {
	eventDrivenInternalEvent_enter(&statechart);
	EXPECT_TRUE(eventDrivenInternalEvent_isStateActive(&statechart, EventDrivenInternalEvent_EventDrivenInternalEvent_r1_A));
	EXPECT_TRUE(eventDrivenInternalEvent_isStateActive(&statechart, EventDrivenInternalEvent_EventDrivenInternalEvent_r2_C));
	EXPECT_TRUE(eventDrivenInternalEvent_isStateActive(&statechart, EventDrivenInternalEvent_EventDrivenInternalEvent_check_VALID));
	eventDrivenInternalEventIface_raise_start(&statechart);
	EXPECT_TRUE(eventDrivenInternalEvent_isStateActive(&statechart, EventDrivenInternalEvent_EventDrivenInternalEvent_r1_B));
	EXPECT_TRUE(eventDrivenInternalEvent_isStateActive(&statechart, EventDrivenInternalEvent_EventDrivenInternalEvent_r2_D));
	EXPECT_TRUE(eventDrivenInternalEvent_isStateActive(&statechart, EventDrivenInternalEvent_EventDrivenInternalEvent_check_VALID));
	EXPECT_TRUE(eventDrivenInternalEventIface_get_i1_sequence(&statechart)== 2l);
	EXPECT_TRUE(eventDrivenInternalEventIface_get_i2_sequence(&statechart)== 3l);
	eventDrivenInternalEvent_exit(&statechart);
}


