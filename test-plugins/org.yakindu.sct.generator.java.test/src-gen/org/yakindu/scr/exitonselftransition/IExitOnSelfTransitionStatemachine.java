/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.exitonselftransition;

import org.yakindu.sct.IStatemachine;

public interface IExitOnSelfTransitionStatemachine extends IStatemachine {
	
	public interface Interface {
	
		public void raiseE();
		
		public void raiseF();
		
		public long getEntryCount();
		
		public void setEntryCount(long value);
		
		public long getExitCount();
		
		public void setExitCount(long value);
		
	}
	
	public Interface getInterface();
	
}
