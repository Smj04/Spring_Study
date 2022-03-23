package kr.hs.study.main;

import java.awt.print.Book;


import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		Novel obj1 = ctx.getBean("t1", Novel.class);
		obj1.buy();
		
		Poet obj2 = ctx.getBean("t2", Poet.class);
		obj2.buy();
		
		Magazine obj3 = ctx.getBean("t3", Magazine.class);
		obj3.buy();
		
	}
}
