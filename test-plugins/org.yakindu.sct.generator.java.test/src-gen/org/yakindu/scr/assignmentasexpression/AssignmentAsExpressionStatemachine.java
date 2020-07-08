/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.assignmentasexpression;


public class AssignmentAsExpressionStatemachine implements IAssignmentAsExpressionStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private long a;
		
		public long getA() {
			return a;
		}
		
		public void setA(long value) {
			this.a = value;
		}
		
		private long b;
		
		public long getB() {
			return b;
		}
		
		public void setB(long value) {
			this.b = value;
		}
		
		protected long assignB(long value) {
			return this.b = value;
		}
		
		private long c;
		
		public long getC() {
			return c;
		}
		
		public void setC(long value) {
			this.c = value;
		}
		
		protected long assignC(long value) {
			return this.c = value;
		}
		
		private long d;
		
		public long getD() {
			return d;
		}
		
		public void setD(long value) {
			this.d = value;
		}
		
		private long e;
		
		public long getE() {
			return e;
		}
		
		public void setE(long value) {
			this.e = value;
		}
		
		private long f;
		
		public long getF() {
			return f;
		}
		
		public void setF(long value) {
			this.f = value;
		}
		
		protected long assignF(long value) {
			return this.f = value;
		}
		
		private long g;
		
		public long getG() {
			return g;
		}
		
		public void setG(long value) {
			this.g = value;
		}
		
		private long h;
		
		public long getH() {
			return h;
		}
		
		public void setH(long value) {
			this.h = value;
		}
		
		protected long assignH(long value) {
			return this.h = value;
		}
		
		private long i;
		
		public long getI() {
			return i;
		}
		
		public void setI(long value) {
			this.i = value;
		}
		
		private long i1;
		
		public long getI1() {
			return i1;
		}
		
		public void setI1(long value) {
			this.i1 = value;
		}
		
		protected long assignI1(long value) {
			return this.i1 = value;
		}
		
		private long j;
		
		public long getJ() {
			return j;
		}
		
		public void setJ(long value) {
			this.j = value;
		}
		
		private long j1;
		
		public long getJ1() {
			return j1;
		}
		
		public void setJ1(long value) {
			this.j1 = value;
		}
		
		protected long assignJ1(long value) {
			return this.j1 = value;
		}
		
		private long k;
		
		public long getK() {
			return k;
		}
		
		public void setK(long value) {
			this.k = value;
		}
		
		private long k1;
		
		public long getK1() {
			return k1;
		}
		
		public void setK1(long value) {
			this.k1 = value;
		}
		
		protected long assignK1(long value) {
			return this.k1 = value;
		}
		
		private long l;
		
		public long getL() {
			return l;
		}
		
		public void setL(long value) {
			this.l = value;
		}
		
		private long m;
		
		public long getM() {
			return m;
		}
		
		public void setM(long value) {
			this.m = value;
		}
		
		private long n;
		
		public long getN() {
			return n;
		}
		
		public void setN(long value) {
			this.n = value;
		}
		
		protected long assignN(long value) {
			return this.n = value;
		}
		
		private long p;
		
		public long getP() {
			return p;
		}
		
		public void setP(long value) {
			this.p = value;
		}
		
		private long r;
		
		public long getR() {
			return r;
		}
		
		public void setR(long value) {
			this.r = value;
		}
		
		protected long assignR(long value) {
			return this.r = value;
		}
		
		private long t;
		
		public long getT() {
			return t;
		}
		
		public void setT(long value) {
			this.t = value;
		}
		
		private long u;
		
		public long getU() {
			return u;
		}
		
		public void setU(long value) {
			this.u = value;
		}
		
		private long v;
		
		public long getV() {
			return v;
		}
		
		public void setV(long value) {
			this.v = value;
		}
		
		protected long assignV(long value) {
			return this.v = value;
		}
		
		private long w;
		
		public long getW() {
			return w;
		}
		
		public void setW(long value) {
			this.w = value;
		}
		
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		main_region_Add,
		main_region_Multiply,
		main_region_Divide,
		main_region_Modulo,
		main_region_Shift,
		main_region_boolean_And,
		main_region_boolean_Or,
		main_region_boolean_Xor,
		main_region_Subtract,
		$NullState$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public AssignmentAsExpressionStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		
		
		defaultInterface.setA(0);
		
		defaultInterface.setB(0);
		
		defaultInterface.setC(0);
		
		defaultInterface.setD(0);
		
		defaultInterface.setE(1);
		
		defaultInterface.setF(1);
		
		defaultInterface.setG(4);
		
		defaultInterface.setH(32);
		
		defaultInterface.setI(7);
		
		defaultInterface.setI1(7);
		
		defaultInterface.setJ(8);
		
		defaultInterface.setJ1(2);
		
		defaultInterface.setK(8);
		
		defaultInterface.setK1(4);
		
		defaultInterface.setL(3);
		
		defaultInterface.setM(7);
		
		defaultInterface.setN(5);
		
		defaultInterface.setP(0);
		
		defaultInterface.setR(7);
		
		defaultInterface.setT(10);
		
		defaultInterface.setU(6);
		
		defaultInterface.setV(13);
		
		defaultInterface.setW(7);
		
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
			case main_region_Add:
				main_region_Add_react(true);
				break;
			case main_region_Multiply:
				main_region_Multiply_react(true);
				break;
			case main_region_Divide:
				main_region_Divide_react(true);
				break;
			case main_region_Modulo:
				main_region_Modulo_react(true);
				break;
			case main_region_Shift:
				main_region_Shift_react(true);
				break;
			case main_region_boolean_And:
				main_region_boolean_And_react(true);
				break;
			case main_region_boolean_Or:
				main_region_boolean_Or_react(true);
				break;
			case main_region_boolean_Xor:
				main_region_boolean_Xor_react(true);
				break;
			case main_region_Subtract:
				main_region_Subtract_react(true);
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
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case main_region_Add:
			return stateVector[0] == State.main_region_Add;
		case main_region_Multiply:
			return stateVector[0] == State.main_region_Multiply;
		case main_region_Divide:
			return stateVector[0] == State.main_region_Divide;
		case main_region_Modulo:
			return stateVector[0] == State.main_region_Modulo;
		case main_region_Shift:
			return stateVector[0] == State.main_region_Shift;
		case main_region_boolean_And:
			return stateVector[0] == State.main_region_boolean_And;
		case main_region_boolean_Or:
			return stateVector[0] == State.main_region_boolean_Or;
		case main_region_boolean_Xor:
			return stateVector[0] == State.main_region_boolean_Xor;
		case main_region_Subtract:
			return stateVector[0] == State.main_region_Subtract;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public long getA() {
		return defaultInterface.getA();
	}
	
	public void setA(long value) {
		defaultInterface.setA(value);
	}
	
	public long getB() {
		return defaultInterface.getB();
	}
	
	public void setB(long value) {
		defaultInterface.setB(value);
	}
	
	public long getC() {
		return defaultInterface.getC();
	}
	
	public void setC(long value) {
		defaultInterface.setC(value);
	}
	
	public long getD() {
		return defaultInterface.getD();
	}
	
	public void setD(long value) {
		defaultInterface.setD(value);
	}
	
	public long getE() {
		return defaultInterface.getE();
	}
	
	public void setE(long value) {
		defaultInterface.setE(value);
	}
	
	public long getF() {
		return defaultInterface.getF();
	}
	
	public void setF(long value) {
		defaultInterface.setF(value);
	}
	
	public long getG() {
		return defaultInterface.getG();
	}
	
	public void setG(long value) {
		defaultInterface.setG(value);
	}
	
	public long getH() {
		return defaultInterface.getH();
	}
	
	public void setH(long value) {
		defaultInterface.setH(value);
	}
	
	public long getI() {
		return defaultInterface.getI();
	}
	
	public void setI(long value) {
		defaultInterface.setI(value);
	}
	
	public long getI1() {
		return defaultInterface.getI1();
	}
	
	public void setI1(long value) {
		defaultInterface.setI1(value);
	}
	
	public long getJ() {
		return defaultInterface.getJ();
	}
	
	public void setJ(long value) {
		defaultInterface.setJ(value);
	}
	
	public long getJ1() {
		return defaultInterface.getJ1();
	}
	
	public void setJ1(long value) {
		defaultInterface.setJ1(value);
	}
	
	public long getK() {
		return defaultInterface.getK();
	}
	
	public void setK(long value) {
		defaultInterface.setK(value);
	}
	
	public long getK1() {
		return defaultInterface.getK1();
	}
	
	public void setK1(long value) {
		defaultInterface.setK1(value);
	}
	
	public long getL() {
		return defaultInterface.getL();
	}
	
	public void setL(long value) {
		defaultInterface.setL(value);
	}
	
	public long getM() {
		return defaultInterface.getM();
	}
	
	public void setM(long value) {
		defaultInterface.setM(value);
	}
	
	public long getN() {
		return defaultInterface.getN();
	}
	
	public void setN(long value) {
		defaultInterface.setN(value);
	}
	
	public long getP() {
		return defaultInterface.getP();
	}
	
	public void setP(long value) {
		defaultInterface.setP(value);
	}
	
	public long getR() {
		return defaultInterface.getR();
	}
	
	public void setR(long value) {
		defaultInterface.setR(value);
	}
	
	public long getT() {
		return defaultInterface.getT();
	}
	
	public void setT(long value) {
		defaultInterface.setT(value);
	}
	
	public long getU() {
		return defaultInterface.getU();
	}
	
	public void setU(long value) {
		defaultInterface.setU(value);
	}
	
	public long getV() {
		return defaultInterface.getV();
	}
	
	public void setV(long value) {
		defaultInterface.setV(value);
	}
	
	public long getW() {
		return defaultInterface.getW();
	}
	
	public void setW(long value) {
		defaultInterface.setW(value);
	}
	
	/* Entry action for state 'Add'. */
	private void entryAction_main_region_Add() {
		defaultInterface.setA(((defaultInterface.assignB(5)) + 4));
	}
	
	/* Entry action for state 'Multiply'. */
	private void entryAction_main_region_Multiply() {
		defaultInterface.setE(defaultInterface.getE() * (((defaultInterface.assignF(defaultInterface.getF() * 5)) * 3)));
	}
	
	/* Entry action for state 'Divide'. */
	private void entryAction_main_region_Divide() {
		defaultInterface.setG(defaultInterface.getG() / (((defaultInterface.assignH(defaultInterface.getH() / 2)) / 4)));
	}
	
	/* Entry action for state 'Modulo'. */
	private void entryAction_main_region_Modulo() {
		defaultInterface.setI(defaultInterface.getI() % (((defaultInterface.assignI1(defaultInterface.getI1() % 4)) % 4)));
	}
	
	/* Entry action for state 'Shift'. */
	private void entryAction_main_region_Shift() {
		defaultInterface.setJ(defaultInterface.getJ() << ((defaultInterface.assignJ1(defaultInterface.getJ1() >> 1))));
		
		defaultInterface.setK(defaultInterface.getK() >> ((defaultInterface.assignK1(defaultInterface.getK1() >> 2))));
	}
	
	/* Entry action for state 'boolean And'. */
	private void entryAction_main_region_boolean_And() {
		defaultInterface.setL(defaultInterface.getL() & ((defaultInterface.assignN(defaultInterface.getN() & defaultInterface.m))));
	}
	
	/* Entry action for state 'boolean Or'. */
	private void entryAction_main_region_boolean_Or() {
		defaultInterface.setP(defaultInterface.getP() | ((defaultInterface.assignR(defaultInterface.getR() | defaultInterface.t))));
	}
	
	/* Entry action for state 'boolean Xor'. */
	private void entryAction_main_region_boolean_Xor() {
		defaultInterface.setU(defaultInterface.getU() ^ ((defaultInterface.assignV(defaultInterface.getV() ^ defaultInterface.w))));
	}
	
	/* Entry action for state 'Subtract'. */
	private void entryAction_main_region_Subtract() {
		defaultInterface.setD(defaultInterface.getD() - (((defaultInterface.assignC(defaultInterface.getC() - 5)) - 1)));
	}
	
	/* 'default' enter sequence for state Add */
	private void enterSequence_main_region_Add_default() {
		entryAction_main_region_Add();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Add;
	}
	
	/* 'default' enter sequence for state Multiply */
	private void enterSequence_main_region_Multiply_default() {
		entryAction_main_region_Multiply();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Multiply;
	}
	
	/* 'default' enter sequence for state Divide */
	private void enterSequence_main_region_Divide_default() {
		entryAction_main_region_Divide();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Divide;
	}
	
	/* 'default' enter sequence for state Modulo */
	private void enterSequence_main_region_Modulo_default() {
		entryAction_main_region_Modulo();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Modulo;
	}
	
	/* 'default' enter sequence for state Shift */
	private void enterSequence_main_region_Shift_default() {
		entryAction_main_region_Shift();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Shift;
	}
	
	/* 'default' enter sequence for state boolean And */
	private void enterSequence_main_region_boolean_And_default() {
		entryAction_main_region_boolean_And();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_boolean_And;
	}
	
	/* 'default' enter sequence for state boolean Or */
	private void enterSequence_main_region_boolean_Or_default() {
		entryAction_main_region_boolean_Or();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_boolean_Or;
	}
	
	/* 'default' enter sequence for state boolean Xor */
	private void enterSequence_main_region_boolean_Xor_default() {
		entryAction_main_region_boolean_Xor();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_boolean_Xor;
	}
	
	/* 'default' enter sequence for state Subtract */
	private void enterSequence_main_region_Subtract_default() {
		entryAction_main_region_Subtract();
		nextStateIndex = 0;
		stateVector[0] = State.main_region_Subtract;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state Add */
	private void exitSequence_main_region_Add() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state Multiply */
	private void exitSequence_main_region_Multiply() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state Divide */
	private void exitSequence_main_region_Divide() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state Modulo */
	private void exitSequence_main_region_Modulo() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state Shift */
	private void exitSequence_main_region_Shift() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state boolean And */
	private void exitSequence_main_region_boolean_And() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state boolean Or */
	private void exitSequence_main_region_boolean_Or() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state boolean Xor */
	private void exitSequence_main_region_boolean_Xor() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state Subtract */
	private void exitSequence_main_region_Subtract() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case main_region_Add:
			exitSequence_main_region_Add();
			break;
		case main_region_Multiply:
			exitSequence_main_region_Multiply();
			break;
		case main_region_Divide:
			exitSequence_main_region_Divide();
			break;
		case main_region_Modulo:
			exitSequence_main_region_Modulo();
			break;
		case main_region_Shift:
			exitSequence_main_region_Shift();
			break;
		case main_region_boolean_And:
			exitSequence_main_region_boolean_And();
			break;
		case main_region_boolean_Or:
			exitSequence_main_region_boolean_Or();
			break;
		case main_region_boolean_Xor:
			exitSequence_main_region_boolean_Xor();
			break;
		case main_region_Subtract:
			exitSequence_main_region_Subtract();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_Add_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_Add_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_Add();
				enterSequence_main_region_Subtract_default();
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Multiply_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_Multiply();
				enterSequence_main_region_Divide_default();
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Divide_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_Divide();
				enterSequence_main_region_Modulo_default();
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Modulo_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_Modulo();
				enterSequence_main_region_Shift_default();
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Shift_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_Shift();
				enterSequence_main_region_boolean_And_default();
			}
		}
		return did_transition;
	}
	
	private boolean main_region_boolean_And_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_boolean_And();
				enterSequence_main_region_boolean_Or_default();
			}
		}
		return did_transition;
	}
	
	private boolean main_region_boolean_Or_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_boolean_Or();
				enterSequence_main_region_boolean_Xor_default();
			}
		}
		return did_transition;
	}
	
	private boolean main_region_boolean_Xor_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean main_region_Subtract_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				exitSequence_main_region_Subtract();
				enterSequence_main_region_Multiply_default();
			}
		}
		return did_transition;
	}
	
}
