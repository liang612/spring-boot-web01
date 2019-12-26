package com.bryan.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 拦截器：登录检查
 */
public final class LoginHandlerInterceptor implements HandlerInterceptor {
	//目标方法执行之前
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws ServletException, IOException {
		//重Session中获取loginName属性
		Object userName = request.getSession().getAttribute("loginName");
		//未登录，Session中没有用户名，返回登录页面
		if (userName == null) {
			request.setAttribute("msg", "没有全限，请先登录");
			request.getRequestDispatcher("/login.html").forward(request, response);
			return false;
		} else {
			//已登录，Session中有用户名，跳转到main页面
			return true;

		}

	}
}
