package org.yakindu.scr.valuedevents;

public class ValuedEventsStatemachine implements IValuedEventsStatemachine {

	private final class SCIDefaultImpl implements SCIDefault {

		private boolean integerEvent;

		private int integerEventValue;

		public void raiseIntegerEvent(int value) {
			integerEvent = true;
			integerEventValue = value;
		}

		private int getIntegerEventValue() {
			if (!integerEvent)
				throw new IllegalStateException(
						"Illegal event value acces. Event IntegerEvent is not raised!");
			return integerEventValue;
		}

		private int myVar;

		public int getMyVar() {
			return myVar;
		}

		public void setMyVar(int value) {
			this.myVar = value;
		}

		public void clearEvents() {
			integerEvent = false;
		}

	}

	private SCIDefaultImpl sCIDefault;

	public enum State {
		main_region_A, _region1_B, _region1_C, $NullState$
	};

	private final State[] stateVector = new State[2];

	private int nextStateIndex;

	public ValuedEventsStatemachine() {

		sCIDefault = new SCIDefaultImpl();

	}

	public void init() {
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NullState$;
		}

		clearEvents();
		clearOutEvents();

		sCIDefault.myVar = 0;
	}

	public void enter() {
		entryAction();

		sCIDefault.raiseIntegerEvent(2 * 21);

		nextStateIndex = 0;
		stateVector[0] = State.main_region_A;

		nextStateIndex = 1;
		stateVector[1] = State._region1_B;
	}

	public void exit() {
		switch (stateVector[0]) {
			case main_region_A :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;
				break;

			default :
				break;
		}

		switch (stateVector[1]) {
			case _region1_B :
				nextStateIndex = 1;
				stateVector[1] = State.$NullState$;
				break;

			case _region1_C :
				nextStateIndex = 1;
				stateVector[1] = State.$NullState$;
				break;

			default :
				break;
		}

		exitAction();
	}

	protected void clearEvents() {
		sCIDefault.clearEvents();

	}

	protected void clearOutEvents() {
	}

	public boolean isStateActive(State state) {
		switch (state) {
			case main_region_A :
				return stateVector[0] == State.main_region_A;
			case _region1_B :
				return stateVector[1] == State._region1_B;
			case _region1_C :
				return stateVector[1] == State._region1_C;
			default :
				return false;
		}
	}

	public SCIDefault getSCIDefault() {
		return sCIDefault;
	}

	public void raiseIntegerEvent(int value) {
		sCIDefault.raiseIntegerEvent(value);
	}

	public int getMyVar() {
		return sCIDefault.getMyVar();
	}

	public void setMyVar(int value) {
		sCIDefault.setMyVar(value);
	}

	/* Entry action for statechart 'ValuedEvents'. */
	private void entryAction() {
	}

	/* Exit action for state 'ValuedEvents'. */
	private void exitAction() {
	}

	/* The reactions of state A. */
	private void reactMain_region_A() {
	}

	/* The reactions of state B. */
	private void reactRegion1_B() {
		if (sCIDefault.integerEvent) {
			nextStateIndex = 1;
			stateVector[1] = State.$NullState$;

			sCIDefault.myVar = sCIDefault.integerEventValue;

			nextStateIndex = 1;
			stateVector[1] = State._region1_C;
		}
	}

	/* The reactions of state C. */
	private void reactRegion1_C() {
	}

	public void runCycle() {

		clearOutEvents();

		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {

			switch (stateVector[nextStateIndex]) {
				case main_region_A :
					reactMain_region_A();
					break;
				case _region1_B :
					reactRegion1_B();
					break;
				case _region1_C :
					reactRegion1_C();
					break;
				default :
					// $NullState$
			}
		}

		clearEvents();
	}
}
