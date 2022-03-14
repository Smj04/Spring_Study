package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class Mainclass {
	//xml파일을 읽어서 로딩
	public static void main(String[] args) {
		//슬래쉬로 하는거 주의!
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//주소찍는법
		TestBean1 tb1 = ctx.getBean("p1", TestBean1.class);
		System.out.println("tb1 : "+ tb1);
		
			ctx.close();
	}
	
}
