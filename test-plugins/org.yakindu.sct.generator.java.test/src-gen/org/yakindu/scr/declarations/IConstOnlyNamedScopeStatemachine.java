/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.declarations;

import org.yakindu.sct.IStatemachine;

public interface IConstOnlyNamedScopeStatemachine extends IStatemachine {
	
	public interface Interface {
	
		public void raiseE(long value);
		
	}
	
	public Interface getInterface();
	
	
	public interface InterfaceA {
	
		public static final long b = 1;
		
		public static final long c = 2;
		
		public long getB();
		
		public long getC();
		
	}
	
	public InterfaceA getInterfaceA();
	
}
