package kr.hs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.hs.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	@Bean(name="abc")
	@Lazy //lazy-init="true" 하면 주소값이 달라짐
	public TestBean1 t1() {
		TestBean1 test1 = new TestBean1();
		return test1;
	}
}
