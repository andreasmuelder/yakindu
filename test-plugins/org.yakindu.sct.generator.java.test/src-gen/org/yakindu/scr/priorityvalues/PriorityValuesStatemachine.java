/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.priorityvalues;


public class PriorityValuesStatemachine implements IPriorityValuesStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
		private boolean event1;
		
		
		public void raiseEvent1() {
			event1 = true;
		}
		
		private boolean event2;
		
		
		public void raiseEvent2() {
			event2 = true;
		}
		
		protected void clearEvents() {
			event1 = false;
			event2 = false;
		}
	}
	
	
	private static class SCInterfaceEvBuf {
		private boolean event1;
		private boolean event2;
	}
	private static class PriorityValuesStatemachineEvBuf {
		private SCInterfaceEvBuf iface = new SCInterfaceEvBuf();
	}
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		someRegion_A,
		someRegion_B,
		main_region_A,
		main_region_B,
		main_region_C,
		main_region_D,
		main_region_E,
		$NullState$
	};
	
	private final State[] stateVector = new State[2];
	
	private int nextStateIndex;
	
	private PriorityValuesStatemachineEvBuf _current = new PriorityValuesStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public PriorityValuesStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NullState$;
		}
		
		clearInEvents();
		
		
		isExecuting = false;
	}
	
	public void enter() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		
		enterSequence_someRegion_default();
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		
		exitSequence_someRegion();
		exitSequence_main_region();
		isExecuting = false;
	}
	
	public void runCycle() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		
		swapInEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case someRegion_A:
				someRegion_A_react(true);
				break;
			case someRegion_B:
				someRegion_B_react(true);
				break;
			case main_region_A:
				main_region_A_react(true);
				break;
			case main_region_B:
				main_region_B_react(true);
				break;
			case main_region_C:
				main_region_C_react(true);
				break;
			case main_region_D:
				main_region_D_react(true);
				break;
			case main_region_E:
				main_region_E_react(true);
				break;
			default:
				// $NullState$
			}
		}
		
		
		isExecuting = false;
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NullState$||stateVector[1] != State.$NullState$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return false;
	}
	private void swapInEvents() {
		_current.iface.event1 = sCInterface.event1;
		sCInterface.event1 = false;
		
		_current.iface.event2 = sCInterface.event2;
		sCInterface.event2 = false;
	}
	
	private void clearInEvents() {
		sCInterface.event1 = false;
		
		sCInterface.event2 = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case someRegion_A:
			return stateVector[0] == State.someRegion_A;
		case someRegion_B:
			return stateVector[0] == State.someRegion_B;
		case main_region_A:
			return stateVector[1] == State.main_region_A;
		case main_region_B:
			return stateVector[1] == State.main_region_B;
		case main_region_C:
			return stateVector[1] == State.main_region_C;
		case main_region_D:
			return stateVector[1] == State.main_region_D;
		case main_region_E:
			return stateVector[1] == State.main_region_E;
		default:
			return false;
		}
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public void raiseEvent1() {
		sCInterface.raiseEvent1();
	}
	
	public void raiseEvent2() {
		sCInterface.raiseEvent2();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_someRegion_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.someRegion_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_someRegion_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.someRegion_B;
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		nextStateIndex = 1;
		stateVector[1] = State.main_region_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_B_default() {
		nextStateIndex = 1;
		stateVector[1] = State.main_region_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_C_default() {
		nextStateIndex = 1;
		stateVector[1] = State.main_region_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_main_region_D_default() {
		nextStateIndex = 1;
		stateVector[1] = State.main_region_D;
	}
	
	/* 'default' enter sequence for state E */
	private void enterSequence_main_region_E_default() {
		nextStateIndex = 1;
		stateVector[1] = State.main_region_E;
	}
	
	/* 'default' enter sequence for region someRegion */
	private void enterSequence_someRegion_default() {
		react_someRegion__entry_Default();
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_someRegion_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_someRegion_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_B() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_C() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_main_region_D() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for state E */
	private void exitSequence_main_region_E() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for region someRegion */
	private void exitSequence_someRegion() {
		switch (stateVector[0]) {
		case someRegion_A:
			exitSequence_someRegion_A();
			break;
		case someRegion_B:
			exitSequence_someRegion_B();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[1]) {
		case main_region_A:
			exitSequence_main_region_A();
			break;
		case main_region_B:
			exitSequence_main_region_B();
			break;
		case main_region_C:
			exitSequence_main_region_C();
			break;
		case main_region_D:
			exitSequence_main_region_D();
			break;
		case main_region_E:
			exitSequence_main_region_E();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_someRegion__entry_Default() {
		enterSequence_someRegion_A_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_A_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean someRegion_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.event2) {
					exitSequence_someRegion_A();
					enterSequence_someRegion_B_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean someRegion_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean main_region_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (_current.iface.event1) {
				exitSequence_main_region_A();
				enterSequence_main_region_C_default();
			} else {
				if (_current.iface.event1) {
					exitSequence_main_region_A();
					enterSequence_main_region_B_default();
				} else {
					if (_current.iface.event1) {
						exitSequence_main_region_A();
						enterSequence_main_region_D_default();
					} else {
						if (((_current.iface.event2) && (!isStateActive(State.someRegion_B)))) {
							exitSequence_main_region_A();
							enterSequence_main_region_E_default();
						} else {
							did_transition = false;
						}
					}
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean main_region_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean main_region_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean main_region_E_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
}
