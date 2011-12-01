package org.jboss.as.quickstarts.helloworld;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class RequestHandler {

   @Inject
   private String user;

   @Inject
   private String currentUser;

   String getUser() {
      return user;
   }

   String getCurrentUser() {
      return currentUser;
   }
}
