package kr.hs.study.controller;

import java.awt.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.DataBean;

@Controller 
public class TestController {
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		return "result";
		
//		//list(배열 형식이라 map으로 못받음)
//		@GetMapping("/test2")
//		public String test2(@RequestParam Map<String , String> map,
//							@RequestParam List<String> data3) {
//			
//			String data1 = map.get("data1");
//			String data2 = map.get("data2");
//			for(String str : data3) {
//				System.out.println("data3 : "+str);
//			}
//			return "result";
	}
		
		@GetMapping("/test3")
		public String test3(@ModelAttribute DataBean bean) {
			//bean객체에 요청된 값을 자동주입(autowired)해라
			
			System.out.println("data1 : "+bean.getData1());
			System.out.println("data2 : "+bean.getData2());
			System.out.println("data3 : "+bean.getData3());
			return "result";
		}
	}

