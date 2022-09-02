package test;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		UserBean ub=new LoginDAO().login(req);
		if(ub==null) 
		{
			req.setAttribute("msg","Invalid login Process...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Invalid.jsp");
			rd.forward(req,res);
		}
		else
		{
			HttpSession hs=req.getSession();
			hs.setAttribute("ubean", ub);
			RequestDispatcher rd=req.getRequestDispatcher("Valid.jsp");
			rd.forward(req, res);
		}
	}

}
