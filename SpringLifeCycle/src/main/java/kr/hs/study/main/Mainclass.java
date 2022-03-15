package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class Mainclass {
	//xml파일을 읽어서 로딩
	public static void main(String[] args) {
		
		//슬래쉬로 하는거 주의!, config에서 링크 붙어넣고 import
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
	//클래스 태그 주소생성 및 출력
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		TestBean1 obj3 = ctx.getBean("t2", TestBean1.class);
		
		System.out.println("obj1 : "+ obj1);
		System.out.println("obj2 : "+ obj2);
		System.out.println("obj3 : "+ obj3);
		
//		//init메서드 출력
//		TestBean1 obj4 = ctx.getBean("t3", TestBean1.class);
//		System.out.println("obj4 : "+obj4);
//		
//		TestBean1 obj5 = ctx.getBean("t4", TestBean1.class);
//		System.out.println("obj5 : "+obj5);
//		
			ctx.close(); // bean들의 소멸 - 컨테이너에서 소멸됨..
	}
	
}
