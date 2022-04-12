package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class Mainclass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 xml1 = ctx.getBean(TestBean1.class); //이름이 없기때문에 타입으로 가져온다(컴포넌트 작동방식)
		System.out.println("xml1 : "+xml1);
		ctx.close();
		
		System.out.println("=============================================");
		
//		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
//		TestBean1 xml2 = ctx.getBean(TestBean1.class); //이름이 없기때문에 타입으로 가져온다(컴포넌트 작동방식)
//		System.out.println("xml2 : "+xml2);
//		ctx2.close();
		
	}
}
