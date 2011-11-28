package org.jboss.as.quickstarts.helloworld;

import javax.enterprise.inject.Produces;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public class ObjectFactory {
   private static final ThreadLocal<HttpServletRequest> requestTL = new ThreadLocal<HttpServletRequest>();

   @Produces
   public HttpServletRequest getRequest() {
      return requestTL.get();
   }

   public static void startRequest(HttpServletRequest req) {
      requestTL.set(req);
   }

   public static void endRequest() {
      requestTL.remove();
   }
}
