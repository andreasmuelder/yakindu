/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "AssignmentAsExpression.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static AssignmentAsExpression statechart;

class AssignmentAsExpressionTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		assignmentAsExpression_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &assignmentAsExpression_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(AssignmentAsExpressionTest, simpleAssignment) {
	assignmentAsExpression_enter(&statechart);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_Add));
	EXPECT_TRUE(assignmentAsExpressionIface_get_b(&statechart)== 5l);
	EXPECT_TRUE(assignmentAsExpressionIface_get_a(&statechart)== 9l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_Subtract));
	EXPECT_TRUE(assignmentAsExpressionIface_get_d(&statechart)== 6l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_Multiply));
	EXPECT_TRUE(assignmentAsExpressionIface_get_e(&statechart)== 15l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_Divide));
	EXPECT_TRUE(assignmentAsExpressionIface_get_g(&statechart)== 1l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_Modulo));
	EXPECT_TRUE(assignmentAsExpressionIface_get_i(&statechart)== 1l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_Shift));
	EXPECT_TRUE(assignmentAsExpressionIface_get_j(&statechart)== 16l);
	EXPECT_TRUE(assignmentAsExpressionIface_get_k(&statechart)== 4l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_boolean_And));
	EXPECT_TRUE(assignmentAsExpressionIface_get_l(&statechart)== 1l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_boolean_Or));
	EXPECT_TRUE(assignmentAsExpressionIface_get_p(&statechart)== 15l);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(assignmentAsExpression_isStateActive(&statechart, AssignmentAsExpression_main_region_boolean_Xor));
	EXPECT_TRUE(assignmentAsExpressionIface_get_u(&statechart)== 12l);
	assignmentAsExpression_exit(&statechart);
}


