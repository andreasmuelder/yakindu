/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.executionorder;


public class ChildFirstTransitionTakingStatemachine implements IChildFirstTransitionTakingStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
			runCycle();
		}
		
		private boolean go;
		
		
		public void raiseGo() {
			go = true;
			runCycle();
		}
		
		private long cLocalReaction;
		
		public long getCLocalReaction() {
			return cLocalReaction;
		}
		
		public void setCLocalReaction(long value) {
			this.cLocalReaction = value;
		}
		
		private long caLocalReaction;
		
		public long getCaLocalReaction() {
			return caLocalReaction;
		}
		
		public void setCaLocalReaction(long value) {
			this.caLocalReaction = value;
		}
		
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		R1_A,
		R1_A_R1_AA,
		R1_A_R1_AB,
		R1_A_R1_AB_R1_ABA,
		R1_A_R1_AB_R2_ABB,
		R1_B,
		R2_C,
		R2_C_R_CA,
		R2_C_R_CA_R_CAA,
		R2_C_R_CA_R_CAA_R1_CAAA,
		R2_C_R_CA_R_CAA_R2_CAAB,
		R2_C_R_CA_R_CAB,
		R2_C_R_CB,
		R2_C_R_CB_R1_CBA,
		R2_C_R_CB_R2_CBB,
		R2_C_R_CB_R3_CBC,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[5];
	
	private int nextStateIndex;
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public ChildFirstTransitionTakingStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 5; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		defaultInterface.setCLocalReaction(0);
		
		defaultInterface.setCaLocalReaction(0);
		
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
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case R1_A_R1_AA:
				r1_A_r1_AA_react(true);
				break;
			case R1_A_R1_AB_R1_ABA:
				r1_A_r1_AB_r1_ABA_react(true);
				break;
			case R1_A_R1_AB_R2_ABB:
				r1_A_r1_AB_r2_ABB_react(true);
				break;
			case R1_B:
				r1_B_react(true);
				break;
			case R2_C_R_CA_R_CAA_R1_CAAA:
				r2_C_r_CA_r_CAA_r1_CAAA_react(true);
				break;
			case R2_C_R_CA_R_CAA_R2_CAAB:
				r2_C_r_CA_r_CAA_r2_CAAB_react(true);
				break;
			case R2_C_R_CA_R_CAB:
				r2_C_r_CA_r_CAB_react(true);
				break;
			case R2_C_R_CB_R1_CBA:
				r2_C_r_CB_r1_CBA_react(true);
				break;
			case R2_C_R_CB_R2_CBB:
				r2_C_r_CB_r2_CBB_react(true);
				break;
			case R2_C_R_CB_R3_CBC:
				r2_C_r_CB_r3_CBC_react(true);
				break;
			default:
				// $NULLSTATE$
			}
		}
		
		clearInEvents();
		isExecuting = false;
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NULLSTATE$||stateVector[1] != State.$NULLSTATE$||stateVector[2] != State.$NULLSTATE$||stateVector[3] != State.$NULLSTATE$||stateVector[4] != State.$NULLSTATE$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return false;
	}
	private void clearInEvents() {
		defaultInterface.e = false;
		defaultInterface.go = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case R1_A:
			return stateVector[0].ordinal() >= State.
					R1_A.ordinal()&& stateVector[0].ordinal() <= State.R1_A_R1_AB_R2_ABB.ordinal();
		case R1_A_R1_AA:
			return stateVector[0] == State.R1_A_R1_AA;
		case R1_A_R1_AB:
			return stateVector[0].ordinal() >= State.
					R1_A_R1_AB.ordinal()&& stateVector[0].ordinal() <= State.R1_A_R1_AB_R2_ABB.ordinal();
		case R1_A_R1_AB_R1_ABA:
			return stateVector[0] == State.R1_A_R1_AB_R1_ABA;
		case R1_A_R1_AB_R2_ABB:
			return stateVector[1] == State.R1_A_R1_AB_R2_ABB;
		case R1_B:
			return stateVector[0] == State.R1_B;
		case R2_C:
			return stateVector[2].ordinal() >= State.
					R2_C.ordinal()&& stateVector[2].ordinal() <= State.R2_C_R_CB_R3_CBC.ordinal();
		case R2_C_R_CA:
			return stateVector[2].ordinal() >= State.
					R2_C_R_CA.ordinal()&& stateVector[2].ordinal() <= State.R2_C_R_CA_R_CAB.ordinal();
		case R2_C_R_CA_R_CAA:
			return stateVector[2].ordinal() >= State.
					R2_C_R_CA_R_CAA.ordinal()&& stateVector[2].ordinal() <= State.R2_C_R_CA_R_CAA_R2_CAAB.ordinal();
		case R2_C_R_CA_R_CAA_R1_CAAA:
			return stateVector[2] == State.R2_C_R_CA_R_CAA_R1_CAAA;
		case R2_C_R_CA_R_CAA_R2_CAAB:
			return stateVector[3] == State.R2_C_R_CA_R_CAA_R2_CAAB;
		case R2_C_R_CA_R_CAB:
			return stateVector[2] == State.R2_C_R_CA_R_CAB;
		case R2_C_R_CB:
			return stateVector[2].ordinal() >= State.
					R2_C_R_CB.ordinal()&& stateVector[2].ordinal() <= State.R2_C_R_CB_R3_CBC.ordinal();
		case R2_C_R_CB_R1_CBA:
			return stateVector[2] == State.R2_C_R_CB_R1_CBA;
		case R2_C_R_CB_R2_CBB:
			return stateVector[3] == State.R2_C_R_CB_R2_CBB;
		case R2_C_R_CB_R3_CBC:
			return stateVector[4] == State.R2_C_R_CB_R3_CBC;
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
	
	public void raiseGo() {
		defaultInterface.raiseGo();
	}
	
	public long getCLocalReaction() {
		return defaultInterface.getCLocalReaction();
	}
	
	public void setCLocalReaction(long value) {
		defaultInterface.setCLocalReaction(value);
	}
	
	public long getCaLocalReaction() {
		return defaultInterface.getCaLocalReaction();
	}
	
	public void setCaLocalReaction(long value) {
		defaultInterface.setCaLocalReaction(value);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r1_A_default() {
		enterSequence_r1_A_r1_default();
	}
	
	/* 'default' enter sequence for state AA */
	private void enterSequence_r1_A_r1_AA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R1_A_R1_AA;
	}
	
	/* 'default' enter sequence for state AB */
	private void enterSequence_r1_A_r1_AB_default() {
		enterSequence_r1_A_r1_AB_r1_default();
		enterSequence_r1_A_r1_AB_r2_default();
	}
	
	/* 'default' enter sequence for state ABA */
	private void enterSequence_r1_A_r1_AB_r1_ABA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R1_A_R1_AB_R1_ABA;
	}
	
	/* 'default' enter sequence for state ABB */
	private void enterSequence_r1_A_r1_AB_r2_ABB_default() {
		nextStateIndex = 1;
		stateVector[1] = State.R1_A_R1_AB_R2_ABB;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r1_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R1_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_r2_C_default() {
		enterSequence_r2_C_r_default();
	}
	
	/* 'default' enter sequence for state CA */
	private void enterSequence_r2_C_r_CA_default() {
		enterSequence_r2_C_r_CA_r_default();
	}
	
	/* 'default' enter sequence for state CAA */
	private void enterSequence_r2_C_r_CA_r_CAA_default() {
		enterSequence_r2_C_r_CA_r_CAA_r1_default();
		enterSequence_r2_C_r_CA_r_CAA_r2_default();
	}
	
	/* 'default' enter sequence for state CAAA */
	private void enterSequence_r2_C_r_CA_r_CAA_r1_CAAA_default() {
		nextStateIndex = 2;
		stateVector[2] = State.R2_C_R_CA_R_CAA_R1_CAAA;
	}
	
	/* 'default' enter sequence for state CAAB */
	private void enterSequence_r2_C_r_CA_r_CAA_r2_CAAB_default() {
		nextStateIndex = 3;
		stateVector[3] = State.R2_C_R_CA_R_CAA_R2_CAAB;
	}
	
	/* 'default' enter sequence for state CAB */
	private void enterSequence_r2_C_r_CA_r_CAB_default() {
		nextStateIndex = 2;
		stateVector[2] = State.R2_C_R_CA_R_CAB;
	}
	
	/* 'default' enter sequence for state CB */
	private void enterSequence_r2_C_r_CB_default() {
		enterSequence_r2_C_r_CB_r1_default();
		enterSequence_r2_C_r_CB_r2_default();
		enterSequence_r2_C_r_CB_r3_default();
	}
	
	/* 'default' enter sequence for state CBA */
	private void enterSequence_r2_C_r_CB_r1_CBA_default() {
		nextStateIndex = 2;
		stateVector[2] = State.R2_C_R_CB_R1_CBA;
	}
	
	/* 'default' enter sequence for state CBB */
	private void enterSequence_r2_C_r_CB_r2_CBB_default() {
		nextStateIndex = 3;
		stateVector[3] = State.R2_C_R_CB_R2_CBB;
	}
	
	/* 'default' enter sequence for state CBC */
	private void enterSequence_r2_C_r_CB_r3_CBC_default() {
		nextStateIndex = 4;
		stateVector[4] = State.R2_C_R_CB_R3_CBC;
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r1_default() {
		react_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r1_A_r1_default() {
		react_r1_A_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r1_A_r1_AB_r1_default() {
		react_r1_A_r1_AB_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r1_A_r1_AB_r2_default() {
		react_r1_A_r1_AB_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r2_default() {
		react_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r2_C_r_default() {
		react_r2_C_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r2_C_r_CA_r_default() {
		react_r2_C_r_CA_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r2_C_r_CA_r_CAA_r1_default() {
		react_r2_C_r_CA_r_CAA_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r2_C_r_CA_r_CAA_r2_default() {
		react_r2_C_r_CA_r_CAA_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r2_C_r_CB_r1_default() {
		react_r2_C_r_CB_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r2_C_r_CB_r2_default() {
		react_r2_C_r_CB_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region r3 */
	private void enterSequence_r2_C_r_CB_r3_default() {
		react_r2_C_r_CB_r3__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_r1_A() {
		exitSequence_r1_A_r1();
	}
	
	/* Default exit sequence for state AA */
	private void exitSequence_r1_A_r1_AA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state AB */
	private void exitSequence_r1_A_r1_AB() {
		exitSequence_r1_A_r1_AB_r1();
		exitSequence_r1_A_r1_AB_r2();
	}
	
	/* Default exit sequence for state ABA */
	private void exitSequence_r1_A_r1_AB_r1_ABA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state ABB */
	private void exitSequence_r1_A_r1_AB_r2_ABB() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r1_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state CA */
	private void exitSequence_r2_C_r_CA() {
		exitSequence_r2_C_r_CA_r();
	}
	
	/* Default exit sequence for state CAA */
	private void exitSequence_r2_C_r_CA_r_CAA() {
		exitSequence_r2_C_r_CA_r_CAA_r1();
		exitSequence_r2_C_r_CA_r_CAA_r2();
	}
	
	/* Default exit sequence for state CAAA */
	private void exitSequence_r2_C_r_CA_r_CAA_r1_CAAA() {
		nextStateIndex = 2;
		stateVector[2] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state CAAB */
	private void exitSequence_r2_C_r_CA_r_CAA_r2_CAAB() {
		nextStateIndex = 3;
		stateVector[3] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state CAB */
	private void exitSequence_r2_C_r_CA_r_CAB() {
		nextStateIndex = 2;
		stateVector[2] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state CB */
	private void exitSequence_r2_C_r_CB() {
		exitSequence_r2_C_r_CB_r1();
		exitSequence_r2_C_r_CB_r2();
		exitSequence_r2_C_r_CB_r3();
	}
	
	/* Default exit sequence for state CBA */
	private void exitSequence_r2_C_r_CB_r1_CBA() {
		nextStateIndex = 2;
		stateVector[2] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state CBB */
	private void exitSequence_r2_C_r_CB_r2_CBB() {
		nextStateIndex = 3;
		stateVector[3] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state CBC */
	private void exitSequence_r2_C_r_CB_r3_CBC() {
		nextStateIndex = 4;
		stateVector[4] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r1() {
		switch (stateVector[0]) {
		case R1_A_R1_AA:
			exitSequence_r1_A_r1_AA();
			break;
		case R1_A_R1_AB_R1_ABA:
			exitSequence_r1_A_r1_AB_r1_ABA();
			break;
		case R1_B:
			exitSequence_r1_B();
			break;
		default:
			break;
		}
		
		switch (stateVector[1]) {
		case R1_A_R1_AB_R2_ABB:
			exitSequence_r1_A_r1_AB_r2_ABB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r1_A_r1() {
		switch (stateVector[0]) {
		case R1_A_R1_AA:
			exitSequence_r1_A_r1_AA();
			break;
		case R1_A_R1_AB_R1_ABA:
			exitSequence_r1_A_r1_AB_r1_ABA();
			break;
		default:
			break;
		}
		
		switch (stateVector[1]) {
		case R1_A_R1_AB_R2_ABB:
			exitSequence_r1_A_r1_AB_r2_ABB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r1_A_r1_AB_r1() {
		switch (stateVector[0]) {
		case R1_A_R1_AB_R1_ABA:
			exitSequence_r1_A_r1_AB_r1_ABA();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r1_A_r1_AB_r2() {
		switch (stateVector[1]) {
		case R1_A_R1_AB_R2_ABB:
			exitSequence_r1_A_r1_AB_r2_ABB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r2() {
		switch (stateVector[2]) {
		case R2_C_R_CA_R_CAA_R1_CAAA:
			exitSequence_r2_C_r_CA_r_CAA_r1_CAAA();
			break;
		case R2_C_R_CA_R_CAB:
			exitSequence_r2_C_r_CA_r_CAB();
			break;
		case R2_C_R_CB_R1_CBA:
			exitSequence_r2_C_r_CB_r1_CBA();
			break;
		default:
			break;
		}
		
		switch (stateVector[3]) {
		case R2_C_R_CA_R_CAA_R2_CAAB:
			exitSequence_r2_C_r_CA_r_CAA_r2_CAAB();
			break;
		case R2_C_R_CB_R2_CBB:
			exitSequence_r2_C_r_CB_r2_CBB();
			break;
		default:
			break;
		}
		
		switch (stateVector[4]) {
		case R2_C_R_CB_R3_CBC:
			exitSequence_r2_C_r_CB_r3_CBC();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r2_C_r_CA_r() {
		switch (stateVector[2]) {
		case R2_C_R_CA_R_CAA_R1_CAAA:
			exitSequence_r2_C_r_CA_r_CAA_r1_CAAA();
			break;
		case R2_C_R_CA_R_CAB:
			exitSequence_r2_C_r_CA_r_CAB();
			break;
		default:
			break;
		}
		
		switch (stateVector[3]) {
		case R2_C_R_CA_R_CAA_R2_CAAB:
			exitSequence_r2_C_r_CA_r_CAA_r2_CAAB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r2_C_r_CA_r_CAA_r1() {
		switch (stateVector[2]) {
		case R2_C_R_CA_R_CAA_R1_CAAA:
			exitSequence_r2_C_r_CA_r_CAA_r1_CAAA();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r2_C_r_CA_r_CAA_r2() {
		switch (stateVector[3]) {
		case R2_C_R_CA_R_CAA_R2_CAAB:
			exitSequence_r2_C_r_CA_r_CAA_r2_CAAB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r2_C_r_CB_r1() {
		switch (stateVector[2]) {
		case R2_C_R_CB_R1_CBA:
			exitSequence_r2_C_r_CB_r1_CBA();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r2_C_r_CB_r2() {
		switch (stateVector[3]) {
		case R2_C_R_CB_R2_CBB:
			exitSequence_r2_C_r_CB_r2_CBB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r3 */
	private void exitSequence_r2_C_r_CB_r3() {
		switch (stateVector[4]) {
		case R2_C_R_CB_R3_CBC:
			exitSequence_r2_C_r_CB_r3_CBC();
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
	private void react_r1_A_r1__entry_Default() {
		enterSequence_r1_A_r1_AA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r1_A_r1_AB_r1__entry_Default() {
		enterSequence_r1_A_r1_AB_r1_ABA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r1_A_r1_AB_r2__entry_Default() {
		enterSequence_r1_A_r1_AB_r2_ABB_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2__entry_Default() {
		enterSequence_r2_C_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2_C_r__entry_Default() {
		enterSequence_r2_C_r_CA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2_C_r_CA_r__entry_Default() {
		enterSequence_r2_C_r_CA_r_CAA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2_C_r_CA_r_CAA_r1__entry_Default() {
		enterSequence_r2_C_r_CA_r_CAA_r1_CAAA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2_C_r_CA_r_CAA_r2__entry_Default() {
		enterSequence_r2_C_r_CA_r_CAA_r2_CAAB_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2_C_r_CB_r1__entry_Default() {
		enterSequence_r2_C_r_CB_r1_CBA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2_C_r_CB_r2__entry_Default() {
		enterSequence_r2_C_r_CB_r2_CBB_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2_C_r_CB_r3__entry_Default() {
		enterSequence_r2_C_r_CB_r3_CBC_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean r1_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_r1_A();
				enterSequence_r1_B_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r1_A_r1_AA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.go) {
				exitSequence_r1_A_r1_AA();
				enterSequence_r1_A_r1_AB_default();
				r1_A_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = r1_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r1_A_r1_AB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = r1_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r1_A_r1_AB_r1_ABA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.go) {
				exitSequence_r1_A_r1_AB();
				enterSequence_r1_A_r1_AA_default();
				r1_A_react(false);
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r1_A_r1_AB_r2_ABB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = r1_A_r1_AB_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r1_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_r1_B();
				enterSequence_r1_A_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r2_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			defaultInterface.setCLocalReaction(defaultInterface.getCLocalReaction() + 1);
			
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_r2_C_r_CA();
				enterSequence_r2_C_r_CB_default();
				r2_C_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			defaultInterface.setCaLocalReaction(defaultInterface.getCaLocalReaction() + 1);
			
			did_transition = r2_C_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CA_r_CAA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.go) {
				exitSequence_r2_C_r_CA_r_CAA();
				enterSequence_r2_C_r_CA_r_CAB_default();
				r2_C_r_CA_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = r2_C_r_CA_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CA_r_CAA_r1_CAAA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CA_r_CAA_r2_CAAB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = r2_C_r_CA_r_CAA_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CA_r_CAB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.go) {
				exitSequence_r2_C_r_CA_r_CAB();
				enterSequence_r2_C_r_CA_r_CAA_default();
				r2_C_r_CA_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = r2_C_r_CA_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_r2_C_r_CB();
				enterSequence_r2_C_r_CA_default();
				r2_C_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = r2_C_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CB_r1_CBA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CB_r2_CBB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean r2_C_r_CB_r3_CBC_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = r2_C_r_CB_react(try_transition);
		}
		return did_transition;
	}
	
}
