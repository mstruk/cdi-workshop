package org.jboss.as.quickstarts.helloworld.util;

import org.jboss.as.quickstarts.helloworld.ObjectFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@WebListener
public class RequestListener implements ServletRequestListener {

   @Override
   public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
       ObjectFactory.endRequest();
   }

   @Override
   public void requestInitialized(ServletRequestEvent servletRequestEvent) {
      Object request = servletRequestEvent.getServletRequest();
      if (request instanceof HttpServletRequest == false)
         throw new IllegalArgumentException("ServletRequest is not instance of HttpServletRequest (" + request + ")");

      ObjectFactory.startRequest((HttpServletRequest) request);
   }
}
