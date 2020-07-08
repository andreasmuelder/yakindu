/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.executionorder;


public class ChildFirstTransitionsInSubchartStatemachine implements IChildFirstTransitionsInSubchartStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private InterfaceOperationCallback operationCallback;
		
		public void setInterfaceOperationCallback(
				InterfaceOperationCallback operationCallback) {
			this.operationCallback = operationCallback;
		}
		private long a_local;
		
		public long getA_local() {
			return a_local;
		}
		
		public void setA_local(long value) {
			this.a_local = value;
		}
		
		private long c_local;
		
		public long getC_local() {
			return c_local;
		}
		
		public void setC_local(long value) {
			this.c_local = value;
		}
		
		private long aa_local;
		
		public long getAa_local() {
			return aa_local;
		}
		
		public void setAa_local(long value) {
			this.aa_local = value;
		}
		
		private long ab_local;
		
		public long getAb_local() {
			return ab_local;
		}
		
		public void setAb_local(long value) {
			this.ab_local = value;
		}
		
		private long ac_local;
		
		public long getAc_local() {
			return ac_local;
		}
		
		public void setAc_local(long value) {
			this.ac_local = value;
		}
		
		private long ad_local;
		
		public long getAd_local() {
			return ad_local;
		}
		
		public void setAd_local(long value) {
			this.ad_local = value;
		}
		
		private long aaa_local;
		
		public long getAaa_local() {
			return aaa_local;
		}
		
		public void setAaa_local(long value) {
			this.aaa_local = value;
		}
		
		private long aac_local;
		
		public long getAac_local() {
			return aac_local;
		}
		
		public void setAac_local(long value) {
			this.aac_local = value;
		}
		
		private long a_check;
		
		public long getA_check() {
			return a_check;
		}
		
		public void setA_check(long value) {
			this.a_check = value;
		}
		
		private long aa_check;
		
		public long getAa_check() {
			return aa_check;
		}
		
		public void setAa_check(long value) {
			this.aa_check = value;
		}
		
		private long ab_check;
		
		public long getAb_check() {
			return ab_check;
		}
		
		public void setAb_check(long value) {
			this.ab_check = value;
		}
		
		private long aac_check;
		
		public long getAac_check() {
			return aac_check;
		}
		
		public void setAac_check(long value) {
			this.aac_check = value;
		}
		
		private long ac_check;
		
		public long getAc_check() {
			return ac_check;
		}
		
		public void setAc_check(long value) {
			this.ac_check = value;
		}
		
		private long ad_check;
		
		public long getAd_check() {
			return ad_check;
		}
		
		public void setAd_check(long value) {
			this.ad_check = value;
		}
		
		private long c_check;
		
		public long getC_check() {
			return c_check;
		}
		
		public void setC_check(long value) {
			this.c_check = value;
		}
		
		private long sm_local;
		
		public long getSm_local() {
			return sm_local;
		}
		
		public void setSm_local(long value) {
			this.sm_local = value;
		}
		
		private long cnt;
		
		public long getCnt() {
			return cnt;
		}
		
		public void setCnt(long value) {
			this.cnt = value;
		}
		
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		childFirstTransitionsInSubchart_r_A,
		childFirstTransitionsInSubchart_r_A_r1_AA,
		childFirstTransitionsInSubchart_r_A_r1_AB,
		childFirstTransitionsInSubchart_r_A_r2_AC,
		childFirstTransitionsInSubchart_r_A_r2_AD,
		childFirstTransitionsInSubchart_r_B,
		childFirstTransitionsInSubchart_r2_C,
		childFirstTransitionsInSubchart_r2_D,
		$NullState$
	};
	
	private final State[] stateVector = new State[3];
	
	private int nextStateIndex;
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public ChildFirstTransitionsInSubchartStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		if (this.defaultInterface.operationCallback == null) {
			throw new IllegalStateException("Operation callback for interface Interface must be set.");
		}
		
		for (int i = 0; i < 3; i++) {
			stateVector[i] = State.$NullState$;
		}
		
		
		defaultInterface.setA_local(0);
		
		defaultInterface.setC_local(0);
		
		defaultInterface.setAa_local(0);
		
		defaultInterface.setAb_local(0);
		
		defaultInterface.setAc_local(0);
		
		defaultInterface.setAd_local(0);
		
		defaultInterface.setAaa_local(0);
		
		defaultInterface.setAac_local(0);
		
		defaultInterface.setA_check(0);
		
		defaultInterface.setAa_check(0);
		
		defaultInterface.setAb_check(0);
		
		defaultInterface.setAac_check(0);
		
		defaultInterface.setAc_check(0);
		
		defaultInterface.setAd_check(0);
		
		defaultInterface.setC_check(0);
		
		defaultInterface.setSm_local(0);
		
		defaultInterface.setCnt(0);
		
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
		enterSequence_r2_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_r();
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
			case childFirstTransitionsInSubchart_r_A_r1_AA:
				r_A_r1_AA_react(true);
				break;
			case childFirstTransitionsInSubchart_r_A_r1_AB:
				r_A_r1_AB_react(true);
				break;
			case childFirstTransitionsInSubchart_r_A_r2_AC:
				r_A_r2_AC_react(true);
				break;
			case childFirstTransitionsInSubchart_r_A_r2_AD:
				r_A_r2_AD_react(true);
				break;
			case childFirstTransitionsInSubchart_r_B:
				r_B_react(true);
				break;
			case childFirstTransitionsInSubchart_r2_C:
				r2_C_react(true);
				break;
			case childFirstTransitionsInSubchart_r2_D:
				r2_D_react(true);
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
		return stateVector[0] != State.$NullState$||stateVector[1] != State.$NullState$||stateVector[2] != State.$NullState$;
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
		case childFirstTransitionsInSubchart_r_A:
			return stateVector[0].ordinal() >= State.
					childFirstTransitionsInSubchart_r_A.ordinal()&& stateVector[0].ordinal() <= State.childFirstTransitionsInSubchart_r_A_r2_AD.ordinal();
		case childFirstTransitionsInSubchart_r_A_r1_AA:
			return stateVector[0] == State.childFirstTransitionsInSubchart_r_A_r1_AA;
		case childFirstTransitionsInSubchart_r_A_r1_AB:
			return stateVector[0] == State.childFirstTransitionsInSubchart_r_A_r1_AB;
		case childFirstTransitionsInSubchart_r_A_r2_AC:
			return stateVector[1] == State.childFirstTransitionsInSubchart_r_A_r2_AC;
		case childFirstTransitionsInSubchart_r_A_r2_AD:
			return stateVector[1] == State.childFirstTransitionsInSubchart_r_A_r2_AD;
		case childFirstTransitionsInSubchart_r_B:
			return stateVector[0] == State.childFirstTransitionsInSubchart_r_B;
		case childFirstTransitionsInSubchart_r2_C:
			return stateVector[2] == State.childFirstTransitionsInSubchart_r2_C;
		case childFirstTransitionsInSubchart_r2_D:
			return stateVector[2] == State.childFirstTransitionsInSubchart_r2_D;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public long getA_local() {
		return defaultInterface.getA_local();
	}
	
	public void setA_local(long value) {
		defaultInterface.setA_local(value);
	}
	
	public long getC_local() {
		return defaultInterface.getC_local();
	}
	
	public void setC_local(long value) {
		defaultInterface.setC_local(value);
	}
	
	public long getAa_local() {
		return defaultInterface.getAa_local();
	}
	
	public void setAa_local(long value) {
		defaultInterface.setAa_local(value);
	}
	
	public long getAb_local() {
		return defaultInterface.getAb_local();
	}
	
	public void setAb_local(long value) {
		defaultInterface.setAb_local(value);
	}
	
	public long getAc_local() {
		return defaultInterface.getAc_local();
	}
	
	public void setAc_local(long value) {
		defaultInterface.setAc_local(value);
	}
	
	public long getAd_local() {
		return defaultInterface.getAd_local();
	}
	
	public void setAd_local(long value) {
		defaultInterface.setAd_local(value);
	}
	
	public long getAaa_local() {
		return defaultInterface.getAaa_local();
	}
	
	public void setAaa_local(long value) {
		defaultInterface.setAaa_local(value);
	}
	
	public long getAac_local() {
		return defaultInterface.getAac_local();
	}
	
	public void setAac_local(long value) {
		defaultInterface.setAac_local(value);
	}
	
	public long getA_check() {
		return defaultInterface.getA_check();
	}
	
	public void setA_check(long value) {
		defaultInterface.setA_check(value);
	}
	
	public long getAa_check() {
		return defaultInterface.getAa_check();
	}
	
	public void setAa_check(long value) {
		defaultInterface.setAa_check(value);
	}
	
	public long getAb_check() {
		return defaultInterface.getAb_check();
	}
	
	public void setAb_check(long value) {
		defaultInterface.setAb_check(value);
	}
	
	public long getAac_check() {
		return defaultInterface.getAac_check();
	}
	
	public void setAac_check(long value) {
		defaultInterface.setAac_check(value);
	}
	
	public long getAc_check() {
		return defaultInterface.getAc_check();
	}
	
	public void setAc_check(long value) {
		defaultInterface.setAc_check(value);
	}
	
	public long getAd_check() {
		return defaultInterface.getAd_check();
	}
	
	public void setAd_check(long value) {
		defaultInterface.setAd_check(value);
	}
	
	public long getC_check() {
		return defaultInterface.getC_check();
	}
	
	public void setC_check(long value) {
		defaultInterface.setC_check(value);
	}
	
	public long getSm_local() {
		return defaultInterface.getSm_local();
	}
	
	public void setSm_local(long value) {
		defaultInterface.setSm_local(value);
	}
	
	public long getCnt() {
		return defaultInterface.getCnt();
	}
	
	public void setCnt(long value) {
		defaultInterface.setCnt(value);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r_A_default() {
		enterSequence_r_A_r1_default();
		enterSequence_r_A_r2_default();
	}
	
	/* 'default' enter sequence for state AA */
	private void enterSequence_r_A_r1_AA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.childFirstTransitionsInSubchart_r_A_r1_AA;
	}
	
	/* 'default' enter sequence for state AB */
	private void enterSequence_r_A_r1_AB_default() {
		nextStateIndex = 0;
		stateVector[0] = State.childFirstTransitionsInSubchart_r_A_r1_AB;
	}
	
	/* 'default' enter sequence for state AC */
	private void enterSequence_r_A_r2_AC_default() {
		nextStateIndex = 1;
		stateVector[1] = State.childFirstTransitionsInSubchart_r_A_r2_AC;
	}
	
	/* 'default' enter sequence for state AD */
	private void enterSequence_r_A_r2_AD_default() {
		nextStateIndex = 1;
		stateVector[1] = State.childFirstTransitionsInSubchart_r_A_r2_AD;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.childFirstTransitionsInSubchart_r_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_r2_C_default() {
		nextStateIndex = 2;
		stateVector[2] = State.childFirstTransitionsInSubchart_r2_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_r2_D_default() {
		nextStateIndex = 2;
		stateVector[2] = State.childFirstTransitionsInSubchart_r2_D;
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r_default() {
		react_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r_A_r1_default() {
		react_r_A_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r_A_r2_default() {
		react_r_A_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r2_default() {
		react_r2__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_r_A() {
		exitSequence_r_A_r1();
		exitSequence_r_A_r2();
	}
	
	/* Default exit sequence for state AA */
	private void exitSequence_r_A_r1_AA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state AB */
	private void exitSequence_r_A_r1_AB() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state AC */
	private void exitSequence_r_A_r2_AC() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for state AD */
	private void exitSequence_r_A_r2_AD() {
		nextStateIndex = 1;
		stateVector[1] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_r2_C() {
		nextStateIndex = 2;
		stateVector[2] = State.$NullState$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_r2_D() {
		nextStateIndex = 2;
		stateVector[2] = State.$NullState$;
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r() {
		switch (stateVector[0]) {
		case childFirstTransitionsInSubchart_r_A_r1_AA:
			exitSequence_r_A_r1_AA();
			break;
		case childFirstTransitionsInSubchart_r_A_r1_AB:
			exitSequence_r_A_r1_AB();
			break;
		case childFirstTransitionsInSubchart_r_B:
			exitSequence_r_B();
			break;
		default:
			break;
		}
		
		switch (stateVector[1]) {
		case childFirstTransitionsInSubchart_r_A_r2_AC:
			exitSequence_r_A_r2_AC();
			break;
		case childFirstTransitionsInSubchart_r_A_r2_AD:
			exitSequence_r_A_r2_AD();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r_A_r1() {
		switch (stateVector[0]) {
		case childFirstTransitionsInSubchart_r_A_r1_AA:
			exitSequence_r_A_r1_AA();
			break;
		case childFirstTransitionsInSubchart_r_A_r1_AB:
			exitSequence_r_A_r1_AB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r_A_r2() {
		switch (stateVector[1]) {
		case childFirstTransitionsInSubchart_r_A_r2_AC:
			exitSequence_r_A_r2_AC();
			break;
		case childFirstTransitionsInSubchart_r_A_r2_AD:
			exitSequence_r_A_r2_AD();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r2() {
		switch (stateVector[2]) {
		case childFirstTransitionsInSubchart_r2_C:
			exitSequence_r2_C();
			break;
		case childFirstTransitionsInSubchart_r2_D:
			exitSequence_r2_D();
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
	private void react_r_A_r1__entry_Default() {
		enterSequence_r_A_r1_AA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r_A_r2__entry_Default() {
		enterSequence_r_A_r2_AC_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_r2__entry_Default() {
		enterSequence_r2_C_default();
	}
	
	private boolean react() {
		defaultInterface.setSm_local(defaultInterface.operationCallback.next());
		
		return false;
	}
	
	private boolean r_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.check("A")) {
				exitSequence_r_A();
				enterSequence_r_B_default();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			defaultInterface.setA_local(defaultInterface.operationCallback.next());
		}
		return did_transition;
	}
	
	private boolean r_A_r1_AA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.check("AA")) {
				exitSequence_r_A_r1_AA();
				enterSequence_r_A_r1_AB_default();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			defaultInterface.setAa_local(defaultInterface.operationCallback.next());
		}
		return did_transition;
	}
	
	private boolean r_A_r1_AB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.check("AB")) {
				exitSequence_r_A_r1_AB();
				enterSequence_r_A_r1_AA_default();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			defaultInterface.setAb_local(defaultInterface.operationCallback.next());
		}
		return did_transition;
	}
	
	private boolean r_A_r2_AC_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.check("AC")) {
				exitSequence_r_A_r2_AC();
				enterSequence_r_A_r2_AD_default();
				r_A_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			defaultInterface.setAc_local(defaultInterface.operationCallback.next());
			
			did_transition = r_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r_A_r2_AD_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.check("AD")) {
				exitSequence_r_A_r2_AD();
				enterSequence_r_A_r2_AC_default();
				r_A_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			defaultInterface.setAd_local(defaultInterface.operationCallback.next());
			
			did_transition = r_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean r_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean r2_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.operationCallback.check("C")) {
				exitSequence_r2_C();
				enterSequence_r2_D_default();
				react();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			defaultInterface.setC_local(defaultInterface.operationCallback.next());
			
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean r2_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = react();
		}
		return did_transition;
	}
	
}
