/**
* Copyright (c) 2019 itemis AG - All rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* 
* Contributors:
* 	itemis AG
*
*/
package org.yakindu.sct.types.generator.statechart.core

import com.google.inject.Inject
import java.util.Collection
import org.yakindu.base.types.Package
import org.yakindu.sct.generator.core.execution.AbstractGeneratorEntryExecutor
import org.yakindu.sct.generator.core.filesystem.ISCTFileSystemAccess
import org.yakindu.sct.model.sequencer.ModelSequencer
import org.yakindu.sct.model.sgen.GeneratorEntry
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.types.generator.ITypesGenerator

class PackageGeneratorEntryExecutor extends AbstractGeneratorEntryExecutor {
	
	@Inject protected ModelSequencer sequencer
	@Inject protected ITypesGenerator generator
	
	override protected execute(ISCTFileSystemAccess access, GeneratorEntry generatorEntry) {
		generator.generate(createPackages(generatorEntry), access) 
	}
	
	def protected Collection<Package> createPackages(GeneratorEntry entry) {
		val elementRef = entry.elementRef
		if(elementRef instanceof Statechart) {
			#[sequencer.transform(elementRef, null)]	
		} else {
			null
		}
	}
}