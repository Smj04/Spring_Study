package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.baseball;
import kr.hs.study.beans.basketball;
import kr.hs.study.beans.vollyball;

@Configuration
public class BeanconfigClass {
	
	@Bean
	public baseball java1() {
		baseball b1 = new baseball(9,9);
		return b1;
	}
	
	@Bean
	public vollyball java2() {
		vollyball v2 = new vollyball();
	v2.setPeople(6);
	v2.setNumber(3);
	return v2;
	}
	
	@Bean
	public basketball java3() {
		basketball b3 = new basketball(5,4);
	return b3;
	}
}
