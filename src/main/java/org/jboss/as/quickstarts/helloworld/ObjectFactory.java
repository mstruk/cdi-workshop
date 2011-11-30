package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.HttpParam;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class ObjectFactory {

   private ServletRequest req;

   @Produces @RequestScoped
   public HttpServletRequest getRequest() {
      System.out.println("ObjectFactory.getRequest()");
      return (HttpServletRequest) req;
   }

   @Produces @HttpParam
   public String getRequestParam(InjectionPoint ip)
   {
      return req.getParameter(ip.getAnnotated().getAnnotation(HttpParam.class).value());
   }

   private void onServletRequest(@Observes ServletRequest event) {
      System.out.println("onServletRequest");
      req = event;
   }
}
