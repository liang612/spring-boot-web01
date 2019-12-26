package com.bryan.config;

import com.bryan.component.LoginHandlerInterceptor;
import com.bryan.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public  class MyConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //重定向
        registry.addViewController("/main.html").setViewName("main");
        registry.addViewController("/success.html").setViewName("success");
        //浏览器会发送login.html请求到login
        registry.addViewController("").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
    }

    @Bean //将组件注册到容器
    public LocaleResolver localeResolver(){
    	return new MyLocaleResolver();
	}



//    注册拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginHandlerInterceptor())
				.addPathPatterns("/**")
				.excludePathPatterns("/","/login.html","/user/login","/webjars/**","/asserts/**");
	}
}
