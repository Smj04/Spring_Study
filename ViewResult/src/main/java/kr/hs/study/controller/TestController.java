package kr.hs.study.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	@GetMapping("/test2")
	public String test2() {
		
	return "test2";
	}
	@GetMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("data3",300);
		model.addAttribute("data4",400);
		return "test3";
	}
}
