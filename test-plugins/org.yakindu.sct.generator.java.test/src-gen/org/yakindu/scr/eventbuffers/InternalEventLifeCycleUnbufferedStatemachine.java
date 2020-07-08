/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.eventbuffers;


public class InternalEventLifeCycleUnbufferedStatemachine implements IInternalEventLifeCycleUnbufferedStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
		}
		
		private boolean f;
		
		
		public void raiseF() {
			f = true;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean e;
		private boolean f;
	}
	private static class InternalEventLifeCycleUnbufferedStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		internalEventLifeCycle_r1_A,
		internalEventLifeCycle_r1_B,
		internalEventLifeCycle_r2_C,
		internalEventLifeCycle_r2_D,
		$NullState$
	};
	
	private final State[] stateVector = new State[2];
	
	private int nextStateIndex;
	
	private boolean i1;
	private boolean i2;
	private InternalEventLifeCycleUnbufferedStatemachineEvBuf _current = new InternalEventLifeCycleUnbufferedStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public InternalEventLifeCycleUnbufferedStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NullState$;
		}
		
		clearInEvents();
		clearInternalEvents();
		
		
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
		enterSequence_r1_default();
		enterSequence_r2_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_r1();
		exitSequence_r2();
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
			case internalEventLifeCycle_r1_A:
				r1_A_react(true);
				break;
			case internalEventLifeCycle_r1_B:
				r1_B_react(true);
				break;
			case internalEventLifeCycle_r2_C:
				r2_C_react(true);
				break;
			case internalEventLifeCycle_r2_D:
				r2_D_react(true);
				break;
			default:
				// $NullState$
			}
		}
		
		clearInternalEvents();
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
		_current.iface.e = defaultInterface.e;
		defaultInterface.e = false;
		
		_current.iface.f = defaultInterface.f;
		defaultInterface.f = false;
	}
	
	private void clearInEvents() {
		defaultInterface.e = false;
		defaultInterface.f = false;
	}
	
	private void clearInternalEvents() {
		i1 = false;
		i2 = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case internalEventLifeCycle_r1_A:
			return stateVector[0] == State.internalEventLifeCycle_r1_A;
		case internalEventLifeCycle_r1_B:
			return stateVector[0] == State.internalEventLifeCycle_r1_B;
		case internalEventLifeCycle_r2_C:
			return stateVector[1] == State.internalEventLifeCycle_r2_C;
		case internalEventLifeCycle_r2_D:
			return stateVector[1] == State.internalEventLifeCycle_r2_D;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	private void raiseI1() {
		i1 = true;
	}
	
	private void raiseI2() {
		i2 = true;
	}
	
	public void raiseE() {
		defaultInterface.raiseE();
	}
	
	public void raiseF() {
		defaultInterface.raiseF();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r1_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.internalEventLifeCycle_r1_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r1_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.internalEventLifeCycle_r1_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_r2_C_default() {
		nextStateIndex = 1;
		stateVector[1] = State.internalEventLifeCycle_r2_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_r2_D_default() {
		nextStateIndex = 1;
		stateVector[1] = State.internalEventLifeCycle_r2_D;
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r1_default() {
		react_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r2_default() {
		react_r2__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_r1_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r1_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_r2_C() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_r2_D() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r1() {
		switch (stateVector[0]) {
		case internalEventLifeCycle_r1_A:
			exitSequence_r1_A();
			break;
		case internalEventLifeCycle_r1_B:
			exitSequence_r1_B();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r2() {
		switch (stateVector[1]) {
		case internalEventLifeCycle_r2_C:
			exitSequence_r2_C();
			break;
		case internalEventLifeCycle_r2_D:
			exitSequence_r2_D();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_r1__entry_Default() {
		enterSequence_r1_A_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2__entry_Default() {
		enterSequence_r2_C_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean r1_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (i2) {
					exitSequence_r1_A();
					enterSequence_r1_B_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			if (_current.iface.e) {
				raiseI1();
			}
		}
		return did_transition;
	}
	
	private boolean r1_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.e) {
					exitSequence_r1_B();
					enterSequence_r1_A_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean r2_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (i1) {
				exitSequence_r2_C();
				enterSequence_r2_D_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r2_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (_current.iface.f) {
				exitSequence_r2_D();
				raiseI2();
				
				enterSequence_r2_C_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
