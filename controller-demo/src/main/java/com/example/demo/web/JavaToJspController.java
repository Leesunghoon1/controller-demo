package com.example.demo.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.User;

@Controller
public class JavaToJspController {
	
	@GetMapping("/jsp/java")
	public String jspToJava() {
		return "b";
	}
	
	
	@GetMapping("/jsp/java/model")
	public String jspToJavaToModel(Model model) { // 함수의 파라미터에 model을 선언하고
		
		User user = new User();
		user.setUsername("ssar");
		model.addAttribute("username", user.getUsername()); //addAttribute로 전달만 하면된다
		
		//e 페이지 까지 model에 있는 벨류값을 들고감
		
		return "e";
	}
}
