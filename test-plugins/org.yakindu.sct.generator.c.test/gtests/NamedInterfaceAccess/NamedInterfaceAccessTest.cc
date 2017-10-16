/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "NamedInterfaceAccess.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static NamedInterfaceAccess statechart;

class NamedInterfaceAccessTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		namedInterfaceAccess_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &namedInterfaceAccess_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(NamedInterfaceAccessTest, SafeOpenSuccess) {
	namedInterfaceAccess_enter(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	namedInterfaceAccessIfaceUser_raise_numberPressed(&statechart, 3l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	namedInterfaceAccessIfaceUser_raise_numberPressed(&statechart, 7l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	namedInterfaceAccessIfaceUser_raise_numberPressed(&statechart, 5l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(namedInterfaceAccessIfaceSafe_israised_open(&statechart));
}


