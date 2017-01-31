package com.vivek.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vivek.loginApp.EmployeeDAO;
import com.vivek.loginApp.EmployeeEntity;
import com.vivek.loginApp.LogInBean;


@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LogInServlet() {
        super();        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		// Set response content type
	    response.setContentType("text/html");
		
		EmployeeDAO empDAO = new EmployeeDAO();
		List<EmployeeEntity> empList = empDAO.fetchData();
		int flag = 0;
		String logInId = (String) request.getParameter("logInId");
		String password = (String) request.getParameter("password");
		LogInBean logBean = new LogInBean();
		logBean.setLogInId(logInId);
		logBean.setPassword(password);
		//HttpSession session = request.getSession();
		//session.setAttribute("logInBean", logBean);			
		
		for (int i = 0; i < empList.size(); i++) {
			if (logInId.equalsIgnoreCase(empList.get(i).getName().trim()) && password.equalsIgnoreCase(empList.get(i).getPassword().trim())) {
				flag = 1;				
			}
		}
		if (flag == 1) {			
			out.print("<center><h2>Welcome Mr."+ logBean.getLogInId() + " !</h2></center>");
		} else { 
			request.setAttribute("logInBean", logBean);
			RequestDispatcher reqDis = request.getRequestDispatcher("error.jsp");
			reqDis.forward(request, response);	
		}	
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
