/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.alwaysoncycle;


public class AlwaysOncycleStatemachine implements IAlwaysOncycleStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
		}
		
		private long value;
		
		public long getValue() {
			return value;
		}
		
		public void setValue(long value) {
			this.value = value;
		}
		
		private boolean v2;
		
		public boolean getV2() {
			return v2;
		}
		
		public void setV2(boolean value) {
			this.v2 = value;
		}
		
		private long x;
		
		public long getX() {
			return x;
		}
		
		public void setX(long value) {
			this.x = value;
		}
		
		private long y;
		
		public long getY() {
			return y;
		}
		
		public void setY(long value) {
			this.y = value;
		}
		
		protected void clearEvents() {
			e = false;
		}
	}
	
	
	private static class SCInterfaceEvBuf {
		private boolean e;
	}
	private static class AlwaysOncycleStatemachineEvBuf {
		private SCInterfaceEvBuf iface = new SCInterfaceEvBuf();
	}
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		main_region_StateA,
		main_region_StateB,
		$NullState$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private AlwaysOncycleStatemachineEvBuf _current = new AlwaysOncycleStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public AlwaysOncycleStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		
		clearInEvents();
		
		sCInterface.setValue(0);
		
		sCInterface.setV2(false);
		
		sCInterface.setX(0);
		
		sCInterface.setY(0);
		
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
			case main_region_StateA:
				main_region_StateA_react(true);
				break;
			case main_region_StateB:
				main_region_StateB_react(true);
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
		_current.iface.e = sCInterface.e;
		sCInterface.e = false;
	}
	
	private void clearInEvents() {
		sCInterface.e = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case main_region_StateA:
			return stateVector[0] == State.main_region_StateA;
		case main_region_StateB:
			return stateVector[0] == State.main_region_StateB;
		default:
			return false;
		}
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public void raiseE() {
		sCInterface.raiseE();
	}
	
	public long getValue() {
		return sCInterface.getValue();
	}
	
	public void setValue(long value) {
		sCInterface.setValue(value);
	}
	
	public boolean getV2() {
		return sCInterface.getV2();
	}
	
	public void setV2(boolean value) {
		sCInterface.setV2(value);
	}
	
	public long getX() {
		return sCInterface.getX();
	}
	
	public void setX(long value) {
		sCInterface.setX(value);
	}
	
	public long getY() {
		return sCInterface.getY();
	}
	
	public void setY(long value) {
		sCInterface.setY(value);
	}
	
	/* Entry action for state 'StateA'. */
	private void entryAction_main_region_StateA() {
		sCInterface.setValue(0);
	}
	
	/* Exit action for state 'StateA'. */
	private void exitAction_main_region_StateA() {
		sCInterface.setValue(0);
	}
	
	/* 'default' enter sequence for state StateA */
	private void enterSequence_main_region_StateA_default() {
		entryAction_main_region_StateA();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_StateA;
	}
	
	/* 'default' enter sequence for state StateB */
	private void enterSequence_main_region_StateB_default() {
		nextStateIndex = 0;
		stateVector[0] = State.main_region_StateB;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state StateA */
	private void exitSequence_main_region_StateA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
		
		exitAction_main_region_StateA();
	}
	
	/* Default exit sequence for state StateB */
	private void exitSequence_main_region_StateB() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case main_region_StateA:
			exitSequence_main_region_StateA();
			break;
		case main_region_StateB:
			exitSequence_main_region_StateB();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_StateA_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_StateA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (sCInterface.getValue()==5) {
					exitSequence_main_region_StateA();
					enterSequence_main_region_StateB_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			sCInterface.setValue(sCInterface.getValue() + 1);
		}
		return did_transition;
	}
	
	private boolean main_region_StateB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (sCInterface.getValue()==5) {
					exitSequence_main_region_StateB();
					enterSequence_main_region_StateA_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			sCInterface.setValue(sCInterface.getValue() + 1);
			
			sCInterface.setX(sCInterface.getX() + 1);
			
			sCInterface.setY(sCInterface.getY() + 1);
		}
		return did_transition;
	}
	
}
