package kr.hs.study.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;


public class Mainclass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 obj = ctx.getBean(TestBean1.class);
		System.out.println(obj.getData1());
		System.out.println(obj.getData2());
		ctx.close();

	}
}
