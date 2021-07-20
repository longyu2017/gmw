package com.xyz.gmw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class GmwApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmwApplication.class, args);
	}

	@RequestMapping(value = {"","index"})
	public String index(Model model){
		model.addAttribute("msg","thx");
		return "index";
	}
}
