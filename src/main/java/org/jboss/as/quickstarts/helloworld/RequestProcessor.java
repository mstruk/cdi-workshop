package org.jboss.as.quickstarts.helloworld;

import org.jboss.as.quickstarts.helloworld.annotations.HttpParam;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletRequest;
import java.util.LinkedList;

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
   private RequestProcessor(Instance<ServletRequest> reqInstance) {
      System.out.println("RequestProcessor<init> (" + reqInstance + ")");
      System.out.println("isAmbiguous: " + reqInstance.isAmbiguous());
      LinkedList someList = new LinkedList();
      for (ServletRequest req: reqInstance) {
         //System.out.println("  req: " + req);
         //action = req.getParameter(ACTION);
         someList.add(req);
      }
      action = reqInstance.iterator().next().getParameter(ACTION);
      System.out.println("Action set");
      System.out.println("Instances iterated: " + someList);
   }

   public String getAction() {
      return action;
   }

   public String getAction2() {
      return action2;
   }
}
