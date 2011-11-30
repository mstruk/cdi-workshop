package org.jboss.as.quickstarts.helloworld.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.servlet.ServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class ServletRequestProvider {

   private ServletRequest request;

   @Produces @RequestScoped
   public ServletRequest getServletRequest() {
      System.out.println("  << request ::get()");
      return request;
   }

   void setServletRequest(ServletRequest req) {
      System.out.println("  >> request ::set()");
      this.request = req;
   }
}
