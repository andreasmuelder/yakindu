/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.eventdrivenoutevents;

import org.yakindu.sct.IStatemachine;
import org.yakindu.sct.rx.Observable;

public interface IEventDrivenOutEventsStatemachine extends IStatemachine {
	
	public interface SCInterface {
	
		public void raiseE1();
		
		public Observable<Void> getE2();
		
	}
	
	public SCInterface getSCInterface();
	
}
