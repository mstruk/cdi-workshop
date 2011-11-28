package org.jboss.as.quickstarts.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * A simple servlet taking advantage of features added in 3.0.
 * </p>
 * 
 * <p>
 * The servlet is registered and mapped to /HelloServlet using the {@linkplain WebServlet
 * @HttpServlet}. The {@link HelloService} is injected by CDI.
 * </p>
 * 
 * @author Pete Muir
 * 
 */
@SuppressWarnings("serial")
@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {

   static String PAGE_HEADER = "<html><head /><body>";

   static String PAGE_FOOTER = "</body></html>";

   @Inject
   HelloService helloService;

   @Inject
   HelloService service2;

   @Inject RequestProcessor handler;

   @Inject ShoppingCart cart;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("doGet()");
      PrintWriter writer = resp.getWriter();
      writer.println(PAGE_HEADER);
      writer.println("<h1>" + helloService.createHelloMessage("World") + "</h1>");
      writer.println("<p>action = " + handler.getAction() + "</p>");
      writer.println("<p>Shopping Cart: " + cart);
      writer.println("<p>helloService: " + helloService + "</p>");
      writer.println("<p>service2: " + service2 + "</p>");
      writer.println("<p>Assert helloService != service2: " + (helloService != service2) + "</p>");
      writer.println(PAGE_FOOTER);
      writer.close();
   }

}
