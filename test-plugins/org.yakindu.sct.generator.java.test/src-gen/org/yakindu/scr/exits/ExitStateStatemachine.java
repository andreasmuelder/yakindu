/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.exits;


public class ExitStateStatemachine implements IExitStateStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
		}
		
		private boolean f;
		
		
		public void raiseF() {
			f = true;
		}
		
		private boolean g;
		
		
		public void raiseG() {
			g = true;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean e;
		private boolean f;
		private boolean g;
	}
	private static class ExitStateStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		exitState_r_A,
		exitState_r_A_r_B,
		exitState_r_E,
		exitState_r_F,
		$NullState$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private ExitStateStatemachineEvBuf _current = new ExitStateStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public ExitStateStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
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
		enterSequence_r_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_r();
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
			case exitState_r_A_r_B:
				r_A_r_B_react(true);
				break;
			case exitState_r_E:
				r_E_react(true);
				break;
			case exitState_r_F:
				r_F_react(true);
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
		_current.iface.e = defaultInterface.e;
		defaultInterface.e = false;
		
		_current.iface.f = defaultInterface.f;
		defaultInterface.f = false;
		
		_current.iface.g = defaultInterface.g;
		defaultInterface.g = false;
	}
	
	private void clearInEvents() {
		defaultInterface.e = false;
		defaultInterface.f = false;
		defaultInterface.g = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case exitState_r_A:
			return stateVector[0].ordinal() >= State.
					exitState_r_A.ordinal()&& stateVector[0].ordinal() <= State.exitState_r_A_r_B.ordinal();
		case exitState_r_A_r_B:
			return stateVector[0] == State.exitState_r_A_r_B;
		case exitState_r_E:
			return stateVector[0] == State.exitState_r_E;
		case exitState_r_F:
			return stateVector[0] == State.exitState_r_F;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public void raiseE() {
		defaultInterface.raiseE();
	}
	
	public void raiseF() {
		defaultInterface.raiseF();
	}
	
	public void raiseG() {
		defaultInterface.raiseG();
	}
	
	private void effect_r_A_tr0() {
		exitSequence_r_A();
		enterSequence_r_E_default();
	}
	
	private void effect_r_A_tr1() {
		exitSequence_r_A();
		enterSequence_r_F_default();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r_A_default() {
		enterSequence_r_A_r_default();
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r_A_r_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.exitState_r_A_r_B;
	}
	
	/* 'default' enter sequence for state E */
	private void enterSequence_r_E_default() {
		nextStateIndex = 0;
		stateVector[0] = State.exitState_r_E;
	}
	
	/* 'default' enter sequence for state F */
	private void enterSequence_r_F_default() {
		nextStateIndex = 0;
		stateVector[0] = State.exitState_r_F;
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r_default() {
		react_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r_A_r_default() {
		react_r_A_r__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_r_A() {
		exitSequence_r_A_r();
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r_A_r_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state E */
	private void exitSequence_r_E() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state F */
	private void exitSequence_r_F() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r() {
		switch (stateVector[0]) {
		case exitState_r_A_r_B:
			exitSequence_r_A_r_B();
			break;
		case exitState_r_E:
			exitSequence_r_E();
			break;
		case exitState_r_F:
			exitSequence_r_F();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r_A_r() {
		switch (stateVector[0]) {
		case exitState_r_A_r_B:
			exitSequence_r_A_r_B();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_r__entry_Default() {
		enterSequence_r_A_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r_A_r__entry_Default() {
		enterSequence_r_A_r_B_default();
	}
	
	/* The reactions of exit default. */
	private void react_r_A_r__exit_Default() {
		effect_r_A_tr0();
	}
	
	/* The reactions of exit f. */
	private void react_r_A_r_f() {
		effect_r_A_tr1();
	}
	
	/* The reactions of exit g. */
	private void react_r_A_r_g() {
		effect_r_A_tr0();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean r_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r_A_r_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (r_A_react(try_transition)==false) {
				if (_current.iface.g) {
					exitSequence_r_A_r_B();
					react_r_A_r_g();
				} else {
					if (_current.iface.f) {
						exitSequence_r_A_r_B();
						react_r_A_r_f();
					} else {
						if (_current.iface.e) {
							exitSequence_r_A_r_B();
							react_r_A_r__exit_Default();
						} else {
							did_transition = false;
						}
					}
				}
			}
		}
		return did_transition;
	}
	
	private boolean r_E_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r_F_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
