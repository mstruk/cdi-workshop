package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.UserName;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class RequestHandler {

   @Inject @UserName
   private String user;

   @Inject @UserName
   private String currentUser;

   String getUser() {
      return user;
   }

   String getCurrentUser() {
      return currentUser;
   }
}
