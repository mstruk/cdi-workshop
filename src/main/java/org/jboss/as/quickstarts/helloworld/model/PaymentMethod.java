package org.jboss.as.quickstarts.helloworld.model;

import java.math.BigInteger;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public interface PaymentMethod {
   void performPayment(BigInteger sum);
}
