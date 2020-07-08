/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.executionorder;


public class ParentFirstLocalReactionsStatemachine implements IParentFirstLocalReactionsStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
		}
		
		private boolean doSelfTransition;
		
		
		public void raiseDoSelfTransition() {
			doSelfTransition = true;
		}
		
		private long cnt;
		
		public long getCnt() {
			return cnt;
		}
		
		public void setCnt(long value) {
			this.cnt = value;
		}
		
		protected long assignCnt(long value) {
			return this.cnt = value;
		}
		
		private boolean disable_a;
		
		public boolean getDisable_a() {
			return disable_a;
		}
		
		public void setDisable_a(boolean value) {
			this.disable_a = value;
		}
		
		private boolean disable_aa;
		
		public boolean getDisable_aa() {
			return disable_aa;
		}
		
		public void setDisable_aa(boolean value) {
			this.disable_aa = value;
		}
		
		private boolean disable_aaa;
		
		public boolean getDisable_aaa() {
			return disable_aaa;
		}
		
		public void setDisable_aaa(boolean value) {
			this.disable_aaa = value;
		}
		
		private long a_local;
		
		public long getA_local() {
			return a_local;
		}
		
		public void setA_local(long value) {
			this.a_local = value;
		}
		
		private long aa_local;
		
		public long getAa_local() {
			return aa_local;
		}
		
		public void setAa_local(long value) {
			this.aa_local = value;
		}
		
		private long aaa_local;
		
		public long getAaa_local() {
			return aaa_local;
		}
		
		public void setAaa_local(long value) {
			this.aaa_local = value;
		}
		
		private long sm_local;
		
		public long getSm_local() {
			return sm_local;
		}
		
		public void setSm_local(long value) {
			this.sm_local = value;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean e;
		private boolean doSelfTransition;
	}
	private static class ParentFirstLocalReactionsStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		R_A,
		R_A_R_AA,
		R_A_R_AA_R_AAA,
		R_A_R_AA_R_AAB,
		R_A_R_AB,
		R_B,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private ParentFirstLocalReactionsStatemachineEvBuf _current = new ParentFirstLocalReactionsStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public ParentFirstLocalReactionsStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		defaultInterface.setCnt(0);
		
		defaultInterface.setDisable_a(false);
		
		defaultInterface.setDisable_aa(false);
		
		defaultInterface.setDisable_aaa(false);
		
		defaultInterface.setA_local(0);
		
		defaultInterface.setAa_local(0);
		
		defaultInterface.setAaa_local(0);
		
		defaultInterface.setSm_local(0);
		
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
			case R_A_R_AA_R_AAA:
				r_A_r_AA_r_AAA_react(true);
				break;
			case R_A_R_AA_R_AAB:
				r_A_r_AA_r_AAB_react(true);
				break;
			case R_A_R_AB:
				r_A_r_AB_react(true);
				break;
			case R_B:
				r_B_react(true);
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
		_current.iface.e = defaultInterface.e;
		defaultInterface.e = false;
		
		_current.iface.doSelfTransition = defaultInterface.doSelfTransition;
		defaultInterface.doSelfTransition = false;
	}
	
	private void clearInEvents() {
		defaultInterface.e = false;
		defaultInterface.doSelfTransition = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case R_A:
			return stateVector[0].ordinal() >= State.
					R_A.ordinal()&& stateVector[0].ordinal() <= State.R_A_R_AB.ordinal();
		case R_A_R_AA:
			return stateVector[0].ordinal() >= State.
					R_A_R_AA.ordinal()&& stateVector[0].ordinal() <= State.R_A_R_AA_R_AAB.ordinal();
		case R_A_R_AA_R_AAA:
			return stateVector[0] == State.R_A_R_AA_R_AAA;
		case R_A_R_AA_R_AAB:
			return stateVector[0] == State.R_A_R_AA_R_AAB;
		case R_A_R_AB:
			return stateVector[0] == State.R_A_R_AB;
		case R_B:
			return stateVector[0] == State.R_B;
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
	
	public void raiseDoSelfTransition() {
		defaultInterface.raiseDoSelfTransition();
	}
	
	public long getCnt() {
		return defaultInterface.getCnt();
	}
	
	public void setCnt(long value) {
		defaultInterface.setCnt(value);
	}
	
	public boolean getDisable_a() {
		return defaultInterface.getDisable_a();
	}
	
	public void setDisable_a(boolean value) {
		defaultInterface.setDisable_a(value);
	}
	
	public boolean getDisable_aa() {
		return defaultInterface.getDisable_aa();
	}
	
	public void setDisable_aa(boolean value) {
		defaultInterface.setDisable_aa(value);
	}
	
	public boolean getDisable_aaa() {
		return defaultInterface.getDisable_aaa();
	}
	
	public void setDisable_aaa(boolean value) {
		defaultInterface.setDisable_aaa(value);
	}
	
	public long getA_local() {
		return defaultInterface.getA_local();
	}
	
	public void setA_local(long value) {
		defaultInterface.setA_local(value);
	}
	
	public long getAa_local() {
		return defaultInterface.getAa_local();
	}
	
	public void setAa_local(long value) {
		defaultInterface.setAa_local(value);
	}
	
	public long getAaa_local() {
		return defaultInterface.getAaa_local();
	}
	
	public void setAaa_local(long value) {
		defaultInterface.setAaa_local(value);
	}
	
	public long getSm_local() {
		return defaultInterface.getSm_local();
	}
	
	public void setSm_local(long value) {
		defaultInterface.setSm_local(value);
	}
	
	/* Entry action for state 'A'. */
	private void entryAction_r_A() {
		defaultInterface.setDisable_a(false);
		
		defaultInterface.setDisable_aa(false);
		
		defaultInterface.setDisable_aaa(false);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r_A_default() {
		entryAction_r_A();
		enterSequence_r_A_r_default();
	}
	
	/* 'default' enter sequence for state AA */
	private void enterSequence_r_A_r_AA_default() {
		enterSequence_r_A_r_AA_r_default();
	}
	
	/* 'default' enter sequence for state AAA */
	private void enterSequence_r_A_r_AA_r_AAA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R_A_R_AA_R_AAA;
	}
	
	/* 'default' enter sequence for state AAB */
	private void enterSequence_r_A_r_AA_r_AAB_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R_A_R_AA_R_AAB;
	}
	
	/* 'default' enter sequence for state AB */
	private void enterSequence_r_A_r_AB_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R_A_R_AB;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R_B;
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r_default() {
		react_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r_A_r_default() {
		react_r_A_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r_A_r_AA_r_default() {
		react_r_A_r_AA_r__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_r_A() {
		exitSequence_r_A_r();
	}
	
	/* Default exit sequence for state AA */
	private void exitSequence_r_A_r_AA() {
		exitSequence_r_A_r_AA_r();
	}
	
	/* Default exit sequence for state AAA */
	private void exitSequence_r_A_r_AA_r_AAA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state AAB */
	private void exitSequence_r_A_r_AA_r_AAB() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state AB */
	private void exitSequence_r_A_r_AB() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r() {
		switch (stateVector[0]) {
		case R_A_R_AA_R_AAA:
			exitSequence_r_A_r_AA_r_AAA();
			break;
		case R_A_R_AA_R_AAB:
			exitSequence_r_A_r_AA_r_AAB();
			break;
		case R_A_R_AB:
			exitSequence_r_A_r_AB();
			break;
		case R_B:
			exitSequence_r_B();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r_A_r() {
		switch (stateVector[0]) {
		case R_A_R_AA_R_AAA:
			exitSequence_r_A_r_AA_r_AAA();
			break;
		case R_A_R_AA_R_AAB:
			exitSequence_r_A_r_AA_r_AAB();
			break;
		case R_A_R_AB:
			exitSequence_r_A_r_AB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r_A_r_AA_r() {
		switch (stateVector[0]) {
		case R_A_R_AA_R_AAA:
			exitSequence_r_A_r_AA_r_AAA();
			break;
		case R_A_R_AA_R_AAB:
			exitSequence_r_A_r_AA_r_AAB();
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
		enterSequence_r_A_r_AA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r_A_r_AA_r__entry_Default() {
		enterSequence_r_A_r_AA_r_AAA_default();
	}
	
	private boolean react() {
		defaultInterface.setSm_local((defaultInterface.assignCnt(defaultInterface.getCnt() + 1)));
		
		return false;
	}
	
	private boolean r_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (((_current.iface.e) && (!defaultInterface.getDisable_a()))) {
					exitSequence_r_A();
					enterSequence_r_B_default();
				} else {
					if (((_current.iface.doSelfTransition) && (!defaultInterface.getDisable_a()))) {
						exitSequence_r_A();
						enterSequence_r_A_default();
					} else {
						did_transition = false;
					}
				}
			}
		}
		if (did_transition==false) {
			defaultInterface.setA_local((defaultInterface.assignCnt(defaultInterface.getCnt() + 1)));
		}
		return did_transition;
	}
	
	private boolean r_A_r_AA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (r_A_react(try_transition)==false) {
				if (((_current.iface.e) && (!defaultInterface.getDisable_aa()))) {
					exitSequence_r_A_r_AA();
					enterSequence_r_A_r_AB_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			defaultInterface.setAa_local((defaultInterface.assignCnt(defaultInterface.getCnt() + 1)));
		}
		return did_transition;
	}
	
	private boolean r_A_r_AA_r_AAA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (r_A_r_AA_react(try_transition)==false) {
				if (((_current.iface.e) && (!defaultInterface.getDisable_aaa()))) {
					exitSequence_r_A_r_AA_r_AAA();
					enterSequence_r_A_r_AA_r_AAB_default();
				} else {
					if (((_current.iface.doSelfTransition) && (!defaultInterface.getDisable_aaa()))) {
						exitSequence_r_A_r_AA_r_AAA();
						enterSequence_r_A_r_AA_r_AAA_default();
					} else {
						did_transition = false;
					}
				}
			}
		}
		if (did_transition==false) {
			defaultInterface.setAaa_local((defaultInterface.assignCnt(defaultInterface.getCnt() + 1)));
		}
		return did_transition;
	}
	
	private boolean r_A_r_AA_r_AAB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (r_A_r_AA_react(try_transition)==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r_A_r_AB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (r_A_react(try_transition)==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
