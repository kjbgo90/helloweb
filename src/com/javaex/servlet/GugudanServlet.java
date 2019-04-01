package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tmpDan = Integer.parseInt(request.getParameter("dan"));
		PrintWriter out = response.getWriter();
		
		System.out.println("구구단 출력");
		
		out.println("<table border='1'>");
		for(int i = 0; i < 9; i++) {
			out.println("	<tr>");
			out.println("		<td>" + tmpDan + "x</td>");
			out.println("		<td>" + (i + 1) + "</td>");
			out.println("		<td>=" + tmpDan * (i + 1) + "</td>");
			out.println("	</tr>");
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
