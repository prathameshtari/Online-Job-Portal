package com.me.JobPortal.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.me.JobPortal.pojo.User;

public class EmployeeInterceptor extends HandlerInterceptorAdapter{

	String errorPage;

	public String getErrorPage() {
		return errorPage;
	}

	public void setErrorPage(String errorPage) {
		this.errorPage = errorPage;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = (HttpSession) request.getSession();
		
//		if(session.getAttribute("user") != null){
//			System.out.println("in interceptor");
//			return true;
//		}
		if (session.getAttribute("user") != null){
		User user = (User) session.getAttribute("user");
		
		if (user.getRole().equalsIgnoreCase("employee") ){
			System.out.println("in Employee interceptor");
			return true;
		}
		}
		System.out.println("not Employer");
		response.sendRedirect(request.getContextPath() +"/authorize/error.htm");
		return false;
		
		
		
		
	}
	
}

