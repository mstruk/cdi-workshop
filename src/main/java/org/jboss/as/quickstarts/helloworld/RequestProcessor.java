package org.jboss.as.quickstarts.helloworld;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class RequestProcessor {

   private static final String ACTION = "action";

   private String action;

   public RequestProcessor() {
      System.out.println("RequestProcessor<init>");
   }

   @Inject
   public RequestProcessor(HttpServletRequest req) {
      System.out.println("RequestProcessor<init> (" + req + ")");
      action = req.getParameter(ACTION);
   }

   public String getAction() {
      return action;
   }
}
