/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * Contributors:
 * 
 *    Kevin Bauer - Initial implementation
 *******************************************************************************/
package com.jama.oslc.model.trs;

import java.net.URI;

import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;



@OslcNamespace(TRSConstants.TRS_NAMESPACE)
@OslcResourceShape(title = "Deletion  Shape", describes = TRSConstants.TRS_TYPE_DELETION)
public class Deletion extends ChangeEvent {

	public Deletion() {}
	
	
	/**
	 * @param changed
	 * @param order
	 */
	public Deletion(URI about, URI changed, int order) {
		super(about, changed, order);
	}
}
