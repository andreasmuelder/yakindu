/**
Copyright (c) 2011 committers of YAKINDU and others. 
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html
 
Contributors:
	committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.runtime.java.test_localactions;

import java.util.LinkedList;

import org.yakindu.sct.runtime.java.Event;

import org.yakindu.sct.runtime.java.Notification;

public class Test_LocalActionsEventBasedStatemachine
		extends
			Test_LocalActionsCycleBasedStatemachine {

	private LinkedList<Event<? extends Enum<?>>> eventQueue;

	public Test_LocalActionsEventBasedStatemachine() {
		eventQueue = new LinkedList<Event<? extends Enum<?>>>();
		//Replace interface map entries of cycle based statemachine super class
		getInterfaceMap().put("DefaultInterface",
				new DefaultInterfaceEventBasedImpl(this));
	}

	public void notify(Notification notification) {
		super.notify(notification);
		runCycle();
	}

	@Override
	protected LinkedList<Event<? extends Enum<?>>> getOccuredEvents() {
		return eventQueue;
	}

	@Override
	protected boolean eventOccured() {
		return !eventQueue.isEmpty();
	}

	@Override
	public void runCycle() {
		if (eventOccured()) {
			Event<? extends Enum<?>> event = getOccuredEvents().poll();
			super.getOccuredEvents().add(event);
			super.runCycle();
		}
	}
}
