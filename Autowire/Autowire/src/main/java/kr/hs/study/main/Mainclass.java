package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class Mainclass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		
		System.out.println("data1 : "+obj1.getData1());
		System.out.println("data2 : "+obj1.getData2());
		System.out.println("data3 : "+obj1.getData3());
		ctx.close();
	}
}
