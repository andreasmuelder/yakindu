/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.shallowhistorywithdeepentry;


public class ShallowHistoryWithDeepEntryStatemachine implements IShallowHistoryWithDeepEntryStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
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
		
		protected void clearEvents() {
			toZ = false;
			toY = false;
			toC = false;
			toA = false;
		}
	}
	
	
	private static class SCInterfaceEvBuf {
		private boolean toZ;
		private boolean toY;
		private boolean toC;
		private boolean toA;
	}
	private static class ShallowHistoryWithDeepEntryStatemachineEvBuf {
		private SCInterfaceEvBuf iface = new SCInterfaceEvBuf();
	}
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		main_region_Y,
		main_region_Z,
		main_region_Z__region0_A,
		main_region_Z__region0_B,
		main_region_Z__region0_B__region0_C,
		$NullState$
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
		sCInterface = new SCInterfaceImpl();
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
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		
		swapInEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case main_region_Y:
				main_region_Y_react(true);
				break;
			case main_region_Z__region0_A:
				main_region_Z__region0_A_react(true);
				break;
			case main_region_Z__region0_B__region0_C:
				main_region_Z__region0_B__region0_C_react(true);
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
		_current.iface.toZ = sCInterface.toZ;
		sCInterface.toZ = false;
		
		_current.iface.toY = sCInterface.toY;
		sCInterface.toY = false;
		
		_current.iface.toC = sCInterface.toC;
		sCInterface.toC = false;
		
		_current.iface.toA = sCInterface.toA;
		sCInterface.toA = false;
	}
	
	private void clearInEvents() {
		sCInterface.toZ = false;
		
		sCInterface.toY = false;
		
		sCInterface.toC = false;
		
		sCInterface.toA = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case main_region_Y:
			return stateVector[0] == State.main_region_Y;
		case main_region_Z:
			return stateVector[0].ordinal() >= State.
					main_region_Z.ordinal()&& stateVector[0].ordinal() <= State.main_region_Z__region0_B__region0_C.ordinal();
		case main_region_Z__region0_A:
			return stateVector[0] == State.main_region_Z__region0_A;
		case main_region_Z__region0_B:
			return stateVector[0].ordinal() >= State.
					main_region_Z__region0_B.ordinal()&& stateVector[0].ordinal() <= State.main_region_Z__region0_B__region0_C.ordinal();
		case main_region_Z__region0_B__region0_C:
			return stateVector[0] == State.main_region_Z__region0_B__region0_C;
		default:
			return false;
		}
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public void raiseToZ() {
		sCInterface.raiseToZ();
	}
	
	public void raiseToY() {
		sCInterface.raiseToY();
	}
	
	public void raiseToC() {
		sCInterface.raiseToC();
	}
	
	public void raiseToA() {
		sCInterface.raiseToA();
	}
	
	/* 'default' enter sequence for state Y */
	private void enterSequence_main_region_Y_default() {
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Y;
	}
	
	/* 'default' enter sequence for state Z */
	private void enterSequence_main_region_Z_default() {
		enterSequence_main_region_Z__region0_default();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_Z__region0_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Z__region0_A;
		
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
		stateVector[0] = State.main_region_Z__region0_B__region0_C;
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
		case main_region_Z__region0_A:
			enterSequence_main_region_Z__region0_A_default();
			break;
		case main_region_Z__region0_B__region0_C:
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
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state Z */
	private void exitSequence_main_region_Z() {
		exitSequence_main_region_Z__region0();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_Z__region0_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_Z__region0_B() {
		exitSequence_main_region_Z__region0_B__region0();
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_Z__region0_B__region0_C() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case main_region_Y:
			exitSequence_main_region_Y();
			break;
		case main_region_Z__region0_A:
			exitSequence_main_region_Z__region0_A();
			break;
		case main_region_Z__region0_B__region0_C:
			exitSequence_main_region_Z__region0_B__region0_C();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_main_region_Z__region0() {
		switch (stateVector[0]) {
		case main_region_Z__region0_A:
			exitSequence_main_region_Z__region0_A();
			break;
		case main_region_Z__region0_B__region0_C:
			exitSequence_main_region_Z__region0_B__region0_C();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region null */
	private void exitSequence_main_region_Z__region0_B__region0() {
		switch (stateVector[0]) {
		case main_region_Z__region0_B__region0_C:
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
		if (historyVector[0] != State.$NullState$) {
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
