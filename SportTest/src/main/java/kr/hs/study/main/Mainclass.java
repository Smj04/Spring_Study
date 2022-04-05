package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Sports;
import kr.hs.study.beans.baseball;
import kr.hs.study.beans.basketball;
import kr.hs.study.beans.vollyball;
import kr.hs.study.config.BeanconfigClass;


public class Mainclass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
		new AnnotationConfigApplicationContext(BeanconfigClass.class);
	
		Sports obj1 = ctx.getBean("java1", baseball.class);
		obj1.play();
		obj1.stop();
		
		Sports obj2 = ctx.getBean("java2", vollyball.class);
		obj2.play();
		obj2.stop();
		
		Sports obj3 = ctx.getBean("java3", basketball.class);
		obj3.play();
		obj3.stop();
		
	}
}
