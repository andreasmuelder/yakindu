/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.expressions;

import org.yakindu.sct.IStatemachine;

public interface ITriggerExpressionPrecedenceStatemachine extends IStatemachine {
	
	public interface Interface {
	
		public void raiseE1();
		
		public void raiseE2();
		
		public boolean getC1();
		
		public void setC1(boolean value);
		
		public boolean getC2();
		
		public void setC2(boolean value);
		
		public boolean getE1_transition();
		
		public void setE1_transition(boolean value);
		
		public boolean getE2_transition();
		
		public void setE2_transition(boolean value);
		
	}
	
	public Interface getInterface();
	
}
