/*
 * generated by Xtext
 */
package org.yakindu.sct.generator.genmodel.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.yakindu.sct.generator.genmodel.ui.help.HelpSystemDocumentationProvider;
import org.yakindu.sct.generator.genmodel.ui.help.GenModelEObjectHover;
import org.yakindu.sct.generator.genmodel.ui.highlighting.SGenSemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SGenUiModule extends
		org.yakindu.sct.generator.genmodel.ui.AbstractSGenUiModule {
	public SGenUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SGenSemanticHighlightingCalculator.class;
	}

	public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		return HelpSystemDocumentationProvider.class;
	}

	@Override
	public Class<? extends IEObjectHover> bindIEObjectHover() {
		return GenModelEObjectHover.class;
	}

}
