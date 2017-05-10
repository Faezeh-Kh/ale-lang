package org.eclipse.emf.ecoretools.ale.ide.listener;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetSync;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetSync.ResourceStatus;
import org.eclipse.sirius.common.tools.api.resource.ResourceSyncClient;

/**
 * Workspace listener notifying a Session when a DSL file is modified
 */
public class AleWorkspaceListener implements IResourceChangeListener {

	Session session;
	Resource dslRes;
	Set<IFile> files;

	public AleWorkspaceListener(Session session, Resource dslRes) {
		this.session = session;
		this.files = new LinkedHashSet<IFile>();
		this.dslRes = dslRes;
	}

	public void listen(IFile file) {
		files.add(file);
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
			if (isMatching(event.getDelta())) {
				
				List<ResourceSyncClient.ResourceStatusChange> changes = new ArrayList<>();
				ResourceStatus oldStatus = ResourceSetSync.getStatus(dslRes);
				ResourceStatus newStatus = ResourceStatus.EXTERNAL_CHANGED;
				changes.add(new ResourceSyncClient.ResourceStatusChange(dslRes, newStatus, oldStatus));

				ResourceSetSync rsSetSync = ResourceSetSync.getOrInstallResourceSetSync(session.getTransactionalEditingDomain());
				rsSetSync.statusesChanged(changes);
			}
		}
	}

	private boolean isMatching(IResourceDelta delta) {
		for (IFile file : files) {
			IResourceDelta deltaTarget = delta.findMember(file.getFullPath());
			if (deltaTarget != null) {
				return true;
			}
		}
		return false;
	}

}
