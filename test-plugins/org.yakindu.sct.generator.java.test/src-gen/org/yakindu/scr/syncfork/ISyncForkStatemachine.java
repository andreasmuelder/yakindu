/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.syncfork;

import org.yakindu.sct.IStatemachine;

public interface ISyncForkStatemachine extends IStatemachine {
	
	public interface Interface {
	
		public void raiseE();
		
		public void raiseF();
		
	}
	
	public Interface getInterface();
	
}
