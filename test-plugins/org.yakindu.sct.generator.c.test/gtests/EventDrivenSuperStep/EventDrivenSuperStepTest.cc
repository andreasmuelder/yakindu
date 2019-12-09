/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "EventDrivenSuperStep.h"

#include "sc_timer_service.h"

static EventDrivenSuperStep statechart;


class EventDrivenSuperStepTest : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void superStepOnInternalEventQueue();
	void superStepIteratesUsingAlwaysTrigger();
	void superStepIteratesUsingSameEventAndGuard();
	void setTimer(EventDrivenSuperStep* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(EventDrivenSuperStep* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static EventDrivenSuperStepTest * tc;


void EventDrivenSuperStepTest::SetUp()
{
	eventDrivenSuperStep_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		0,
		(sc_run_cycle_fp) &eventDrivenSuperStep_runCycle,
		true,
		200,
		&statechart
	);
	
	
	tc = this;
}
void EventDrivenSuperStepTest::superStepOnInternalEventQueue()
{
	eventDrivenSuperStep_enter(&statechart);
	EXPECT_TRUE(eventDrivenSuperStep_isStateActive(&statechart, EventDrivenSuperStep_EventDrivenSuperStep_main_region_A));
	eventDrivenSuperStepIface_raise_e(&statechart);
	EXPECT_TRUE(eventDrivenSuperStep_isStateActive(&statechart, EventDrivenSuperStep_EventDrivenSuperStep_main_region_C));
	EXPECT_TRUE(eventDrivenSuperStepIface_get_x(&statechart)== 17);
	eventDrivenSuperStep_exit(&statechart);
}
void EventDrivenSuperStepTest::superStepIteratesUsingAlwaysTrigger()
{
	eventDrivenSuperStep_enter(&statechart);
	eventDrivenSuperStepIface_raise_f(&statechart);
	EXPECT_TRUE(eventDrivenSuperStep_isStateActive(&statechart, EventDrivenSuperStep_EventDrivenSuperStep_main_region_I));
	EXPECT_TRUE(eventDrivenSuperStepIface_get_x(&statechart)== 0);
	eventDrivenSuperStep_exit(&statechart);
}
void EventDrivenSuperStepTest::superStepIteratesUsingSameEventAndGuard()
{
	eventDrivenSuperStep_enter(&statechart);
	EXPECT_TRUE(eventDrivenSuperStep_isStateActive(&statechart, EventDrivenSuperStep_EventDrivenSuperStep_main_region_A));
	eventDrivenSuperStepIface_raise_e(&statechart);
	EXPECT_TRUE(eventDrivenSuperStep_isStateActive(&statechart, EventDrivenSuperStep_EventDrivenSuperStep_main_region_C));
	EXPECT_TRUE(eventDrivenSuperStepIface_get_x(&statechart)== 17);
	eventDrivenSuperStepIface_raise_f(&statechart);
	EXPECT_TRUE(eventDrivenSuperStep_isStateActive(&statechart, EventDrivenSuperStep_EventDrivenSuperStep_main_region_I));
	EXPECT_TRUE(eventDrivenSuperStepIface_get_x(&statechart)== 0);
	eventDrivenSuperStep_exit(&statechart);
}

void EventDrivenSuperStepTest::setTimer(EventDrivenSuperStep* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&(tc->timer_service), timer);
}

void EventDrivenSuperStepTest::unsetTimer(EventDrivenSuperStep* handle, const sc_eventid evid){
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(EventDrivenSuperStepTest, superStepOnInternalEventQueue) {
	superStepOnInternalEventQueue();
}
TEST_F(EventDrivenSuperStepTest, superStepIteratesUsingAlwaysTrigger) {
	superStepIteratesUsingAlwaysTrigger();
}
TEST_F(EventDrivenSuperStepTest, superStepIteratesUsingSameEventAndGuard) {
	superStepIteratesUsingSameEventAndGuard();
}


