/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.ieq.eventdriventriggeredbytimeevent;

import java.util.LinkedList;
import java.util.Queue;
import org.yakindu.scr.ieq.ITimer;

public class EventDrivenTriggeredByTimeEventStatemachine implements IEventDrivenTriggeredByTimeEventStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
		private long x;
		
		public long getX() {
			return x;
		}
		
		public void setX(long value) {
			this.x = value;
		}
		
		private long transition_count;
		
		public long getTransition_count() {
			return transition_count;
		}
		
		public void setTransition_count(long value) {
			this.transition_count = value;
		}
		
	}
	
	
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		eventDrivenTriggeredByTimeEvent_r_A,
		eventDrivenTriggeredByTimeEvent_r_B,
		$NullState$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private ITimer timer;
	
	private final boolean[] timeEvents = new boolean[2];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public EventDrivenTriggeredByTimeEventStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		if (timer == null) {
			throw new IllegalStateException("timer not set.");
		}
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		
		clearInEvents();
		
		sCInterface.setX(0);
		
		sCInterface.setTransition_count(0);
		
		isExecuting = false;
	}
	
	public void enter() {
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
		if (timer == null) {
			throw new IllegalStateException("timer not set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		nextEvent();
		do { 
			for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
				switch (stateVector[nextStateIndex]) {
				case eventDrivenTriggeredByTimeEvent_r_A:
					r_A_react(true);
					break;
				case eventDrivenTriggeredByTimeEvent_r_B:
					r_B_react(true);
					break;
				default:
					// $NullState$
				}
			}
			
			clearInEvents();
			nextEvent();
		} while ((timeEvents[0] || timeEvents[1]));
		
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
	private void clearInEvents() {
		timeEvents[0] = false;
		timeEvents[1] = false;
	}
	
	protected void nextEvent() {
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
		case eventDrivenTriggeredByTimeEvent_r_A:
			return stateVector[0] == State.eventDrivenTriggeredByTimeEvent_r_A;
		case eventDrivenTriggeredByTimeEvent_r_B:
			return stateVector[0] == State.eventDrivenTriggeredByTimeEvent_r_B;
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
	public void setTimer(ITimer timer) {
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
	
	public void timeElapsed(int eventID) {
		inEventQueue.add(new Runnable() {
			@Override
			public void run() {
				timeEvents[eventID] = true;
			}
		});
		runCycle();
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public long getX() {
		return sCInterface.getX();
	}
	
	public void setX(long value) {
		sCInterface.setX(value);
	}
	
	public long getTransition_count() {
		return sCInterface.getTransition_count();
	}
	
	public void setTransition_count(long value) {
		sCInterface.setTransition_count(value);
	}
	
	/* Entry action for state 'A'. */
	private void entryAction_r_A() {
		timer.setTimer(this, 0, (1 * 1000), false);
	}
	
	/* Entry action for state 'B'. */
	private void entryAction_r_B() {
		timer.setTimer(this, 1, (1 * 1000), false);
	}
	
	/* Exit action for state 'A'. */
	private void exitAction_r_A() {
		timer.unsetTimer(this, 0);
	}
	
	/* Exit action for state 'B'. */
	private void exitAction_r_B() {
		timer.unsetTimer(this, 1);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_r_A_default() {
		entryAction_r_A();
		nextStateIndex = 0;
		stateVector[0] = State.eventDrivenTriggeredByTimeEvent_r_A;
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_r_B_default() {
		entryAction_r_B();
		nextStateIndex = 0;
		stateVector[0] = State.eventDrivenTriggeredByTimeEvent_r_B;
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_r_default() {
		react_r__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_r_A() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
		
		exitAction_r_A();
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_r_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
		
		exitAction_r_B();
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_r() {
		switch (stateVector[0]) {
		case eventDrivenTriggeredByTimeEvent_r_A:
			exitSequence_r_A();
			break;
		case eventDrivenTriggeredByTimeEvent_r_B:
			exitSequence_r_B();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_r__entry_Default() {
		enterSequence_r_A_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean r_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (timeEvents[0]) {
					exitSequence_r_A();
					sCInterface.setTransition_count(sCInterface.getTransition_count() + 1);
					
					enterSequence_r_B_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			sCInterface.setX(sCInterface.getX() + 1);
		}
		return did_transition;
	}
	
	private boolean r_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (timeEvents[1]) {
					exitSequence_r_B();
					sCInterface.setTransition_count(sCInterface.getTransition_count() + 1);
					
					enterSequence_r_A_default();
				} else {
					did_transition = false;
				}
			}
		}
		if (did_transition==false) {
			sCInterface.setX(sCInterface.getX() + 1);
		}
		return did_transition;
	}
	
}
