package test01.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5350160190126631190L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		session.setAttribute("username", req.getUserPrincipal());
		
		resp.getWriter().print("req.getUserPrincipal() = " + req.getUserPrincipal() + ";req.isUserInRole(\"ldapGroup1\") = " + req.isUserInRole("ldapgroup1"));
		
	}
}
