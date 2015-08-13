package com.square.listener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.square.dao.UserUtil;

/**
 * Servlet implementation class SessionListener
 */
public class SessionListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionListener() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		int a=UserUtil.validateUser(Username,Password);
	if(a==1)
		{
		HttpSession sess=request.getSession();
		sess.setAttribute("vname", Username);
		int userid=UserUtil.fetchUserId(Username);
		sess.setAttribute("vuser_id", userid);
		sess.setMaxInactiveInterval(10*60);
		String url=response.encodeRedirectURL("Home.jsp");
		response.sendRedirect("Home.jsp");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
