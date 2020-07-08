/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.historywithoutinitialstep;


public class HistoryWithoutInitialStepStatemachine implements IHistoryWithoutInitialStepStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean toA;
		
		
		public void raiseToA() {
			toA = true;
		}
		
		private boolean toB;
		
		
		public void raiseToB() {
			toB = true;
		}
		
		private boolean toHistory;
		
		
		public void raiseToHistory() {
			toHistory = true;
		}
		
		private boolean next;
		
		
		public void raiseNext() {
			next = true;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean toA;
		private boolean toB;
		private boolean toHistory;
		private boolean next;
	}
	private static class HistoryWithoutInitialStepStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		main_region_A,
		main_region_B,
		main_region_B_r1_C,
		main_region_B_r1_D,
		main_region_B_r1_E,
		main_region_B_r1_E__region0_F,
		$NullState$
	};
	
	private State[] historyVector = new State[1];
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private HistoryWithoutInitialStepStatemachineEvBuf _current = new HistoryWithoutInitialStepStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public HistoryWithoutInitialStepStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		for (int i = 0; i < 1; i++) {
			historyVector[i] = State.$NullState$;
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
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_main_region();
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
			case main_region_A:
				main_region_A_react(true);
				break;
			case main_region_B_r1_C:
				main_region_B_r1_C_react(true);
				break;
			case main_region_B_r1_D:
				main_region_B_r1_D_react(true);
				break;
			case main_region_B_r1_E__region0_F:
				main_region_B_r1_E__region0_F_react(true);
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
		return stateVector[0] != State.$NullState$;
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
		_current.iface.toA = defaultInterface.toA;
		defaultInterface.toA = false;
		
		_current.iface.toB = defaultInterface.toB;
		defaultInterface.toB = false;
		
		_current.iface.toHistory = defaultInterface.toHistory;
		defaultInterface.toHistory = false;
		
		_current.iface.next = defaultInterface.next;
		defaultInterface.next = false;
	}
	
	private void clearInEvents() {
		defaultInterface.toA = false;
		defaultInterface.toB = false;
		defaultInterface.toHistory = false;
		defaultInterface.next = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case main_region_A:
			return stateVector[0] == State.main_region_A;
		case main_region_B:
			return stateVector[0].ordinal() >= State.
					main_region_B.ordinal()&& stateVector[0].ordinal() <= State.main_region_B_r1_E__region0_F.ordinal();
		case main_region_B_r1_C:
			return stateVector[0] == State.main_region_B_r1_C;
		case main_region_B_r1_D:
			return stateVector[0] == State.main_region_B_r1_D;
		case main_region_B_r1_E:
			return stateVector[0].ordinal() >= State.
					main_region_B_r1_E.ordinal()&& stateVector[0].ordinal() <= State.main_region_B_r1_E__region0_F.ordinal();
		case main_region_B_r1_E__region0_F:
			return stateVector[0] == State.main_region_B_r1_E__region0_F;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public void raiseToA() {
		defaultInterface.raiseToA();
	}
	
	public void raiseToB() {
		defaultInterface.raiseToB();
	}
	
	public void raiseToHistory() {
		defaultInterface.raiseToHistory();
	}
	
	public void raiseNext() {
		defaultInterface.raiseNext();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.main_region_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_B_default() {
		enterSequence_main_region_B_r1_default();
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_B_r1_C_default() {
		nextStateIndex = 0;
		stateVector[0] = State.main_region_B_r1_C;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_main_region_B_r1_D_default() {
		nextStateIndex = 0;
		stateVector[0] = State.main_region_B_r1_D;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state E */
	private void enterSequence_main_region_B_r1_E_default() {
		enterSequence_main_region_B_r1_E__region0_default();
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state F */
	private void enterSequence_main_region_B_r1_E__region0_F_default() {
		nextStateIndex = 0;
		stateVector[0] = State.main_region_B_r1_E__region0_F;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_B_r1_default() {
		react_main_region_B_r1__entry_Default();
	}
	
	/* shallow enterSequence with history in child r1 */
	private void shallowEnterSequence_main_region_B_r1() {
		switch (historyVector[0]) {
		case main_region_B_r1_C:
			enterSequence_main_region_B_r1_C_default();
			break;
		case main_region_B_r1_D:
			enterSequence_main_region_B_r1_D_default();
			break;
		case main_region_B_r1_E__region0_F:
			enterSequence_main_region_B_r1_E_default();
			break;
		default:
			break;
		}
	}
	
	/* 'default' enter sequence for region null */
	private void enterSequence_main_region_B_r1_E__region0_default() {
		react_main_region_B_r1_E__region0__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_B() {
		exitSequence_main_region_B_r1();
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_B_r1_C() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_main_region_B_r1_D() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state E */
	private void exitSequence_main_region_B_r1_E() {
		exitSequence_main_region_B_r1_E__region0();
	}
	
	/* Default exit sequence for state F */
	private void exitSequence_main_region_B_r1_E__region0_F() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case main_region_A:
			exitSequence_main_region_A();
			break;
		case main_region_B_r1_C:
			exitSequence_main_region_B_r1_C();
			break;
		case main_region_B_r1_D:
			exitSequence_main_region_B_r1_D();
			break;
		case main_region_B_r1_E__region0_F:
			exitSequence_main_region_B_r1_E__region0_F();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_B_r1() {
		switch (stateVector[0]) {
		case main_region_B_r1_C:
			exitSequence_main_region_B_r1_C();
			break;
		case main_region_B_r1_D:
			exitSequence_main_region_B_r1_D();
			break;
		case main_region_B_r1_E__region0_F:
			exitSequence_main_region_B_r1_E__region0_F();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_main_region_B_r1_E__region0() {
		switch (stateVector[0]) {
		case main_region_B_r1_E__region0_F:
			exitSequence_main_region_B_r1_E__region0_F();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_A_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_B_r1__entry_Default() {
		enterSequence_main_region_B_r1_C_default();
	}
	
	/* Default react sequence for shallow history entry he */
	private void react_main_region_B_r1_he() {
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NullState$) {
			shallowEnterSequence_main_region_B_r1();
		} else {
			enterSequence_main_region_B_r1_C_default();
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_B_r1_E__region0__entry_Default() {
		enterSequence_main_region_B_r1_E__region0_F_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.toB) {
					exitSequence_main_region_A();
					enterSequence_main_region_B_default();
				} else {
					if (_current.iface.toHistory) {
						exitSequence_main_region_A();
						react_main_region_B_r1_he();
					} else {
						did_transition = false;
					}
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.toA) {
					exitSequence_main_region_B();
					enterSequence_main_region_A_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_B_r1_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (main_region_B_react(try_transition)==false) {
				if (_current.iface.next) {
					exitSequence_main_region_B_r1_C();
					enterSequence_main_region_B_r1_D_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_B_r1_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (main_region_B_react(try_transition)==false) {
				if (_current.iface.next) {
					exitSequence_main_region_B_r1_D();
					enterSequence_main_region_B_r1_E_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_B_r1_E_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (main_region_B_react(try_transition)==false) {
				if (_current.iface.next) {
					exitSequence_main_region_B_r1_E();
					enterSequence_main_region_B_r1_C_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_B_r1_E__region0_F_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (main_region_B_r1_E_react(try_transition)==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
