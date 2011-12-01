package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.LoggedIn;
import org.jboss.as.quickstarts.helloworld.annotations.UserName;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class RequestHandler {

   @Inject @Default @UserName
   private String user;

   @Inject @LoggedIn @UserName
   private String currentUser;

   String getUser() {
      return user;
   }

   String getCurrentUser() {
      return currentUser;
   }
}
