/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.guard;

import org.yakindu.sct.IStatemachine;

public interface IGuardStatemachine extends IStatemachine {
	
	public interface Interface {
	
		public void raiseEvent1();
		
		public void raiseEvent2();
		
		public void raiseReturn();
		
		public long getMyVar();
		
		public void setMyVar(long value);
		
	}
	
	public Interface getInterface();
	
}
