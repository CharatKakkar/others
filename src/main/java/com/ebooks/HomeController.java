package com.ebooks;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@RequestMapping("/")
	public String display(){
		return "home";
		
	}
}
