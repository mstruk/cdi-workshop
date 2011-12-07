package org.jboss.as.quickstarts.helloworld.model;

import java.math.BigInteger;

/**
 * @author <a href="mailto:mstrukel@redhat.com>Marko Strukelj</a>
 */
public abstract class AbstractPaymentMethod implements PaymentMethod
{

   private String name;
   private String number;
   private int expiresYear;
   private int expiresMonth;
   private int cvcCode;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getNumber()
   {
      return number;
   }

   public void setNumber(String number)
   {
      this.number = number;
   }

   public int getExpiresYear()
   {
      return expiresYear;
   }

   public void setExpiresYear(int expiresYear)
   {
      this.expiresYear = expiresYear;
   }

   public int getExpiresMonth()
   {
      return expiresMonth;
   }

   public void setExpiresMonth(int expiresMonth)
   {
      this.expiresMonth = expiresMonth;
   }

   public int getCvcCode()
   {
      return cvcCode;
   }

   public void setCvcCode(int cvcCode)
   {
      this.cvcCode = cvcCode;
   }

   @Override
   public abstract void performPayment(BigInteger sum);
}
