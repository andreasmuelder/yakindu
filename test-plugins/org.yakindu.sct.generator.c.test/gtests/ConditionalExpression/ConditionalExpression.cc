/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "ConditionalExpressions.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static ConditionalExpressions statechart;

class ConditionalExpression : public ::testing::Test{
	protected:
	virtual void SetUp() {
		conditionalExpressions_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &conditionalExpressions_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(ConditionalExpression, ConditionalExpressionTest) {
	conditionalExpressions_enter(&statechart);
	EXPECT_TRUE(conditionalExpressions_isStateActive(&statechart, ConditionalExpressions_main_region_A));
	EXPECT_TRUE(conditionalExpressionsIface_get_condition(&statechart)== 1l);
	conditionalExpressionsIface_raise_e(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(conditionalExpressions_isStateActive(&statechart, ConditionalExpressions_main_region_B));
	EXPECT_TRUE(conditionalExpressionsIface_get_condition(&statechart)== 2l);
}


