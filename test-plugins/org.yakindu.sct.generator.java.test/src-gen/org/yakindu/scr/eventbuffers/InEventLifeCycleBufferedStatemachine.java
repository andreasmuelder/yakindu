/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.eventbuffers;


public class InEventLifeCycleBufferedStatemachine implements IInEventLifeCycleBufferedStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
		}
		
		private boolean f;
		
		
		public void raiseF() {
			f = true;
		}
		
		private boolean i1;
		
		
		public void raiseI1() {
			i1 = true;
		}
		
		private boolean i2;
		
		
		public void raiseI2() {
			i2 = true;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean e;
		private boolean f;
		private boolean i1;
		private boolean i2;
	}
	private static class InEventLifeCycleBufferedStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		R1_A,
		R1_B,
		R2_C,
		R2_D,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[2];
	
	private int nextStateIndex;
	
	private InEventLifeCycleBufferedStatemachineEvBuf _current = new InEventLifeCycleBufferedStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public InEventLifeCycleBufferedStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NULLSTATE$;
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
			case R1_A:
				r1_A_react(true);
				break;
			case R1_B:
				r1_B_react(true);
				break;
			case R2_C:
				r2_C_react(true);
				break;
			case R2_D:
				r2_D_react(true);
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
		return stateVector[0] != State.$NULLSTATE$||stateVector[1] != State.$NULLSTATE$;
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
		
		_current.iface.i1 = defaultInterface.i1;
		defaultInterface.i1 = false;
		
		_current.iface.i2 = defaultInterface.i2;
		defaultInterface.i2 = false;
	}
	
	private void clearInEvents() {
		defaultInterface.e = false;
		defaultInterface.f = false;
		defaultInterface.i1 = false;
		defaultInterface.i2 = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case R1_A:
			return stateVector[0] == State.R1_A;
		case R1_B:
			return stateVector[0] == State.R1_B;
		case R2_C:
			return stateVector[1] == State.R2_C;
		case R2_D:
			return stateVector[1] == State.R2_D;
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
	
	public void raiseI1() {
		defaultInterface.raiseI1();
	}
	
	public void raiseI2() {
		defaultInterface.raiseI2();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r1_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R1_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r1_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R1_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_r2_C_default() {
		nextStateIndex = 1;
		stateVector[1] = State.R2_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_r2_D_default() {
		nextStateIndex = 1;
		stateVector[1] = State.R2_D;
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
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r1_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_r2_C() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_r2_D() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r1() {
		switch (stateVector[0]) {
		case R1_A:
			exitSequence_r1_A();
			break;
		case R1_B:
			exitSequence_r1_B();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r2() {
		switch (stateVector[1]) {
		case R2_C:
			exitSequence_r2_C();
			break;
		case R2_D:
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
				if (_current.iface.i2) {
					exitSequence_r1_A();
					enterSequence_r1_B_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			if (_current.iface.e) {
				defaultInterface.raiseI1();
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
			if (_current.iface.i1) {
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
				defaultInterface.raiseI2();
				
				enterSequence_r2_C_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
