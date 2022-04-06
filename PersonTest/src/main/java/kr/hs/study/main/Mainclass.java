package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;

@Configuration
public class Mainclass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		TestBean obj = ctx.getBean("xml1", TestBean.class);

		System.out.println("p1 Age : " + obj.getP1().getAge());
		System.out.println("p1 Name : " + obj.getP1().getName());
		System.out.println("p2 Age : " + obj.getP2().getAge());
		System.out.println("p2 Name : " + obj.getP2().getName());

		ctx.close();

	}
}
