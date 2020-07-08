/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.shallowhistorywithdeepentry;


public class ShallowHistoryWithDeepEntryStatemachine implements IShallowHistoryWithDeepEntryStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean toZ;
		
		
		public void raiseToZ() {
			toZ = true;
		}
		
		private boolean toY;
		
		
		public void raiseToY() {
			toY = true;
		}
		
		private boolean toC;
		
		
		public void raiseToC() {
			toC = true;
		}
		
		private boolean toA;
		
		
		public void raiseToA() {
			toA = true;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean toZ;
		private boolean toY;
		private boolean toC;
		private boolean toA;
	}
	private static class ShallowHistoryWithDeepEntryStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAIN_REGION_Y,
		MAIN_REGION_Z,
		MAIN_REGION_Z_A,
		MAIN_REGION_Z_B,
		MAIN_REGION_Z_B_C,
		$NULLSTATE$
	};
	
	private State[] historyVector = new State[1];
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private ShallowHistoryWithDeepEntryStatemachineEvBuf _current = new ShallowHistoryWithDeepEntryStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public ShallowHistoryWithDeepEntryStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		for (int i = 0; i < 1; i++) {
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
			case MAIN_REGION_Y:
				main_region_Y_react(true);
				break;
			case MAIN_REGION_Z_A:
				main_region_Z__region0_A_react(true);
				break;
			case MAIN_REGION_Z_B_C:
				main_region_Z__region0_B__region0_C_react(true);
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
		_current.iface.toZ = defaultInterface.toZ;
		defaultInterface.toZ = false;
		
		_current.iface.toY = defaultInterface.toY;
		defaultInterface.toY = false;
		
		_current.iface.toC = defaultInterface.toC;
		defaultInterface.toC = false;
		
		_current.iface.toA = defaultInterface.toA;
		defaultInterface.toA = false;
	}
	
	private void clearInEvents() {
		defaultInterface.toZ = false;
		defaultInterface.toY = false;
		defaultInterface.toC = false;
		defaultInterface.toA = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_Y:
			return stateVector[0] == State.MAIN_REGION_Y;
		case MAIN_REGION_Z:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_Z.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_Z_B_C.ordinal();
		case MAIN_REGION_Z_A:
			return stateVector[0] == State.MAIN_REGION_Z_A;
		case MAIN_REGION_Z_B:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_Z_B.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_Z_B_C.ordinal();
		case MAIN_REGION_Z_B_C:
			return stateVector[0] == State.MAIN_REGION_Z_B_C;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public void raiseToZ() {
		defaultInterface.raiseToZ();
	}
	
	public void raiseToY() {
		defaultInterface.raiseToY();
	}
	
	public void raiseToC() {
		defaultInterface.raiseToC();
	}
	
	public void raiseToA() {
		defaultInterface.raiseToA();
	}
	
	/* 'default' enter sequence for state Y */
	private void enterSequence_main_region_Y_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_Y;
	}
	
	/* 'default' enter sequence for state Z */
	private void enterSequence_main_region_Z_default() {
		enterSequence_main_region_Z__region0_default();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_Z__region0_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_Z_A;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_Z__region0_B_default() {
		enterSequence_main_region_Z__region0_B__region0_default();
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_Z__region0_B__region0_C_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_Z_B_C;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region null */
	private void enterSequence_main_region_Z__region0_default() {
		react_main_region_Z__region0__entry_Default();
	}
	
	/* shallow enterSequence with history in child null */
	private void shallowEnterSequence_main_region_Z__region0() {
		switch (historyVector[0]) {
		case MAIN_REGION_Z_A:
			enterSequence_main_region_Z__region0_A_default();
			break;
		case MAIN_REGION_Z_B_C:
			enterSequence_main_region_Z__region0_B_default();
			break;
		default:
			break;
		}
	}
	
	/* 'default' enter sequence for region null */
	private void enterSequence_main_region_Z__region0_B__region0_default() {
		react_main_region_Z__region0_B__region0__entry_Default();
	}
	
	/* Default exit sequence for state Y */
	private void exitSequence_main_region_Y() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state Z */
	private void exitSequence_main_region_Z() {
		exitSequence_main_region_Z__region0();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_Z__region0_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_Z__region0_B() {
		exitSequence_main_region_Z__region0_B__region0();
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_Z__region0_B__region0_C() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case MAIN_REGION_Y:
			exitSequence_main_region_Y();
			break;
		case MAIN_REGION_Z_A:
			exitSequence_main_region_Z__region0_A();
			break;
		case MAIN_REGION_Z_B_C:
			exitSequence_main_region_Z__region0_B__region0_C();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_main_region_Z__region0() {
		switch (stateVector[0]) {
		case MAIN_REGION_Z_A:
			exitSequence_main_region_Z__region0_A();
			break;
		case MAIN_REGION_Z_B_C:
			exitSequence_main_region_Z__region0_B__region0_C();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_main_region_Z__region0_B__region0() {
		switch (stateVector[0]) {
		case MAIN_REGION_Z_B_C:
			exitSequence_main_region_Z__region0_B__region0_C();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_Y_default();
	}
	
	/* Default react sequence for shallow history entry  */
	private void react_main_region_Z__region0__entry_Default() {
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NULLSTATE$) {
			shallowEnterSequence_main_region_Z__region0();
		} else {
			enterSequence_main_region_Z__region0_A_default();
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_Z__region0_B__region0__entry_Default() {
		enterSequence_main_region_Z__region0_B__region0_C_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_Y_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.toZ) {
					exitSequence_main_region_Y();
					enterSequence_main_region_Z_default();
				} else {
					if (_current.iface.toC) {
						exitSequence_main_region_Y();
						enterSequence_main_region_Z__region0_B__region0_C_default();
						historyVector[0] = stateVector[0];
					} else {
						did_transition = false;
					}
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Z_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.toY) {
					exitSequence_main_region_Z();
					enterSequence_main_region_Y_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Z__region0_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (main_region_Z_react(try_transition)==false) {
				if (_current.iface.toC) {
					exitSequence_main_region_Z__region0_A();
					enterSequence_main_region_Z__region0_B__region0_C_default();
					historyVector[0] = stateVector[0];
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Z__region0_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (main_region_Z_react(try_transition)==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Z__region0_B__region0_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (main_region_Z__region0_B_react(try_transition)==false) {
				if (_current.iface.toA) {
					exitSequence_main_region_Z__region0_B();
					enterSequence_main_region_Z__region0_A_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
}
