package org.nodeclipse.jsquared.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.nodeclipse.jsquared.views.BrowserDemoView;


public class PerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);

		layout.addView(BrowserDemoView.VIEW_ID, IPageLayout.LEFT, 0.95f,
				IPageLayout.ID_EDITOR_AREA);
	}

}
