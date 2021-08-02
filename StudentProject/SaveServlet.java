package com.usttrng;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")

 

public class SaveServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();

 String sid=request.getParameter("id");
 int id=Integer.parseInt(sid);
 String name=request.getParameter("name");
 String password=request.getParameter("password");
 String email=request.getParameter("email");
 String country=request.getParameter("country");

 
 Student e=new Student();
 e.setName(name);
 e.setPassword(password);
 e.setEmail(email);
 e.setCountry(country);
 e.setId(id);

 int status=StudentDao.save(e);
 if(status>0){
 out.print("<p>Record saved successfully!</p>");
 request.getRequestDispatcher("index.html").include(request, response);
 }else{
 out.println("Sorry! unable to save record");
 }

 out.close();
 }

 }

