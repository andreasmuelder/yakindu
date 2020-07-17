/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.simulation.core.sexec.container;

import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.model.sruntime.CompositeSlot;
import org.yakindu.sct.model.sruntime.ExecutionContext;
import org.yakindu.sct.model.sruntime.ExecutionEvent;
import org.yakindu.sct.model.sruntime.ExecutionVariable;

import com.google.inject.ImplementedBy;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
@ImplementedBy(DefaultExecutionContextInitializer.class)
public interface IExecutionContextInitializer {
	/**
	 * Called before the interpreter is started to initialize the
	 * {@link ExecutionContext} based on the {@link ExecutionFlow}. Clients
	 * should create {@link ExecutionVariable}s and {@link ExecutionEvent}s
	 * based on the {@link ExecutionFlow}
	 * 
	 */
	public void initialize(ExecutionContext context, ExecutionFlow flow);

	public CompositeSlot newInstance(ExecutionFlow flow);
}

