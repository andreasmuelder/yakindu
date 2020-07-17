/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.supersteps;

import java.util.LinkedList;
import java.util.Queue;

public class EventDrivenSuperStepStatemachine implements IEventDrivenSuperStepStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e;
		
		
		public void raiseE() {
			inEventQueue.add(new Runnable() {
				@Override
				public void run() {
					e = true;
				}
			});
			runCycle();
		}
		
		private boolean f;
		
		
		public void raiseF() {
			inEventQueue.add(new Runnable() {
				@Override
				public void run() {
					f = true;
				}
			});
			runCycle();
		}
		
		private long x;
		
		public long getX() {
			return x;
		}
		
		public void setX(long value) {
			this.x = value;
		}
		
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAIN_REGION_A,
		MAIN_REGION_B,
		MAIN_REGION_C,
		MAIN_REGION_D,
		MAIN_REGION_G,
		MAIN_REGION_H,
		MAIN_REGION_I,
		MAIN_REGION_L,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private Queue<Runnable> internalEventQueue = new LinkedList<Runnable>();
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean l1;
	private boolean l2;
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	private boolean stateConfVectorChanged;
	
	protected boolean getStateConfVectorChanged() {
		return stateConfVectorChanged;
	}
	
	protected void setStateConfVectorChanged(boolean value) {
		this.stateConfVectorChanged = value;
	}
	public EventDrivenSuperStepStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		clearInternalEvents();
		
		defaultInterface.setX(0);
		
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
		do { 
			stateConfVectorChanged = false;
			microStep();
		} while (getStateConfVectorChanged());
		
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
		nextEvent();
		do { 
			do { 
				stateConfVectorChanged = false;
				microStep();
			} while (getStateConfVectorChanged());
			
			clearInEvents();
			clearInternalEvents();
			nextEvent();
		} while ((((defaultInterface.e || defaultInterface.f) || l1) || l2));
		
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
	private void clearInEvents() {
		defaultInterface.e = false;
		defaultInterface.f = false;
	}
	
	private void clearInternalEvents() {
		l1 = false;
		l2 = false;
	}
	
	private void microStep() {
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case MAIN_REGION_A:
				main_region_A_react(true);
				break;
			case MAIN_REGION_B:
				main_region_B_react(true);
				break;
			case MAIN_REGION_C:
				main_region_C_react(true);
				break;
			case MAIN_REGION_D:
				main_region_D_react(true);
				break;
			case MAIN_REGION_G:
				main_region_G_react(true);
				break;
			case MAIN_REGION_H:
				main_region_H_react(true);
				break;
			case MAIN_REGION_I:
				main_region_I_react(true);
				break;
			case MAIN_REGION_L:
				main_region_L_react(true);
				break;
			default:
				// $NULLSTATE$
			}
		}
	}
	
	protected void nextEvent() {
		if(!internalEventQueue.isEmpty()) {
			internalEventQueue.poll().run();
			return;
		}
		if(!inEventQueue.isEmpty()) {
			inEventQueue.poll().run();
			return;
		}
	}
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_A:
			return stateVector[0] == State.MAIN_REGION_A;
		case MAIN_REGION_B:
			return stateVector[0] == State.MAIN_REGION_B;
		case MAIN_REGION_C:
			return stateVector[0] == State.MAIN_REGION_C;
		case MAIN_REGION_D:
			return stateVector[0] == State.MAIN_REGION_D;
		case MAIN_REGION_G:
			return stateVector[0] == State.MAIN_REGION_G;
		case MAIN_REGION_H:
			return stateVector[0] == State.MAIN_REGION_H;
		case MAIN_REGION_I:
			return stateVector[0] == State.MAIN_REGION_I;
		case MAIN_REGION_L:
			return stateVector[0] == State.MAIN_REGION_L;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	private void raiseL1() {
	
		internalEventQueue.add(new Runnable() {
			@Override public void run() {
				l1 = true;					
			}
		});
	}
	
	private void raiseL2() {
	
		internalEventQueue.add(new Runnable() {
			@Override public void run() {
				l2 = true;					
			}
		});
	}
	
	public void raiseE() {
		defaultInterface.raiseE();
	}
	
	public void raiseF() {
		defaultInterface.raiseF();
	}
	
	public long getX() {
		return defaultInterface.getX();
	}
	
	public void setX(long value) {
		defaultInterface.setX(value);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_A;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_B;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_C_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_C;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_main_region_D_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_D;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for state G */
	private void enterSequence_main_region_G_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_G;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for state H */
	private void enterSequence_main_region_H_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_H;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for state I */
	private void enterSequence_main_region_I_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_I;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for state L */
	private void enterSequence_main_region_L_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_L;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_C() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_main_region_D() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state G */
	private void exitSequence_main_region_G() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state H */
	private void exitSequence_main_region_H() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state I */
	private void exitSequence_main_region_I() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state L */
	private void exitSequence_main_region_L() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case MAIN_REGION_A:
			exitSequence_main_region_A();
			break;
		case MAIN_REGION_B:
			exitSequence_main_region_B();
			break;
		case MAIN_REGION_C:
			exitSequence_main_region_C();
			break;
		case MAIN_REGION_D:
			exitSequence_main_region_D();
			break;
		case MAIN_REGION_G:
			exitSequence_main_region_G();
			break;
		case MAIN_REGION_H:
			exitSequence_main_region_H();
			break;
		case MAIN_REGION_I:
			exitSequence_main_region_I();
			break;
		case MAIN_REGION_L:
			exitSequence_main_region_L();
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
			if (defaultInterface.e) {
				exitSequence_main_region_A();
				raiseL1();
				
				enterSequence_main_region_B_default();
				react();
			} else {
				if (defaultInterface.f) {
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
			if (defaultInterface.e) {
				exitSequence_main_region_B();
				raiseL2();
				
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
			if (defaultInterface.f) {
				exitSequence_main_region_C();
				enterSequence_main_region_D_default();
				react();
			} else {
				if (l1) {
					exitSequence_main_region_C();
					enterSequence_main_region_L_default();
					react();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			if (defaultInterface.e) {
				defaultInterface.setX(42);
			}
			did_transition = react();
		}
		return did_transition;
	}
	
	private boolean main_region_D_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (((defaultInterface.f) && (defaultInterface.getX()==0))) {
				exitSequence_main_region_D();
				enterSequence_main_region_A_default();
				react();
			} else {
				if (defaultInterface.f) {
					exitSequence_main_region_D();
					defaultInterface.setX(defaultInterface.getX() - 1);
					
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
			if (defaultInterface.e) {
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
	
	private boolean main_region_L_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (l2) {
				exitSequence_main_region_L();
				enterSequence_main_region_C_default();
				react();
			} else {
				if (((l1) && (defaultInterface.getX()>17))) {
					exitSequence_main_region_L();
					defaultInterface.setX(defaultInterface.getX() - 1);
					
					enterSequence_main_region_L_default();
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
	
}