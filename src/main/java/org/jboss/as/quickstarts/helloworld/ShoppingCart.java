package org.jboss.as.quickstarts.helloworld;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
@SessionScoped
public class ShoppingCart implements Serializable {

   private static final long serialVersionUID = 7378850171680328591L;

   public ShoppingCart() {
      System.out.println("ShoppingCart<init>");
   }
}
