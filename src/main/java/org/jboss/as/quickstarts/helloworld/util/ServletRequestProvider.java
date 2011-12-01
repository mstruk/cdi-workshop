package org.jboss.as.quickstarts.helloworld.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.servlet.ServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class ServletRequestProvider {

   private ServletRequest req;

   @Produces @RequestScoped
   public ServletRequest getServletRequest() {
       return req;
   }

   void setServletRequest(ServletRequest req) {
      this.req = req;
   }
}
