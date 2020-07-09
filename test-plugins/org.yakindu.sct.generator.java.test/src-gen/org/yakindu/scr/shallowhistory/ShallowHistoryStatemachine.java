/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.shallowhistory;


public class ShallowHistoryStatemachine implements IShallowHistoryStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean event1;
		
		
		public void raiseEvent1() {
			event1 = true;
		}
		
		private boolean event2;
		
		
		public void raiseEvent2() {
			event2 = true;
		}
		
		private boolean event3;
		
		
		public void raiseEvent3() {
			event3 = true;
		}
		
		private boolean event4;
		
		
		public void raiseEvent4() {
			event4 = true;
		}
		
		private boolean event5;
		
		
		public void raiseEvent5() {
			event5 = true;
		}
		
		private boolean event6;
		
		
		public void raiseEvent6() {
			event6 = true;
		}
		
		private boolean event7;
		
		
		public void raiseEvent7() {
			event7 = true;
		}
		
		private boolean event8;
		
		
		public void raiseEvent8() {
			event8 = true;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean event1;
		private boolean event2;
		private boolean event3;
		private boolean event4;
		private boolean event5;
		private boolean event6;
		private boolean event7;
		private boolean event8;
	}
	private static class ShallowHistoryStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAINREGION_STATE1,
		MAINREGION_STATE2,
		MAINREGION_STATE2__REGION0_STATE3,
		MAINREGION_STATE2__REGION0_STATE4,
		MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6,
		MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7,
		MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8,
		MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9,
		MAINREGION_STATE2__REGION0_STATE5,
		$NULLSTATE$
	};
	
	private State[] historyVector = new State[2];
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private ShallowHistoryStatemachineEvBuf _current = new ShallowHistoryStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public ShallowHistoryStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		for (int i = 0; i < 2; i++) {
			historyVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		
		isExecuting = false;
	}
	
	public void enter() {
		if (!initialized)
			throw new IllegalStateException(
			        "The state machine needs to be initialized first by calling the init() function.");
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		enterSequence_mainRegion_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_mainRegion();
		isExecuting = false;
	}
	
	public void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
			        "The state machine needs to be initialized first by calling the init() function.");
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		swapInEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case MAINREGION_STATE1:
				mainRegion_State1_react(true);
				break;
			case MAINREGION_STATE2__REGION0_STATE3:
				mainRegion_State2__region0_State3_react(true);
				break;
			case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6:
				mainRegion_State2__region0_State4__region0_State6_react(true);
				break;
			case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
				mainRegion_State2__region0_State4__region0_State7__region0_State8_react(true);
				break;
			case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
				mainRegion_State2__region0_State4__region0_State7__region0_State9_react(true);
				break;
			case MAINREGION_STATE2__REGION0_STATE5:
				mainRegion_State2__region0_State5_react(true);
				break;
			default:
				// $NULLSTATE$
			}
		}
		
		isExecuting = false;
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NULLSTATE$;
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
		_current.iface.event1 = defaultInterface.event1;
		defaultInterface.event1 = false;
		
		_current.iface.event2 = defaultInterface.event2;
		defaultInterface.event2 = false;
		
		_current.iface.event3 = defaultInterface.event3;
		defaultInterface.event3 = false;
		
		_current.iface.event4 = defaultInterface.event4;
		defaultInterface.event4 = false;
		
		_current.iface.event5 = defaultInterface.event5;
		defaultInterface.event5 = false;
		
		_current.iface.event6 = defaultInterface.event6;
		defaultInterface.event6 = false;
		
		_current.iface.event7 = defaultInterface.event7;
		defaultInterface.event7 = false;
		
		_current.iface.event8 = defaultInterface.event8;
		defaultInterface.event8 = false;
	}
	
	private void clearInEvents() {
		defaultInterface.event1 = false;
		defaultInterface.event2 = false;
		defaultInterface.event3 = false;
		defaultInterface.event4 = false;
		defaultInterface.event5 = false;
		defaultInterface.event6 = false;
		defaultInterface.event7 = false;
		defaultInterface.event8 = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAINREGION_STATE1:
			return stateVector[0] == State.MAINREGION_STATE1;
		case MAINREGION_STATE2:
			return stateVector[0].ordinal() >= State.
					MAINREGION_STATE2.ordinal()&& stateVector[0].ordinal() <= State.MAINREGION_STATE2__REGION0_STATE5.ordinal();
		case MAINREGION_STATE2__REGION0_STATE3:
			return stateVector[0] == State.MAINREGION_STATE2__REGION0_STATE3;
		case MAINREGION_STATE2__REGION0_STATE4:
			return stateVector[0].ordinal() >= State.
					MAINREGION_STATE2__REGION0_STATE4.ordinal()&& stateVector[0].ordinal() <= State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9.ordinal();
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6:
			return stateVector[0] == State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7:
			return stateVector[0].ordinal() >= State.
					MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7.ordinal()&& stateVector[0].ordinal() <= State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9.ordinal();
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
			return stateVector[0] == State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
			return stateVector[0] == State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9;
		case MAINREGION_STATE2__REGION0_STATE5:
			return stateVector[0] == State.MAINREGION_STATE2__REGION0_STATE5;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public void raiseEvent1() {
		defaultInterface.raiseEvent1();
	}
	
	public void raiseEvent2() {
		defaultInterface.raiseEvent2();
	}
	
	public void raiseEvent3() {
		defaultInterface.raiseEvent3();
	}
	
	public void raiseEvent4() {
		defaultInterface.raiseEvent4();
	}
	
	public void raiseEvent5() {
		defaultInterface.raiseEvent5();
	}
	
	public void raiseEvent6() {
		defaultInterface.raiseEvent6();
	}
	
	public void raiseEvent7() {
		defaultInterface.raiseEvent7();
	}
	
	public void raiseEvent8() {
		defaultInterface.raiseEvent8();
	}
	
	/* 'default' enter sequence for state State1 */
	private void enterSequence_mainRegion_State1_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAINREGION_STATE1;
	}
	
	/* 'default' enter sequence for state State2 */
	private void enterSequence_mainRegion_State2_default() {
		enterSequence_mainRegion_State2__region0_default();
	}
	
	/* 'default' enter sequence for state State3 */
	private void enterSequence_mainRegion_State2__region0_State3_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAINREGION_STATE2__REGION0_STATE3;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state State4 */
	private void enterSequence_mainRegion_State2__region0_State4_default() {
		enterSequence_mainRegion_State2__region0_State4__region0_default();
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state State6 */
	private void enterSequence_mainRegion_State2__region0_State4__region0_State6_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6;
	}
	
	/* 'default' enter sequence for state State7 */
	private void enterSequence_mainRegion_State2__region0_State4__region0_State7_default() {
		enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_default();
	}
	
	/* 'default' enter sequence for state State8 */
	private void enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8;
		
		historyVector[1] = stateVector[0];
	}
	
	/* 'default' enter sequence for state State9 */
	private void enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9;
		
		historyVector[1] = stateVector[0];
	}
	
	/* 'default' enter sequence for state State5 */
	private void enterSequence_mainRegion_State2__region0_State5_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAINREGION_STATE2__REGION0_STATE5;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for region mainRegion */
	private void enterSequence_mainRegion_default() {
		react_mainRegion__entry_Default();
	}
	
	/* 'default' enter sequence for region null */
	private void enterSequence_mainRegion_State2__region0_default() {
		react_mainRegion_State2__region0__entry_Default();
	}
	
	/* shallow enterSequence with history in child null */
	private void shallowEnterSequence_mainRegion_State2__region0() {
		switch (historyVector[0]) {
		case MAINREGION_STATE2__REGION0_STATE3:
			enterSequence_mainRegion_State2__region0_State3_default();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6:
			enterSequence_mainRegion_State2__region0_State4_default();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
			enterSequence_mainRegion_State2__region0_State4_default();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
			enterSequence_mainRegion_State2__region0_State4_default();
			break;
		case MAINREGION_STATE2__REGION0_STATE5:
			enterSequence_mainRegion_State2__region0_State5_default();
			break;
		default:
			break;
		}
	}
	
	/* 'default' enter sequence for region null */
	private void enterSequence_mainRegion_State2__region0_State4__region0_default() {
		react_mainRegion_State2__region0_State4__region0__entry_Default();
	}
	
	/* 'default' enter sequence for region null */
	private void enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_default() {
		react_mainRegion_State2__region0_State4__region0_State7__region0__entry_Default();
	}
	
	/* shallow enterSequence with history in child null */
	private void shallowEnterSequence_mainRegion_State2__region0_State4__region0_State7__region0() {
		switch (historyVector[1]) {
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
			enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8_default();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
			enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9_default();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for state State1 */
	private void exitSequence_mainRegion_State1() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state State2 */
	private void exitSequence_mainRegion_State2() {
		exitSequence_mainRegion_State2__region0();
	}
	
	/* Default exit sequence for state State3 */
	private void exitSequence_mainRegion_State2__region0_State3() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state State4 */
	private void exitSequence_mainRegion_State2__region0_State4() {
		exitSequence_mainRegion_State2__region0_State4__region0();
	}
	
	/* Default exit sequence for state State6 */
	private void exitSequence_mainRegion_State2__region0_State4__region0_State6() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state State7 */
	private void exitSequence_mainRegion_State2__region0_State4__region0_State7() {
		exitSequence_mainRegion_State2__region0_State4__region0_State7__region0();
	}
	
	/* Default exit sequence for state State8 */
	private void exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state State9 */
	private void exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state State5 */
	private void exitSequence_mainRegion_State2__region0_State5() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region mainRegion */
	private void exitSequence_mainRegion() {
		switch (stateVector[0]) {
		case MAINREGION_STATE1:
			exitSequence_mainRegion_State1();
			break;
		case MAINREGION_STATE2__REGION0_STATE3:
			exitSequence_mainRegion_State2__region0_State3();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6:
			exitSequence_mainRegion_State2__region0_State4__region0_State6();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9();
			break;
		case MAINREGION_STATE2__REGION0_STATE5:
			exitSequence_mainRegion_State2__region0_State5();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_mainRegion_State2__region0() {
		switch (stateVector[0]) {
		case MAINREGION_STATE2__REGION0_STATE3:
			exitSequence_mainRegion_State2__region0_State3();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6:
			exitSequence_mainRegion_State2__region0_State4__region0_State6();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9();
			break;
		case MAINREGION_STATE2__REGION0_STATE5:
			exitSequence_mainRegion_State2__region0_State5();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_mainRegion_State2__region0_State4__region0() {
		switch (stateVector[0]) {
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE6:
			exitSequence_mainRegion_State2__region0_State4__region0_State6();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_mainRegion_State2__region0_State4__region0_State7__region0() {
		switch (stateVector[0]) {
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE8:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8();
			break;
		case MAINREGION_STATE2__REGION0_STATE4__REGION0_STATE7__REGION0_STATE9:
			exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_mainRegion__entry_Default() {
		enterSequence_mainRegion_State1_default();
	}
	
	/* Default react sequence for shallow history entry  */
	private void react_mainRegion_State2__region0__entry_Default() {
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NULLSTATE$) {
			shallowEnterSequence_mainRegion_State2__region0();
		} else {
			enterSequence_mainRegion_State2__region0_State3_default();
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_mainRegion_State2__region0_State4__region0__entry_Default() {
		enterSequence_mainRegion_State2__region0_State4__region0_State6_default();
	}
	
	/* Default react sequence for shallow history entry  */
	private void react_mainRegion_State2__region0_State4__region0_State7__region0__entry_Default() {
		/* Enter the region with shallow history */
		if (historyVector[1] != State.$NULLSTATE$) {
			shallowEnterSequence_mainRegion_State2__region0_State4__region0_State7__region0();
		} else {
			enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8_default();
		}
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean mainRegion_State1_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.event1) {
					exitSequence_mainRegion_State1();
					enterSequence_mainRegion_State2_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.event2) {
					exitSequence_mainRegion_State2();
					enterSequence_mainRegion_State1_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2__region0_State3_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mainRegion_State2_react(try_transition)==false) {
				if (_current.iface.event3) {
					exitSequence_mainRegion_State2__region0_State3();
					enterSequence_mainRegion_State2__region0_State4_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2__region0_State4_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mainRegion_State2_react(try_transition)==false) {
				if (_current.iface.event4) {
					exitSequence_mainRegion_State2__region0_State4();
					enterSequence_mainRegion_State2__region0_State5_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2__region0_State4__region0_State6_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mainRegion_State2__region0_State4_react(try_transition)==false) {
				if (_current.iface.event5) {
					exitSequence_mainRegion_State2__region0_State4__region0_State6();
					enterSequence_mainRegion_State2__region0_State4__region0_State7_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2__region0_State4__region0_State7_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mainRegion_State2__region0_State4_react(try_transition)==false) {
				if (_current.iface.event6) {
					exitSequence_mainRegion_State2__region0_State4__region0_State7();
					enterSequence_mainRegion_State2__region0_State4__region0_State6_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2__region0_State4__region0_State7__region0_State8_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mainRegion_State2__region0_State4__region0_State7_react(try_transition)==false) {
				if (_current.iface.event7) {
					exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8();
					enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2__region0_State4__region0_State7__region0_State9_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mainRegion_State2__region0_State4__region0_State7_react(try_transition)==false) {
				if (_current.iface.event8) {
					exitSequence_mainRegion_State2__region0_State4__region0_State7__region0_State9();
					enterSequence_mainRegion_State2__region0_State4__region0_State7__region0_State8_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean mainRegion_State2__region0_State5_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mainRegion_State2_react(try_transition)==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
