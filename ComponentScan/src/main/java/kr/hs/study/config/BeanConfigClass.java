package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import kr.hs.study.beans.TestBean1;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans"})
public class BeanConfigClass {
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	
}
