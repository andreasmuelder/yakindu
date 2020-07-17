/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "InEventLifeCycleUnbuffered.h"

#include "sc_timer_service.h"

#define SC_UNUSED(P) (void)P

static InEventLifeCycleUnbuffered statechart;


class InEventLifeCycleUnbufferedTest : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void inEventLifeCycleUnbufferedTest();
	void setTimer(InEventLifeCycleUnbuffered* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(InEventLifeCycleUnbuffered* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static InEventLifeCycleUnbufferedTest * tc;


void InEventLifeCycleUnbufferedTest::SetUp()
{
	inEventLifeCycleUnbuffered_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		0,
		(sc_run_cycle_fp) &inEventLifeCycleUnbuffered_runCycle,
		false,
		200,
		&statechart
	);
	
	
	tc = this;
}
void InEventLifeCycleUnbufferedTest::inEventLifeCycleUnbufferedTest()
{
	inEventLifeCycleUnbuffered_enter(&statechart);
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r1_A));
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r2_C));
	inEventLifeCycleUnbufferedIface_raise_e(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r1_A));
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r2_D));
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r1_A));
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r2_D));
	inEventLifeCycleUnbufferedIface_raise_f(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r1_A));
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r2_C));
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r1_A));
	EXPECT_TRUE(inEventLifeCycleUnbuffered_isStateActive(&statechart, InEventLifeCycleUnbuffered_r2_C));
}

void InEventLifeCycleUnbufferedTest::setTimer(InEventLifeCycleUnbuffered* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid, statechart);
	insert_timer(&(tc->timer_service), timer);
}

void InEventLifeCycleUnbufferedTest::unsetTimer(InEventLifeCycleUnbuffered* handle, const sc_eventid evid){
	SC_UNUSED(handle);
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(InEventLifeCycleUnbufferedTest, InEventLifeCycleUnbufferedTest) {
	inEventLifeCycleUnbufferedTest();
}

