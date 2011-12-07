package org.jboss.as.quickstarts.helloworld.model;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public class Stats<T extends PaymentMethod> {

   private T paymentMethod;

   public Stats(T paymentMethod) {
      this.paymentMethod = paymentMethod;
   }
}
