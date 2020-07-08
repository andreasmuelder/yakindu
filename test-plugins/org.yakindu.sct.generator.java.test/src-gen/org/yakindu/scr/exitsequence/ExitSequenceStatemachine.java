/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.exitsequence;


public class ExitSequenceStatemachine implements IExitSequenceStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e;
		
		
		public void raiseE() {
			e = true;
			runCycle();
		}
		
		private boolean f;
		
		
		public void raiseF() {
			f = true;
			runCycle();
		}
		
		private long a_exit;
		
		public long getA_exit() {
			return a_exit;
		}
		
		public void setA_exit(long value) {
			this.a_exit = value;
		}
		
		private long aa_exit;
		
		public long getAa_exit() {
			return aa_exit;
		}
		
		public void setAa_exit(long value) {
			this.aa_exit = value;
		}
		
		private long ab_exit;
		
		public long getAb_exit() {
			return ab_exit;
		}
		
		public void setAb_exit(long value) {
			this.ab_exit = value;
		}
		
		private long aba_exit;
		
		public long getAba_exit() {
			return aba_exit;
		}
		
		public void setAba_exit(long value) {
			this.aba_exit = value;
		}
		
		private long abb_exit;
		
		public long getAbb_exit() {
			return abb_exit;
		}
		
		public void setAbb_exit(long value) {
			this.abb_exit = value;
		}
		
		private long ac_exit;
		
		public long getAc_exit() {
			return ac_exit;
		}
		
		public void setAc_exit(long value) {
			this.ac_exit = value;
		}
		
		private long aca_exit;
		
		public long getAca_exit() {
			return aca_exit;
		}
		
		public void setAca_exit(long value) {
			this.aca_exit = value;
		}
		
		private long acaa_exit;
		
		public long getAcaa_exit() {
			return acaa_exit;
		}
		
		public void setAcaa_exit(long value) {
			this.acaa_exit = value;
		}
		
		private long ad_exit;
		
		public long getAd_exit() {
			return ad_exit;
		}
		
		public void setAd_exit(long value) {
			this.ad_exit = value;
		}
		
		private long ada_exit;
		
		public long getAda_exit() {
			return ada_exit;
		}
		
		public void setAda_exit(long value) {
			this.ada_exit = value;
		}
		
		private long adb_exit;
		
		public long getAdb_exit() {
			return adb_exit;
		}
		
		public void setAdb_exit(long value) {
			this.adb_exit = value;
		}
		
		private long adc_exit;
		
		public long getAdc_exit() {
			return adc_exit;
		}
		
		public void setAdc_exit(long value) {
			this.adc_exit = value;
		}
		
		private long c;
		
		public long getC() {
			return c;
		}
		
		public void setC(long value) {
			this.c = value;
		}
		
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAIN_REGION_A,
		MAIN_REGION_A_R_AA,
		MAIN_REGION_A_R_AB,
		MAIN_REGION_A_R_AB_R1_ABA,
		MAIN_REGION_A_R_AB_R2_ABB,
		MAIN_REGION_A_R_AC,
		MAIN_REGION_A_R_AC_R_ACA,
		MAIN_REGION_A_R_AC_R_ACA_R_ACAA,
		MAIN_REGION_A_R_AD,
		MAIN_REGION_A_R_AD_R1_ADA,
		MAIN_REGION_A_R_AD_R2_ADB,
		MAIN_REGION_A_R_AD_R3_ADC,
		$NULLSTATE$
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
	public ExitSequenceStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 3; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		defaultInterface.setA_exit(0);
		
		defaultInterface.setAa_exit(0);
		
		defaultInterface.setAb_exit(0);
		
		defaultInterface.setAba_exit(0);
		
		defaultInterface.setAbb_exit(0);
		
		defaultInterface.setAc_exit(0);
		
		defaultInterface.setAca_exit(0);
		
		defaultInterface.setAcaa_exit(0);
		
		defaultInterface.setAd_exit(0);
		
		defaultInterface.setAda_exit(0);
		
		defaultInterface.setAdb_exit(0);
		
		defaultInterface.setAdc_exit(0);
		
		defaultInterface.setC(1);
		
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
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case MAIN_REGION_A_R_AA:
				main_region_A_r_AA_react(true);
				break;
			case MAIN_REGION_A_R_AB_R1_ABA:
				main_region_A_r_AB_r1_ABA_react(true);
				break;
			case MAIN_REGION_A_R_AB_R2_ABB:
				main_region_A_r_AB_r2_ABB_react(true);
				break;
			case MAIN_REGION_A_R_AC_R_ACA_R_ACAA:
				main_region_A_r_AC_r_ACA_r_ACAA_react(true);
				break;
			case MAIN_REGION_A_R_AD_R1_ADA:
				main_region_A_r_AD_r1_ADA_react(true);
				break;
			case MAIN_REGION_A_R_AD_R2_ADB:
				main_region_A_r_AD_r2_ADB_react(true);
				break;
			case MAIN_REGION_A_R_AD_R3_ADC:
				main_region_A_r_AD_r3_ADC_react(true);
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
		return stateVector[0] != State.$NULLSTATE$||stateVector[1] != State.$NULLSTATE$||stateVector[2] != State.$NULLSTATE$;
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
		defaultInterface.f = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_A:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_A.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_A_R_AD_R3_ADC.ordinal();
		case MAIN_REGION_A_R_AA:
			return stateVector[0] == State.MAIN_REGION_A_R_AA;
		case MAIN_REGION_A_R_AB:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_A_R_AB.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_A_R_AB_R2_ABB.ordinal();
		case MAIN_REGION_A_R_AB_R1_ABA:
			return stateVector[0] == State.MAIN_REGION_A_R_AB_R1_ABA;
		case MAIN_REGION_A_R_AB_R2_ABB:
			return stateVector[1] == State.MAIN_REGION_A_R_AB_R2_ABB;
		case MAIN_REGION_A_R_AC:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_A_R_AC.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_A_R_AC_R_ACA_R_ACAA.ordinal();
		case MAIN_REGION_A_R_AC_R_ACA:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_A_R_AC_R_ACA.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_A_R_AC_R_ACA_R_ACAA.ordinal();
		case MAIN_REGION_A_R_AC_R_ACA_R_ACAA:
			return stateVector[0] == State.MAIN_REGION_A_R_AC_R_ACA_R_ACAA;
		case MAIN_REGION_A_R_AD:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_A_R_AD.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_A_R_AD_R3_ADC.ordinal();
		case MAIN_REGION_A_R_AD_R1_ADA:
			return stateVector[0] == State.MAIN_REGION_A_R_AD_R1_ADA;
		case MAIN_REGION_A_R_AD_R2_ADB:
			return stateVector[1] == State.MAIN_REGION_A_R_AD_R2_ADB;
		case MAIN_REGION_A_R_AD_R3_ADC:
			return stateVector[2] == State.MAIN_REGION_A_R_AD_R3_ADC;
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
	
	public long getA_exit() {
		return defaultInterface.getA_exit();
	}
	
	public void setA_exit(long value) {
		defaultInterface.setA_exit(value);
	}
	
	public long getAa_exit() {
		return defaultInterface.getAa_exit();
	}
	
	public void setAa_exit(long value) {
		defaultInterface.setAa_exit(value);
	}
	
	public long getAb_exit() {
		return defaultInterface.getAb_exit();
	}
	
	public void setAb_exit(long value) {
		defaultInterface.setAb_exit(value);
	}
	
	public long getAba_exit() {
		return defaultInterface.getAba_exit();
	}
	
	public void setAba_exit(long value) {
		defaultInterface.setAba_exit(value);
	}
	
	public long getAbb_exit() {
		return defaultInterface.getAbb_exit();
	}
	
	public void setAbb_exit(long value) {
		defaultInterface.setAbb_exit(value);
	}
	
	public long getAc_exit() {
		return defaultInterface.getAc_exit();
	}
	
	public void setAc_exit(long value) {
		defaultInterface.setAc_exit(value);
	}
	
	public long getAca_exit() {
		return defaultInterface.getAca_exit();
	}
	
	public void setAca_exit(long value) {
		defaultInterface.setAca_exit(value);
	}
	
	public long getAcaa_exit() {
		return defaultInterface.getAcaa_exit();
	}
	
	public void setAcaa_exit(long value) {
		defaultInterface.setAcaa_exit(value);
	}
	
	public long getAd_exit() {
		return defaultInterface.getAd_exit();
	}
	
	public void setAd_exit(long value) {
		defaultInterface.setAd_exit(value);
	}
	
	public long getAda_exit() {
		return defaultInterface.getAda_exit();
	}
	
	public void setAda_exit(long value) {
		defaultInterface.setAda_exit(value);
	}
	
	public long getAdb_exit() {
		return defaultInterface.getAdb_exit();
	}
	
	public void setAdb_exit(long value) {
		defaultInterface.setAdb_exit(value);
	}
	
	public long getAdc_exit() {
		return defaultInterface.getAdc_exit();
	}
	
	public void setAdc_exit(long value) {
		defaultInterface.setAdc_exit(value);
	}
	
	public long getC() {
		return defaultInterface.getC();
	}
	
	public void setC(long value) {
		defaultInterface.setC(value);
	}
	
	/* Exit action for state 'A'. */
	private void exitAction_main_region_A() {
		defaultInterface.setA_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'AA'. */
	private void exitAction_main_region_A_r_AA() {
		defaultInterface.setAa_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'AB'. */
	private void exitAction_main_region_A_r_AB() {
		defaultInterface.setAb_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'ABA'. */
	private void exitAction_main_region_A_r_AB_r1_ABA() {
		defaultInterface.setAba_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'ABB'. */
	private void exitAction_main_region_A_r_AB_r2_ABB() {
		defaultInterface.setAbb_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'AC'. */
	private void exitAction_main_region_A_r_AC() {
		defaultInterface.setAc_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'ACA'. */
	private void exitAction_main_region_A_r_AC_r_ACA() {
		defaultInterface.setAca_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'ACAA'. */
	private void exitAction_main_region_A_r_AC_r_ACA_r_ACAA() {
		defaultInterface.setAcaa_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'AD'. */
	private void exitAction_main_region_A_r_AD() {
		defaultInterface.setAd_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'ADA'. */
	private void exitAction_main_region_A_r_AD_r1_ADA() {
		defaultInterface.setAda_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'ADB'. */
	private void exitAction_main_region_A_r_AD_r2_ADB() {
		defaultInterface.setAdb_exit(defaultInterface.c++);
	}
	
	/* Exit action for state 'ADC'. */
	private void exitAction_main_region_A_r_AD_r3_ADC() {
		defaultInterface.setAdc_exit(defaultInterface.c++);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		enterSequence_main_region_A_r_default();
	}
	
	/* 'default' enter sequence for state AA */
	private void enterSequence_main_region_A_r_AA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_A_R_AA;
	}
	
	/* 'default' enter sequence for state AB */
	private void enterSequence_main_region_A_r_AB_default() {
		enterSequence_main_region_A_r_AB_r1_default();
		enterSequence_main_region_A_r_AB_r2_default();
	}
	
	/* 'default' enter sequence for state ABA */
	private void enterSequence_main_region_A_r_AB_r1_ABA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_A_R_AB_R1_ABA;
	}
	
	/* 'default' enter sequence for state ABB */
	private void enterSequence_main_region_A_r_AB_r2_ABB_default() {
		nextStateIndex = 1;
		stateVector[1] = State.MAIN_REGION_A_R_AB_R2_ABB;
	}
	
	/* 'default' enter sequence for state AC */
	private void enterSequence_main_region_A_r_AC_default() {
		enterSequence_main_region_A_r_AC_r_default();
	}
	
	/* 'default' enter sequence for state ACA */
	private void enterSequence_main_region_A_r_AC_r_ACA_default() {
		enterSequence_main_region_A_r_AC_r_ACA_r_default();
	}
	
	/* 'default' enter sequence for state ACAA */
	private void enterSequence_main_region_A_r_AC_r_ACA_r_ACAA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_A_R_AC_R_ACA_R_ACAA;
	}
	
	/* 'default' enter sequence for state AD */
	private void enterSequence_main_region_A_r_AD_default() {
		enterSequence_main_region_A_r_AD_r1_default();
		enterSequence_main_region_A_r_AD_r2_default();
		enterSequence_main_region_A_r_AD_r3_default();
	}
	
	/* 'default' enter sequence for state ADA */
	private void enterSequence_main_region_A_r_AD_r1_ADA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_A_R_AD_R1_ADA;
	}
	
	/* 'default' enter sequence for state ADB */
	private void enterSequence_main_region_A_r_AD_r2_ADB_default() {
		nextStateIndex = 1;
		stateVector[1] = State.MAIN_REGION_A_R_AD_R2_ADB;
	}
	
	/* 'default' enter sequence for state ADC */
	private void enterSequence_main_region_A_r_AD_r3_ADC_default() {
		nextStateIndex = 2;
		stateVector[2] = State.MAIN_REGION_A_R_AD_R3_ADC;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_main_region_A_r_default() {
		react_main_region_A_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_A_r_AB_r1_default() {
		react_main_region_A_r_AB_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_main_region_A_r_AB_r2_default() {
		react_main_region_A_r_AB_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_main_region_A_r_AC_r_default() {
		react_main_region_A_r_AC_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_main_region_A_r_AC_r_ACA_r_default() {
		react_main_region_A_r_AC_r_ACA_r__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_A_r_AD_r1_default() {
		react_main_region_A_r_AD_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_main_region_A_r_AD_r2_default() {
		react_main_region_A_r_AD_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region r3 */
	private void enterSequence_main_region_A_r_AD_r3_default() {
		react_main_region_A_r_AD_r3__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_exitSequence_main_region_A() {
		exitSequence_main_region_A_r();
		exitAction_main_region_A();
	}
	
	/* Default exit sequence for state AA */
	private void exitSequence_main_region_A_r_exitSequence_main_region_A_r_AA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
		
		exitAction_main_region_A_r_AA();
	}
	
	/* Default exit sequence for state AB */
	private void exitSequence_main_region_A_r_exitSequence_main_region_A_r_AB() {
		exitSequence_main_region_A_r_AB_r1();
		exitSequence_main_region_A_r_AB_r2();
		exitAction_main_region_A_r_AB();
	}
	
	/* Default exit sequence for state ABA */
	private void exitSequence_main_region_A_r_AB_r1_exitSequence_main_region_A_r_AB_r1_ABA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
		
		exitAction_main_region_A_r_AB_r1_ABA();
	}
	
	/* Default exit sequence for state ABB */
	private void exitSequence_main_region_A_r_AB_r2_exitSequence_main_region_A_r_AB_r2_ABB() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
		
		exitAction_main_region_A_r_AB_r2_ABB();
	}
	
	/* Default exit sequence for state AC */
	private void exitSequence_main_region_A_r_exitSequence_main_region_A_r_AC() {
		exitSequence_main_region_A_r_AC_r();
		exitAction_main_region_A_r_AC();
	}
	
	/* Default exit sequence for state ACAA */
	private void exitSequence_main_region_A_r_AC_r_ACA_r_exitSequence_main_region_A_r_AC_r_ACA_r_ACAA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
		
		exitAction_main_region_A_r_AC_r_ACA_r_ACAA();
	}
	
	/* Default exit sequence for state AD */
	private void exitSequence_main_region_A_r_exitSequence_main_region_A_r_AD() {
		exitSequence_main_region_A_r_AD_r1();
		exitSequence_main_region_A_r_AD_r2();
		exitSequence_main_region_A_r_AD_r3();
		exitAction_main_region_A_r_AD();
	}
	
	/* Default exit sequence for state ADA */
	private void exitSequence_main_region_A_r_AD_r1_exitSequence_main_region_A_r_AD_r1_ADA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
		
		exitAction_main_region_A_r_AD_r1_ADA();
	}
	
	/* Default exit sequence for state ADB */
	private void exitSequence_main_region_A_r_AD_r2_exitSequence_main_region_A_r_AD_r2_ADB() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
		
		exitAction_main_region_A_r_AD_r2_ADB();
	}
	
	/* Default exit sequence for state ADC */
	private void exitSequence_main_region_A_r_AD_r3_exitSequence_main_region_A_r_AD_r3_ADC() {
		nextStateIndex = 2;
		stateVector[2] = State.$NULLSTATE$;
		
		exitAction_main_region_A_r_AD_r3_ADC();
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case MAIN_REGION_A_R_AA:
			exitSequence_main_region_A_r_exitSequence_main_region_A_r_AA();
			exitAction_main_region_A();
			break;
		case MAIN_REGION_A_R_AB_R1_ABA:
			exitSequence_main_region_A_r_AB_r1_exitSequence_main_region_A_r_AB_r1_ABA();
			break;
		case MAIN_REGION_A_R_AC_R_ACA_R_ACAA:
			exitSequence_main_region_A_r_AC_r_ACA_r_exitSequence_main_region_A_r_AC_r_ACA_r_ACAA();
			exitAction_main_region_A_r_AC_r_ACA();
			exitAction_main_region_A_r_AC();
			exitAction_main_region_A();
			break;
		case MAIN_REGION_A_R_AD_R1_ADA:
			exitSequence_main_region_A_r_AD_r1_exitSequence_main_region_A_r_AD_r1_ADA();
			break;
		default:
			break;
		}
		
		switch (stateVector[1]) {
		case MAIN_REGION_A_R_AB_R2_ABB:
			exitSequence_main_region_A_r_AB_r2_exitSequence_main_region_A_r_AB_r2_ABB();
			exitAction_main_region_A_r_AB();
			exitAction_main_region_A();
			break;
		case MAIN_REGION_A_R_AD_R2_ADB:
			exitSequence_main_region_A_r_AD_r2_exitSequence_main_region_A_r_AD_r2_ADB();
			break;
		default:
			break;
		}
		
		switch (stateVector[2]) {
		case MAIN_REGION_A_R_AD_R3_ADC:
			exitSequence_main_region_A_r_AD_r3_exitSequence_main_region_A_r_AD_r3_ADC();
			exitAction_main_region_A_r_AD();
			exitAction_main_region_A();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_main_region_A_r() {
		switch (stateVector[0]) {
		case MAIN_REGION_A_R_AA:
			exitSequence_main_region_A_r_exitSequence_main_region_A_r_AA();
			break;
		case MAIN_REGION_A_R_AB_R1_ABA:
			exitSequence_main_region_A_r_AB_r1_exitSequence_main_region_A_r_AB_r1_ABA();
			break;
		case MAIN_REGION_A_R_AC_R_ACA_R_ACAA:
			exitSequence_main_region_A_r_AC_r_ACA_r_exitSequence_main_region_A_r_AC_r_ACA_r_ACAA();
			exitAction_main_region_A_r_AC_r_ACA();
			exitAction_main_region_A_r_AC();
			break;
		case MAIN_REGION_A_R_AD_R1_ADA:
			exitSequence_main_region_A_r_AD_r1_exitSequence_main_region_A_r_AD_r1_ADA();
			break;
		default:
			break;
		}
		
		switch (stateVector[1]) {
		case MAIN_REGION_A_R_AB_R2_ABB:
			exitSequence_main_region_A_r_AB_r2_exitSequence_main_region_A_r_AB_r2_ABB();
			exitAction_main_region_A_r_AB();
			break;
		case MAIN_REGION_A_R_AD_R2_ADB:
			exitSequence_main_region_A_r_AD_r2_exitSequence_main_region_A_r_AD_r2_ADB();
			break;
		default:
			break;
		}
		
		switch (stateVector[2]) {
		case MAIN_REGION_A_R_AD_R3_ADC:
			exitSequence_main_region_A_r_AD_r3_exitSequence_main_region_A_r_AD_r3_ADC();
			exitAction_main_region_A_r_AD();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_A_r_AB_r1() {
		switch (stateVector[0]) {
		case MAIN_REGION_A_R_AB_R1_ABA:
			exitSequence_main_region_A_r_AB_r1_exitSequence_main_region_A_r_AB_r1_ABA();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_main_region_A_r_AB_r2() {
		switch (stateVector[1]) {
		case MAIN_REGION_A_R_AB_R2_ABB:
			exitSequence_main_region_A_r_AB_r2_exitSequence_main_region_A_r_AB_r2_ABB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_main_region_A_r_AC_r() {
		switch (stateVector[0]) {
		case MAIN_REGION_A_R_AC_R_ACA_R_ACAA:
			exitSequence_main_region_A_r_AC_r_ACA_r_exitSequence_main_region_A_r_AC_r_ACA_r_ACAA();
			exitAction_main_region_A_r_AC_r_ACA();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_A_r_AD_r1() {
		switch (stateVector[0]) {
		case MAIN_REGION_A_R_AD_R1_ADA:
			exitSequence_main_region_A_r_AD_r1_exitSequence_main_region_A_r_AD_r1_ADA();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_main_region_A_r_AD_r2() {
		switch (stateVector[1]) {
		case MAIN_REGION_A_R_AD_R2_ADB:
			exitSequence_main_region_A_r_AD_r2_exitSequence_main_region_A_r_AD_r2_ADB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r3 */
	private void exitSequence_main_region_A_r_AD_r3() {
		switch (stateVector[2]) {
		case MAIN_REGION_A_R_AD_R3_ADC:
			exitSequence_main_region_A_r_AD_r3_exitSequence_main_region_A_r_AD_r3_ADC();
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
	private void react_main_region_A_r__entry_Default() {
		enterSequence_main_region_A_r_AA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_A_r_AB_r1__entry_Default() {
		enterSequence_main_region_A_r_AB_r1_ABA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_A_r_AB_r2__entry_Default() {
		enterSequence_main_region_A_r_AB_r2_ABB_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_A_r_AC_r__entry_Default() {
		enterSequence_main_region_A_r_AC_r_ACA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_A_r_AC_r_ACA_r__entry_Default() {
		enterSequence_main_region_A_r_AC_r_ACA_r_ACAA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_A_r_AD_r1__entry_Default() {
		enterSequence_main_region_A_r_AD_r1_ADA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_A_r_AD_r2__entry_Default() {
		enterSequence_main_region_A_r_AD_r2_ADB_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_A_r_AD_r3__entry_Default() {
		enterSequence_main_region_A_r_AD_r3_ADC_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.f) {
				exitSequence_main_region_exitSequence_main_region_A();
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
	
	private boolean main_region_A_r_AA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_main_region_A_r_exitSequence_main_region_A_r_AA();
				enterSequence_main_region_A_r_AB_default();
				main_region_A_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = main_region_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_main_region_A_r_exitSequence_main_region_A_r_AB();
				enterSequence_main_region_A_r_AC_default();
				main_region_A_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = main_region_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AB_r1_ABA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AB_r2_ABB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = main_region_A_r_AB_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AC_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_main_region_A_r_exitSequence_main_region_A_r_AC();
				enterSequence_main_region_A_r_AD_default();
				main_region_A_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = main_region_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AC_r_ACA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = main_region_A_r_AC_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AC_r_ACA_r_ACAA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = main_region_A_r_AC_r_ACA_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AD_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e) {
				exitSequence_main_region_A_r_exitSequence_main_region_A_r_AD();
				enterSequence_main_region_A_r_AA_default();
				main_region_A_react(false);
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			did_transition = main_region_A_react(try_transition);
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AD_r1_ADA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AD_r2_ADB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
	private boolean main_region_A_r_AD_r3_ADC_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		if (did_transition==false) {
			did_transition = main_region_A_r_AD_react(try_transition);
		}
		return did_transition;
	}
	
}
