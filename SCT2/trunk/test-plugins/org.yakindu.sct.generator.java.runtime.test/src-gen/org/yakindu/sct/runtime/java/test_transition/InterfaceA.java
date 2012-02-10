/**
Copyright (c) 2011 committers of YAKINDU and others. 
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html
 
Contributors:
	committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.runtime.java.test_transition;

import org.yakindu.sct.runtime.java.Event;
import org.yakindu.sct.runtime.java.INotificationSender;
import org.yakindu.sct.runtime.java.IGenericAccessInterface;

public interface InterfaceA
		extends
			INotificationSender,
			IGenericAccessInterface {

	public enum Events {
		Event1, Event2, Event3, Event4, Event5,
	}

	public void raiseEvent1(int value);

	public void raiseEvent2();

	public void raiseEvent3();

	public void raiseEvent4();
	public boolean isRaisedEvent5();

	public Event<Events> getEventEvent5();

}
