package com.vijay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		PrintWriter out = res.getWriter();
		
		out.print("Hi ");
		
		/*
		 * ServletContext ctx = req.getServletContext();
		 * 
		 * String st = ctx.getInitParameter("name");
		 */
		
		ServletConfig cg = getServletConfig();
		
		String st = cg.getInitParameter("name");
		
		out.println(st);
		
		
	}

}
