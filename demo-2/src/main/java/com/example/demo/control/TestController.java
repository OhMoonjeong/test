package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService service;
	
	@GetMapping("a")
	@ResponseBody
	public String a() {
		return "a... service is" + service;
	}
}
