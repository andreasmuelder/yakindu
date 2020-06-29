/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.parentfirstlocalreactions;


public class ParentFirstLocalReactionsStatemachine implements IParentFirstLocalReactionsStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
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
		
		protected void clearEvents() {
			e = false;
			doSelfTransition = false;
		}
	}
	
	
	private static class SCInterfaceEvBuf {
		private boolean e;
		private boolean doSelfTransition;
	}
	private static class ParentFirstLocalReactionsStatemachineEvBuf {
		private SCInterfaceEvBuf iface = new SCInterfaceEvBuf();
	}
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		parentFirstLocalReactions_r_A,
		parentFirstLocalReactions_r_A_r_AA,
		parentFirstLocalReactions_r_A_r_AA_r_AAA,
		parentFirstLocalReactions_r_A_r_AA_r_AAB,
		parentFirstLocalReactions_r_A_r_AB,
		parentFirstLocalReactions_r_B,
		$NullState$
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
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		
		clearInEvents();
		
		sCInterface.setCnt(0);
		
		sCInterface.setDisable_a(false);
		
		sCInterface.setDisable_aa(false);
		
		sCInterface.setDisable_aaa(false);
		
		sCInterface.setA_local(0);
		
		sCInterface.setAa_local(0);
		
		sCInterface.setAaa_local(0);
		
		sCInterface.setSm_local(0);
		
		isExecuting = false;
	}
	
	public void enter() {
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
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		
		swapInEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case parentFirstLocalReactions_r_A_r_AA_r_AAA:
				r_A_r_AA_r_AAA_react(true);
				break;
			case parentFirstLocalReactions_r_A_r_AA_r_AAB:
				r_A_r_AA_r_AAB_react(true);
				break;
			case parentFirstLocalReactions_r_A_r_AB:
				r_A_r_AB_react(true);
				break;
			case parentFirstLocalReactions_r_B:
				r_B_react(true);
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
		
		_current.iface.doSelfTransition = sCInterface.doSelfTransition;
		sCInterface.doSelfTransition = false;
	}
	
	private void clearInEvents() {
		sCInterface.e = false;
		
		sCInterface.doSelfTransition = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case parentFirstLocalReactions_r_A:
			return stateVector[0].ordinal() >= State.
					parentFirstLocalReactions_r_A.ordinal()&& stateVector[0].ordinal() <= State.parentFirstLocalReactions_r_A_r_AB.ordinal();
		case parentFirstLocalReactions_r_A_r_AA:
			return stateVector[0].ordinal() >= State.
					parentFirstLocalReactions_r_A_r_AA.ordinal()&& stateVector[0].ordinal() <= State.parentFirstLocalReactions_r_A_r_AA_r_AAB.ordinal();
		case parentFirstLocalReactions_r_A_r_AA_r_AAA:
			return stateVector[0] == State.parentFirstLocalReactions_r_A_r_AA_r_AAA;
		case parentFirstLocalReactions_r_A_r_AA_r_AAB:
			return stateVector[0] == State.parentFirstLocalReactions_r_A_r_AA_r_AAB;
		case parentFirstLocalReactions_r_A_r_AB:
			return stateVector[0] == State.parentFirstLocalReactions_r_A_r_AB;
		case parentFirstLocalReactions_r_B:
			return stateVector[0] == State.parentFirstLocalReactions_r_B;
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
	
	public void raiseDoSelfTransition() {
		sCInterface.raiseDoSelfTransition();
	}
	
	public long getCnt() {
		return sCInterface.getCnt();
	}
	
	public void setCnt(long value) {
		sCInterface.setCnt(value);
	}
	
	public boolean getDisable_a() {
		return sCInterface.getDisable_a();
	}
	
	public void setDisable_a(boolean value) {
		sCInterface.setDisable_a(value);
	}
	
	public boolean getDisable_aa() {
		return sCInterface.getDisable_aa();
	}
	
	public void setDisable_aa(boolean value) {
		sCInterface.setDisable_aa(value);
	}
	
	public boolean getDisable_aaa() {
		return sCInterface.getDisable_aaa();
	}
	
	public void setDisable_aaa(boolean value) {
		sCInterface.setDisable_aaa(value);
	}
	
	public long getA_local() {
		return sCInterface.getA_local();
	}
	
	public void setA_local(long value) {
		sCInterface.setA_local(value);
	}
	
	public long getAa_local() {
		return sCInterface.getAa_local();
	}
	
	public void setAa_local(long value) {
		sCInterface.setAa_local(value);
	}
	
	public long getAaa_local() {
		return sCInterface.getAaa_local();
	}
	
	public void setAaa_local(long value) {
		sCInterface.setAaa_local(value);
	}
	
	public long getSm_local() {
		return sCInterface.getSm_local();
	}
	
	public void setSm_local(long value) {
		sCInterface.setSm_local(value);
	}
	
	/* Entry action for state 'A'. */
	private void entryAction_r_A() {
		sCInterface.setDisable_a(false);
		
		sCInterface.setDisable_aa(false);
		
		sCInterface.setDisable_aaa(false);
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
		stateVector[0] = State.parentFirstLocalReactions_r_A_r_AA_r_AAA;
	}
	
	/* 'default' enter sequence for state AAB */
	private void enterSequence_r_A_r_AA_r_AAB_default() {
		nextStateIndex = 0;
		stateVector[0] = State.parentFirstLocalReactions_r_A_r_AA_r_AAB;
	}
	
	/* 'default' enter sequence for state AB */
	private void enterSequence_r_A_r_AB_default() {
		nextStateIndex = 0;
		stateVector[0] = State.parentFirstLocalReactions_r_A_r_AB;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.parentFirstLocalReactions_r_B;
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
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state AAB */
	private void exitSequence_r_A_r_AA_r_AAB() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state AB */
	private void exitSequence_r_A_r_AB() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r() {
		switch (stateVector[0]) {
		case parentFirstLocalReactions_r_A_r_AA_r_AAA:
			exitSequence_r_A_r_AA_r_AAA();
			break;
		case parentFirstLocalReactions_r_A_r_AA_r_AAB:
			exitSequence_r_A_r_AA_r_AAB();
			break;
		case parentFirstLocalReactions_r_A_r_AB:
			exitSequence_r_A_r_AB();
			break;
		case parentFirstLocalReactions_r_B:
			exitSequence_r_B();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r_A_r() {
		switch (stateVector[0]) {
		case parentFirstLocalReactions_r_A_r_AA_r_AAA:
			exitSequence_r_A_r_AA_r_AAA();
			break;
		case parentFirstLocalReactions_r_A_r_AA_r_AAB:
			exitSequence_r_A_r_AA_r_AAB();
			break;
		case parentFirstLocalReactions_r_A_r_AB:
			exitSequence_r_A_r_AB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r_A_r_AA_r() {
		switch (stateVector[0]) {
		case parentFirstLocalReactions_r_A_r_AA_r_AAA:
			exitSequence_r_A_r_AA_r_AAA();
			break;
		case parentFirstLocalReactions_r_A_r_AA_r_AAB:
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
		sCInterface.setSm_local((sCInterface.assignCnt(sCInterface.getCnt() + 1)));
		
		return false;
	}
	
	private boolean r_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (((_current.iface.e) && (!sCInterface.getDisable_a()))) {
					exitSequence_r_A();
					enterSequence_r_B_default();
				} else {
					if (((_current.iface.doSelfTransition) && (!sCInterface.getDisable_a()))) {
						exitSequence_r_A();
						enterSequence_r_A_default();
					} else {
						did_transition = false;
					}
				}
			}
		}
		if (did_transition==false) {
			sCInterface.setA_local((sCInterface.assignCnt(sCInterface.getCnt() + 1)));
		}
		return did_transition;
	}
	
	private boolean r_A_r_AA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (r_A_react(try_transition)==false) {
				if (((_current.iface.e) && (!sCInterface.getDisable_aa()))) {
					exitSequence_r_A_r_AA();
					enterSequence_r_A_r_AB_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			sCInterface.setAa_local((sCInterface.assignCnt(sCInterface.getCnt() + 1)));
		}
		return did_transition;
	}
	
	private boolean r_A_r_AA_r_AAA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (r_A_r_AA_react(try_transition)==false) {
				if (((_current.iface.e) && (!sCInterface.getDisable_aaa()))) {
					exitSequence_r_A_r_AA_r_AAA();
					enterSequence_r_A_r_AA_r_AAB_default();
				} else {
					if (((_current.iface.doSelfTransition) && (!sCInterface.getDisable_aaa()))) {
						exitSequence_r_A_r_AA_r_AAA();
						enterSequence_r_A_r_AA_r_AAA_default();
					} else {
						did_transition = false;
					}
				}
			}
		}
		if (did_transition==false) {
			sCInterface.setAaa_local((sCInterface.assignCnt(sCInterface.getCnt() + 1)));
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
