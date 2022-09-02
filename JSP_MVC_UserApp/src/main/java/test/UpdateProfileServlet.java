package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet{
   protected void doPost(HttpServletRequest req,
        HttpServletResponse res)throws ServletException,IOException{
    HttpSession hs = req.getSession(false);
    if(hs==null) 
    {
    	req.setAttribute("msg","Session Expired...<br>");
    	RequestDispatcher rd=req.getRequestDispatcher("Invalid.jsp");
    	rd.forward(req, res);
    }
    else 
    {
		 UserBean ub = (UserBean)hs.getAttribute("ubean");
		 ub.setAddr(req.getParameter("addr"));
		 ub.setmId(req.getParameter("mid"));
		 ub.setPhNo(Long.parseLong(req.getParameter("phno")));
		 int k = new UpdateDAO().update(ub);
		 if(k>0) {
		 RequestDispatcher rd =
		 req.getRequestDispatcher("Update.jsp");
		 rd.forward(req, res);
     }
    }
   }
}
