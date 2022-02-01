package com.example.MavenProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Customer {
	@GetMapping(path="/all")
	@ResponseBody
	public String getDetails()
	{
	return "Hi GoodMorning";
	}
}
