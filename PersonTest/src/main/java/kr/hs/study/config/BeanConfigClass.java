package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.TestBean;

@Configuration
public class BeanConfigClass {
	@Bean
	public TestBean xml1() {

		TestBean t1 = new TestBean();
		return t1;
	}

	@Bean(name = "p1")
	public Person data1() {

		Person p1 = new Person();
		p1.setAge(5);
		p1.setName("º≠πŒ¡§");
		return p1;
	}

	@Bean(name = "p2")
	public Person data2() {

		Person p2 = new Person();
		p2.setAge(1);
		p2.setName("±ËπŒ¡§");
		return p2;

	}
}
