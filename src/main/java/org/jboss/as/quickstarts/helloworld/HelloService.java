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

   public HelloService() {
      System.out.println("HelloService<init>");
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

   @PostConstruct
   void postConstruct2() {
      System.out.println("@PostConstruct method 2");
   }

   String createHelloMessage(String name) {
      return "Hello " + name + "!";
   }

}
