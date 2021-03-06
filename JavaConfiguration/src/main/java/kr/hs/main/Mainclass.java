package kr.hs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.beans.TestBean1;
import kr.hs.config.BeanConfigClass;

public class Mainclass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
			TestBean1 obj1 = ctx.getBean("abc", TestBean1.class);
		System.out.println("obj1 : "+ obj1);
		
		TestBean1 obj2 = ctx.getBean("abc", TestBean1.class);
		System.out.println("obj2 : " +obj2);
		
		ctx.close();
	}
}
