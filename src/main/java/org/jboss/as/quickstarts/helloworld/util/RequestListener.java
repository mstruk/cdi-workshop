package org.jboss.as.quickstarts.helloworld.util;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@WebListener
public class RequestListener implements ServletRequestListener {
   @Inject
   Event<ServletRequest> event;

   @Override
   public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
   }

   @Override
   public void requestInitialized(ServletRequestEvent servletRequestEvent) {
      event.fire(servletRequestEvent.getServletRequest());
   }
}
