/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.guardedentry;

import org.yakindu.sct.IStatemachine;

public interface IGuardedEntryStatemachine extends IStatemachine {
	
	public interface Interface {
	
		public void raiseE();
		
		public boolean getGuard();
		
		public void setGuard(boolean value);
		
		public boolean getDone();
		
		public void setDone(boolean value);
		
	}
	
	public Interface getInterface();
	
}
