/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "HistoryWithoutInitialStep.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static HistoryWithoutInitialStep statechart;

class HistoryWithoutInitialStepTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		historyWithoutInitialStep_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &historyWithoutInitialStep_runCycle,
			false,
			200,
			&statechart
		);
	}
};

void init(){
	historyWithoutInitialStep_enter(&statechart);
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_A));
	historyWithoutInitialStepIface_raise_toB(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
}

TEST_F(HistoryWithoutInitialStepTest, enterThroughInitialEntry) {
	init();
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_B_r1_C));
	historyWithoutInitialStepIface_raise_next(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_B_r1_D));
}
TEST_F(HistoryWithoutInitialStepTest, enterCThroughHistory) {
	init();
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_B_r1_C));
	historyWithoutInitialStepIface_raise_toA(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_A));
	historyWithoutInitialStepIface_raise_toHistory(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_B_r1_C));
}
TEST_F(HistoryWithoutInitialStepTest, enterDThroughHistory) {
	init();
	historyWithoutInitialStepIface_raise_next(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_B_r1_D));
	historyWithoutInitialStepIface_raise_toA(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_A));
	historyWithoutInitialStepIface_raise_toHistory(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(historyWithoutInitialStep_isStateActive(&statechart, HistoryWithoutInitialStep_main_region_B_r1_D));
}


