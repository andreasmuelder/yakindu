/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.ckeywords;


public class CKeywordsStatemachine implements ICKeywordsStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean auto;
		
		
		public void raiseAuto() {
			auto = true;
		}
		
		private boolean breakEvent;
		
		
		public void raiseBreak() {
			breakEvent = true;
		}
		
		private boolean caseVariable;
		
		public boolean getCase() {
			return caseVariable;
		}
		
		public void setCase(boolean value) {
			this.caseVariable = value;
		}
		
		private long doVariable;
		
		public long getDo() {
			return doVariable;
		}
		
		public void setDo(long value) {
			this.doVariable = value;
		}
		
		private boolean continueVariable;
		
		public boolean getContinue() {
			return continueVariable;
		}
		
		public void setContinue(boolean value) {
			this.continueVariable = value;
		}
		
		private boolean doubleVariable;
		
		public boolean getDouble() {
			return doubleVariable;
		}
		
		public void setDouble(boolean value) {
			this.doubleVariable = value;
		}
		
		private boolean enumVariable;
		
		public boolean getEnum() {
			return enumVariable;
		}
		
		public void setEnum(boolean value) {
			this.enumVariable = value;
		}
		
		private boolean extern;
		
		public boolean getExtern() {
			return extern;
		}
		
		public void setExtern(boolean value) {
			this.extern = value;
		}
		
		private boolean floatVariable;
		
		public boolean getFloat() {
			return floatVariable;
		}
		
		public void setFloat(boolean value) {
			this.floatVariable = value;
		}
		
		private boolean forVariable;
		
		public boolean getFor() {
			return forVariable;
		}
		
		public void setFor(boolean value) {
			this.forVariable = value;
		}
		
		private boolean gotoVariable;
		
		public boolean getGoto() {
			return gotoVariable;
		}
		
		public void setGoto(boolean value) {
			this.gotoVariable = value;
		}
		
		private boolean ifVariable;
		
		public boolean getIf() {
			return ifVariable;
		}
		
		public void setIf(boolean value) {
			this.ifVariable = value;
		}
		
		private boolean intVariable;
		
		public boolean getInt() {
			return intVariable;
		}
		
		public void setInt(boolean value) {
			this.intVariable = value;
		}
		
		private boolean longVariable;
		
		public boolean getLong() {
			return longVariable;
		}
		
		public void setLong(boolean value) {
			this.longVariable = value;
		}
		
		private boolean register;
		
		public boolean getRegister() {
			return register;
		}
		
		public void setRegister(boolean value) {
			this.register = value;
		}
		
		private boolean returnVariable;
		
		public boolean getReturn() {
			return returnVariable;
		}
		
		public void setReturn(boolean value) {
			this.returnVariable = value;
		}
		
		private boolean shortVariable;
		
		public boolean getShort() {
			return shortVariable;
		}
		
		public void setShort(boolean value) {
			this.shortVariable = value;
		}
		
		private boolean signed;
		
		public boolean getSigned() {
			return signed;
		}
		
		public void setSigned(boolean value) {
			this.signed = value;
		}
		
		private boolean sizeof;
		
		public boolean getSizeof() {
			return sizeof;
		}
		
		public void setSizeof(boolean value) {
			this.sizeof = value;
		}
		
		private boolean staticVariable;
		
		public boolean getStatic() {
			return staticVariable;
		}
		
		public void setStatic(boolean value) {
			this.staticVariable = value;
		}
		
		private boolean struct;
		
		public boolean getStruct() {
			return struct;
		}
		
		public void setStruct(boolean value) {
			this.struct = value;
		}
		
		private boolean switchVariable;
		
		public boolean getSwitch() {
			return switchVariable;
		}
		
		public void setSwitch(boolean value) {
			this.switchVariable = value;
		}
		
		private boolean typedef;
		
		public boolean getTypedef() {
			return typedef;
		}
		
		public void setTypedef(boolean value) {
			this.typedef = value;
		}
		
		private boolean union;
		
		public boolean getUnion() {
			return union;
		}
		
		public void setUnion(boolean value) {
			this.union = value;
		}
		
		private boolean unsigned;
		
		public boolean getUnsigned() {
			return unsigned;
		}
		
		public void setUnsigned(boolean value) {
			this.unsigned = value;
		}
		
		private boolean voidVariable;
		
		public boolean getVoid() {
			return voidVariable;
		}
		
		public void setVoid(boolean value) {
			this.voidVariable = value;
		}
		
		private boolean volatileVariable;
		
		public boolean getVolatile() {
			return volatileVariable;
		}
		
		public void setVolatile(boolean value) {
			this.volatileVariable = value;
		}
		
		private boolean whileVariable;
		
		public boolean getWhile() {
			return whileVariable;
		}
		
		public void setWhile(boolean value) {
			this.whileVariable = value;
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean auto;
		private boolean breakEvent;
	}
	private static class CKeywordsStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		AUTO_CHAR,
		AUTO_LOOP,
		AUTO_LOOP_SWITCH_CASE,
		AUTO_LOOP_SWITCH_CASE_ENUM_ASM,
		$NULLSTATE$
	};
	
	private State[] historyVector = new State[2];
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private CKeywordsStatemachineEvBuf _current = new CKeywordsStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public CKeywordsStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		for (int i = 0; i < 2; i++) {
			historyVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		defaultInterface.setCase(false);
		
		defaultInterface.setDo(0);
		
		defaultInterface.setContinue(false);
		
		defaultInterface.setDouble(false);
		
		defaultInterface.setEnum(false);
		
		defaultInterface.setExtern(false);
		
		defaultInterface.setFloat(false);
		
		defaultInterface.setFor(false);
		
		defaultInterface.setGoto(false);
		
		defaultInterface.setIf(false);
		
		defaultInterface.setInt(false);
		
		defaultInterface.setLong(false);
		
		defaultInterface.setRegister(false);
		
		defaultInterface.setReturn(false);
		
		defaultInterface.setShort(false);
		
		defaultInterface.setSigned(false);
		
		defaultInterface.setSizeof(false);
		
		defaultInterface.setStatic(false);
		
		defaultInterface.setStruct(false);
		
		defaultInterface.setSwitch(false);
		
		defaultInterface.setTypedef(false);
		
		defaultInterface.setUnion(false);
		
		defaultInterface.setUnsigned(false);
		
		defaultInterface.setVoid(false);
		
		defaultInterface.setVolatile(false);
		
		defaultInterface.setWhile(false);
		
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
		enterSequence_auto_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_auto();
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
			case AUTO_CHAR:
				auto_char_react(true);
				break;
			case AUTO_LOOP_SWITCH_CASE_ENUM_ASM:
				auto_loop_switch_case_enum_asm_react(true);
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
		_current.iface.auto = defaultInterface.auto;
		defaultInterface.auto = false;
		
		_current.iface.breakEvent = defaultInterface.breakEvent;
		defaultInterface.breakEvent = false;
	}
	
	private void clearInEvents() {
		defaultInterface.auto = false;
		defaultInterface.breakEvent = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case AUTO_CHAR:
			return stateVector[0] == State.AUTO_CHAR;
		case AUTO_LOOP:
			return stateVector[0].ordinal() >= State.
					AUTO_LOOP.ordinal()&& stateVector[0].ordinal() <= State.AUTO_LOOP_SWITCH_CASE_ENUM_ASM.ordinal();
		case AUTO_LOOP_SWITCH_CASE:
			return stateVector[0].ordinal() >= State.
					AUTO_LOOP_SWITCH_CASE.ordinal()&& stateVector[0].ordinal() <= State.AUTO_LOOP_SWITCH_CASE_ENUM_ASM.ordinal();
		case AUTO_LOOP_SWITCH_CASE_ENUM_ASM:
			return stateVector[0] == State.AUTO_LOOP_SWITCH_CASE_ENUM_ASM;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public void raiseAuto() {
		defaultInterface.raiseAuto();
	}
	
	public void raiseBreak() {
		defaultInterface.raiseBreak();
	}
	
	public boolean getCase() {
		return defaultInterface.getCase();
	}
	
	public void setCase(boolean value) {
		defaultInterface.setCase(value);
	}
	
	public long getDo() {
		return defaultInterface.getDo();
	}
	
	public void setDo(long value) {
		defaultInterface.setDo(value);
	}
	
	public boolean getContinue() {
		return defaultInterface.getContinue();
	}
	
	public void setContinue(boolean value) {
		defaultInterface.setContinue(value);
	}
	
	public boolean getDouble() {
		return defaultInterface.getDouble();
	}
	
	public void setDouble(boolean value) {
		defaultInterface.setDouble(value);
	}
	
	public boolean getEnum() {
		return defaultInterface.getEnum();
	}
	
	public void setEnum(boolean value) {
		defaultInterface.setEnum(value);
	}
	
	public boolean getExtern() {
		return defaultInterface.getExtern();
	}
	
	public void setExtern(boolean value) {
		defaultInterface.setExtern(value);
	}
	
	public boolean getFloat() {
		return defaultInterface.getFloat();
	}
	
	public void setFloat(boolean value) {
		defaultInterface.setFloat(value);
	}
	
	public boolean getFor() {
		return defaultInterface.getFor();
	}
	
	public void setFor(boolean value) {
		defaultInterface.setFor(value);
	}
	
	public boolean getGoto() {
		return defaultInterface.getGoto();
	}
	
	public void setGoto(boolean value) {
		defaultInterface.setGoto(value);
	}
	
	public boolean getIf() {
		return defaultInterface.getIf();
	}
	
	public void setIf(boolean value) {
		defaultInterface.setIf(value);
	}
	
	public boolean getInt() {
		return defaultInterface.getInt();
	}
	
	public void setInt(boolean value) {
		defaultInterface.setInt(value);
	}
	
	public boolean getLong() {
		return defaultInterface.getLong();
	}
	
	public void setLong(boolean value) {
		defaultInterface.setLong(value);
	}
	
	public boolean getRegister() {
		return defaultInterface.getRegister();
	}
	
	public void setRegister(boolean value) {
		defaultInterface.setRegister(value);
	}
	
	public boolean getReturn() {
		return defaultInterface.getReturn();
	}
	
	public void setReturn(boolean value) {
		defaultInterface.setReturn(value);
	}
	
	public boolean getShort() {
		return defaultInterface.getShort();
	}
	
	public void setShort(boolean value) {
		defaultInterface.setShort(value);
	}
	
	public boolean getSigned() {
		return defaultInterface.getSigned();
	}
	
	public void setSigned(boolean value) {
		defaultInterface.setSigned(value);
	}
	
	public boolean getSizeof() {
		return defaultInterface.getSizeof();
	}
	
	public void setSizeof(boolean value) {
		defaultInterface.setSizeof(value);
	}
	
	public boolean getStatic() {
		return defaultInterface.getStatic();
	}
	
	public void setStatic(boolean value) {
		defaultInterface.setStatic(value);
	}
	
	public boolean getStruct() {
		return defaultInterface.getStruct();
	}
	
	public void setStruct(boolean value) {
		defaultInterface.setStruct(value);
	}
	
	public boolean getSwitch() {
		return defaultInterface.getSwitch();
	}
	
	public void setSwitch(boolean value) {
		defaultInterface.setSwitch(value);
	}
	
	public boolean getTypedef() {
		return defaultInterface.getTypedef();
	}
	
	public void setTypedef(boolean value) {
		defaultInterface.setTypedef(value);
	}
	
	public boolean getUnion() {
		return defaultInterface.getUnion();
	}
	
	public void setUnion(boolean value) {
		defaultInterface.setUnion(value);
	}
	
	public boolean getUnsigned() {
		return defaultInterface.getUnsigned();
	}
	
	public void setUnsigned(boolean value) {
		defaultInterface.setUnsigned(value);
	}
	
	public boolean getVoid() {
		return defaultInterface.getVoid();
	}
	
	public void setVoid(boolean value) {
		defaultInterface.setVoid(value);
	}
	
	public boolean getVolatile() {
		return defaultInterface.getVolatile();
	}
	
	public void setVolatile(boolean value) {
		defaultInterface.setVolatile(value);
	}
	
	public boolean getWhile() {
		return defaultInterface.getWhile();
	}
	
	public void setWhile(boolean value) {
		defaultInterface.setWhile(value);
	}
	
	/* Entry action for state 'char'. */
	private void entryAction_auto_char() {
		defaultInterface.setCase(true);
		
		defaultInterface.setDo(0);
		
		defaultInterface.setContinue(true);
		
		defaultInterface.setDouble(true);
		
		defaultInterface.setEnum(true);
		
		defaultInterface.setExtern(true);
		
		defaultInterface.setFloat(true);
		
		defaultInterface.setFor(true);
		
		defaultInterface.setGoto(true);
		
		defaultInterface.setIf(true);
		
		defaultInterface.setInt(true);
		
		defaultInterface.setLong(true);
		
		defaultInterface.setRegister(true);
		
		defaultInterface.setReturn(true);
		
		defaultInterface.setShort(true);
		
		defaultInterface.setSigned(true);
		
		defaultInterface.setSizeof(true);
		
		defaultInterface.setStatic(true);
		
		defaultInterface.setStruct(true);
		
		defaultInterface.setSwitch(true);
		
		defaultInterface.setTypedef(true);
		
		defaultInterface.setUnion(true);
		
		defaultInterface.setUnsigned(true);
		
		defaultInterface.setVoid(true);
		
		defaultInterface.setVolatile(true);
		
		defaultInterface.setWhile(true);
	}
	
	/* Entry action for state 'asm'. */
	private void entryAction_auto_loop_switch_case_enum_asm() {
		defaultInterface.setCase(false);
		
		defaultInterface.setDo(0);
		
		defaultInterface.setContinue(false);
		
		defaultInterface.setDouble(false);
		
		defaultInterface.setEnum(false);
		
		defaultInterface.setExtern(false);
		
		defaultInterface.setFloat(false);
		
		defaultInterface.setFor(false);
		
		defaultInterface.setGoto(false);
		
		defaultInterface.setIf(false);
		
		defaultInterface.setInt(false);
		
		defaultInterface.setLong(false);
		
		defaultInterface.setRegister(false);
		
		defaultInterface.setReturn(false);
		
		defaultInterface.setShort(false);
		
		defaultInterface.setSigned(false);
		
		defaultInterface.setSizeof(false);
		
		defaultInterface.setStatic(false);
		
		defaultInterface.setStruct(false);
		
		defaultInterface.setSwitch(false);
		
		defaultInterface.setTypedef(false);
		
		defaultInterface.setUnion(false);
		
		defaultInterface.setUnsigned(false);
		
		defaultInterface.setVoid(false);
		
		defaultInterface.setVolatile(false);
		
		defaultInterface.setWhile(false);
	}
	
	/* 'default' enter sequence for state char */
	private void enterSequence_auto_char_default() {
		entryAction_auto_char();
		nextStateIndex = 0;
		stateVector[0] = State.AUTO_CHAR;
	}
	
	/* 'default' enter sequence for state loop */
	private void enterSequence_auto_loop_default() {
		enterSequence_auto_loop_switch_default();
	}
	
	/* 'default' enter sequence for state case */
	private void enterSequence_auto_loop_switch_case_default() {
		enterSequence_auto_loop_switch_case_enum_default();
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state asm */
	private void enterSequence_auto_loop_switch_case_enum_asm_default() {
		entryAction_auto_loop_switch_case_enum_asm();
		nextStateIndex = 0;
		stateVector[0] = State.AUTO_LOOP_SWITCH_CASE_ENUM_ASM;
		
		historyVector[1] = stateVector[0];
	}
	
	/* 'default' enter sequence for region auto */
	private void enterSequence_auto_default() {
		react_auto__entry_Default();
	}
	
	/* 'default' enter sequence for region switch */
	private void enterSequence_auto_loop_switch_default() {
		react_auto_loop_switch__entry_Default();
	}
	
	/* shallow enterSequence with history in child switch */
	private void shallowEnterSequence_auto_loop_switch() {
		switch (historyVector[0]) {
		case AUTO_LOOP_SWITCH_CASE_ENUM_ASM:
			enterSequence_auto_loop_switch_case_default();
			break;
		default:
			break;
		}
	}
	
	/* 'default' enter sequence for region enum */
	private void enterSequence_auto_loop_switch_case_enum_default() {
		react_auto_loop_switch_case_enum__entry_Default();
	}
	
	/* deep enterSequence with history in child enum */
	private void deepEnterSequence_auto_loop_switch_case_enum() {
		switch (historyVector[1]) {
		case AUTO_LOOP_SWITCH_CASE_ENUM_ASM:
			enterSequence_auto_loop_switch_case_enum_asm_default();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for state char */
	private void exitSequence_auto_char() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state asm */
	private void exitSequence_auto_loop_switch_case_enum_asm() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region auto */
	private void exitSequence_auto() {
		switch (stateVector[0]) {
		case AUTO_CHAR:
			exitSequence_auto_char();
			break;
		case AUTO_LOOP_SWITCH_CASE_ENUM_ASM:
			exitSequence_auto_loop_switch_case_enum_asm();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_auto__entry_Default() {
		enterSequence_auto_char_default();
	}
	
	/* Default react sequence for shallow history entry  */
	private void react_auto_loop_switch__entry_Default() {
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NULLSTATE$) {
			shallowEnterSequence_auto_loop_switch();
		} else {
			enterSequence_auto_loop_switch_case_default();
		}
	}
	
	/* Default react sequence for deep history entry  */
	private void react_auto_loop_switch_case_enum__entry_Default() {
		/* Enter the region with deep history */
		if (historyVector[1] != State.$NULLSTATE$) {
			deepEnterSequence_auto_loop_switch_case_enum();
		} else {
			enterSequence_auto_loop_switch_case_enum_asm_default();
		}
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean auto_char_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (((_current.iface.auto) && (defaultInterface.getCase()))) {
					exitSequence_auto_char();
					defaultInterface.setDo(defaultInterface.getDo() + 1);
					
					enterSequence_auto_loop_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean auto_loop_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean auto_loop_switch_case_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (auto_loop_react(try_transition)==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean auto_loop_switch_case_enum_asm_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (auto_loop_switch_case_react(try_transition)==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
