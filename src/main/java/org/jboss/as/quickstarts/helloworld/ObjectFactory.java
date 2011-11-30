package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.HttpParam;
import org.jboss.as.quickstarts.helloworld.util.ServletRequestProvider;

import javax.enterprise.inject.Produces;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public class ObjectFactory {
   @Inject
   private ServletRequestProvider reqProvider;

   @Produces @RequestScoped
   public HttpServletRequest getRequest() {
      System.out.println("ObjectFactory.getRequest()");
      return (HttpServletRequest) reqProvider.getServletRequest();
   }

   @Produces @HttpParam
   public String getRequestParam(InjectionPoint ip)
   {
      return reqProvider.getServletRequest().getParameter(ip.getAnnotated().getAnnotation(HttpParam.class).value());
   }
}
