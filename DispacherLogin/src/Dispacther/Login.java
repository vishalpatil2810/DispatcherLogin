package Dispacther;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	String n =req.getParameter("UserName");
	String p =req.getParameter("UserPass");
    
	if(p.equals("servlet")){
		RequestDispatcher rd =req.getRequestDispatcher("servlet2");
		rd.forward(req, resp);
	     
		
	}else{
		out.print("sory userName or Password error");
		RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		rd.include(req, resp);
	}
		
		
	}

}
