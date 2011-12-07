package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.LoggedIn;
import org.jboss.as.quickstarts.helloworld.annotations.UserName;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class UserNameProvider {

   public UserNameProvider() {
      System.out.println("UserNameProvider<init>");
   }

   @Produces @Default @UserName
   private String getCurrentUserName() {
      return "johndoe";
   }

   @Produces @LoggedIn @UserName
   private String getRequestedUserName() {
      return "janedoe";
   }
}
