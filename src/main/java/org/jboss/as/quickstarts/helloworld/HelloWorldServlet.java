package org.jboss.as.quickstarts.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {

   static String PAGE_HEADER = "<html><head /><body>";

   static String PAGE_FOOTER = "</body></html>";

   @Inject RequestHandler handler;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("doGet()");
      PrintWriter writer = resp.getWriter();
      writer.println(PAGE_HEADER);

      writer.println("<p>Current user: " + handler.getCurrentUser() + "</p>");
      writer.println("<p>User: " + handler.getUser() + "</p>");

      writer.println(PAGE_FOOTER);
      writer.close();
   }

}
