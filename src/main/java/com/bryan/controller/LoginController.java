package com.bryan.controller;

import com.bryan.domin.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public final class LoginController {

	@PostMapping("/user/login")
	public final String login(User user, Map<String, Object> map, HttpSession session) {

		if (!StringUtils.isEmpty(user.getUsername()) && user.getUsername().equals("aaa") && user.getPassword().equals("123")) {
			//把登录成功的用户名存入Session域中
			session.setAttribute("loginName",user.getUsername());
			//登录成功
			return "redirect:/main.html";
		} else {
			//登录失败
			map.put("msg", "用户名密码错误");
			return "login";
		}
	}


}
