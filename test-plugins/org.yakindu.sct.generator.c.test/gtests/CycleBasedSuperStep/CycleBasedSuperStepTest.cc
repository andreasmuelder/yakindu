/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "CycleBasedSuperStep.h"

#include "sc_timer_service.h"

static CycleBasedSuperStep statechart;


class CycleBasedSuperStepTest : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void superStepTakesTwoTransitionsUsingSameEvent();
	void superStepIteratesUsingAlwaysTrigger();
	void superStepIteratesUsingSameEventAndGuard();
	void setTimer(CycleBasedSuperStep* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(CycleBasedSuperStep* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static CycleBasedSuperStepTest * tc;


void CycleBasedSuperStepTest::SetUp()
{
	cycleBasedSuperStep_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		0,
		(sc_run_cycle_fp) &cycleBasedSuperStep_runCycle,
		false,
		100,
		&statechart
	);
	
	
	tc = this;
}
void CycleBasedSuperStepTest::superStepTakesTwoTransitionsUsingSameEvent()
{
	cycleBasedSuperStep_enter(&statechart);
	EXPECT_TRUE(cycleBasedSuperStep_isStateActive(&statechart, CycleBasedSuperStep_CycleBasedSuperStep_main_region_A));
	cycleBasedSuperStepIface_raise_e(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(cycleBasedSuperStep_isStateActive(&statechart, CycleBasedSuperStep_CycleBasedSuperStep_main_region_C));
	cycleBasedSuperStep_exit(&statechart);
}
void CycleBasedSuperStepTest::superStepIteratesUsingAlwaysTrigger()
{
	cycleBasedSuperStep_enter(&statechart);
	cycleBasedSuperStepIface_raise_f(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(cycleBasedSuperStep_isStateActive(&statechart, CycleBasedSuperStep_CycleBasedSuperStep_main_region_I));
	EXPECT_TRUE(cycleBasedSuperStepIface_get_x(&statechart)== 0);
	cycleBasedSuperStep_exit(&statechart);
}
void CycleBasedSuperStepTest::superStepIteratesUsingSameEventAndGuard()
{
	cycleBasedSuperStep_enter(&statechart);
	EXPECT_TRUE(cycleBasedSuperStep_isStateActive(&statechart, CycleBasedSuperStep_CycleBasedSuperStep_main_region_A));
	cycleBasedSuperStepIface_raise_e(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(cycleBasedSuperStep_isStateActive(&statechart, CycleBasedSuperStep_CycleBasedSuperStep_main_region_C));
	EXPECT_TRUE(cycleBasedSuperStepIface_get_x(&statechart)== 42);
	cycleBasedSuperStepIface_raise_f(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(cycleBasedSuperStep_isStateActive(&statechart, CycleBasedSuperStep_CycleBasedSuperStep_main_region_I));
	EXPECT_TRUE(cycleBasedSuperStepIface_get_x(&statechart)== 0);
	cycleBasedSuperStep_exit(&statechart);
}

void CycleBasedSuperStepTest::setTimer(CycleBasedSuperStep* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&(tc->timer_service), timer);
}

void CycleBasedSuperStepTest::unsetTimer(CycleBasedSuperStep* handle, const sc_eventid evid){
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(CycleBasedSuperStepTest, superStepTakesTwoTransitionsUsingSameEvent) {
	superStepTakesTwoTransitionsUsingSameEvent();
}
TEST_F(CycleBasedSuperStepTest, superStepIteratesUsingAlwaysTrigger) {
	superStepIteratesUsingAlwaysTrigger();
}
TEST_F(CycleBasedSuperStepTest, superStepIteratesUsingSameEventAndGuard) {
	superStepIteratesUsingSameEventAndGuard();
}


