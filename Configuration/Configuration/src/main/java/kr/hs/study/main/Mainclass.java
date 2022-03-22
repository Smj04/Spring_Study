package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.config.TestBean1;
@Configuration
public class Mainclass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestBean1.class);
	
		//config.xml에서 만든 bean이 아니라 java1()로 가져옴
		TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
				System.out.println("obj1 : "+obj1);
				
		TestBean1 obj2 = ctx.getBean("java2", TestBean1.class);
				System.out.println("obj2 : "+obj2);
				
		TestBean1 obj3 = ctx.getBean("java3", TestBean1.class);
				System.out.println("obj3 : "+obj3);
		
	}
}
