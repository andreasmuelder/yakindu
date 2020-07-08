/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.eventdriven;

import java.util.LinkedList;
import java.util.Queue;
import org.yakindu.sct.rx.Observable;

public class EventDrivenInternalEventStatemachine implements IEventDrivenInternalEventStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean start;
		
		
		public void raiseStart() {
			start = true;
			runCycle();
		}
		
		private boolean reset;
		
		
		public void raiseReset() {
			reset = true;
			runCycle();
		}
		
		private boolean e;
		
		private long eValue;
		
		
		protected void raiseE(long value) {
			eValue = value;
			e = true;
			eObservable.next(value);
		}
		
		private Observable<Long> eObservable = new Observable<Long>();
		
		public Observable<Long> getE() {
			return eObservable;
		}
		
		private long x;
		
		public long getX() {
			return x;
		}
		
		public void setX(long value) {
			this.x = value;
		}
		
		private long i1_sequence;
		
		public long getI1_sequence() {
			return i1_sequence;
		}
		
		public void setI1_sequence(long value) {
			this.i1_sequence = value;
		}
		
		private long i2_sequence;
		
		public long getI2_sequence() {
			return i2_sequence;
		}
		
		public void setI2_sequence(long value) {
			this.i2_sequence = value;
		}
		
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		R1_A,
		R1_B,
		R2_C,
		R2_D,
		CHECK_VALID,
		CHECK_MULTIPLEEVENTS,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[3];
	
	private int nextStateIndex;
	
	private Queue<Runnable> internalEventQueue = new LinkedList<Runnable>();
	private boolean i1;
	private boolean i2;
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public EventDrivenInternalEventStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 3; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		clearInternalEvents();
		
		defaultInterface.setX(0);
		
		defaultInterface.setI1_sequence(0);
		
		defaultInterface.setI2_sequence(0);
		
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
		enterSequence_check_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_r1();
		exitSequence_r2();
		exitSequence_check();
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
		nextEvent();
		do { 
			for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
				switch (stateVector[nextStateIndex]) {
				case R1_A:
					r1_A_react(true);
					break;
				case R1_B:
					r1_B_react(true);
					break;
				case R2_C:
					r2_C_react(true);
					break;
				case R2_D:
					r2_D_react(true);
					break;
				case CHECK_VALID:
					check_VALID_react(true);
					break;
				case CHECK_MULTIPLEEVENTS:
					check_MULTIPLEEVENTS_react(true);
					break;
				default:
					// $NULLSTATE$
				}
			}
			
			clearInEvents();
			clearInternalEvents();
			nextEvent();
		} while ((((defaultInterface.start || defaultInterface.reset) || i1) || i2));
		
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
		defaultInterface.start = false;
		defaultInterface.reset = false;
	}
	
	private void clearInternalEvents() {
		i1 = false;
		i2 = false;
	}
	
	protected void nextEvent() {
		if(!internalEventQueue.isEmpty()) {
			internalEventQueue.poll().run();
			return;
		}
	}
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case R1_A:
			return stateVector[0] == State.R1_A;
		case R1_B:
			return stateVector[0] == State.R1_B;
		case R2_C:
			return stateVector[1] == State.R2_C;
		case R2_D:
			return stateVector[1] == State.R2_D;
		case CHECK_VALID:
			return stateVector[2] == State.CHECK_VALID;
		case CHECK_MULTIPLEEVENTS:
			return stateVector[2] == State.CHECK_MULTIPLEEVENTS;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	private void raiseI1() {
	
		internalEventQueue.add(new Runnable() {
			@Override public void run() {
				i1 = true;					
			}
		});
	}
	
	private void raiseI2() {
	
		internalEventQueue.add(new Runnable() {
			@Override public void run() {
				i2 = true;					
			}
		});
	}
	
	public void raiseStart() {
		defaultInterface.raiseStart();
	}
	
	public void raiseReset() {
		defaultInterface.raiseReset();
	}
	
	public Observable<Long> getE() {
		return defaultInterface.getE();
	}
	
	public long getX() {
		return defaultInterface.getX();
	}
	
	public void setX(long value) {
		defaultInterface.setX(value);
	}
	
	public long getI1_sequence() {
		return defaultInterface.getI1_sequence();
	}
	
	public void setI1_sequence(long value) {
		defaultInterface.setI1_sequence(value);
	}
	
	public long getI2_sequence() {
		return defaultInterface.getI2_sequence();
	}
	
	public void setI2_sequence(long value) {
		defaultInterface.setI2_sequence(value);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r1_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R1_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r1_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.R1_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_r2_C_default() {
		nextStateIndex = 1;
		stateVector[1] = State.R2_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_r2_D_default() {
		nextStateIndex = 1;
		stateVector[1] = State.R2_D;
	}
	
	/* 'default' enter sequence for state VALID */
	private void enterSequence_check_VALID_default() {
		nextStateIndex = 2;
		stateVector[2] = State.CHECK_VALID;
	}
	
	/* 'default' enter sequence for state MULTIPLEEVENTS */
	private void enterSequence_check_MULTIPLEEVENTS_default() {
		nextStateIndex = 2;
		stateVector[2] = State.CHECK_MULTIPLEEVENTS;
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_r1_default() {
		react_r1__entry_Default();
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_r2_default() {
		react_r2__entry_Default();
	}
	
	/* 'default' enter sequence for region check */
	private void enterSequence_check_default() {
		react_check__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_r1_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r1_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_r2_C() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_r2_D() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state VALID */
	private void exitSequence_check_VALID() {
		nextStateIndex = 2;
		stateVector[2] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state MULTIPLEEVENTS */
	private void exitSequence_check_MULTIPLEEVENTS() {
		nextStateIndex = 2;
		stateVector[2] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_r1() {
		switch (stateVector[0]) {
		case R1_A:
			exitSequence_r1_A();
			break;
		case R1_B:
			exitSequence_r1_B();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_r2() {
		switch (stateVector[1]) {
		case R2_C:
			exitSequence_r2_C();
			break;
		case R2_D:
			exitSequence_r2_D();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region check */
	private void exitSequence_check() {
		switch (stateVector[2]) {
		case CHECK_VALID:
			exitSequence_check_VALID();
			break;
		case CHECK_MULTIPLEEVENTS:
			exitSequence_check_MULTIPLEEVENTS();
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
	private void react_r2__entry_Default() {
		enterSequence_r2_C_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_check__entry_Default() {
		enterSequence_check_VALID_default();
	}
	
	private boolean react() {
		defaultInterface.setX(defaultInterface.getX() + 1);
		
		return false;
	}
	
	private boolean r1_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (i2) {
					exitSequence_r1_A();
					defaultInterface.setI2_sequence(defaultInterface.x);
					
					enterSequence_r1_B_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			if (defaultInterface.start) {
				raiseI1();
			}
		}
		return did_transition;
	}
	
	private boolean r1_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (defaultInterface.reset) {
					exitSequence_r1_B();
					enterSequence_r1_A_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			if (((i2) && (defaultInterface.getI2_sequence()<10))) {
				defaultInterface.setI2_sequence(defaultInterface.getI2_sequence() + 1);
			}
		}
		return did_transition;
	}
	
	private boolean r2_C_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (i1) {
				exitSequence_r2_C();
				defaultInterface.setI1_sequence(defaultInterface.x);
				
				raiseI2();
				
				enterSequence_r2_D_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean r2_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.reset) {
				exitSequence_r2_D();
				enterSequence_r2_C_default();
			} else {
				did_transition = false;
			}
		}
		if (did_transition==false) {
			if (((i1) && (defaultInterface.getI1_sequence()<10))) {
				defaultInterface.setI1_sequence(defaultInterface.getI1_sequence() + 1);
			}
		}
		return did_transition;
	}
	
	private boolean check_VALID_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (((((defaultInterface.start && i1)) || ((defaultInterface.start && i2))) || ((i1 && i2)))) {
				exitSequence_check_VALID();
				enterSequence_check_MULTIPLEEVENTS_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean check_MULTIPLEEVENTS_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.reset) {
				exitSequence_check_MULTIPLEEVENTS();
				enterSequence_check_VALID_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
