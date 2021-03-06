/*******************************************************************************
 *  Copyright (c) 2000, 2010 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.update.core;
 
import org.eclipse.core.runtime.*;

/**
 * Convenience implementation of a verifier.
 * <p>
 * This class may be subclassed by clients.
 * </p> 
 * <p>
 * <b>Note:</b> This class/interface is part of an interim API that is still under development and expected to
 * change significantly before reaching stability. It is being made available at this early stage to solicit feedback
 * from pioneering adopters on the understanding that any code that uses this API will almost certainly be broken
 * (repeatedly) as the API evolves.
 * </p>
 * @see org.eclipse.update.core.IVerifier
 * @since 2.0
 * @deprecated The org.eclipse.update component has been replaced by Equinox p2.
 * This API will be deleted in a future release. See bug 311590 for details.
 */
public abstract class Verifier implements IVerifier {
	
	private IVerifier parent;

	/**
	 * @see IVerifier#verify(IFeature, ContentReference, boolean, InstallMonitor)
	 */
	public abstract IVerificationResult verify(
		IFeature feature,
		ContentReference reference,
		boolean isFeatureVerification,
		InstallMonitor monitor)
		throws CoreException ;

	/**
	 * @see IVerifier#verify(IFeature, ContentReference, boolean, InstallMonitor)
	 */
	public void setParent(IVerifier parentVerifier){
		if (this.parent==null){
			this.parent = parentVerifier;
		}
	}
	
	/**
	 * Returns the parent verifier
	 * 
	 * @return the parent verifier
	 * @since 2.0
	 */
	public IVerifier getParent(){
		return parent;
	}

}
