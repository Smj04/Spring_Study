package kr.hs.study.config;

import org.springframework.context.annotation.Bean;

public class TestBean1 {
	@Bean
	//��ü�� ������ ����Ÿ�� ��ü
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	@Bean
	public TestBean1 java3() {
		TestBean1 t3 = new TestBean1();
		return t3;
	}
}
