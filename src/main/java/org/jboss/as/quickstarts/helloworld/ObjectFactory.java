package org.jboss.as.quickstarts.helloworld;

import javax.enterprise.inject.Produces;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public class ObjectFactory {

   @Produces
   public HttpServletRequest getRequest() {
      // hmmm
      return null;
   }
}
