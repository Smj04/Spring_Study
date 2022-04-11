package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.management.DescriptorKey;

import org.springframework.context.annotation.Bean;

public class TestBean1 {
	
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}

	@Resource
	private DataBean1 data1;
	
	@Resource
	private DataBean2 data2;
	
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	@PostConstruct
	public void post() {
		System.out.println("postConstruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("preDestroy");
	}
}
