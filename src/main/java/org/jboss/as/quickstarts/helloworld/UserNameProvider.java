package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.LoggedIn;
import org.jboss.as.quickstarts.helloworld.annotations.UserName;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public class UserNameProvider {

   @UserName
   private String getCurrentUserName() {
      return "johndoe";
   }

   @LoggedIn @UserName
   private String getRequestedUserName() {
      return "janedoe";
   }
}
