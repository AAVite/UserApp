package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet{
  protected void doGet(HttpServletRequest req,
    HttpServletResponse res)throws ServletException,IOException{
	  HttpSession hs = req.getSession(false);
	  if(hs==null) {
		  req.setAttribute("msg","Session expired...<br>");
		  RequestDispatcher rd = req.getRequestDispatcher("Invalid.jsp");
		  rd.forward(req, res);
	  }else 
	  {
		   RequestDispatcher rd =req.getRequestDispatcher("Edit.jsp");
	   	   rd.forward(req, res);
	  }
 }
}