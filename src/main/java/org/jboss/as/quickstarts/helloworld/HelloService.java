package org.jboss.as.quickstarts.helloworld;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * A simple CDI service which is able to say hello to someone
 * 
 * @author Pete Muir
 * 
 */
@ApplicationScoped
public class HelloService {

   private ServiceConfig config;

   public HelloService() {
      System.out.println("HelloService<init>");
   }

   @Inject
   public HelloService(ServiceConfig conf) {
      this.config = conf;
   }

   @Inject
   void init() {
      System.out.println("Initializer method - init()");
   }

   @Inject
   void init2() {
      System.out.println("Initializer method 2 - init2()");
   }

   @PostConstruct
   void postConstruct() {
      System.out.println("@PostConstruct method");
   }

   String createHelloMessage(String name) {
      return "Hello " + name + "!";
   }

}
