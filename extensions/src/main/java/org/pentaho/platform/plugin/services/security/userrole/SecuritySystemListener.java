package org.pentaho.platform.plugin.services.security.userrole;

import org.pentaho.platform.api.engine.IPentahoSession;
import org.pentaho.platform.api.engine.IPentahoSystemListener;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.springframework.security.authentication.ProviderManager;

/**
 * This listener ensures that the Authentication system has been loaded. Security must be started before the repository.
 */
public class SecuritySystemListener implements IPentahoSystemListener {

  @Override
  public boolean startup( IPentahoSession session ) {
    PentahoSystem.get( ProviderManager.class, "authenticationManager", session  );
    return true;
  }

  @Override
  public void shutdown() {
    // do nothing
  }
}
