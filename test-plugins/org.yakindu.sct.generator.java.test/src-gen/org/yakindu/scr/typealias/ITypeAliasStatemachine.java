/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.typealias;

import org.yakindu.sct.IStatemachine;

public interface ITypeAliasStatemachine extends IStatemachine {
	
	public interface Interface {
	
		public void raiseMyEvent();
		
		public long getMyVar();
		
		public void setMyVar(long value);
		
		public String getMyString();
		
		public void setMyString(String value);
		
	}
	
	public Interface getInterface();
	
}
