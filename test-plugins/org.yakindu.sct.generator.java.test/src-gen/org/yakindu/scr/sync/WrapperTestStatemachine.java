/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.sync;

import java.util.LinkedList;
import java.util.List;
import org.yakindu.sct.ITimer;
import org.yakindu.sct.rx.Observable;

public class WrapperTestStatemachine implements IWrapperTestStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private List<InterfaceListener> listeners = new LinkedList<InterfaceListener>();
		
		public List<InterfaceListener> getListeners() {
			return listeners;
		}
		private InterfaceOperationCallback operationCallback;
		
		public synchronized void setInterfaceOperationCallback(
				InterfaceOperationCallback operationCallback) {
			this.operationCallback = operationCallback;
		}
		private boolean ev_out;
		
		
		protected void raiseEv_out() {
			synchronized(WrapperTestStatemachine.this) {
				ev_out = true;
				for (InterfaceListener listener : listeners) {
					listener.onEv_outRaised();
				}
				ev_outObservable.next(null);
			}
		}
		
		private Observable<Void> ev_outObservable = new Observable<Void>();
		
		public Observable<Void> getEv_out() {
			return ev_outObservable;
		}
		
		private boolean ev_in;
		
		
		public void raiseEv_in() {
			synchronized(WrapperTestStatemachine.this) {
				ev_in = true;
			}
		}
		
		private long afterCalls;
		
		public synchronized long getAfterCalls() {
			synchronized(WrapperTestStatemachine.this) {
				return afterCalls;
			}
		}
		
		public void setAfterCalls(long value) {
			synchronized(WrapperTestStatemachine.this) {
				this.afterCalls = value;
			}
		}
		
		private long cycles;
		
		public synchronized long getCycles() {
			synchronized(WrapperTestStatemachine.this) {
				return cycles;
			}
		}
		
		public void setCycles(long value) {
			synchronized(WrapperTestStatemachine.this) {
				this.cycles = value;
			}
		}
		
		private long s2_entered;
		
		public synchronized long getS2_entered() {
			synchronized(WrapperTestStatemachine.this) {
				return s2_entered;
			}
		}
		
		public void setS2_entered(long value) {
			synchronized(WrapperTestStatemachine.this) {
				this.s2_entered = value;
			}
		}
		
	}
	
	private static class InterfaceEvBuf {
		private boolean ev_in;
	}
	private static class WrapperTestStatemachineTimeEventsEvBuf {
		private boolean wrapperTest_main_region_s1_time_event_0;
		private boolean wrapperTest_time_event_0;
	}
	private static class WrapperTestStatemachineEvBuf {
		private InterfaceEvBuf iface = new InterfaceEvBuf();
		private WrapperTestStatemachineTimeEventsEvBuf timeEvents = new WrapperTestStatemachineTimeEventsEvBuf();
	}
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAIN_REGION_S1,
		MAIN_REGION_S2,
		MAIN_REGION_FINAL_0,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private ITimer timer;
	
	private final boolean[] timeEvents = new boolean[2];
	
	private WrapperTestStatemachineEvBuf _current = new WrapperTestStatemachineEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		synchronized(WrapperTestStatemachine.this) {
			return isExecuting;
		}
	}
	
	protected void setIsExecuting(boolean value) {
		synchronized(WrapperTestStatemachine.this) {
			this.isExecuting = value;
		}
	}
	public WrapperTestStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public synchronized void init() {
		this.initialized = true;
		if (timer == null) {
			throw new IllegalStateException("timer not set.");
		}
		if (this.defaultInterface.operationCallback == null) {
			throw new IllegalStateException("Operation callback for interface Interface must be set.");
		}
		
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		defaultInterface.setAfterCalls(0);
		
		defaultInterface.setCycles(0);
		
		defaultInterface.setS2_entered(0);
		
		isExecuting = false;
	}
	
	public synchronized void enter() {
		if (!initialized)
			throw new IllegalStateException(
			        "The state machine needs to be initialized first by calling the init() function.");
		if (timer == null) {
			throw new IllegalStateException("timer not set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		timer.setTimer(this, 1, (1 * 1000), true);
		
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public synchronized void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_main_region();
		timer.unsetTimer(this, 1);
		
		isExecuting = false;
	}
	
	public synchronized void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
			        "The state machine needs to be initialized first by calling the init() function.");
		if (timer == null) {
			throw new IllegalStateException("timer not set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		swapInEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case MAIN_REGION_S1:
				main_region_s1_react(true);
				break;
			case MAIN_REGION_S2:
				main_region_s2_react(true);
				break;
			case MAIN_REGION_FINAL_0:
				main_region__final__react(true);
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
	public synchronized boolean isActive() {
		return stateVector[0] != State.$NULLSTATE$;
	}
	
	/** 
	* @see IStatemachine#isFinal()
	*/
	public synchronized boolean isFinal() {
		return (stateVector[0] == State.MAIN_REGION_FINAL_0);
	}
	private void swapInEvents() {
		_current.iface.ev_in = defaultInterface.ev_in;
		defaultInterface.ev_in = false;
		
		_current.timeEvents.wrapperTest_main_region_s1_time_event_0 = timeEvents[0];
		timeEvents[0] = false;
		
		_current.timeEvents.wrapperTest_time_event_0 = timeEvents[1];
		timeEvents[1] = false;
	}
	
	private void clearInEvents() {
		defaultInterface.ev_in = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public synchronized boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_S1:
			return stateVector[0] == State.MAIN_REGION_S1;
		case MAIN_REGION_S2:
			return stateVector[0] == State.MAIN_REGION_S2;
		case MAIN_REGION_FINAL_0:
			return stateVector[0] == State.MAIN_REGION_FINAL_0;
		default:
			return false;
		}
	}
	
	/**
	* Set the {@link ITimer} for the state machine. It must be set
	* externally on a timed state machine before a run cycle can be correctly
	* executed.
	* 
	* @param timer
	*/
	public synchronized void setTimer(ITimer timer) {
		this.timer = timer;
	}
	
	/**
	* Returns the currently used timer.
	* 
	* @return {@link ITimer}
	*/
	public ITimer getTimer() {
		return timer;
	}
	
	public synchronized void timeElapsed(int eventID) {
		timeEvents[eventID] = true;
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public synchronized Observable<Void> getEv_out() {
		return defaultInterface.getEv_out();
	}
	
	public synchronized void raiseEv_in() {
		defaultInterface.raiseEv_in();
	}
	
	public synchronized long getAfterCalls() {
		return defaultInterface.getAfterCalls();
	}
	
	public synchronized void setAfterCalls(long value) {
		defaultInterface.setAfterCalls(value);
	}
	
	public synchronized long getCycles() {
		return defaultInterface.getCycles();
	}
	
	public synchronized void setCycles(long value) {
		defaultInterface.setCycles(value);
	}
	
	public synchronized long getS2_entered() {
		return defaultInterface.getS2_entered();
	}
	
	public synchronized void setS2_entered(long value) {
		defaultInterface.setS2_entered(value);
	}
	
	/* Entry action for state 's1'. */
	private void entryAction_main_region_s1() {
		timer.setTimer(this, 0, 500, false);
		
		defaultInterface.raiseEv_out();
	}
	
	/* Entry action for state 's2'. */
	private void entryAction_main_region_s2() {
		defaultInterface.setS2_entered(defaultInterface.getS2_entered() + 1);
	}
	
	/* Exit action for state 's1'. */
	private void exitAction_main_region_s1() {
		timer.unsetTimer(this, 0);
	}
	
	/* 'default' enter sequence for state s1 */
	private void enterSequence_main_region_s1_default() {
		entryAction_main_region_s1();
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_S1;
	}
	
	/* 'default' enter sequence for state s2 */
	private void enterSequence_main_region_s2_default() {
		entryAction_main_region_s2();
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_S2;
	}
	
	/* Default enter sequence for state null */
	private void enterSequence_main_region__final__default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_FINAL_0;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state s1 */
	private void exitSequence_main_region_s1() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
		
		exitAction_main_region_s1();
	}
	
	/* Default exit sequence for state s2 */
	private void exitSequence_main_region_s2() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for final state. */
	private void exitSequence_main_region__final_() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case MAIN_REGION_S1:
			exitSequence_main_region_s1();
			break;
		case MAIN_REGION_S2:
			exitSequence_main_region_s2();
			break;
		case MAIN_REGION_FINAL_0:
			exitSequence_main_region__final_();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_s1_default();
	}
	
	private boolean react() {
		if (_current.timeEvents.wrapperTest_time_event_0) {
			defaultInterface.operationCallback.displayTime();
		}
		defaultInterface.setCycles(defaultInterface.getCycles() + 1);
		
		return false;
	}
	
	private boolean main_region_s1_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (defaultInterface.getCycles()==40) {
					exitSequence_main_region_s1();
					enterSequence_main_region__final__default();
				} else {
					if (_current.iface.ev_in) {
						exitSequence_main_region_s1();
						enterSequence_main_region_s2_default();
					} else {
						if (_current.timeEvents.wrapperTest_main_region_s1_time_event_0) {
							exitSequence_main_region_s1();
							defaultInterface.setAfterCalls(defaultInterface.getAfterCalls() + 1);
							
							enterSequence_main_region_s1_default();
						} else {
							did_transition = false;
						}
					}
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_s2_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (_current.iface.ev_in) {
					exitSequence_main_region_s2();
					enterSequence_main_region_s1_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region__final__react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}
