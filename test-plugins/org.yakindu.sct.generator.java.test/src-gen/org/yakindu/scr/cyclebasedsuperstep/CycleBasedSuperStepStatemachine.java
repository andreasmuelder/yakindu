/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.cyclebasedsuperstep;


public class CycleBasedSuperStepStatemachine implements ICycleBasedSuperStepStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
		}
		
		private boolean f;
		
		
		public void raiseF() {
			f = true;
		}
		
		private long x;
		
		public long getX() {
			return x;
		}
		
		public void setX(long value) {
			this.x = value;
		}
		
		protected void clearEvents() {
			e = false;
			f = false;
		}
	}
	
	
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		cycleBasedSuperStep_main_region_A,
		cycleBasedSuperStep_main_region_B,
		cycleBasedSuperStep_main_region_C,
		cycleBasedSuperStep_main_region_D,
		cycleBasedSuperStep_main_region_G,
		cycleBasedSuperStep_main_region_H,
		cycleBasedSuperStep_main_region_I,
		$NullState$
	};
	
	private final State[] stateVector = new State[1];
	
	private boolean stateVectorChanged = false;
	
	private int nextStateIndex;
	
	public CycleBasedSuperStepStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		clearEvents();
		clearOutEvents();
		sCInterface.setX(0);
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
		do {
			stateVectorChanged = false;
			for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
				switch (stateVector[nextStateIndex]) {
				case cycleBasedSuperStep_main_region_A:
					main_region_A_react(true);
					break;
				case cycleBasedSuperStep_main_region_B:
					main_region_B_react(true);
					break;
				case cycleBasedSuperStep_main_region_C:
					main_region_C_react(true);
					break;
				case cycleBasedSuperStep_main_region_D:
					main_region_D_react(true);
					break;
				case cycleBasedSuperStep_main_region_G:
					main_region_G_react(true);
					break;
				case cycleBasedSuperStep_main_region_H:
					main_region_H_react(true);
					break;
				case cycleBasedSuperStep_main_region_I:
					main_region_I_react(true);
					break;
				default:
					// $NullState$
				}
			}
		} while(stateVectorChanged);
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
		case cycleBasedSuperStep_main_region_A:
			return stateVector[0] == State.cycleBasedSuperStep_main_region_A;
		case cycleBasedSuperStep_main_region_B:
			return stateVector[0] == State.cycleBasedSuperStep_main_region_B;
		case cycleBasedSuperStep_main_region_C:
			return stateVector[0] == State.cycleBasedSuperStep_main_region_C;
		case cycleBasedSuperStep_main_region_D:
			return stateVector[0] == State.cycleBasedSuperStep_main_region_D;
		case cycleBasedSuperStep_main_region_G:
			return stateVector[0] == State.cycleBasedSuperStep_main_region_G;
		case cycleBasedSuperStep_main_region_H:
			return stateVector[0] == State.cycleBasedSuperStep_main_region_H;
		case cycleBasedSuperStep_main_region_I:
			return stateVector[0] == State.cycleBasedSuperStep_main_region_I;
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
	
	public void raiseF() {
		sCInterface.raiseF();
	}
	
	public long getX() {
		return sCInterface.getX();
	}
	
	public void setX(long value) {
		sCInterface.setX(value);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.cycleBasedSuperStep_main_region_A;
		stateVectorChanged = true;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.cycleBasedSuperStep_main_region_B;
		stateVectorChanged = true;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_C_default() {
		nextStateIndex = 0;
		stateVector[0] = State.cycleBasedSuperStep_main_region_C;
		stateVectorChanged = true;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_main_region_D_default() {
		nextStateIndex = 0;
		stateVector[0] = State.cycleBasedSuperStep_main_region_D;
		stateVectorChanged = true;
	}
	
	/* 'default' enter sequence for state G */
	private void enterSequence_main_region_G_default() {
		nextStateIndex = 0;
		stateVector[0] = State.cycleBasedSuperStep_main_region_G;
		stateVectorChanged = true;
	}
	
	/* 'default' enter sequence for state H */
	private void enterSequence_main_region_H_default() {
		nextStateIndex = 0;
		stateVector[0] = State.cycleBasedSuperStep_main_region_H;
		stateVectorChanged = true;
	}
	
	/* 'default' enter sequence for state I */
	private void enterSequence_main_region_I_default() {
		nextStateIndex = 0;
		stateVector[0] = State.cycleBasedSuperStep_main_region_I;
		stateVectorChanged = true;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_C() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_main_region_D() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state G */
	private void exitSequence_main_region_G() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state H */
	private void exitSequence_main_region_H() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state I */
	private void exitSequence_main_region_I() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case cycleBasedSuperStep_main_region_A:
			exitSequence_main_region_A();
			break;
		case cycleBasedSuperStep_main_region_B:
			exitSequence_main_region_B();
			break;
		case cycleBasedSuperStep_main_region_C:
			exitSequence_main_region_C();
			break;
		case cycleBasedSuperStep_main_region_D:
			exitSequence_main_region_D();
			break;
		case cycleBasedSuperStep_main_region_G:
			exitSequence_main_region_G();
			break;
		case cycleBasedSuperStep_main_region_H:
			exitSequence_main_region_H();
			break;
		case cycleBasedSuperStep_main_region_I:
			exitSequence_main_region_I();
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
			if (sCInterface.e) {
				exitSequence_main_region_A();
				enterSequence_main_region_B_default();
				react();
			} else {
				if (sCInterface.f) {
					exitSequence_main_region_A();
					enterSequence_main_region_G_default();
					react();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.e) {
				exitSequence_main_region_B();
				enterSequence_main_region_C_default();
				react();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.f) {
				exitSequence_main_region_C();
				enterSequence_main_region_D_default();
				react();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			if (sCInterface.e) {
				sCInterface.setX(42);
			}
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (((sCInterface.f) && (sCInterface.getX()==0))) {
				exitSequence_main_region_D();
				enterSequence_main_region_A_default();
				react();
			} else {
				if (sCInterface.f) {
					exitSequence_main_region_D();
					sCInterface.setX(sCInterface.getX() - 1);
					
					enterSequence_main_region_D_default();
					react();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_G_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			exitSequence_main_region_G();
			enterSequence_main_region_H_default();
			react();
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_H_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			exitSequence_main_region_H();
			enterSequence_main_region_I_default();
			react();
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_I_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (sCInterface.e) {
				exitSequence_main_region_I();
				enterSequence_main_region_A_default();
				react();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
}
