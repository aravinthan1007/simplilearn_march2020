package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		out.print("<h2>Accessing Configuration(ServletConfig) based params of Servlet1 in Servlet2<h2>");
		out.print("<h3>Query1 "+config.getInitParameter("query1")+"</h3>");
		out.print("<h3>Query2 "+config.getInitParameter("query2")+"</h3>");
		ServletContext context=getServletContext();
		out.print("<br/><br/><h2>Accessing Context/Application(ServletContext) based params of application in Servlet2<h2>");
		out.print("<h3>Driver "+context.getInitParameter("driver")+"</h3>");
		out.print("<h3>URL "+context.getInitParameter("url")+"</h3>");
		out.print("<h3>Username "+context.getInitParameter("username")+"</h3>");
	}

}
