package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.HttpParam;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletRequest;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@RequestScoped
public class RequestProcessor {

   private static final String ACTION = "action";

   private String action;

   @Inject @HttpParam("action") private String action2;

   public RequestProcessor() {
      System.out.println("RequestProcessor<init>");
   }

   @Inject
   private RequestProcessor(ServletRequest req) {
      System.out.println("req: " + req);
      action = req.getParameter(ACTION);
   }

   public String getAction() {
      return action;
   }

   public String getAction2() {
      return action2;
   }
}
