package com.bryan.component;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 在连接上携带区域信息
 */
public final class MyLocaleResolver implements LocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		//获取请求信息
		String l = request.getParameter("l");
		//构造区域信息，Locale对象
		Locale locale = Locale.getDefault();
		//判断请求信息是否为空
		if (!StringUtils.isEmpty(l)) {
			String[] split = l.split("_");
			locale=new Locale(split[0], split[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

	}
}
