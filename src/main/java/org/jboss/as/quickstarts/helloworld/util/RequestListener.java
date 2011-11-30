package org.jboss.as.quickstarts.helloworld.util;

import org.jboss.as.quickstarts.helloworld.ObjectFactory;

import javax.inject.Inject;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@WebListener
public class RequestListener implements ServletRequestListener {

   @Inject
   private ServletRequestProvider reqProvider;

   @Override
   public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
   }

   @Override
   public void requestInitialized(ServletRequestEvent servletRequestEvent) {
      reqProvider.setServletRequest(servletRequestEvent.getServletRequest());
   }
}
