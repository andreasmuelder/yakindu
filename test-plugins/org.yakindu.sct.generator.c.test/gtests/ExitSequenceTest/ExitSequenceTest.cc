/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "ExitSequence.h"

#include "sc_timer_service.h"


static ExitSequence statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class ExitSequenceTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		exitSequence_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &exitSequence_runCycle,
			true,
			200,
			&statechart
		);
	}
};


TEST_F(ExitSequenceTest, testFrom1A) {
	
	exitSequence_enter(&statechart);
	EXPECT_TRUE((exitSequenceIface_get_canary(&statechart)== 0l));
	exitSequenceIface_raise_e(&statechart);
	EXPECT_TRUE((exitSequenceIface_get_canary(&statechart)== 0l));
	EXPECT_TRUE(exitSequence_isStateActive(&statechart, ExitSequence_main_region_StateA_inner1_State1A));
	exitSequence_exit(&statechart);
	EXPECT_TRUE((exitSequenceIface_get_canary(&statechart)== 1l));
}
TEST_F(ExitSequenceTest, testFrom1B) {
	
	exitSequence_enter(&statechart);
	EXPECT_TRUE((exitSequenceIface_get_canary(&statechart)== 0l));
	exitSequenceIface_set_guard(&statechart,true);
	exitSequenceIface_raise_e(&statechart);
	EXPECT_TRUE((exitSequenceIface_get_canary(&statechart)== 0l));
	EXPECT_TRUE(exitSequence_isStateActive(&statechart, ExitSequence_main_region_StateA_inner1_State1B));
	exitSequence_exit(&statechart);
	EXPECT_TRUE((exitSequenceIface_get_canary(&statechart)== 1l));
}

