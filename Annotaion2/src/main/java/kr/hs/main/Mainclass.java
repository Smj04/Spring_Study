package kr.hs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.beans.TestBean1;
import kr.hs.config.BeanConfigClass;

public class Mainclass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		TestBean1 obj = ctx.getBean(TestBean1.class);
		System.out.println("data1 : " + obj.getData1());
		System.out.println("data2 : " + obj.getData2());
		ctx.close();
	}
}
