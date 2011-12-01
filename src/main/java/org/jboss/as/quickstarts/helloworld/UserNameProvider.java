package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.LoggedIn;
import org.jboss.as.quickstarts.helloworld.annotations.UserName;

import javax.enterprise.inject.Produces;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public class UserNameProvider {

   @Produces
   private String getCurrentUserName() {
      return "johndoe";
   }

   @Produces @LoggedIn
   private String getRequestedUserName() {
      return "janedoe";
   }
}
