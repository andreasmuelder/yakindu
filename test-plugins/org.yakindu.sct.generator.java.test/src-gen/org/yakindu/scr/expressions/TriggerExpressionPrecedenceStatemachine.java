/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.expressions;


public class TriggerExpressionPrecedenceStatemachine implements ITriggerExpressionPrecedenceStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e1;
		
		
		public void raiseE1() {
			e1 = true;
		}
		
		private boolean e2;
		
		
		public void raiseE2() {
			e2 = true;
		}
		
		private boolean c1;
		
		public boolean getC1() {
			return c1;
		}
		
		public void setC1(boolean value) {
			this.c1 = value;
		}
		
		private boolean c2;
		
		public boolean getC2() {
			return c2;
		}
		
		public void setC2(boolean value) {
			this.c2 = value;
		}
		
		private boolean e1_transition;
		
		public boolean getE1_transition() {
			return e1_transition;
		}
		
		public void setE1_transition(boolean value) {
			this.e1_transition = value;
		}
		
		private boolean e2_transition;
		
		public boolean getE2_transition() {
			return e2_transition;
		}
		
		public void setE2_transition(boolean value) {
			this.e2_transition = value;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean e1;
		private boolean e2;
	}
	private static class TriggerExpressionPrecedenceStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAIN_REGION_A,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private TriggerExpressionPrecedenceStatemachineEvBuf _current = new TriggerExpressionPrecedenceStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public TriggerExpressionPrecedenceStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		defaultInterface.setC1(false);
		
		defaultInterface.setC2(false);
		
		defaultInterface.setE1_transition(false);
		
		defaultInterface.setE2_transition(false);
		
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
			case MAIN_REGION_A:
				main_region_A_react(true);
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
		_current.iface.e1 = defaultInterface.e1;
		defaultInterface.e1 = false;
		
		_current.iface.e2 = defaultInterface.e2;
		defaultInterface.e2 = false;
	}
	
	private void clearInEvents() {
		defaultInterface.e1 = false;
		defaultInterface.e2 = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_A:
			return stateVector[0] == State.MAIN_REGION_A;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public void raiseE1() {
		defaultInterface.raiseE1();
	}
	
	public void raiseE2() {
		defaultInterface.raiseE2();
	}
	
	public boolean getC1() {
		return defaultInterface.getC1();
	}
	
	public void setC1(boolean value) {
		defaultInterface.setC1(value);
	}
	
	public boolean getC2() {
		return defaultInterface.getC2();
	}
	
	public void setC2(boolean value) {
		defaultInterface.setC2(value);
	}
	
	public boolean getE1_transition() {
		return defaultInterface.getE1_transition();
	}
	
	public void setE1_transition(boolean value) {
		defaultInterface.setE1_transition(value);
	}
	
	public boolean getE2_transition() {
		return defaultInterface.getE2_transition();
	}
	
	public void setE2_transition(boolean value) {
		defaultInterface.setE2_transition(value);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_A;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case MAIN_REGION_A:
			exitSequence_main_region_A();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_A_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (((_current.iface.e1) && ((defaultInterface.getC1() || defaultInterface.getC2())))) {
					exitSequence_main_region_A();
					defaultInterface.setE1_transition(true);
					
					enterSequence_main_region_A_default();
				} else {
					if (_current.iface.e2) {
						exitSequence_main_region_A();
						defaultInterface.setE2_transition(true);
						
						enterSequence_main_region_A_default();
					} else {
						did_transition = false;
					}
				}
			}
		}
		return did_transition;
	}
	
}
