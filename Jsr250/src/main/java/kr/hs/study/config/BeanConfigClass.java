package kr.hs.study.config;

import org.springframework.context.annotation.Bean;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;

public class BeanConfigClass {
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	@Bean
	public DataBean1 data1() {
		DataBean1 d1 = new DataBean1();
		return d1;
	}
	
	@Bean
	public DataBean2 data2() {
		DataBean2 d2 = new DataBean2();
		return d2;
	}
}
