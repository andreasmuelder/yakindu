package org.yakindu.scr.booleanexpressions;


public class BooleanExpressionsStatemachine implements IBooleanExpressionsStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
		private boolean e1;
		
		public void raiseE1() {
			e1 = true;
		}
		
		private boolean myBool1;
		
		public boolean getMyBool1() {
			return myBool1;
		}
		
		public void setMyBool1(boolean value) {
			this.myBool1 = value;
		}
		
		private boolean myBool2;
		
		public boolean getMyBool2() {
			return myBool2;
		}
		
		public void setMyBool2(boolean value) {
			this.myBool2 = value;
		}
		
		private boolean and;
		
		public boolean getAnd() {
			return and;
		}
		
		public void setAnd(boolean value) {
			this.and = value;
		}
		
		private boolean or;
		
		public boolean getOr() {
			return or;
		}
		
		public void setOr(boolean value) {
			this.or = value;
		}
		
		private boolean not;
		
		public boolean getNot() {
			return not;
		}
		
		public void setNot(boolean value) {
			this.not = value;
		}
		
		private boolean equal;
		
		public boolean getEqual() {
			return equal;
		}
		
		public void setEqual(boolean value) {
			this.equal = value;
		}
		
		private boolean notequal;
		
		public boolean getNotequal() {
			return notequal;
		}
		
		public void setNotequal(boolean value) {
			this.notequal = value;
		}
		
		protected void clearEvents() {
			e1 = false;
		}
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
	
	
	public BooleanExpressionsStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		clearEvents();
		clearOutEvents();
		sCInterface.setMyBool1(false);
		
		sCInterface.setMyBool2(false);
		
		sCInterface.setAnd(false);
		
		sCInterface.setOr(false);
		
		sCInterface.setNot(false);
		
		sCInterface.setEqual(false);
		
		sCInterface.setNotequal(false);
	}
	
	public void enter() {
		if (!initialized) {
			throw new IllegalStateException(
				"The state machine needs to be initialized first by calling the init() function."
			);
		}
		enterSequence_main_region_default();
	}
	
	public void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
					"The state machine needs to be initialized first by calling the init() function.");
		clearOutEvents();
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
		clearEvents();
	}
	public void exit() {
		exitSequence_main_region();
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
	/**
	* This method resets the incoming events (time events included).
	*/
	protected void clearEvents() {
		sCInterface.clearEvents();
	}
	
	/**
	* This method resets the outgoing events.
	*/
	protected void clearOutEvents() {
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
	
	public void raiseE1() {
		sCInterface.raiseE1();
	}
	
	public boolean getMyBool1() {
		return sCInterface.getMyBool1();
	}
	
	public void setMyBool1(boolean value) {
		sCInterface.setMyBool1(value);
	}
	
	public boolean getMyBool2() {
		return sCInterface.getMyBool2();
	}
	
	public void setMyBool2(boolean value) {
		sCInterface.setMyBool2(value);
	}
	
	public boolean getAnd() {
		return sCInterface.getAnd();
	}
	
	public void setAnd(boolean value) {
		sCInterface.setAnd(value);
	}
	
	public boolean getOr() {
		return sCInterface.getOr();
	}
	
	public void setOr(boolean value) {
		sCInterface.setOr(value);
	}
	
	public boolean getNot() {
		return sCInterface.getNot();
	}
	
	public void setNot(boolean value) {
		sCInterface.setNot(value);
	}
	
	public boolean getEqual() {
		return sCInterface.getEqual();
	}
	
	public void setEqual(boolean value) {
		sCInterface.setEqual(value);
	}
	
	public boolean getNotequal() {
		return sCInterface.getNotequal();
	}
	
	public void setNotequal(boolean value) {
		sCInterface.setNotequal(value);
	}
	
	/* Entry action for state 'StateA'. */
	private void entryAction_main_region_StateA() {
		sCInterface.setMyBool1(true);
		
		sCInterface.setMyBool2(false);
	}
	
	/* Entry action for state 'StateB'. */
	private void entryAction_main_region_StateB() {
		sCInterface.setAnd(sCInterface.myBool1 && sCInterface.myBool2);
		
		sCInterface.setOr(sCInterface.myBool1 || sCInterface.myBool2);
		
		sCInterface.setNot(!sCInterface.myBool1);
		
		sCInterface.setEqual(sCInterface.myBool1==sCInterface.myBool2);
		
		sCInterface.setNotequal((sCInterface.myBool1!=sCInterface.myBool2));
	}
	
	/* 'default' enter sequence for state StateA */
	private void enterSequence_main_region_StateA_default() {
		entryAction_main_region_StateA();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_StateA;
	}
	
	/* 'default' enter sequence for state StateB */
	private void enterSequence_main_region_StateB_default() {
		entryAction_main_region_StateB();
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
	
	private boolean react(boolean try_transition) {
		return false;
	}
	
	private boolean main_region_StateA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react(try_transition)==false) {
				if (sCInterface.e1) {
					exitSequence_main_region_StateA();
					enterSequence_main_region_StateB_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
	private boolean main_region_StateB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react(try_transition)==false) {
				did_transition = false;
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
}
