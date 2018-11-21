/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "DeepEntry.h"

#include "sc_timer_service.h"

static DeepEntry statechart;



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class DeepEntryTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		deepEntry_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &deepEntry_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(DeepEntryTest, enterToSubstate) {
	
	deepEntry_enter(&statechart);
	sc_integer vergleich = 4l;
	EXPECT_TRUE(vergleich== 4l);
	deepEntry_exit(&statechart);
}


