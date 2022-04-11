package kr.hs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.beans.DataBean1;
import kr.hs.beans.DataBean2;
import kr.hs.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean1 xml1() {
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
