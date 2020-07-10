/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.runnabletest;

import java.util.List;
import org.yakindu.sct.IStatemachine;
import org.yakindu.sct.ITimerCallback;
import org.yakindu.sct.rx.Observable;

public interface IRunnableTestStatemachine extends ITimerCallback,IStatemachine {
	
	public interface Interface {
	
		public Observable<Long> getEv_out();
		
		public void raiseEv_in(long value);
		
		public long getMyVar();
		
		public void setMyVar(long value);
		
		public long getAfterCalls();
		
		public void setAfterCalls(long value);
		
		public long getCycles();
		
		public void setCycles(long value);
		
		public long getS2_entered();
		
		public void setS2_entered(long value);
		
		public List<InterfaceListener> getListeners();
		public void setInterfaceOperationCallback(InterfaceOperationCallback operationCallback);
	}
	
	public interface InterfaceListener {
	
		public void onEv_outRaised(long value);
	}
	
	public interface InterfaceOperationCallback {
	
		public void displayTime();
		
	}
	
	public Interface getInterface();
	
}
