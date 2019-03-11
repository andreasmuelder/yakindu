/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.ieq.ineventqueue;

import java.util.LinkedList;
import java.util.Queue;
import org.yakindu.scr.ieq.IStatemachine;

public interface IInEventQueueStatemachine extends IStatemachine {
	public interface SCInterface {
	
		public void raiseE();
		
		public void raiseF(long value);
		
		public long getCycles();
		
		public void setCycles(long value);
		
		public void setSCInterfaceOperationCallback(SCInterfaceOperationCallback operationCallback);
	
	}
	
	public interface SCInterfaceOperationCallback {
	
		public void askOracle();
		
	}
	
	public SCInterface getSCInterface();
	
	public interface SCII {
	
		public void raiseG();
		
	}
	
	public SCII getSCII();
	
}
