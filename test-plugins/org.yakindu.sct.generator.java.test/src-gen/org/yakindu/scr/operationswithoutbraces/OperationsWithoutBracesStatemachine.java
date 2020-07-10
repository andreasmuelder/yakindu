/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.operationswithoutbraces;


public class OperationsWithoutBracesStatemachine implements IOperationsWithoutBracesStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private InterfaceOperationCallback operationCallback;
		
		public void setInterfaceOperationCallback(
				InterfaceOperationCallback operationCallback) {
			this.operationCallback = operationCallback;
		}
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAIN_REGION_A,
		MAIN_REGION_B,
		MAIN_REGION_C,
		MAIN_REGION_D,
		ANOTHER_REGION_A,
		ANOTHER_REGION_B,
		ANOTHER_REGION_C,
		ANOTHER_REGION_D,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[2];
	
	private int nextStateIndex;
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public OperationsWithoutBracesStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		if (this.defaultInterface.operationCallback == null) {
			throw new IllegalStateException("Operation callback for interface Interface must be set.");
		}
		
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		
		
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
		enterSequence_another_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_main_region();
		exitSequence_another_region();
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
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case MAIN_REGION_A:
				main_region_A_react(true);
				break;
			case MAIN_REGION_B:
				main_region_B_react(true);
				break;
			case MAIN_REGION_C:
				main_region_C_react(true);
				break;
			case MAIN_REGION_D:
				main_region_D_react(true);
				break;
			case ANOTHER_REGION_A:
				another_region_A_react(true);
				break;
			case ANOTHER_REGION_B:
				another_region_B_react(true);
				break;
			case ANOTHER_REGION_C:
				another_region_C_react(true);
				break;
			case ANOTHER_REGION_D:
				another_region_D_react(true);
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
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_A:
			return stateVector[0] == State.MAIN_REGION_A;
		case MAIN_REGION_B:
			return stateVector[0] == State.MAIN_REGION_B;
		case MAIN_REGION_C:
			return stateVector[0] == State.MAIN_REGION_C;
		case MAIN_REGION_D:
			return stateVector[0] == State.MAIN_REGION_D;
		case ANOTHER_REGION_A:
			return stateVector[1] == State.ANOTHER_REGION_A;
		case ANOTHER_REGION_B:
			return stateVector[1] == State.ANOTHER_REGION_B;
		case ANOTHER_REGION_C:
			return stateVector[1] == State.ANOTHER_REGION_C;
		case ANOTHER_REGION_D:
			return stateVector[1] == State.ANOTHER_REGION_D;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_C_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_main_region_D_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_D;
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_another_region_A_default() {
		nextStateIndex = 1;
		stateVector[1] = State.ANOTHER_REGION_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_another_region_B_default() {
		nextStateIndex = 1;
		stateVector[1] = State.ANOTHER_REGION_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_another_region_C_default() {
		nextStateIndex = 1;
		stateVector[1] = State.ANOTHER_REGION_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_another_region_D_default() {
		nextStateIndex = 1;
		stateVector[1] = State.ANOTHER_REGION_D;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region another region */
	private void enterSequence_another_region_default() {
		react_another_region__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_C() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_main_region_D() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_another_region_A() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_another_region_B() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_another_region_C() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_another_region_D() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case MAIN_REGION_A:
			exitSequence_main_region_A();
			break;
		case MAIN_REGION_B:
			exitSequence_main_region_B();
			break;
		case MAIN_REGION_C:
			exitSequence_main_region_C();
			break;
		case MAIN_REGION_D:
			exitSequence_main_region_D();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region another region */
	private void exitSequence_another_region() {
		switch (stateVector[1]) {
		case ANOTHER_REGION_A:
			exitSequence_another_region_A();
			break;
		case ANOTHER_REGION_B:
			exitSequence_another_region_B();
			break;
		case ANOTHER_REGION_C:
			exitSequence_another_region_C();
			break;
		case ANOTHER_REGION_D:
			exitSequence_another_region_D();
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
	private void react_another_region__entry_Default() {
		enterSequence_another_region_A_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (!defaultInterface.operationCallback.myBoolOp()) {
					exitSequence_main_region_A();
					enterSequence_main_region_B_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (defaultInterface.operationCallback.myIntOp()==0) {
					exitSequence_main_region_B();
					enterSequence_main_region_C_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (defaultInterface.operationCallback.myRealOp()==0.0) {
					exitSequence_main_region_C();
					enterSequence_main_region_D_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean another_region_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (!defaultInterface.operationCallback.myBoolOp()) {
				exitSequence_another_region_A();
				enterSequence_another_region_B_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean another_region_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.myIntOp()==0) {
				exitSequence_another_region_B();
				enterSequence_another_region_C_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean another_region_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.myRealOp()==0.0) {
				exitSequence_another_region_C();
				enterSequence_another_region_D_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean another_region_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
}
